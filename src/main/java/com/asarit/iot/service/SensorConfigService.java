package com.asarit.iot.service;

import com.asarit.iot.dto.SensorConfigDTO;
import com.asarit.iot.model.SensorConfig;

public interface SensorConfigService {


      SensorConfigDTO getByConfigId(Long sensorConfigId) ;


    SensorConfig register(SensorConfigDTO sensorConfigDTO);

    SensorConfigDTO getById(Long lakeId);

}
