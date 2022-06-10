package ss10_dsa_list.excercise.linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list= new MyLinkedList<>();
        list.add(0,2);
        list.add(1,3);
        list.add(2,5);
        list.addFirst(6);
        list.addLast(7);
        list.printList();
        System.out.println("---------");

        list.remove(3);
        list.clone();
        list.size();
        list.printList();
        System.out.println("------");
        list.clone();
        list.printList();
    }
}

