drop table Lead cascade constraints;
drop table Cliente cascade constraints;
drop table Produto cascade constraints;
drop table Fornecedor cascade constraints;
drop table LocalizacaoGeografica cascade constraints;

CREATE TABLE Lead (
    idLead NUMBER(10) PRIMARY KEY,
    canalOrigem VARCHAR2(100),
    categoriaProdutoInteresse VARCHAR2(100)
);

CREATE TABLE Cliente (
    idCliente NUMBER(10) PRIMARY KEY,
    idLead NUMBER(10),
    nome VARCHAR2(100),
    telefone VARCHAR2(20),
    email VARCHAR2(255),
    idade NUMBER(3),
    genero VARCHAR2(10),
    estadoCivil VARCHAR2(20),
    idLocalizacao NUMBER(10),
    nivelRenda NUMBER(12, 2),
    nivelEducacao VARCHAR2(100),
    formaPagamentoPref VARCHAR2(50),
    CONSTRAINT fk_cliente_lead FOREIGN KEY (idLead) REFERENCES Lead(idLead) ON DELETE CASCADE
);

CREATE TABLE Produto (
    idProduto NUMBER(10) PRIMARY KEY,
    idFornecedor NUMBER(10),
    nomeProduto VARCHAR2(255),
    estrelas NUMBER(5),
    categoriaProduto VARCHAR2(100),
    qtdEstoque NUMBER(10),
    dataCompraProduto DATE,
    valorProduto NUMBER(12, 2),
    CONSTRAINT fk_produto_fornecedor FOREIGN KEY (idFornecedor) REFERENCES Fornecedor(idFornecedor) ON DELETE CASCADE
);

CREATE TABLE Fornecedor (
    idFornecedor NUMBER(10) PRIMARY KEY,
    nomeFornecedor VARCHAR2(255),
    tipoFornecedor VARCHAR2(100)
);

CREATE TABLE LocalizacaoGeografica (
    idLocalizacao NUMBER(10) PRIMARY KEY,
    pais VARCHAR2(100),
    estado VARCHAR2(100),
    cidade VARCHAR2(100),
    cep VARCHAR2(20)
);

-- Adicionando restrições de chave estrangeira usando ALTER TABLE

ALTER TABLE Cliente ADD CONSTRAINT fk_cliente_localizacao FOREIGN KEY (idLocalizacao) REFERENCES LocalizacaoGeografica(idLocalizacao) ON DELETE CASCADE;

ALTER TABLE Produto ADD CONSTRAINT fk_produto_fornecedor FOREIGN KEY (idFornecedor) REFERENCES Fornecedor(idFornecedor) ON DELETE CASCADE;

-- Inserções na tabela Lead
INSERT INTO Lead (idLead, canalOrigem, categoriaProdutoInteresse) VALUES (1, 'Site', 'Eletrônicos');
INSERT INTO Lead (idLead, canalOrigem, categoriaProdutoInteresse) VALUES (2, 'Redes Sociais', 'Moda');

-- Inserções na tabela Cliente
INSERT INTO Cliente (idCliente, idLead, nome, telefone, email, idade, genero, estadoCivil, idLocalizacao, nivelRenda, nivelEducacao, formaPagamentoPref)
VALUES (101, 1, 'Ana', '123456789', 'ana@example.com', 30, 'Feminino', 'Solteiro(a)', 201, 5000.00, 'Graduação', 'Cartão de Crédito');
INSERT INTO Cliente (idCliente, idLead, nome, telefone, email, idade, genero, estadoCivil, idLocalizacao, nivelRenda, nivelEducacao, formaPagamentoPref)
VALUES (102, 2, 'João', '987654321', 'joao@example.com', 35, 'Masculino', 'Casado(a)', 202, 6000.00, 'Pós-Graduação', 'Boleto Bancário');

-- Inserções na tabela Produto
INSERT INTO Produto (idProduto, idFornecedor, nomeProduto, estrelas, categoriaProduto, qtdEstoque, dataCompraProduto, valorProduto)
VALUES (301, 1, 'Smartphone', 4, 'Tecnologia', 100, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 1500.00);
INSERT INTO Produto (idProduto, idFornecedor, nomeProduto, estrelas, categoriaProduto, qtdEstoque, dataCompraProduto, valorProduto)
VALUES (302, 2, 'Camisa Polo', 5, 'Moda', 200, TO_DATE('2023-02-01', 'YYYY-MM-DD'), 100.00);

-- Inserções na tabela Fornecedor
INSERT INTO Fornecedor (idFornecedor, nomeFornecedor, tipoFornecedor)
VALUES (1, 'TecnoCorp', 'Tecnologia');
INSERT INTO Fornecedor (idFornecedor, nomeFornecedor, tipoFornecedor)
VALUES (2, 'ModaStyle', 'Moda');

-- Inserções na tabela LocalizacaoGeografica
INSERT INTO LocalizacaoGeografica (idLocalizacao, pais, estado, cidade, cep)
VALUES (201, 'Brasil', 'São Paulo', 'São Paulo', '01000-000');
INSERT INTO LocalizacaoGeografica (idLocalizacao, pais, estado, cidade, cep)
VALUES (202, 'Brasil', 'Rio de Janeiro', 'Rio de Janeiro', '20000-000');

select * from Lead;
select * from Cliente;
select * from Produto;
select * from Fornecedor;
select * from LocalizacaoGeografica;