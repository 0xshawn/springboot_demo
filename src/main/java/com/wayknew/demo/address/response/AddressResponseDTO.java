package com.wayknew.demo.address.response;


import com.wayknew.demo.address.AddressDTO;

import java.util.List;

public class AddressResponseDTO {
    private Integer code;
    private String message;
    private AddressDTO address;
    private List<AddressDTO> addresss;

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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public List<AddressDTO> getAddresss() {
        return addresss;
    }

    public void setAddresss(List<AddressDTO> addresss) {
        this.addresss = addresss;
    }
}
