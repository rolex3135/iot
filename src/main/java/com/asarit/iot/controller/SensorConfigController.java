package com.asarit.iot.controller;

import com.asarit.iot.dto.SensorConfigDTO;
import com.asarit.iot.model.SensorConfig;
import com.asarit.iot.service.SensorConfigService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensorConfig")
public class SensorConfigController {
    private final SensorConfigService sensorConfigService;


    public SensorConfigController(SensorConfigService sensorConfigService  ) {
        this.sensorConfigService = sensorConfigService;

    }

    @PostMapping("/save")

    public ResponseEntity<String> register(@RequestBody SensorConfigDTO sensorConfigDTO){
        sensorConfigService.register(sensorConfigDTO);
        return  ResponseEntity.status(HttpStatus.OK).body("registered");
    }

    @GetMapping("/getBylakeId/{lakeId}")
    public SensorConfigDTO getBylakeId(@PathVariable("lakeId") Long lakeId){
        return  sensorConfigService.getById(lakeId);
    }
    @GetMapping("/getByConfigId/{sensorConfigId}")
   public SensorConfigDTO  getByConfigId(@PathVariable("sensorConfigId") Long sensorConfigId){
      return  sensorConfigService.getByConfigId(sensorConfigId);
    }


}
