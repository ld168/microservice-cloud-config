package com.ld.springcloud.service;

import com.ld.springcloud.vo.Product;

import java.util.List;

public interface IProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
