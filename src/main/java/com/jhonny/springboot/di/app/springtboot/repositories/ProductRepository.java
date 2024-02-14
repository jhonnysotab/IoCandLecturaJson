package com.jhonny.springboot.di.app.springtboot.repositories;

import java.util.List;
 

import com.jhonny.springboot.di.app.springtboot.models.Product;
 
public interface ProductRepository {

        List<Product>findAll();

        Product finById(Long Id);
}
