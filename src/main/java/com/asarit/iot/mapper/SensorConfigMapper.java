package com.asarit.iot.mapper;

import com.asarit.iot.dto.SensorConfigDTO;
import com.asarit.iot.model.SensorConfig;
import org.springframework.stereotype.Service;

@Service
public class SensorConfigMapper {
    public SensorConfig toSensorConfig(SensorConfigDTO sensorConfigDTO){
        SensorConfig sensorConfig=new SensorConfig();
        sensorConfig.setId(sensorConfigDTO.getId());
        sensorConfig.setDoSerialNo(sensorConfigDTO.getDoSerialNo());
        sensorConfig.setPhSerialNo(sensorConfigDTO.getPhSerialNo());
        sensorConfig.setDoPdf(sensorConfigDTO.getDoPdf());
        sensorConfig.setPhPdf(sensorConfigDTO.getPhPdf());
        sensorConfig.setDoAmount(sensorConfigDTO.getDoAmount());
        sensorConfig.setPhAmount(sensorConfigDTO.getPhAmount());
        return  sensorConfig;
    }

    public SensorConfigDTO toSensorConfigDTO(SensorConfig sensorConfig){
        return new SensorConfigDTO(
                sensorConfig.getLake().getId(),
                sensorConfig.getId(),
                sensorConfig.getPhSerialNo(),
                sensorConfig.getDoSerialNo(),
                sensorConfig.getPhPdf(),
                sensorConfig.getDoPdf(),
                sensorConfig.getPhAmount(),
                sensorConfig.getDoAmount()


        );
    }
}
