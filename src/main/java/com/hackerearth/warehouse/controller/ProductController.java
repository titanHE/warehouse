package com.hackerearth.warehouse.controller;

import com.hackerearth.warehouse.model.Message;
import com.hackerearth.warehouse.model.Product;
import com.hackerearth.warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/counter")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.add(product));
    }

    @PostMapping("/remove/{id}")
    public ResponseEntity<Message> removeProduct(@PathVariable Long id) {
        return ResponseEntity.ok().body(new Message(productService.remove(id)));
    }

}
