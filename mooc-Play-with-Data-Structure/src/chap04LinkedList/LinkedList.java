package chap04LinkedList;

public class LinkedList<E> {


    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyhead;
    private int size;

    public LinkedList() {
        dummyhead= new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;
        size ++;
    }
    public void add(int index, E e){
        if(index <0|| index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        if(index ==0)
            addFirst(e);
        else{
            Node prev =head;
            for(int i = 0; i<index -1; i++)
                prev = prev.next;
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size ++;
        }
    }

}
