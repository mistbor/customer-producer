package com.pv.demo.producer;

import com.pv.demo.container.SyncStack;
import com.pv.demo.product.Product;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/9/6
 */
public class Producer implements Runnable {

    SyncStack syncStack = new SyncStack();

    public Producer(SyncStack syncStack) {
        this.syncStack = syncStack;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            Product product = new Product(i);
            syncStack.push(product);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
