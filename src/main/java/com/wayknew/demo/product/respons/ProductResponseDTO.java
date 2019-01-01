package com.wayknew.demo.product.respons;

import com.wayknew.demo.product.Product;
import com.wayknew.demo.product.ProductDTO;
import javafx.print.PageOrientation;

import java.util.List;

public class ProductResponseDTO {
    private Integer code;
    private String message;
    private ProductDTO product;
    private List<ProductDTO> products;

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> users) {
        this.products = products;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

}
