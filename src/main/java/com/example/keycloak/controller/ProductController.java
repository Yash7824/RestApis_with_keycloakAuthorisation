package com.example.keycloak.controller;

import com.example.keycloak.entity.Products;
import com.example.keycloak.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @RolesAllowed("admin")
    public List<Products> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    @RolesAllowed({"user", "admin"})
    public Products getProduct(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    @RolesAllowed("user")
    public List<Products> addProducts(@RequestBody List<Products> products){
        return productService.saveProducts(products);
    }

    @PostMapping("/product")
    @RolesAllowed("user")
    public Products addProduct(@RequestBody Products product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    @RolesAllowed("admin")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteById(id);
    }

}
