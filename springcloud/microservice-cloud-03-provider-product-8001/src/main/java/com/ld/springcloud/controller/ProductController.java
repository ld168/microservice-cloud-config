package com.ld.springcloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import com.ld.springcloud.vo.Product;
import com.ld.springcloud.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return iProductService.add(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return iProductService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return iProductService.list();
    }

}
