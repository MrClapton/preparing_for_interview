package ru.geekbrains.lesson3.task1;

import lombok.SneakyThrows;

public class Ping implements Runnable {
    private final PingPongQueue queue;

    public Ping(PingPongQueue queue) {
        this.queue = queue;
        new Thread(this, "Ping").start();
    }

    @SneakyThrows
    @Override
    public void run() {
        while (queue.getCounter() > 0) {
            queue.printPing(Thread.currentThread().getName());
        }
    }
}
