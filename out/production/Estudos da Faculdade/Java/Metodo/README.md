# Métodos

## Método main

O primeiro método que conhecemos em Java éo método que inicializa o programa, o métodomain( ):

### Sobre o main

Esse método é chamado pelo JRE para executar o programa/aplicativo Java e o chamamos de ponto de entrada. 
Sem o método main, um projeto Java é uma coleção de classes que não podem ser executadas, 
não podem ser executadas e não podem executar determinadas funções.

### Cada parte do main

- public: Um modificador de visibilidade; o método principal deve ser público;
caso contrário, o JRE não poderá acessá-lo e chamá-lo.

- static: Quando um objeto desse tipo de classe é criado,
ele possui os campos e métodos declarados pela classe. 
A classe é um modelo para criar objetos. 
Por causa da palavra-chave static, 
o método main não está associado a um objeto de um tipo de classe, 
mas à própria classe.

- void: Esta palavra-chave é usada aqui para nos dizer que o método main não retorna nada,
então é como um substituto para "sem tipo", porque se nada for retornado,
não há necessidade de um tipo.

- String[ ] args: Os métodos às vezes são declarados como recebendo alguns dados de entrada,
String[ ] args representa uma matriz de valores de texto. 
String é a classe que representa objetos de texto em Java. 
O [ ] significa array e args é seu nome. Mas espere, 
já executamos esse método antes e não precisamos fornecer nada! 
Bem, não é obrigatório, 
mas você verá como pode dar argumentos (valores fornecidos ao método, que são usados pelo código em seu corpo) após esta lista

## Definindo um método

- Todo método deve ter um tipo (int, char, float, etc.) que determina o tipo de seu valor de retorno.
- Os parâmetros são variáveis que serão utilizadas pelo método. Tais variáveis são inicializadas com valores na chamada do método.
- Para os nomes dos métodos e de seus parâmetros valem as mesmas regras para os nome de variáveis.
- O comando return devolve para o chamador do método o resultado da execução deste.
- O valor de retorno deve ser do mesmo tipo definido para o método.
- Quando o comando return é executado, o método termina sua execução e retorna o valor indicado para quem fez a chamada do método.
- Importante: a execução de um programa sempre começa pelo método main.

``` 
<modificador>* <tipoRetorno> <nome> (<parâmetros>*)
{   
<comandos*> 
}
```

## Chamada de Métodos

- Para cada um dos parâmetros do método, devemos fornecer um valor de mesmo tipo, na chamada do método.
- Ao chamar um método passando variáveis como argumento, estamos usando apenas os seus valores que serão copiados para as variáveis parâmetros do método.
- Os valores das variáveis usadas na chamada do método não são afetados por alterações dentro do método: passagem de parâmetro por valor.

## O tipo void
- O tipo void é um tipo especial.
- Este tipo é utilizado para indicar que um método não retorna nenhum valor. Como no exemplo do método imprimi( ).
- Podemos usar o comando return (sem qualquer valor) para indicar explicitamente o fim de um método do tipo void.

## Variáveis LOCAIS e GLOBAIS
- Uma variável é chamada local se ela foi declarada dentro de um método. Nesse caso, ela existe somente dentro daquele método e, após o término da execução do método, a variável deixa de existir.
- Variáveis utilizadas como parâmetros de métodos também são locais.
- Uma variável é chamada global se ela for declarada fora de qualquer método. Essa variável é visível em todos os métodos. Qualquer método pode alterá-la e ela existe durante a execução do programa.

## Escopo das variáveis
- O escopo de uma variável determina de quais par tes do código ela pode ser acessada. 
- A regra de escopo em geral é:

As variáveis globais são visíveis em todos os métodos.

As variáveis locais são visíveis apenas nos métodos onde foram declaradas.

- Em Java, além dessas regras, temos os modificadores de visibilidade que vão definir o acesso(public, private, protected).

## Acesso a métodos de outras classes
- Um método pode ser acessado fora da classe em que foi definido.
- Por exemplo, quando acessamos métodos da classe Math ou da classe String: 
``` java
Math.pow(2, 3); 
String.charAt(0);
```
- Qualquer método do tipo static criado em uma classe pode ser chamado a partir de outra classe usando o formato: nome_da_classe.nome_do_método
- Assim, um método criado pode ser reutilizado em outra aplicação.

Métodos que manipulam arrays

- O vetor passado como argumento do método é passado por referência. Seu conteúdo pode ser modificado pelo método.
- Dentro do método, usar o atributo length quando for preciso o tamanho do vetor

