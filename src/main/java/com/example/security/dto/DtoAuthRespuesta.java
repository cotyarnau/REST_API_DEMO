package com.example.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Esta clase va a ser la que nos devolverá la información con el token y el tipo que tenga este
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoAuthRespuesta {
    private String accessToken;
    private String tokenType = "Bearer ";

    public DtoAuthRespuesta(String accessToken) {
        this.accessToken = accessToken;
    }
}

