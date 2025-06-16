# 🚦 Desafio Controle de Fluxo - Java

Este projeto foi desenvolvido como parte de um desafio prático para exercitar o uso de **controle de fluxo** em Java, utilizando condicionais, laços de repetição e tratamento de exceções.

---

## 💻 Sobre o Projeto

O sistema solicita dois números inteiros via terminal:

- Se o **segundo número for maior que o primeiro**, ele imprime no console uma contagem de `n` números.
- Se o **primeiro número for maior que o segundo**, uma **exceção personalizada** é lançada, e o usuário é solicitado a tentar novamente.

---

## 📌 Requisitos Utilizados

- Java 17
- IDE Eclipse

---

## ⚙️ Como Executar

### 1. Clone o repositório:
git clone https://github.com/seu-usuario/DesafioControleFluxo.git
cd DesafioControleFluxo

### 2. Compile os arquivos Java:
javac Contador.java ParametrosInvalidosException.java

### 3. Execute o programa:
java Contador

---

## 📂 Estrutura dos Arquivos

- DesafioControleFluxo/
- ├── Contador.java                     // Classe principal com lógica de entrada e contagem
- ├── ParametrosInvalidosException.java // Exceção personalizada para validação de parâmetros
- └── README.md

## 🧠 Conceitos Praticados
#### Estruturas de decisão (if, else);
#### Laços de repetição (for, while);
#### Tratamento de exceções com try/catch;
#### Criação de exceção customizada (extends Exception);
#### Entrada de dados com Scanner.

## ✅ Exemplo de Execução
#### Digite o primeiro número: 5
#### Digite o segundo número: 8
- Imprimindo o número: 6
- Imprimindo o número: 7
