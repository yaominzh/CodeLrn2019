package chap08HeapAndPriorityQueue;

public interface Queue<E> {
    int getSize();
    void enqueue(E e);
    boolean isEmpty();
    E dequeue();
    E getFront();
}
