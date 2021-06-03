# Capítulo 02 - Introdução a aplicativos Java – entrada/saída e operadores

## 2.1 Introdução
Programas que tem apenas saída através de mensagem na tela, calculos simples como a soma e exibição do resultado.


## 2.2 Nosso primeiro programa Java: imprimindo uma linha de texto

Criado o primeiro aplicativo do livro, e após é feita uma alteração para incluir mais uma linha de saída e comentários.

Explicado sobre as palavras reservadas, convenção de nomes, case-sensitive, espaços (identação) e linhas em branco para melhor legibilidade do código.

Comando utilizado para compilar o programa via prompt de comando (Terminal/CMD): 

```java
javac Welcome1.java
```

Após compilado, será gerado um arquivo com o mesmo nome, porém com extensão `.class`. Este programa poderá ser executado através do seguinte comando: 

```java
java Welcome1.class
```

## 2.3 Modificando nosso primeiro programa Java

Criado um programa parecido com o anterior, porém utilizando a declaração do método `print` e `println`, ambos do objeto `System.out`. O primeiro faz com que a saída não tenha quebra de linhas ao final da linha, já a segunda tem quebra de linha ao final do texto.

## 2.4 Exibindo texto com printf

f - significa "formato". 
System.out.printf - exibe os dados _formatados_.

Para formatar uma String, deve-se utilizar um especificador de formato (%) seguido de uma letra que corresponde ao tipo do formato. Por exemplo:
- %s
- %n
- %d

## 2.5 Outra aplicação: adicionando inteiros

Leitura de dados com a classe `Scanner(System.in)`. Para utilizar esta classe, é feito um _import_ dela no programa(`import java.util.Scanner;`). Essa é uma forma de "reutilização/reaproveitamento" de código.

## 2.6 Conceitos de memória

Breve explicação sobre espaços alocados para as variáveis

## 2.7 Aritmética
Explicação sobre os operadores aritméticos, sua ordem de precedência (quem vem primeiro), divisão de inteiros.

## 2.8 Tomada de decisão: operadores de igualdade e operadores relacionais

São operadores que sempre irão retornar um valor booleano (true/false).
- `==` - que quer dizer _igual à_
- `!=` - que quer dizer _diferente de_
- `>` - que quer dizer _maior que_
- `<` - que quer dizer _menor que_
- `>=` - que quer dizer _maior ou igual à_
- `<=` - que quer dizer _menor ou igual à_


## 2.9 Conclusão

Resumo e exercícios