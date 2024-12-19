package com.Muellimler.Muellimler.DAO.Repository;

import com.Muellimler.Muellimler.DAO.Entity.MuellimEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MuellimRepository extends CrudRepository<MuellimEntity,Long> {
    Optional<MuellimEntity> findByMuellimIdAndStatusNot(Long id);
}
