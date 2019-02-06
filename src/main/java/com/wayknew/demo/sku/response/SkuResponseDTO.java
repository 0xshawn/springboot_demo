package com.wayknew.demo.sku.response;

import com.wayknew.demo.sku.SkuDTO;

import java.util.List;

public class SkuResponseDTO {
    private Integer code;
    private String message;
    private SkuDTO sku;
    private List<SkuDTO> skus;

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

    public SkuDTO getSku() {
        return sku;
    }

    public void setSku(SkuDTO sku) {
        this.sku = sku;
    }

    public List<SkuDTO> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuDTO> skus) {
        this.skus = skus;
    }
}
