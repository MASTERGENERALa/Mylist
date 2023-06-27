package Mylist;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");

        Object element = myList.getElementAt(1);
        System.out.println("Елемент за індексом 1: " + element);

        int count = myList.size();
        System.out.println("Загальна кількість елементів: " + count);
    }
}
