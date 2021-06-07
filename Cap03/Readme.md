# Capítulo 03 - Introdução a classes, objetos, métodos e strings

## 3.1 - Introdução
Neste capítulo, diferente do módulo anterior que utilizamos classes e métodos pre-existentes (_Scanner_, _print_, _printf_, _println_), serão criados classes e métodos próprios para resolver determinadas situações.

Será feita a criação de uma classe simples de uma conta bancária do mundo real com métodos para tarefas como consulta de saldo, depósitos, saques.

## 3.2 - Variáveis de instância, métodos set e métodos get

### Variáveis de instância

Variáveis de instância são as chamadas ao objeto. Cada _instanciação_ de um objeto cria um novo espaço alocado na memória que será destinado para cada chamada. Por exemplo, mesmo que duas pessoas tenham o mesmo nome elas são diferentes pessoas e estão em locais diferentes.

### Modificadores de acesso _public_ e _private_

A maioria das declarações de variável de instância é declarada como _private_ e só serão acessíveis dentro da própria classe. Para acessá-la, é necessário o uso de métodos acessores (_getters e setters_).

### Métodos get/set
Os métodos get/set são os métodos acessores de cada objeto. São eles que farão ou a atribuição (set) ou a recuperação (get) dos dados deste objeto.

Cada classe declarada como _public_ deve ser criada em arquivo separado.

### Parâmetros são variáveis locais
As variáveis declaradas dentro de uma classe só existirão nela, o mesmo para métodos. Este processo também é chamado de _escopo de variáveis_. As variáveis locais só existirão dentro daquele escopo em que foram criadas. Após finalizar a execução da classe ou do método em que se encontra, esta variável é _"destruída"_ e não existirá mais.

### Corpo do método setName
Neste caso, contém apenas uma única instrução que atribui o valor do parâmetro _name_ (valor que será passado para o método como _String_) para a variável de instância (variável da classe). 
No exemplo abaixo, à esquerda (_this.name_) é a declaração da variável da classe, e à direita do sinal de _=_ é a variável que será passada por parâmetro do método.

```java
public void setName(String name) {
    this.name = name;
}
```

### Corpo do método getName
Diferente do método setName, o método getName não exige que seja passado um valor para sua execução, portanto é criado como uma _lista vazia_ de parâmetros.

Porém como ele é apenas um método de _consulta_, ele deve retornar algo para quem o consulta. Nesse caso, o tipo de retorno será de uma String para quem o chamou, ou seja, no exemplo abaixo, é retornado um nome que nas variáveis da classe são do tipo String, por isso o tipo do retorno deste método é do tipo String.


```java
public String getName() {
    return name;
}
```