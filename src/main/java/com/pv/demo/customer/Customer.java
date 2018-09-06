package com.pv.demo.customer;

import com.pv.demo.container.SyncStack;
import com.pv.demo.product.Product;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/9/6
 */
public class Customer implements Runnable {
    SyncStack syncStack = new SyncStack();

    public Customer(SyncStack syncStack) {
        this.syncStack = syncStack;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            Product product = syncStack.pull();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}