package com.ld.springcloud.service.impl;

import com.ld.springcloud.service.IProductService;
import com.ld.springcloud.vo.Product;
import com.ld.springcloud.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ld
 */
@Service
public class ProductServiceimpl implements IProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
