package com.nbstech.spring.basic.dataaccess.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPAPlayerRepository extends JpaRepository<PlayerEntity, Integer> {
}
