# Exercicios Práticos - Aula 3

## 1. Criar um sistema de associações.

### Classes necessárias

- Produto

  - Produto tem 1 grupo.

- Grupo de Produto

  - Grupo de produtos tem 1 ou mais produtos

- Loja
  - Loja tem 1 endereço
- Endereço

- Telefone
  - Loja tem 1 ou mais telefones (Ex Comercial, Fiscal, Financeiro)

Criar um metódo onde seja preenchido as informações necessárias da loja: produtos e grupo de produtos, endereço e dados de lojas.

### Estrutura sem relacionametos:

- Produto
  - id
  - descricao
  - valor
  - dataCadastro
  - fornecedor
- Grupo Produto
  - id
  - descricao
- Loja
  - id
  - cnpj
  - razao
  - numero
  - complemento
- Telefone
  - id
  - numero
  - tipo

## 2. Método de validação

- Criar um método que receba o objeto **Loja** e nesse mesmo metódo inclua novos produtos, telefones e imprima os valores.

- Não deixar incluir um produto que ja exista na loja, validar e printar caso essa situação aconteça

- Imprimir os valores de loja
