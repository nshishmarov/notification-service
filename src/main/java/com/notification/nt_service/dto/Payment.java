package com.notification.nt_service.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    @JsonProperty("paymentName")
    private String paymentName;
    @JsonProperty("paymentDate")
    @JsonFormat(pattern = "dd.MM.yyyy", shape = JsonFormat.Shape.STRING)
    private Date paymentDate;
    @JsonProperty("paymentStatus")
    private String paymentStatus;
}
