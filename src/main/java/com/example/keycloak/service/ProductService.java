package com.example.keycloak.service;

import com.example.keycloak.entity.Products;
import com.example.keycloak.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Products saveProduct(Products product){
        return productRepository.save(product);
    }

    public List<Products> saveProducts(List<Products> products){
        return productRepository.saveAll(products);
    }

    public Products getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Products> getProducts(){
        return productRepository.findAll();
    }

    public String deleteById(int id){
        productRepository.deleteById(id);
        return "The product has been deleted";
    }


}
