package ru.geekbrains.lesson2.task2;

/**
 * 2. Реализовать основные методы ArrayList.
 */

public class Task2 {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        int s = myArrayList.getSize();
        System.out.println("Array size: " + s);

        myArrayList.add("0");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add(3, "3");
        String elem = myArrayList.get(1);

        System.out.println(myArrayList.toString());
        System.out.println("element.value= " + elem + ", size= " + myArrayList.getSize());

        String removeEl = myArrayList.remove(0);
        System.out.println(myArrayList.toString());
        System.out.println("removed element.value= " + removeEl + ", size= " + myArrayList.getSize());


        int lastIndex = myArrayList.getSize();
        for (int i = 0; i < 10; i++) {
            int index = lastIndex + i;
            myArrayList.add(String.valueOf(index));
            System.out.println("index: " + index + ", size: " + myArrayList.getSize());
        }

        System.out.println(myArrayList.toString());
        System.out.println("Capacity= " + myArrayList.getCapacity() + ", size= " + myArrayList.getSize());

        myArrayList.clear();
        System.out.println("Capacity= " + myArrayList.getCapacity() + ", size= " + myArrayList.getSize());
    }
}
