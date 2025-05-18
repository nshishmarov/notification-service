package com.notification.nt_service.domain;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "payments")
public class PaymentEntity {
    @Id
    @Column(name = "\"paymentId\"", columnDefinition = "uuid")
    @JsonProperty("paymentId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID paymentId;
    @Column(name = "\"paymentName\"", columnDefinition = "varchar(50)")
    @JsonProperty("paymentName")
    private String paymentName;
    @Column(name = "\"paymentDate\"", columnDefinition = "date")
    @JsonProperty("paymentDate")
    private Date paymentDate;
    @Column(name = "\"paymentStatus\"", columnDefinition = "varchar(50)")
    @JsonProperty("paymentStatus")
    private String paymentStatus;
}
