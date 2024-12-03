# APS-Sistema de analise de performance de algoritmos de ordenação

Sistema em Java para análise de performance de algoritmos de ordenação de dados, desenvolvido como parte das Atividades Práticas Supervisionadas (APS) no curso de Ciência da Computação.

---

## 📋 Descrição do Projeto
Este sistema permite comparar a eficiência de três algoritmos de ordenação: *Bubble Sort, **Selection Sort* e *Quick Sort*. Através da geração de dados personalizados e da exibição dos tempos de execução de cada algoritmo, o sistema ajuda a avaliar o método mais eficiente para diferentes volumes de dados.

---
 
## 🎯 Objetivo
O objetivo é fornecer uma ferramenta prática para estudar algoritmos de ordenação, ajudando na escolha do método mais adequado para cenários específicos de grandes volumes de dados, onde a eficiência é essencial.

---

## 📚 Aprendizados
Este projeto permitiu explorar a complexidade de algoritmos e a eficiência em tempo de execução, consolidando o entendimento sobre como a escolha do método de ordenação afeta o desempenho em diferentes contextos.

---

## 🛠 Funcionalidades
- *Geração de Dados Aleatórios*: Números aleatórios são gerados para testes, com intervalo e volume personalizáveis.
- *Métodos de Ordenação*: Implementação de Bubble Sort, Selection Sort e Quick Sort, cada um com suas próprias características de eficiência.
- *Comparação de Desempenho*: Visualização do tempo de execução de cada algoritmo, possibilitando análises de eficiência.

---

## 📈 Resultados e Análise
Os testes demonstraram que o *Quick Sort* é o mais eficiente para grandes volumes de dados devido à sua complexidade média \(O(n \log n)\). Em comparação, *Bubble Sort* e *Selection Sort* apresentaram desempenho inferior e são mais indicados para listas pequenas ou para fins didáticos.

### Exemplos de Tempos de Execução:

### Crescente:
| Tamanho do Vetor | Bubble Sort (ms) | Selection Sort (ms) | Quick Sort (ms) |
|------------------|------------------|---------------------|-----------------|
| 1.000            | 5                | 3                   | 3               |
| 10.000           | 22               | 33                  | 4               |
| 50.000           | 5746             | 367                 | 20              |
| 100.000          | 22660            | 2198                | 29              |

### Decrescente:
| Tamanho do Vetor | Bubble Sort (ms) | Selection Sort (ms) | Quick Sort (ms) |
|------------------|------------------|---------------------|-----------------|
| 1.000            | 3                | 23                  | 13              |
| 10.000           | 97               | 21                  | 1               |
| 50.000           | 4855             | 472                 | 6               |
| 100.000          | 21921            | 1835                | 30              |

> *Observação*: Os tempos podem variar conforme a configuração de hardware. Estes valores são aproximados.

---

## 📂 Estrutura do Projeto
```plaintext
Java-APS-Sistema-De-Analise-De-Performance-De-Algoritmos-De-Ordenacao/
├── src/
│   ├── menu/
│   │   ├── Principal.java              # Classe principal para execução do sistema
│   │   ├── MenuPrincipal.java          # Interface do menu de opções
│   │   ├── GeradorNumerico.java        # Classe responsável pela geração de dados
│   │   ├── ComparacaoDeDesempenho.java # Classe para análise comparativa
│   │   ├── SelectionSort.java          # Implementação do algoritmo Selection Sort
│   │   ├── BubbleSort.java             # Implementação do algoritmo Bubble Sort
│   │   ├── QuickSort.java              # Implementação do algoritmo Quick Sort
├── README.md                           # Documentação do projeto
├── 📜 LICENSE.md                       # Arquivo de licença do projeto
```
---

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias:

| Tecnologia   | Descrição                                            |
|--------------|------------------------------------------------------|
| Java         | Linguagem principal para o desenvolvimento do sistema.|
| Git          | Controle de versão e colaboração em equipe.          |
| GitHub       | Plataforma para hospedagem do código-fonte.          |
| JUnit        | Framework para testes unitários.                     |
| Markdown     | Utilizado para documentar o projeto.                 |
| IntelliJ IDEA | IDE para desenvolvimento em Java.                   |

---

## Autores

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/170758704?s=400&u=da7a33d81f3feeb953e687442cba5d042527f94d&v=4" width=115><br><sub>João Vitor Fernades</sub>](https://github.com/Joaofernandes-DEV) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/149197706?v=4" width=115><br><sub>Leonardo Souza</sub>](https://github.com/leonardosouzaz) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/186076508?v=4" width=115><br><sub>Victor Anthonio</sub>](https://github.com/VictorSoares-dev) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/187339283?v=4" width=115><br><sub>Victor Sampaio</sub>](https://github.com/VSampaio13) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/187325307?v=4" width=115><br><sub>Alex Lourenço</sub>](https://github.com/4lexbarbosa) |
| :---: | :---: | :---: | :---: | :---: |

---

## Licença

Este projeto está sob licença. Consulte [LICENSE](LICENSE) para obter mais informações.

---
