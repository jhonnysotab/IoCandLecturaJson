package com.jhonny.springboot.di.app.springtboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.jhonny.springboot.di.app.springtboot.models.Product;
import com.jhonny.springboot.di.app.springtboot.repositories.ProductRepository;

@Service
public class ProductServiceImpl  implements ProductService{
 
        @Autowired
        @Qualifier("productRepositoryJson")
        ProductRepository  productRepository;


        @Value("${config.price.tax}")
        double impuestos;
    
    

    @Override
    public List <Product>findAll(){
        return productRepository.findAll().stream().map(p-> {
            Double impuesto = p.getPrice() * impuestos;
            // Product newProd= new Product(p.getId(),p.getName(),impuesto.longValue());
            Product newProd=(Product) p.clone();
            newProd.setPrice(impuesto.longValue());
            return newProd;
        }).collect(Collectors.toList());
    };
    
    @Override
    public Product findById(Long id){
        return productRepository.finById(id);
    }

}
