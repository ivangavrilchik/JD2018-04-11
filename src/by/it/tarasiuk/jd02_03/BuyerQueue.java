package by.it.tarasiuk.jd02_03;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

class BuyerQueue {
    private BuyerQueue() {
    }

    private static LinkedBlockingDeque<Buyer> deque = new LinkedBlockingDeque<>(30);

    static synchronized void addToQueue(Buyer buyer) {
        try {
            deque.putLast(buyer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static synchronized Buyer extractBuyerFromQueue() {
        try {
            return deque.poll(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    static int getSize() {
        return deque.size();
    }
}
