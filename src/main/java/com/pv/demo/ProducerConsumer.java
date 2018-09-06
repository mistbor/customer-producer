package com.pv.demo;

import com.pv.demo.container.SyncStack;
import com.pv.demo.customer.Customer;
import com.pv.demo.producer.Producer;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/9/6
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        Producer producer = new Producer(syncStack);
        Customer customer = new Customer(syncStack);
        new Thread(producer).start();
        new Thread(customer).start();
    }
}