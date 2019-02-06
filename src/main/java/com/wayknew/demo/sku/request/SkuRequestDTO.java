package com.wayknew.demo.sku.request;

import javax.persistence.*;
import java.sql.Timestamp;

public class SkuRequestDTO {
    private String name;
    private String description;
    private Integer price;
    private String img;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}