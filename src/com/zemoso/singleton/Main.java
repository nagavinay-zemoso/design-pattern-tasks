package com.zemoso.singleton;

import com.zemoso.singleton.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Logger logger = Logger.getLoggerInstance(1);
            logger.log("one");
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Logger logger = Logger.getLoggerInstance(2);
            logger.log("two");
        }
    }
}