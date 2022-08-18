- # if/else

A estrutura condicional if/else permite ao programa avaliar uma expressão como sendo verdadeira ou falsa e, de acordo com o resultado dessa verificação, executar uma ou outra rotina.

Na linguagem Java o tipo resultante dessa expressão deve ser sempre um boolean, pois diferentemente das demais, o Java não converte null ou inteiros como 0 e 1 para os valores true ou false.

### Sintaxe do if/else:

```
if (expressão booleana) {
// bloco de código 1
} else {
// bloco de código 2
}
```

# - else if

Complementar ao if/else temos o operador else if. Esse recurso possibilita adicionar uma nova condição à estrutura de decisão para atender a lógica sendo implementada.

### Sintaxe do if/else com else if:

```
if (expressão booleana 1) {
// bloco de código 1
} else if (expressão booleana 2) {
// bloco de código 2
} else {
// bloco de código 3
}
```

# - Switch

Pode haver um ou N números de valores case para uma expressão switch.

O valor do case deve ser do mesmo tipo da expressão switch. O valor do case pode ser literal ou constante. Não permite variáveis.

Os valores do case devem ser únicos. Em caso de valor duplicado, gera erro em tempo de compilação.

O switch deve ser byte, short, int, long (com seus tipos não primitivos), enums e string.

Cada declaração case pode ter um break que é opcional. Quando o controle atinge a declaração break, o controle pula para depois da expressão switch. Se o break não foi encontrado, é executado o próximo case.

O case pode ter um valor default que é opcional.

### Sintaxe:

```
switch(expression){     
case value1:     
//código para ser executado;     
break;  //opcional  
case value2:     
//código para ser executado;     
break;  //opcional   
......


default:      
//código para ser executado se todos os cases não são aceitos;     
}  
'''
