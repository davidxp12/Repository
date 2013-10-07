-- Table: "TB_Veiculo"

DROP TABLE "TB_Veiculo";

CREATE TABLE "TB_Veiculo"
(
  Id serial ,
  Chassi VARCHAR(9),
  Placa VARCHAR(7),
  Cidade VARCHAR(20),
  Estado CHAR(2),
  Grupo VARCHAR(20),
  Modelo VARCHAR(20),
  Fabricante VARCHAR(20),
  Ano VARCHAR(10),
  Km numeric(10,2),
  Valortarifalivre numeric(10,2),
  Valortarifakm numeric(10,2)
)
