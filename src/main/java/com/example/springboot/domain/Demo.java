package com.example.springboot.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Demo {
    @NotBlank
    private String id;
    @NotBlank
    private String colA;
    private boolean colB;
    @NotNull
    private Date colC;
}

