package com.wayknew.demo.address;

import com.wayknew.demo.address.request.AddressRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressBO {
    @Resource
    private AddressDAO addressDAO;


    Address create(Long userId,String province,String city,String region,String street,String addressee,String addresseePhone ){
       Address address = new Address();
        address.setUserId(userId);
        address.setProvince(province);
        address.setCity(city);
        address.setRegion(region);
        address.setStreet(street);
        address.setAddressee(addressee);
        address.setAddresseePhone(addresseePhone);
        return  addressDAO.save(address);
    }

    Address getByAddressId(Long addressId) {
        return addressDAO.findByAddressId(addressId);
    }

    List<Address> getAddressList() {
        return addressDAO.findAll();
    }


    void deleteAddress(Long addressId) {
        Address address = addressDAO.findByAddressId(addressId);
        if (address != null) {
            addressDAO.delete(address);
        }
    }





    Address updateAddress(Long addressId, AddressRequestDTO body) {
        Address address = addressDAO.findByAddressId(addressId);


        if (body.getProvince() != null) {
            address.setProvince(body.getProvince());
        }
        if (body.getCity() != null) {
            address.setCity(body.getCity());
        }
        if (body.getRegion() != null) {
            address.setRegion(body.getRegion());
        }
        if (body.getStreet() != null) {
            address.setStreet(body.getStreet());
        }
        if (body.getAddressee() != null) {
            address.setAddressee(body.getAddressee());
        }
        if (body.getAddresseePhone() != null) {
            address.setAddresseePhone(body.getAddresseePhone());
        }

        address = addressDAO.save(address);
        return address;
    }






}
