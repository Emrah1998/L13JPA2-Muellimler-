package com.Muellimler.Muellimler.DAO.Entity;

import com.Muellimler.Muellimler.MODEL.Enum.MuellimStatus;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "muellimler")
public class MuellimEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private MuellimStatus status;
}
