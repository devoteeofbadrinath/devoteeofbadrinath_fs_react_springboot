package com.brdjdob.brdjstore.controller;

import com.brdjdob.brdjstore.entity.Product;
import com.brdjdob.brdjstore.repository.ProductRepository;
import com.brdjdob.brdjstore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @GetMapping
    public List<Product> getProducts() {
//        List<Product> productList = productRepository.findAll();
        List<Product> productList = iProductService.getProducts();
        return productList;
    }

}
