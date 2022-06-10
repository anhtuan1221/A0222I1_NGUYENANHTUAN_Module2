package ss10_dsa_list.excercise.array_list;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 5);
        myList.add(5, 6);
        myList.add(15);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList.MyListImpl[" + i + "] = " + myList.get(i));
        }
        System.out.println("Remove = " + myList.remove(2));
        myList.add(3, 6);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList.MyListImpl[" + i + "] = " + myList.get(i));
        }
        System.out.println("size:" + myList.size());
        System.out.println("index Of 6 is " + myList.indexOf(6));
        myList.clear();
        System.out.println("size:" + myList.size());
        System.out.print("element: " + myList.indexOf(1));
    }
}
