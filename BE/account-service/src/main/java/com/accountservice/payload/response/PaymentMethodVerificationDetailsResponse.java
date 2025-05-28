package com.accountservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodVerificationDetailsResponse {
    private Date verifiedAt;
    private String verificationMethod;
}
