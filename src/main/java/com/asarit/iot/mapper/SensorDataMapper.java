package com.asarit.iot.mapper;

import com.asarit.iot.dto.SensorDataDTO;
import com.asarit.iot.model.SensorData;
import org.springframework.stereotype.Service;

@Service
public class SensorDataMapper {
    public SensorData toSensorData(SensorDataDTO sensorDataDTO){
        SensorData sensorData=new SensorData();
        sensorData.setId(sensorDataDTO.getId());
        sensorData.setDoValue(sensorDataDTO.getDoValue());
        sensorData.setPhValue(sensorDataDTO.getPhValue());
        return  sensorData;

    }


    public SensorDataDTO toSensorDataDTO(SensorData sensorData) {

        SensorDataDTO sensorDataDTO=new SensorDataDTO();
        sensorDataDTO.setId(sensorData.getId());
        sensorDataDTO.setDoValue(sensorData.getDoValue());
        sensorDataDTO.setPhValue(sensorData.getPhValue());
        sensorDataDTO.setLakeId(sensorData.getLake().getId());
        return sensorDataDTO;
    }
}
