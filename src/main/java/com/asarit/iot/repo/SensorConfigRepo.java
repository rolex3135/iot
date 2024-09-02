package com.asarit.iot.repo;

import com.asarit.iot.model.SensorConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorConfigRepo extends JpaRepository<SensorConfig,Long> {
    SensorConfig findBylakeId(Long lakeId);

}
