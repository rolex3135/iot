package com.asarit.iot.controller;

import com.asarit.iot.dto.SensorDataDTO;
import com.asarit.iot.service.SensorDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensor")
public class SensorDataController {
    private final SensorDataService sensorDataService;
    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody SensorDataDTO sensorDTO){
        sensorDataService.register(sensorDTO);
        return ResponseEntity.status(HttpStatus.OK).body("registered");
    }


    @GetMapping("/getById/{lakeId}")
    public SensorDataDTO getById(@PathVariable("lakeId")Long lakeId){
        return sensorDataService.getByLakeId(lakeId);
    }

}
