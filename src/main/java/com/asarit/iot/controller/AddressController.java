package com.asarit.iot.controller;

import com.asarit.iot.dto.AddressDTO;
import com.asarit.iot.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("save")
    public String addresSave(@RequestBody AddressDTO addressDTO){
        addressService.save(addressDTO);
        return "sucess";
    }
    @GetMapping("getByLakeId/{lakeId}")
    public AddressDTO getByLakeId(@PathVariable("lakeId") Long lakeId){
        return addressService.getByLakeId(lakeId);
    }
}
