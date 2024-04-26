package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(head.next == null) tail = head;
        size++;
    }

    public void addLast(int value){
        if(size == 0) {
            addFirst(value);
        }else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = tail.next;
            size++;
        }
    }

    private Node find(int index) {
        Node res = head;
        for(int i = 0; i < index - 1; i++) {
            if(res.next == null) return null;
            res = res.next;
        }
        return res;
    }

    public boolean removeByIndex(int index) {
        Node findNode = find(index);
        if(findNode == null) return false;
        if(findNode.next == null) return false;
        findNode.next = findNode.next.next;
        size--;
        return true;
    }

    public boolean remove(int value) {
        Node preNode = head;
        Node currentNode = head.next;
        if(currentNode == null) {
            if(preNode.value == value) {
                head = null;
                size--;
                return true;
            }
        }

        while(currentNode != null) {
            if(currentNode.value == value) {
                preNode.next = currentNode.next;
                return true;
            }
            preNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public Node search(int data) {
        Node now = head;
        while(now != null) {
            if(now.value == data) return now;
            now = now.next;
        }
        return null;
    }

    public int indexOf(int data){
        Node now = head;
        int index = 0;
        while(now != null) {
            if(now.value == data) return index;
            now = now.next;
            index++;
        }
        return -1;
    }

    public String toString() {
        Node now = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(now != null) {
            sb.append(now.value);
            sb.append(",");
            now = now.next;
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
