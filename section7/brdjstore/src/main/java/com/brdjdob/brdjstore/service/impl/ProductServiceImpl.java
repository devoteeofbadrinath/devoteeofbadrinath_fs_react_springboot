package com.brdjdob.brdjstore.service.impl;

import com.brdjdob.brdjstore.dto.ProductDto;
import com.brdjdob.brdjstore.entity.Product;
import com.brdjdob.brdjstore.repository.ProductRepository;
import com.brdjdob.brdjstore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    private ProductDto transformToDto (Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
    }
}
