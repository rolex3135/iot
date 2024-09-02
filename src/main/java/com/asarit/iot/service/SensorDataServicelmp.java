package com.asarit.iot.service;

import com.asarit.iot.dto.SensorDataDTO;
import com.asarit.iot.mapper.SensorDataMapper;
import com.asarit.iot.model.Lake;
import com.asarit.iot.model.SensorData;
import com.asarit.iot.repo.LakeRepo;
import com.asarit.iot.repo.SensorDataRepo;
import org.springframework.stereotype.Service;

@Service
public class SensorDataServicelmp  implements  SensorDataService{

    private final LakeRepo lakeRepo;
    private final SensorDataRepo sensorDataRepo;
    private  final SensorDataMapper sensorDataMapper;

    public SensorDataServicelmp(LakeRepo lakeRepo, SensorDataRepo sensorDataRepo, SensorDataMapper sensorDataMapper) {
        this.lakeRepo = lakeRepo;
        this.sensorDataRepo = sensorDataRepo;
        this.sensorDataMapper = sensorDataMapper;
    }
    @Override
    public void register(SensorDataDTO sensorDataDTO) {
        Lake lakeFromDb=lakeRepo.findById(sensorDataDTO.getLakeId()).get();
        SensorData sensorData= sensorDataMapper.toSensorData(sensorDataDTO);

        sensorData.setLake(lakeFromDb);
        sensorDataRepo.save(sensorData);

    }

    @Override
    public SensorDataDTO getByLakeId(Long lakeId) {
        SensorData sensorData=sensorDataRepo.findByLakeId(lakeId);
        return  sensorDataMapper.toSensorDataDTO(sensorData);

    }


}
