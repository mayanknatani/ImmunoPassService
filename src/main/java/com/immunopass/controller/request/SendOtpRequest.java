package com.immunopass.controller.request;

import com.immunopass.enums.AccountIdentifierType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendOtpRequest {
    private String identifier;
    private AccountIdentifierType identifier_type;
}