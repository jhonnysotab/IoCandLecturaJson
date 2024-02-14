package com.jhonny.springboot.di.app.springtboot.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository; 

import com.jhonny.springboot.di.app.springtboot.models.Product;

// @RequestScope 
@Primary
@Repository("producList")
public class ProductRepositoryImpl implements ProductRepository {
    
    private List <Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
        new Product( 1L, "Memoria gb300",300L),
        new Product( 2L, "Laptop Victus",3000L),
        new Product( 3L, "Mouse ",90L),
        new Product( 4L, "Teclado ",120L));
    }

    @Override
    public List<Product> findAll(){
        return data;
    }
    
    @Override
    public Product finById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    
}
