package com.wayknew.demo.product.respons;

import com.wayknew.demo.product.Product;
import com.wayknew.demo.product.ProductDTO;

import java.util.List;

public class ProductListResponseDTO {
    private Integer code;
    private String message;
    private List<ProductDTO> products;

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

    public List<ProductDTO> getproducts() {
        return products;
    }

    public void setproducts(List<ProductDTO> products) {
        this.products = products;
    }

}
