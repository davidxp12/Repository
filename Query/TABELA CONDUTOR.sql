CREATE TABLE tb_condutor
(
  idCondutor serial NOT NULL,
  nome character varying(50),
  idCliente  int NULL,
  idLocacao  int NULL,
  numeroHabilitacao character varying(120),
  categoriaHabilitacao  character varying(5),
  sexo character varying(5),
  dataNascimento character varying(120),
  validade character varying(120),
  CONSTRAINT idCondutor PRIMARY KEY (idCondutor)
)
WITH (
  OIDS=FALSE,
  autovacuum_enabled=true
);
ALTER TABLE tb_condutor OWNER TO postgres;
GRANT SELECT(idCondutor), UPDATE(idCondutor), INSERT(idCondutor), REFERENCES(idCondutor) ON 

tb_condutor TO public;