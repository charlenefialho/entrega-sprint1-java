## Documentação da API - Gestão de Produtos para Prospecção de Clientes

## Como Rodar a Aplicação
Para rodar a aplicação localmente, siga os passos abaixo:

1. Clone este repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Rodar LeadtechApplication como java application para iniciar o servidor Spring Boot.
4. Acesse a aplicação em `http://localhost:8080`.

## Diagramas
Aqui estão os diagramas do projeto:

### Diagrama de Classes
![Diagrama de Arquitetura](https://github.com/charlenefialho/entrega-sprint1-java/assets/94643076/f5bc0225-9ae3-4de6-b506-609a2425f708)

### Diagrama de MER/DER
![Diagrama Conceitual](https://github.com/charlenefialho/entrega-sprint1-java/blob/main/arquivosreadme/diagramaconceitual.png)

![Diagrama lógico](https://github.com/charlenefialho/entrega-sprint1-java/blob/main/arquivosreadme/diagramaLogico.png)

## Proposta Tecnológica e Problemas a serem Resolvidos

Esta aplicação visa fornecer uma solução abrangente para o gerenciamento eficiente de produtos e análise de dados de vendas para empresas que atuam no e-commerce. Além de auxiliar no controle do inventário, a aplicação oferece ferramentas poderosas para analisar padrões de vendas e identificar oportunidades de negócio.

### Como a Aplicação Ajuda no Gerenciamento de Produtos:
- **Controle de Inventário**: A aplicação permite acompanhar o ciclo de vida dos produtos, desde a entrada no estoque até a venda ao cliente final, proporcionando uma visão completa do estoque em tempo real(CRUD).
- **Análise de Vendas**: Com filtragem nas requsiições, podem ser identificados os produtos mais vendidos, as categorias mais lucrativas e os padrões sazonais de compra, facilitando a tomada de decisões estratégicas.

### Como a Aplicação Ajuda na Atração de Novos Clientes:
- **Prospectar Clientes Potenciais**: Através da análise das categorias e produtos mais populares, os gestores podem direcionar suas estratégias de marketing e vendas para atrair novos clientes com maior precisão.
- **Personalização da Experiência do Cliente**: Ao entender as preferências dos clientes com base nos produtos mais vendidos e suas categorias, é possível personalizar ofertas e recomendações, criando uma experiência de compra mais relevante e atraente.

### arquivo dos postman exportado

[Download do Arquivo](https://github.com/charlenefialho/entrega-sprint1-java/blob/main/arquivosreadme/api-java-leadtech.postman_collection.json)

## Documentação da API

### Endpoint: Criar Produto
- Método: POST
- Rota: /api/produtos
- Descrição: Cria um novo produto.
- Corpo da Requisição:
  ```json
  {
    "nome": "Nome do Produto",
    "categoria": "Categoria do Produto",
    "estrelas": 5,
    "qtdEstoque": 100,
    "dataCompra": "2024-04-20",
    "valor": 100.00
  }
``
- **GET /api/produtos/{id}**: Obtém os detalhes de um produto específico pelo seu ID.
### Endpoint: atualizar Produto
- **PUT /api/produtos/{id}**: Atualiza as informações de um produto existente.
```json
  {
    "nome": "Nome do Produto",
    "categoria": "Categoria do Produto",
    "estrelas": 4,
    "qtdEstoque": 100,
    "dataCompra": "2024-04-14",
    "valor": 99.99
  }
```

- **DELETE /api/produtos/{id}**: Exclui um produto do sistema.
- **GET /api/produtos**: Obtém a lista de todos os produtos cadastrados no sistema.

### Filtragem de Produtos

- **GET /api/produtos?categoria={categoria}**: Filtra os produtos por categoria.
- **GET /api/produtos?estrelas={estrelas}**: Filtra os produtos por classificação de estrelas.

### Integrantes do grupo
> Charlene reponsável por toda a criação da API.
> 
> Bianca responsável pela entrega de front.
> 
> Fabricio responsável pela entrega de BD.
> 
> Lucca responsável pela entrega de Devops, QA e .NET
> 
> Laís responsável pela entrega de IA.
<table>
  <tr>
        <td align="center">
      <a href="https://github.com/biancaroman">
        <img src="https://avatars.githubusercontent.com/u/128830935?v=4" width="100px;" border-radius='50%' alt="Bianca Román's photo on GitHub"/><br>
        <sub>
          <b>Bianca Román</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/charlenefialho">
        <img src="https://avatars.githubusercontent.com/u/94643076?v=4" width="100px;" border-radius='50%' alt="Charlene Aparecida's photo on GitHub"/><br>
        <sub>
          <b>Charlene Aparecida</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/laiscrz">
        <img src="https://avatars.githubusercontent.com/u/133046134?v=4" width="100px;" alt="Lais Alves's photo on GitHub"/><br>
        <sub>
          <b>Lais Alves</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/LuccaRaphael">
        <img src="https://avatars.githubusercontent.com/u/127765063?v=4" width="100px;" border-radius='50%' alt="Lucca Raphael's photo on GitHub"/><br>
        <sub>
          <b>Lucca Raphael</b>
        </sub>
      </a>
    </td>
     <td align="center">
      <a href="https://github.com/Fabs0602">
        <img src="https://avatars.githubusercontent.com/u/111320639?v=4" width="100px;" border-radius='50%' alt="Fabricio Torres's photo on GitHub"/><br>
        <sub>
          <b>Fabricio Torres</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
