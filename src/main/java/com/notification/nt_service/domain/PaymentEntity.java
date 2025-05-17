package com.notification.nt_service.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@EqualsAndHashCode
@ToString
@Data
@RequiredArgsConstructor
@Table(name = "payments")
public class PaymentEntity implements Serializable {
    @Id
    @Column(name = "paymentId", columnDefinition = "uuid")
    @JsonProperty("paymentId")
    private UUID paymentId;
    @Column(name = "paymentName", columnDefinition = "varchar(50)")
    @JsonProperty("paymentName")
    private String paymentName;
    @Column(name = "paymentDate", columnDefinition = "date")
    @JsonProperty("paymentDate")
    private Date paymentDate;
    @Column(name = "paymentStatus", columnDefinition = "varchar(50)")
    @JsonProperty("paymentStatus")
    private String paymentStatus;
}
