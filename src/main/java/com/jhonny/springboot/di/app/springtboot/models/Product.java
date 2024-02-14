package com.jhonny.springboot.di.app.springtboot.models;

public class Product  implements Cloneable{
    private Long id;
    private String name;
    private Long price;
    
    public Product() {
    }

    
    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

     
    public void setId(Long id) {
        this.id = id;
    }

     
    public String getName() {
        return name;
    }

     
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Long return the price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Long price) {
        this.price = price;
    }


    @Override
    public Object clone()  { 
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) { 
            return new Product(id,name,price);
        }
    }
    

}
