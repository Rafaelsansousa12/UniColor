package com.unicolor.unicolor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "ID", nullable = true)
    private Long id;

    @JoinColumn(name = "CLASSE_COR", nullable = true)
    private String classeCor;

    @JoinColumn(name = "DESCRICAO_COR", nullable = true)
    private String descCor;

    @JoinColumn(name = "ANO", nullable = true)
    private String ano;

    @JoinColumn(name = "CODIGO_LAZZURIL", nullable = true)
    private Long lazzurilCode;

    @JoinColumn(name = "CODIGO_UNIVERSAL", nullable = true)
    private Long uniCode;

    @JoinColumn(name = "MONTADORA", nullable = true)
    private String montadora;
}