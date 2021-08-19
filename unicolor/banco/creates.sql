
create table cor (
    ID    bigint auto_increment primary key,
    CLASSE_COR varchar(255) null,
    DESC_COR  varchar(255) null,
    ANO varchar(255) null,
    lazzuril_code  bigint null,
    uni_code  bigint null,
    MONTADORA  varchar(255) null
);

create table carro (
    ID bigint auto_increment primary key,
    MODELO varchar(255) null,
    FABRICANTE varchar(255) null,
    ANO varchar(255) null,
    CODIGO bigint null,
    COR_ID bigint null,
    constraint FK_CARRO_COR foreign key (COR_ID) references cor (id)
);

drop table cor;
drop table carro;



INSERT INTO cor (classe_cor, desc_cor, ano, lazzuril_code, uni_code, montadora)
VALUES ('branco', 'branco gelo', '2015', 123, 1, 'Volkswagen');

INSERT INTO carro (modelo, fabricante, ano, codigo, cor_id)
VALUES ('gol', 'Volkswagen', '2015', 123, 1);

SELECT * FROM unicolor.carro;