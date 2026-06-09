# Sistema de Estoque

## Descrição

Projeto desenvolvido em Java com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos (POO), manipulação de listas, estruturas de repetição e organização de responsabilidades entre classes.

O sistema permite cadastrar produtos, listar os produtos cadastrados e realizar buscas por nome através de um menu interativo no terminal.

## Funcionalidades
- Adicionar produtos ao estoque
- Listar todos os produtos cadastrados
- Buscar produtos pelo nome
- Encerrar o programa através do menu

## Conceitos Praticados

- Classes e Objetos
- Encapsulamento
- Construtores
- Collections (ArrayList)
- Estruturas de repetição (while e for)
- Estruturas condicionais (if)
- Organização de responsabilidades entre classes

## Estrutura do Projeto
```
src/
├── Main.java
├── Produto.java
└── Estoque.java
```

### Produto

Representa um produto do estoque.

### Atributos:

- nome
- quantidade

### Estoque

Responsável pelo gerenciamento dos produtos.

### Métodos:

- adicionarProduto()
- listarProdutos()
- buscarProduto()

### Main

Responsável pela interação com o usuário através do menu.

### Exemplo de Uso
```
1 - Adicionar produto
2 - Listar produtos
3 - Buscar produto
4 - Sair

Digite o nome do produto:
Arroz

Digite a quantidade:
10

Produto adicionado com sucesso!
```
### Aprendizados

Durante o desenvolvimento deste exercício foi possível praticar:

- Separação de responsabilidades entre classes
- Manipulação de objetos dentro de listas
- Busca de informações utilizando loops
- Estruturação de aplicações simples em Java

### Melhorias Futuras

- [ ] Remover produtos do estoque
- [ ] Atualizar quantidade de produtos
- [ ] Validar entradas do usuário
- [ ] Persistir dados em arquivo
- [ ] Migrar para interface gráfica

### Tecnologias Utilizadas
- Java
- IntelliJ IDEA
