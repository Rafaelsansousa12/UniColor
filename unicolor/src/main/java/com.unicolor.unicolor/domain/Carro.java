package com.unicolor.unicolor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "ID", nullable = true)
    private Long id;

    @JoinColumn(name = "MODELO", nullable = true)
    private String modelo;

    @JoinColumn(name = "FABRICANTE", nullable = true)
    private String fabricante;

    @JoinColumn(name = "ANO", nullable = true)
    private String ano;

    @JoinColumn(name = "CODIGO", nullable = true)
    private Long codigo;

    @JoinColumn(name = "ID_COR", nullable = true)
    private Long corId;
}
