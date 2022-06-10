package ss10_dsa_list.excercise.linkedList;

public class MyLinkedList<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList() {

    }

    public void add(int index, Object o) {

        if (index == 0) {
          Node  temp = new Node(o);
            temp.next = head;
            head = temp;
        } else {
           Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next=new Node(o);
            temp.next.next = holder;
        }
        numNodes++;
    }

    public void addFirst(Object o) {
        Node temp = new Node(o);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(Object o) {
        Node temp = head;
        Node newNode = new Node(o);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        numNodes++;
    }

    public Object remove(int index) {
        Node temp = head;
        Node newNode;
        if (index < 0 || index > numNodes) {
            return null;
        } else if (index == 0) {
            newNode = head;
            head = head.next;
            numNodes--;
            return newNode.data;
        }
        for (int i = 0; i < numNodes; i++) {
            if (i == index) {
                newNode = temp.next;
                temp.next = temp.next.next;
                numNodes--;
                return newNode.data;
            } else {
                temp = temp.next;
            }
        }
        numNodes--;
        return temp.next.data;
    }

    public int size() {
        return numNodes;
    }

    public Object[] clone() {
        Object[] objects = new Object[numNodes];
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            objects[i] = temp.data;
            temp = temp.next;
        }
        return objects;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Object get(int i) {
        Node temp = head;
        for (int j = 0; j < this.numNodes; j++) {
            if (i == j) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
}

