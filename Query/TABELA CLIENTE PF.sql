-- Table: tb_clientepf

CREATE TABLE TB_clientepf
(
  id serial NOT NULL,
  nome character varying(50),
  telefone character varying(15),
  email character varying(30),
  endereco character varying(120),
  cpf character varying(12),
  rg character varying(12),
  sexo character varying(5),
  datanascimento character varying(12),
  cnh character varying(12),
  datavalida character varying(12),
  categoria character(5),
  estadoemissor character(5),
  passaporte character varying(12),
  CONSTRAINT pk_clientepf_id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE,
  autovacuum_enabled=true
);
ALTER TABLE TB_clientepf OWNER TO postgres;
GRANT SELECT(id), UPDATE(id), INSERT(id), REFERENCES(id) ON TB_clientepf TO public;