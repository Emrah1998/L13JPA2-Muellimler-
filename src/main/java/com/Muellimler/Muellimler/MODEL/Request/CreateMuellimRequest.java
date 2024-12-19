package com.Muellimler.Muellimler.MODEL.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMuellimRequest {
    private String name;
    private String surname;
    private Integer age;
}
