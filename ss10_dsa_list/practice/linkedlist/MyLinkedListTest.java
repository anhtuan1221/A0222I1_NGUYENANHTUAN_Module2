package ss10_dsa_list.practice.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("------Testing--------");
        MyLinkedList ll= new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(1,9);
        ll.add(3,9);
        ll.printList();
    }
}
