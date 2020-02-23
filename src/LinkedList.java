import java.util.jar.JarOutputStream;

public class LinkedList {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        e.next=d;


   /*    System.out.println("-------:");
      //  traverseLinkedList(a);

      //  deleteNode(a);

        System.out.println("xxxxxx");
        traverseLinkedList(a);

        System.out.println("______");
        System.out.println(checkCycleInLinkedList(a));

        Node n = reverse(a);

        System.out.println("XXXXX");
        System.out.println(n.value);*/

        Node result= kthToLastNode(a,3);
        System.out.println("KtoLastNode: "+ result.value);



    }

    public static Node kthToLastNode(Node headOfList, int k){

    Node kthToHeadNode=headOfList;
        int i=1;
        while (i<k){
            kthToHeadNode=kthToHeadNode.next;
            if(kthToHeadNode==null){
                throw new IllegalArgumentException("k is exeed size of linkedlist");
            }
            i++;
        }

        Node currentNode=headOfList;

        while (kthToHeadNode!=null){
            kthToHeadNode=kthToHeadNode.next;
            if(kthToHeadNode==null){
                return currentNode;
            }
            currentNode=currentNode.next;
        }

        return null;

    }

    public static Node reverse(Node headOfList) {
        Node currentNode = headOfList;
        Node previousNode = null;
        Node nextNode = null;

        // until we have 'fallen off' the end of the list
        while (currentNode != null) {

            // copy a pointer to the next element
            // before we overwrite currentNode.next
            nextNode = currentNode.next;

            // reverse the 'next' pointer
            currentNode.next = previousNode;

            // step forward in the list
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }
    public static boolean checkCycleInLinkedList(Node firstNode){
        // start both runners at the beginning
        Node slowRunner = firstNode;
        Node fastRunner = firstNode;

        // until we hit the end of the list
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;

            // case: fastRunner is about to "lap" slowRunner
            if (fastRunner == slowRunner) {
                return true;
            }
        }

        // case: fastRunner hit the end of the list
        return false;
    }

    public static void traverseLinkedList(Node node){

      do{

          System.out.println(node.value);
          node=node.next;
      }while (node!=null);
     /*   if(node!=null){
            System.out.println(node.value);
        }else {
            return;
        }
        traverseLinkedList(node.next);*/

    }

    public static void deleteNode(Node node){
        Node nextNode=node.next;

        if(nextNode!=null){
            node.value=nextNode.value;
            node.next=nextNode.next;
        }else{
            throw new IllegalArgumentException("Can not delete last node with this method");
        }


    }
}


class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
}

