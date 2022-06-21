#if/else
A estrutura condicional if/else permite ao programa avaliar uma express�o como sendo verdadeira ou falsa e, de acordo com o resultado dessa verifica��o, executar uma ou outra rotina.

Na linguagem Java o tipo resultante dessa express�o deve ser sempre um boolean, pois diferentemente das demais, o Java n�o converte null ou inteiros como 0 e 1 para os valores true ou false.

Sintaxe do if/else:

if (express�o booleana) {
// bloco de c�digo 1
} else {
// bloco de c�digo 2
}

#else if
Complementar ao if/else temos o operador else if. Esse recurso possibilita adicionar uma nova condi��o � estrutura de decis�o para atender a l�gica sendo implementada.

Sintaxe do if/else com else if:

if (express�o booleana 1) {
// bloco de c�digo 1
} else if (express�o booleana 2) {
// bloco de c�digo 2
} else {
// bloco de c�digo 3
}

#Switch
Pode haver um ou N n�meros de valores case para uma express�o switch.

O valor do case deve ser do mesmo tipo da express�o switch. O valor do case pode ser literal ou constante. N�o permite vari�veis.

Os valores do case devem ser �nicos. Em caso de valor duplicado, gera erro em tempo de compila��o.

O switch deve ser byte, short, int, long (com seus tipos n�o primitivos), enums e string.

Cada declara��o case pode ter um break que � opcional. Quando o controle atinge a declara��o break, o controle pula para depois da express�o switch. Se o break n�o foi encontrado, � executado o pr�ximo case.

O case pode ter um valor default que � opcional.

Sintaxe:

switch(expression){     
case value1:     
//c�digo para ser executado;     
break;  //opcional  
case value2:     
//c�digo para ser executado;     
break;  //opcional   
......

default:      
//c�digo para ser executado se todos os cases n�o s�o aceitos;     
}  