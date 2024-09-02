package com.asarit.iot.service;

import com.asarit.iot.dto.SensorDataDTO;

public interface SensorDataService {
    SensorDataDTO getByLakeId(Long lakeId) ;


    void register(SensorDataDTO sensorDTO);

}
