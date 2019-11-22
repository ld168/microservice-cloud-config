package com.ld.springcloud.mapper;

import com.ld.springcloud.vo.Product;

import java.util.List;

//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
