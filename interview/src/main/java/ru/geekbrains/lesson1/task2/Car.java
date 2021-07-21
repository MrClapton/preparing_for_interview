package ru.geekbrains.lesson1.task2;

class Car extends Vehicle {
    //added
    public Car(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    void open() {
        System.out.println("Car is open");
    }

    void close() {
        System.out.println("Car is cloded");
    }

    //deleted
//    @Override
//    public void move () {
//        System . out . println ( "Car is moving" );
//    }

}
