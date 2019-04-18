package chap07SetMap;

import chap04LinkedList.LinkedList;

public class LinkedListSet<E> implements Set<E> {
    private LinkedList<E> list;
    public LinkedListSet(){
        list = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if(!list.contains(e))
            list.addFirst(e); //时间复杂度O(1)

    }

    @Override
    public void remove(E e) {
        list.removeElement(e);

    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
