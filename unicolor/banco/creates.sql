create table cor (
    ID    bigint auto_increment primary key,
    CLASSE_COR varchar(255) null,
    DESCRICAO_COR  varchar(255) null,
    ANO varchar(255) null,
    CODIGO_LAZZURIL  bigint null,
    CODIGO_UNIVERSAL  bigint null,
    MONTADORA  varchar(255) null
);

drop table cor;


INSERT INTO cor (classe_cor, desc_cor, ano, lazzuril_code, uni_code, montadora)
VALUES ('vermelho', 'vermelho metalico', '2015', 123, 321, 'ford');

SELECT * FROM unicolor.cor;