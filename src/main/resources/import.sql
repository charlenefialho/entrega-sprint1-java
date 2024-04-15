INSERT INTO Fornecedor (idFornecedor, nomeFornecedor, tipoFornecedor) VALUES (1, 'TecnoCorp', 'Tecnologia');
INSERT INTO Fornecedor (idFornecedor, nomeFornecedor, tipoFornecedor) VALUES (2, 'ModaStyle', 'Moda');

INSERT INTO LocalizacaoGeografica (idLocalizacao, pais, estado, cidade, cep) VALUES (201, 'Brasil', 'São Paulo', 'São Paulo', '01000-000');
INSERT INTO LocalizacaoGeografica (idLocalizacao, pais, estado, cidade, cep) VALUES (202, 'Brasil', 'Rio de Janeiro', 'Rio de Janeiro', '20000-000');

INSERT INTO Lead (idLead, canalOrigem, categoriaProdutoInteresse) VALUES (1, 'Site', 'Eletrônicos');
INSERT INTO Lead (idLead, canalOrigem, categoriaProdutoInteresse) VALUES (2, 'Redes Sociais', 'Moda');

INSERT INTO Cliente (idCliente, idLead, nome, telefone, email, idade, genero, estadoCivil, idLocalizacao, nivelRenda, nivelEducacao, formaPagamentoPref) VALUES (101, 1, 'Ana', '123456789', 'ana@example.com', 30, 'Feminino', 'Solteiro(a)', 201, 5000.00, 'Graduação', 'Cartão de Crédito');
INSERT INTO Cliente (idCliente, idLead, nome, telefone, email, idade, genero, estadoCivil, idLocalizacao, nivelRenda, nivelEducacao, formaPagamentoPref) VALUES (102, 2, 'João', '987654321', 'joao@example.com', 35, 'Masculino', 'Casado(a)', 202, 6000.00, 'Pós-Graduação', 'Boleto Bancário');

INSERT INTO Produto (idProduto, idFornecedor, nomeProduto, estrelas, categoriaProduto, qtdEstoque, dataCompraProduto, valorProduto) VALUES (301, 1, 'Smartphone', 4, 'Tecnologia', 100, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 1500.00);
INSERT INTO Produto (idProduto, idFornecedor, nomeProduto, estrelas, categoriaProduto, qtdEstoque, dataCompraProduto, valorProduto) VALUES (302, 2, 'Camisa Polo', 5, 'Moda', 200, TO_DATE('2023-02-01', 'YYYY-MM-DD'), 100.00);
