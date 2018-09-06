package com.pv.demo.container;

import com.pv.demo.product.Product;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/9/6
 */
public class SyncStack {
    int index = 0;
    Product[] products = new Product[10];

    public synchronized void push(Product product) {
        if (index == products.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        products[index] = product;
        index++;
        System.out.println("push 1 个， 一共: " + index);
    }

    public synchronized Product pull() {
        if (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        System.out.println("pull 1 个， 一共: " + index);
        return products[index];
    }
}