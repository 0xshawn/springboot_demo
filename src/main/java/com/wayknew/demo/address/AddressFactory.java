package com.wayknew.demo.address;

import com.wayknew.demo.address.response.AddressResponseDTO;
import com.wayknew.demo.address.AddressDTO;
import java.util.ArrayList;
import java.util.List;

public class AddressFactory {
    static AddressDTO toAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(address.getAddressId());
        addressDTO.setUserId(address.getUserId());
        addressDTO.setProvince(address.getProvince());
        addressDTO.setCity(address.getCity());
        addressDTO.setRegion(address.getRegion());
        addressDTO.setStreet(address.getStreet());
        addressDTO.setAddressee(address.getAddressee());
        addressDTO.setAddresseePhone(address.getAddresseePhone());
        addressDTO.setCreatedAt(address.getCreatedAt());
        addressDTO.setUpdatedAt(address.getUpdatedAt());
        return addressDTO;
    }

    static AddressResponseDTO successResponse() {
        AddressResponseDTO res = new AddressResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static AddressResponseDTO successResponse(Address address) {
        AddressDTO addressDTO = toAddressDTO(address);
        AddressResponseDTO res = new AddressResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setAddress(addressDTO);
        return res;
    }


    static AddressResponseDTO successResponse(List<Address> addresses) {
        List<AddressDTO> addressDTOList = new ArrayList<>();
        addresses.forEach(user -> {
            addressDTOList.add(toAddressDTO(user));
        });
        AddressResponseDTO res = new AddressResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setAddresss(addressDTOList);
        return res;
    }


    static AddressResponseDTO errorResponse(Integer code, String message) {
        AddressResponseDTO res = new AddressResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

}
