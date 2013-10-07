-- Table: tb_login

-- DROP TABLE tb_login;

CREATE TABLE tb_login
(
  id  serial NOT NULL,
  "login" character varying(10),
  senha character varying(10)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_login OWNER TO postgres;
