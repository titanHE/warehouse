package com.hackerearth.warehouse.service;

import com.hackerearth.warehouse.model.Product;
import com.hackerearth.warehouse.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public String remove(Long id) {
        if(!productRepository.existsById(id)) {
            throw new IllegalArgumentException("product not found");
        }
        productRepository.deleteById(id);
        return "Product with id "+id+" removed";
    }
}
