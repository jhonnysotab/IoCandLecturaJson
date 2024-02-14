package com.jhonny.springboot.di.app.springtboot.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jhonny.springboot.di.app.springtboot.models.Product;

public class ProductoRepositoryJson implements ProductRepository{

    private List<Product>list;

    //Otra manera de obtener el Resource  si el archivo seria un componente seria de la siguiente manera y 
    // remplazara la linea 26 
        // @Value("classpath:product.json")
        // private Resource resource;

    public ProductoRepositoryJson(){
        Resource resource = new ClassPathResource("product.json");
        ObjectMapper obj = new ObjectMapper();
        try {
            list = Arrays.asList(obj.readValue(resource.getFile(),Product[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return list;
    }

    @Override
    public Product finById(Long Id) {
        return  list.stream().filter(p -> p.getId().equals(Id)).findFirst().orElseThrow(null);    
    }

}
