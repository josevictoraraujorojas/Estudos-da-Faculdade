# M�todos

## M�todo main

O primeiro m�todo que conhecemos em Java �o m�todo que inicializa o programa, o m�todomain( ):

### Sobre o main

Esse m�todo � chamado pelo JRE para executar o programa/aplicativo Java e o chamamos de ponto de entrada. 
Sem o m�todo main, um projeto Java � uma cole��o de classes que n�o podem ser executadas, 
n�o podem ser executadas e n�o podem executar determinadas fun��es.

### Cada parte do main

- public: Um modificador de visibilidade; o m�todo principal deve ser p�blico;
caso contr�rio, o JRE n�o poder� acess�-lo e cham�-lo.

- static: Quando um objeto desse tipo de classe � criado,
ele possui os campos e m�todos declarados pela classe. 
A classe � um modelo para criar objetos. 
Por causa da palavra-chave static, 
o m�todo main n�o est� associado a um objeto de um tipo de classe, 
mas � pr�pria classe.

- void: Esta palavra-chave � usada aqui para nos dizer que o m�todo main n�o retorna nada,
ent�o � como um substituto para "sem tipo", porque se nada for retornado,
n�o h� necessidade de um tipo.

- String[ ] args: Os m�todos �s vezes s�o declarados como recebendo alguns dados de entrada,
String[ ] args representa uma matriz de valores de texto. 
String � a classe que representa objetos de texto em Java. 
O [ ] significa array e args � seu nome. Mas espere, 
j� executamos esse m�todo antes e n�o precisamos fornecer nada! 
Bem, n�o � obrigat�rio, 
mas voc� ver� como pode dar argumentos (valores fornecidos ao m�todo, que s�o usados pelo c�digo em seu corpo) ap�s esta lista

## Definindo um m�todo

- Todo m�todo deve ter um tipo (int, char, float, etc.) que determina o tipo de seu valor de retorno.
- Os par�metros s�o vari�veis que ser�o utilizadas pelo m�todo. Tais vari�veis s�o inicializadas com valores na chamada do m�todo.
- Para os nomes dos m�todos e de seus par�metros valem as mesmas regras para os nome de vari�veis.
- O comando return devolve para o chamador do m�todo o resultado da execu��o deste.
- O valor de retorno deve ser do mesmo tipo definido para o m�todo.
- Quando o comando return � executado, o m�todo termina sua execu��o e retorna o valor indicado para quem fez a chamada do m�todo.
- Importante: a execu��o de um programa sempre come�a pelo m�todo main.

``` 
<modificador>* <tipoRetorno> <nome> (<par�metros>*)
{   
<comandos*> 
}
```

## Chamada de M�todos

- Para cada um dos par�metros do m�todo, devemos fornecer um valor de mesmo tipo, na chamada do m�todo.
- Ao chamar um m�todo passando vari�veis como argumento, estamos usando apenas os seus valores que ser�o copiados para as vari�veis par�metros do m�todo.
- Os valores das vari�veis usadas na chamada do m�todo n�o s�o afetados por altera��es dentro do m�todo: passagem de par�metro por valor.

## O tipo void
- O tipo void � um tipo especial.
- Este tipo � utilizado para indicar que um m�todo n�o retorna nenhum valor. Como no exemplo do m�todo imprimi( ).
- Podemos usar o comando return (sem qualquer valor) para indicar explicitamente o fim de um m�todo do tipo void.

## Vari�veis LOCAIS e GLOBAIS
- Uma vari�vel � chamada local se ela foi declarada dentro de um m�todo. Nesse caso, ela existe somente dentro daquele m�todo e, ap�s o t�rmino da execu��o do m�todo, a vari�vel deixa de existir.
- Vari�veis utilizadas como par�metros de m�todos tamb�m s�o locais.
- Uma vari�vel � chamada global se ela for declarada fora de qualquer m�todo. Essa vari�vel � vis�vel em todos os m�todos. Qualquer m�todo pode alter�-la e ela existe durante a execu��o do programa.

## Escopo das vari�veis
- O escopo de uma vari�vel determina de quais par tes do c�digo ela pode ser acessada. 
- A regra de escopo em geral �:

As vari�veis globais s�o vis�veis em todos os m�todos.

As vari�veis locais s�o vis�veis apenas nos m�todos onde foram declaradas.

- Em Java, al�m dessas regras, temos os modificadores de visibilidade que v�o definir o acesso(public, private, protected).

## Acesso a m�todos de outras classes
- Um m�todo pode ser acessado fora da classe em que foi definido.
- Por exemplo, quando acessamos m�todos da classe Math ou da classe String: 
``` java
Math.pow(2, 3); 
String.charAt(0);
```
- Qualquer m�todo do tipo static criado em uma classe pode ser chamado a partir de outra classe usando o formato: nome_da_classe.nome_do_m�todo
- Assim, um m�todo criado pode ser reutilizado em outra aplica��o.

M�todos que manipulam arrays

- O vetor passado como argumento do m�todo � passado por refer�ncia. Seu conte�do pode ser modificado pelo m�todo.
- Dentro do m�todo, usar o atributo length quando for preciso o tamanho do vetor

