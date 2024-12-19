package com.Muellimler.Muellimler.MODEL.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MuellimResponse {
    private String name;
    private String surname;
    private Integer age;
}
