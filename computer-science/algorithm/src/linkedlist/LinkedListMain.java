package linkedlist;

import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.addLast(2);
        list.addLast(4);
        list.addLast(3);
        list.addLast(6);

        System.out.println(list.toString());
        Node node = list.search(2);
        list.remove(2);
        list.removeByIndex(2);
        list.removeByIndex(4);
        System.out.println(list.toString());

        List<Integer> list2 = new java.util.LinkedList<>();
        list2.add(2);
        list2.remove(2);
        list2.add(2, 3);

    }
}
