public class Main {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.add(-1);
        head.add(19);
        head.add(6);
        head.add(8);
        Node answer = new Node(0);
        remove(head,answer,-1);
        System.out.println ("given node: ");
        head.print();
        System.out.println();
        System.out.println("answer node: ");
        answer.print();
    }

    static void remove(Node head, Node answer, int v) {
        boolean found = false;
        if (head != null) {
            while (head.next != null) {
                if (head.value == v && found == false &&head.next != null) {
                    answer.value = head.next.value;
                    found = true;
                }
                else if (head.value != v && found == true && head.next != null) {
                    answer.value = head.next.value;
                }
                else if (head.value != v && found == false && head.next != null) {
                    answer.value = head.value;

                }
                    head = head.next;
                if (head.next != null) {  //
                    answer.add(0);        // basic stuff
                    answer = answer.next; //
                }
            }
        } else {
            System.out.println("null");
        }
    }
}
class Node {
    Node (int v) { value = v; next = null; }
    void add (int v)
    { if (next == null) next = new Node (v); else next.add (v); }
    void print () {
        System.out.print (value + " ");
        if (next != null) next.print ();
    }
    int value;
    Node next; // pointer (reference) to next node
}