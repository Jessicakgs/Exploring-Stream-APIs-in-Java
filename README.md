# Desafio Técnico - Classe Aluno

Este repositório contém a solução para o desafio técnico proposto, onde foi criada uma classe `Aluno` e uma lista de alunos. O objetivo foi manipular essa lista utilizando operações de streams no Java.

## Descrição do Desafio

O desafio consistiu em criar uma classe `Aluno` com os seguintes atributos:

- **Nome**: uma string que representa o nome do aluno.
- **Idade**: um inteiro que representa a idade do aluno.
- **Nota**: um valor double que representa a nota do aluno.
- **Status de aprovação**: um booleano que indica se o aluno está aprovado ou não (definido para notas maiores ou iguais a 7.0).

Após a criação da classe, foram realizadas as seguintes operações com uma lista de alunos (contendo pelo menos 5 alunos):

1. Listar apenas os alunos que estão aprovados (ou seja, com nota maior ou igual a 7.0).
2. Criar uma nova lista que contenha apenas os nomes dos alunos aprovados.
3. Filtrar e listar os alunos que têm idade superior a 18 anos.
4. Adicionar um bônus de 1.0 à nota de todos os alunos que têm mais de 18 anos e exibir suas novas notas.
5. Exibir os resultados de cada operação no console.

## Operações de Streams

### `filter`

O método `filter` é utilizado para filtrar elementos de uma coleção com base em uma condição especificada. Ele retorna um novo stream contendo apenas os elementos que satisfazem a condição. 

- **Vantagens**: 
  - Permite uma maneira concisa e legível de realizar operações de filtragem.
  - Mantém a imutabilidade da coleção original.

- **Desvantagens**: 
  - Pode ter um impacto no desempenho se usado em grandes coleções, pois precisa iterar sobre todos os elementos.

### `map`

O método `map` transforma cada elemento do stream em um novo elemento, aplicando uma função de transformação. O resultado é um novo stream contendo os elementos transformados.

- **Vantagens**: 
  - Permite transformar dados de forma declarativa e limpa.
  - Facilita a criação de novas listas a partir de uma lista existente.

- **Desvantagens**: 
  - Pode ser menos intuitivo para quem não está familiarizado com programação funcional.

### `forEach`

O método `forEach` executa uma ação específica para cada elemento do stream. É frequentemente usado para iterar sobre os elementos e realizar alguma operação, como imprimir no console.

- **Vantagens**: 
  - Simples e direto para realizar operações em cada elemento.
  - Útil para efeitos colaterais, como impressão ou gravação em um banco de dados.

- **Desvantagens**: 
  - Não é adequado para transformar os elementos ou para operações que precisam retornar um valor.
  - Pode levar a código menos funcional, já que pode introduzir efeitos colaterais.


