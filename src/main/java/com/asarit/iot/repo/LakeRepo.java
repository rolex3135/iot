package com.asarit.iot.repo;

import com.asarit.iot.model.Lake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LakeRepo extends JpaRepository<Lake,Long> {
}
