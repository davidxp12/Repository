-- Table: tb_clientepj

CREATE TABLE tb_clientepj
(
  id serial NOT NULL,
  nomefantasia character varying(50),
  nomejuridico character varying(50),
  telefone character varying(15),
  email character varying(30),
  endereco character varying(120),
  cnpj character varying(14),
  CONSTRAINT pk_clientepj_id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_clientepj OWNER TO postgres;