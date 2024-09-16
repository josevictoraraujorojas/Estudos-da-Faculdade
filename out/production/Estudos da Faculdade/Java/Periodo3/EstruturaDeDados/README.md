# O que s�o dados?
Os dados (e seus diversos tipos) s�o os blocos b�sicos da programa��o. 
Eles representam uma unidade ou um elemento de informa��o que pode ser acessado atrav�s de um identificador - por exemplo, uma vari�vel.

A maior parte das linguagens de programa��o trabalha com varia��es baseadas nos quatro tipos primitivos abaixo:

- INT ou n�mero inteiro: valores num�ricos inteiros (positivos ou negativos);
- FLOAT ou o chamado ?ponto flutuante?: valores num�ricos com casas ap�s a v�rgula (positivos ou negativos);
- BOOLEAN ou booleanos: representado apenas por dois valores, ?verdadeiro? e ?falso?. Tamb�m chamados de operadores l�gicos;
- TEXT: sequ�ncias ou cadeias de caracteres, utilizados para manipular textos e/ou outros tipos de dados n�o num�ricos ou booleanos, como hashes de criptografia.

## O problema dos Tipos Primitivos

Os tipos primitivos se tornam insuficientes quando precisamos representar conceitos mais complexos do mundo real.

## Tipos Abstratos de Dados

A maior parte das ?coisas? que existem no mundo � mais complexa que um simples n�mero. Por esse motivo, precisam de mais de uma vari�vel para represent�-las.

Os TADs (Tipos Abstratos de Dados) nada mais s�o do que um agrupamento de outros dados usados para representar conceitos mais complexos do mundo real

Vamos ao exemplo de uma data, poderia ser representada por 3 vari�veis inteiras: uma para o dia, outra para o m�s e a terceira para o ano:
``` java
int dia;

int mes;

int ano;
```

### Como criar um TAD?
Um Tipo Abstrato de Dados precisa encapsular as suas informa��es. Isso significa que as vari�veis que representam as informa��es n�o podem ficar soltas, 
como se fossem declaradas de forma independente. Elas precisam de um escopo (um corpo) onde as informa��es possam ser guardadas.

Vamos retornar ao exemplo do conceito de uma data. Ao inv�s de declarar as suas 3 vari�veis soltas:

``` java
int dia;

int mes;

int ano;
```

Precisamos coloc�-las dentro de uma estrutura com um escopo. Essa estrutura pode ser representada como:
``` java
estrutura Data{

     int dia;

     int mes;

     int ano;

}
```

A maioria das linguagens de programa��o usam o conceito de classes para definir um Tipo Abstrato de Dados. 
Elas usam a palavra ?class? para definir o escopo (o corpo) onde as vari�veis ser�o declaradas.

OBS: A linguagem de programa��o C usa a palavra ?struct? no lugar de ?class?.

exemplos de cria��o do TAD ?Data?
``` java
public class Data{

     int dia;

     int mes;

     int ano;

}
```

### Como criar uma vari�vel de um TAD?
Uma vez que voc� criou o seu Tipo Abstrato de Dados, voc� agora pode declarar vari�veis desse novo tipo, ao inv�s de usar tipos primitivos de dados.

Para o TAD ?Data? que criamos, ao inv�s de declarar 3 vari�veis do tipo int para represent�-la?
``` java
int dia;

int mes;

int ano;
```

?criamos apenas uma �nica vari�vel do tipo ?Data?:
``` java
Data novaData;
```
Pois, essa vari�vel j� cont�m dentro dela todas as 3 vari�veis do tipo int.

� importante lembrar que cada linguagem de programa��o possui detalhes espec�ficos na maneira de criar uma vari�vel de um Tipo Abstrato. Exemplo em java:
``` java
Data novaData = new Data();
```

Al�m dos dados, um Tipo Abstrato de Dados tamb�m pode possuir opera��es (fun��es).

Na verdade, esse � o elemento mais importante de um TAD.

As opera��es (fun��es) dentro de um TAD, permitem que ela opere sobre os seus dados de uma maneira organizada.

As fun��es operam exclusivamente sobre os dados do TAD. As opera��es (fun��es) s�o criadas dentro do TAD e s� podem acessar os dados que existem dentro dele.

Exemplo de um TAD (Tipos Abstratos de Dados):
```java
public class Retangulo{

     int altura;

     int largura;

     // fun��es(opera��es)

     public int perimetro(){

          return (altura*2)+(largura*2);

     }

     public int area(){

          return altura*largura;

     }

}
```

## O que s�o estruturas de dados?
Em computa��o, normalmente utilizamos os dados de forma conjunta. 
A forma como estes dados ser�o agregados e organizados depende muito de como ser�o utilizados e processados, levando-se em considera��o, por exemplo, a efici�ncia para buscas, o volume dos dados trabalhados, a complexidade da implementa��o e a forma como os dados se relacionam. 
Estas diversas formas de organiza��o s�o as chamadas estruturas de dados.

Podemos afirmar que um programa � composto de algoritmos e estruturas de dados, que juntos fazem com que o programa funcione como deve.

Cada estrutura de dados tem um conjunto de m�todos pr�prios para realizar opera��es como:

- Inserir ou excluir elementos;
- Buscar e localizar elementos;
- Ordenar (classificar) elementos de acordo com alguma ordem especificada.

## Caracter�sticas das estruturas de dados

As estruturas de dados podem ser:

- lineares (ex. arrays) ou n�o lineares (ex. grafos);
- homog�neas (todos os dados que comp�e a estrutura s�o do mesmo tipo) ou heterog�neas (podem conter dados de v�rios tipos);
- est�ticas (t�m tamanho/capacidade de mem�ria fixa) ou din�micas (podem expandir).