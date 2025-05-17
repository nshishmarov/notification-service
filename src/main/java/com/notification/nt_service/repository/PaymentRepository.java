package com.notification.nt_service.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.notification.nt_service.domain.PaymentEntity;

@Repository
public interface PaymentRepository extends CrudRepository<UUID, PaymentEntity> {  
}
