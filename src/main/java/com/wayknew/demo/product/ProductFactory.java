package com.wayknew.demo.product;

import com.wayknew.demo.product.ProductDTO;
import com.wayknew.demo.product.respons.ProductResponseDTO;


import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    static ProductDTO toProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(product.getProductId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setCreatedAt(product.getCreatedAt());
        productDTO.setUpdatedAt(product.getUpdatedAt());
        return productDTO;
    }

    static ProductResponseDTO successResponse() {
        ProductResponseDTO res = new ProductResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static ProductResponseDTO successResponse(Product product) {
        ProductDTO productDTO = toProductDTO(product);
        ProductResponseDTO res = new ProductResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setProduct(productDTO);
        return res;
    }

    static ProductResponseDTO successResponse(List<Product> products) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        products.forEach(product -> {
            productDTOList.add(toProductDTO(product));
        });
        ProductResponseDTO res = new ProductResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setProducts(productDTOList);
        return res;
    }

    static ProductResponseDTO errorResponse(Integer code, String message) {
        ProductResponseDTO res = new ProductResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }
}
