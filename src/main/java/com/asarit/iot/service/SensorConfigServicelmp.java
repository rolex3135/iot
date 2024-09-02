package com.asarit.iot.service;

import com.asarit.iot.dto.SensorConfigDTO;
import com.asarit.iot.mapper.SensorConfigMapper;
import com.asarit.iot.model.Lake;
import com.asarit.iot.model.SensorConfig;
import com.asarit.iot.repo.LakeRepo;
import com.asarit.iot.repo.SensorConfigRepo;
import org.springframework.stereotype.Service;

@Service
public class SensorConfigServicelmp implements SensorConfigService {
    private final SensorConfigRepo sensorConfigRepo;
    private final LakeRepo lakeRepo;
    private final SensorConfigMapper sensorConfigMapper;



    public SensorConfigServicelmp(SensorConfigRepo sensorConfigRepo, LakeRepo lakeRepo, SensorConfigMapper sensorConfigMapper) {
        this.sensorConfigRepo = sensorConfigRepo;
        this.lakeRepo = lakeRepo;
        this.sensorConfigMapper = sensorConfigMapper;
    }


    @Override
    public SensorConfigDTO getByConfigId(Long sensorConfigId) {
       SensorConfig sensorConfigFromDb= sensorConfigRepo.findById(sensorConfigId).get();
      return sensorConfigMapper.toSensorConfigDTO(sensorConfigFromDb);

    }

    @Override
    public SensorConfig register(SensorConfigDTO sensorConfigDTO) {
        Lake lakeFromDb=lakeRepo.findById(sensorConfigDTO.getLakeId()).get();
        SensorConfig sensorConfig= sensorConfigMapper.toSensorConfig(sensorConfigDTO);
        sensorConfig.setLake(lakeFromDb);
        return sensorConfigRepo.save(sensorConfig);

    }

    @Override
    public SensorConfigDTO getById(Long lakeId) {
        SensorConfig sensorConfig=sensorConfigRepo.findBylakeId(lakeId);

        return sensorConfigMapper.toSensorConfigDTO(sensorConfig);
    }
}
