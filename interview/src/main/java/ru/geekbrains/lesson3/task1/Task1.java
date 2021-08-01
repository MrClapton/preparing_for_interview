package ru.geekbrains.lesson3.task1;

/**
 * 1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
 */

public class Task1 {
    public static void main(String[] args) {
        PingPongQueue queue = new PingPongQueue();
        new Ping(queue);
        new Pong(queue);
    }
}
