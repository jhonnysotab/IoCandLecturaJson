package com.jhonny.springboot.di.app.springtboot.services;

import java.util.List;

import com.jhonny.springboot.di.app.springtboot.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById( Long id);

}
