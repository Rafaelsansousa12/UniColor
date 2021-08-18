create table cor (
    ID    bigint auto_increment primary key,
    CLASSE_COR varchar(255) null,
    DESCRICAO_COR  varchar(255) null,
    ANO varchar(255) null,
    CODIGO_LAZZURIL  bigint null,
    CODIGO_UNIVERSAL  bigint null,
    MONTADORA  varchar(255) null
);

create table carro (
    ID    bigint auto_increment primary key,
    MODELO varchar(255) null,
    FABRICANTE  varchar(255) null,
    ANO varchar(255) null,
    CODIGO bigint null,
    COR_ID  bigint null
);

drop table carro;




INSERT INTO carro (modelo, fabricante, ano, codigo, cor_id)
VALUES ('gol', 'Wolksvagen', '2015', 123, 321);

SELECT * FROM unicolor.carro;