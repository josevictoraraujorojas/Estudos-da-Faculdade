# Exce��es Java - Try...Catch

## Exce��es Java

Ao executar o c�digo Java, diferentes erros podem ocorrer: erros de codifica��o feitos pelo programador, 
erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo t�cnico para isso �: 
Java lan�ar� uma exce��o (jogar� um erro).

### Classifica��o

O uso das exce��es em um sistema � de extrema import�ncia,
pois ajuda a detectar e tratar poss�veis erros que possam acontecer.
Entretanto, na linguagem Java existem dois tipos de exce��es, que s�o:

- Impl�citas: Exce��es que n�o precisam de tratamento e demonstram serem contorn�veis.
Esse tipo origina-se da subclasse Error ou RunTimeException.
- Expl�citas: Exce��es que precisam ser tratadas e que apresentam condi��es incontorn�veis.
Esse tipo origina do modelo throw e necessita ser declarado pelos m�todos. � originado da subclasse Exception ou IOException.

Existe tamb�m a forma��o de erros dos tipos throwables que s�o:

- Checked Exception: Erros que acontecem fora do controle do programa,
mas que devem ser tratados pelo desenvolvedor para o programa funcionar.
- Unchecked (Runtime): Erros que podem ser evitados se forem tratados e analisados pelo desenvolvedor.
Caso haja um tratamento para esse tipo de erro, o programa acaba parando em tempo de execu��o (Runtime).
- Error: Usado pela JVM que serve para indicar se existe algum problema de recurso do programa,
tornando a execu��o imposs�vel de continuar.



## Java try e catch
A try instru��o permite que voc� defina um bloco de c�digo para ser testado quanto a erros enquanto est� sendo executado.

A catch instru��o permite definir um bloco de c�digo a ser executado, caso ocorra um erro no bloco try.

As palavras-chave trye catch v�m em pares:

### Sintaxe
```java
try {
//  Block of code to try
}
catch(Exception e) {
//  Block of code to handle errors
}
```

## Finally

A finally instru��o permite que voc� execute c�digo, depois try...catchde , independentemente do resultado:

### Exemplo
``` java
public class Main {
public static void main(String[] args) {
try {
int[] myNumbers = {1, 2, 3};
System.out.println(myNumbers[10]);
} catch (Exception e) {
System.out.println("Something went wrong.");
} finally {
System.out.println("The 'try catch' is finished.");
}
}
}
```
## A palavra-chave throw

A throw instru��o permite que voc� crie um erro personalizado.

A throwinstru��o � usada junto com um tipo de exce��o . Existem muitos tipos de exce��o dispon�veis em Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

### Exemplo
Lance uma exce��o se a idade for inferior a 18 anos (imprima "Acesso negado"). Se a idade for maior de 18 anos, imprima "Acesso concedido":

``` java
public class Main {
static void checkAge(int age) {
if (age < 18) {
throw new ArithmeticException("Access denied - You must be at least 18 years old.");
}
else {
System.out.println("Access granted - You are old enough!");
}
}
public static void main(String[] args) {
checkAge(15); // Set age to 15 (which is below 18...)
}
}
```