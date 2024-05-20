-- Inserts para Fornecedor
INSERT INTO fornecedor (nome_fornecedor, tipo_fornecedor) VALUES ('Fornecedor ABC Ltda.', 'Distribuidora de Eletrônicos');
INSERT INTO fornecedor (nome_fornecedor, tipo_fornecedor) VALUES ('Fornecedor XYZ S/A', 'Fabricante de Vestuário');

-- Inserts para LocalizacaoGeografica
INSERT INTO localizacao_geografica (pais, estado, cidade, cep) VALUES ('Brasil', 'São Paulo', 'São Paulo', '01000-000');

-- Inserts para Lead
INSERT INTO lead (canal_origem, categoria_produto_interesse) VALUES ('Redes Sociais', 'Eletrônicos');

-- Inserts para Produto
INSERT INTO produto (nome_produto, estrelas, categoria_produto, qtd_estoque, data_compra_produto, valor_produto, id_fornecedor) VALUES ('Smartphone ABC', 4, 'Telefonia', 50, CURRENT_TIMESTAMP, 1500.00, 1);
INSERT INTO produto (nome_produto, estrelas, categoria_produto, qtd_estoque, data_compra_produto, valor_produto, id_fornecedor) VALUES ('Camiseta XYZ', 5, 'Vestuário', 100, CURRENT_TIMESTAMP, 50.00, 2);


-- Inserts para Cliente
INSERT INTO cliente (nome, telefone, email, idade, genero, estado_civil, nivel_renda, nivel_educacao, forma_pagamento_pref,id_localizacao,id_lead) VALUES ('João Silva', '+55 11 91234-5678', 'joao.silva@example.com', 35, 'Masculino', 'Casado', 7000, 'Pós-graduação', 'Cartão de Crédito', 1, 1);
