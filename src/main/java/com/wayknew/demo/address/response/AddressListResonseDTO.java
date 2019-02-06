package com.wayknew.demo.address.response;

import com.wayknew.demo.address.AddressDTO;

import java.util.List;

public class AddressListResonseDTO {
    private Integer code;
    private String message;
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

    public List<AddressDTO> getAddresss() {
        return addresss;
    }

    public void setAddressss(List<AddressDTO> addresss) {
        this.addresss = addresss;
    }
}


