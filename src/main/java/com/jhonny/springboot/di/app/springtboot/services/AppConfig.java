package com.jhonny.springboot.di.app.springtboot.services;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.PropertySource;

import com.jhonny.springboot.di.app.springtboot.repositories.ProductRepository;
import com.jhonny.springboot.di.app.springtboot.repositories.ProductoRepositoryJson;

@Configuration
@PropertySource("classpath:config.properties") 
public class AppConfig {
 
    @Bean 
     ProductRepository productRepositoryJson(){
        return new ProductoRepositoryJson();
    }
}
