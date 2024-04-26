# O que são dados?
Os dados (e seus diversos tipos) são os blocos básicos da programação. 
Eles representam uma unidade ou um elemento de informação que pode ser acessado através de um identificador - por exemplo, uma variável.

A maior parte das linguagens de programação trabalha com variações baseadas nos quatro tipos primitivos abaixo:

- INT ou número inteiro: valores numéricos inteiros (positivos ou negativos);
- FLOAT ou o chamado ?ponto flutuante?: valores numéricos com casas após a vírgula (positivos ou negativos);
- BOOLEAN ou booleanos: representado apenas por dois valores, ?verdadeiro? e ?falso?. Também chamados de operadores lógicos;
- TEXT: sequências ou cadeias de caracteres, utilizados para manipular textos e/ou outros tipos de dados não numéricos ou booleanos, como hashes de criptografia.

## O problema dos Tipos Primitivos

Os tipos primitivos se tornam insuficientes quando precisamos representar conceitos mais complexos do mundo real.

## Tipos Abstratos de Dados

A maior parte das ?coisas? que existem no mundo é mais complexa que um simples número. Por esse motivo, precisam de mais de uma variável para representá-las.

Os TADs (Tipos Abstratos de Dados) nada mais são do que um agrupamento de outros dados usados para representar conceitos mais complexos do mundo real

Vamos ao exemplo de uma data, poderia ser representada por 3 variáveis inteiras: uma para o dia, outra para o mês e a terceira para o ano:
``` java
int dia;

int mes;

int ano;
```

### Como criar um TAD?
Um Tipo Abstrato de Dados precisa encapsular as suas informações. Isso significa que as variáveis que representam as informações não podem ficar soltas, 
como se fossem declaradas de forma independente. Elas precisam de um escopo (um corpo) onde as informações possam ser guardadas.

Vamos retornar ao exemplo do conceito de uma data. Ao invés de declarar as suas 3 variáveis soltas:

``` java
int dia;

int mes;

int ano;
```

Precisamos colocá-las dentro de uma estrutura com um escopo. Essa estrutura pode ser representada como:
``` java
estrutura Data{

     int dia;

     int mes;

     int ano;

}
```

A maioria das linguagens de programação usam o conceito de classes para definir um Tipo Abstrato de Dados. 
Elas usam a palavra ?class? para definir o escopo (o corpo) onde as variáveis serão declaradas.

OBS: A linguagem de programação C usa a palavra ?struct? no lugar de ?class?.

exemplos de criação do TAD ?Data?
``` java
public class Data{

     int dia;

     int mes;

     int ano;

}
```

### Como criar uma variável de um TAD?
Uma vez que você criou o seu Tipo Abstrato de Dados, você agora pode declarar variáveis desse novo tipo, ao invés de usar tipos primitivos de dados.

Para o TAD ?Data? que criamos, ao invés de declarar 3 variáveis do tipo int para representá-la?
``` java
int dia;

int mes;

int ano;
```

?criamos apenas uma única variável do tipo ?Data?:
``` java
Data novaData;
```
Pois, essa variável já contém dentro dela todas as 3 variáveis do tipo int.

É importante lembrar que cada linguagem de programação possui detalhes específicos na maneira de criar uma variável de um Tipo Abstrato. Exemplo em java:
``` java
Data novaData = new Data();
```

Além dos dados, um Tipo Abstrato de Dados também pode possuir operações (funções).

Na verdade, esse é o elemento mais importante de um TAD.

As operações (funções) dentro de um TAD, permitem que ela opere sobre os seus dados de uma maneira organizada.

As funções operam exclusivamente sobre os dados do TAD. As operações (funções) são criadas dentro do TAD e só podem acessar os dados que existem dentro dele.

Exemplo de um TAD (Tipos Abstratos de Dados):
```java
public class Retangulo{

     int altura;

     int largura;

     // funções(operações)

     public int perimetro(){

          return (altura*2)+(largura*2);

     }

     public int area(){

          return altura*largura;

     }

}
```

## O que são estruturas de dados?
Em computação, normalmente utilizamos os dados de forma conjunta. 
A forma como estes dados serão agregados e organizados depende muito de como serão utilizados e processados, levando-se em consideração, por exemplo, a eficiência para buscas, o volume dos dados trabalhados, a complexidade da implementação e a forma como os dados se relacionam. 
Estas diversas formas de organização são as chamadas estruturas de dados.

Podemos afirmar que um programa é composto de algoritmos e estruturas de dados, que juntos fazem com que o programa funcione como deve.

Cada estrutura de dados tem um conjunto de métodos próprios para realizar operações como:

- Inserir ou excluir elementos;
- Buscar e localizar elementos;
- Ordenar (classificar) elementos de acordo com alguma ordem especificada.

## Características das estruturas de dados

As estruturas de dados podem ser:

- lineares (ex. arrays) ou não lineares (ex. grafos);
- homogêneas (todos os dados que compõe a estrutura são do mesmo tipo) ou heterogêneas (podem conter dados de vários tipos);
- estáticas (têm tamanho/capacidade de memória fixa) ou dinâmicas (podem expandir).