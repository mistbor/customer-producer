package com.pv.demo.product;

import lombok.Data;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/9/6
 */
@Data
public class Product {
    private Integer id;

    public Product(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
