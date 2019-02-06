package com.wayknew.demo.address;

import com.wayknew.demo.address.request.AddressRequestDTO;
import com.wayknew.demo.address.response.AddressResponseDTO;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v8")
public class AddressController {
    @Resource
    private AddressBO addressBO;

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public AddressResponseDTO createAddress(@RequestBody AddressRequestDTO body) {
        try {
            Address address = addressBO.create(body.getUserId(),body.getProvince(),body.getCity(),body.getRegion(),body.getStreet(),body.getAddressee(),body.getAddresseePhone());
            return AddressFactory.successResponse(address);
        } catch (Exception e) {
            return AddressFactory.errorResponse(1, e.toString());
        }
    }





    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public AddressResponseDTO getAddressList() {
        try {
            List<Address> addresss = addressBO.getAddressList();
            return AddressFactory.successResponse(addresss);
        } catch (Exception e) {
            return AddressFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/address/{addressId}", method = RequestMethod.GET)
    public AddressResponseDTO getAddressById(@PathVariable("addressId") Long addressId) {
        try {
            Address address = addressBO.getByAddressId(addressId);
            return AddressFactory.successResponse(address);
        } catch (Exception e) {
            return AddressFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/address/{addressId}", method = RequestMethod.PATCH)
    public AddressResponseDTO updateAddress(@PathVariable("addressId") Long addressId,
                                      @RequestBody AddressRequestDTO body) {
        try {
            Address address = addressBO.updateAddress(addressId, body);
            return AddressFactory.successResponse(address);
        } catch (Exception e) {
            return AddressFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/cart/{addressId}", method = RequestMethod.DELETE)
    public AddressResponseDTO deleteAddress(@PathVariable("addressId") Long addressId) {
        try {
            addressBO.deleteAddress(addressId);
            return AddressFactory.successResponse();
        } catch (Exception e) {
            return AddressFactory.errorResponse(3, e.toString());
        }
    }


}
