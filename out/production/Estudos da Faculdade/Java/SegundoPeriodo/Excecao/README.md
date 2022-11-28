# Exceções Java - Try...Catch

## Exceções Java

Ao executar o código Java, diferentes erros podem ocorrer: erros de codificação feitos pelo programador, 
erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: 
Java lançará uma exceção (jogará um erro).

### Classificação

O uso das exceções em um sistema é de extrema importância,
pois ajuda a detectar e tratar possíveis erros que possam acontecer.
Entretanto, na linguagem Java existem dois tipos de exceções, que são:

- Implícitas: Exceções que não precisam de tratamento e demonstram serem contornáveis.
Esse tipo origina-se da subclasse Error ou RunTimeException.
- Explícitas: Exceções que precisam ser tratadas e que apresentam condições incontornáveis.
Esse tipo origina do modelo throw e necessita ser declarado pelos métodos. É originado da subclasse Exception ou IOException.

Existe também a formação de erros dos tipos throwables que são:

- Checked Exception: Erros que acontecem fora do controle do programa,
mas que devem ser tratados pelo desenvolvedor para o programa funcionar.
- Unchecked (Runtime): Erros que podem ser evitados se forem tratados e analisados pelo desenvolvedor.
Caso haja um tratamento para esse tipo de erro, o programa acaba parando em tempo de execução (Runtime).
- Error: Usado pela JVM que serve para indicar se existe algum problema de recurso do programa,
tornando a execução impossível de continuar.



## Java try e catch
A try instrução permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A catch instrução permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

As palavras-chave trye catch vêm em pares:

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

A finally instrução permite que você execute código, depois try...catchde , independentemente do resultado:

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

A throw instrução permite que você crie um erro personalizado.

A throwinstrução é usada junto com um tipo de exceção . Existem muitos tipos de exceção disponíveis em Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

### Exemplo
Lance uma exceção se a idade for inferior a 18 anos (imprima "Acesso negado"). Se a idade for maior de 18 anos, imprima "Acesso concedido":

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