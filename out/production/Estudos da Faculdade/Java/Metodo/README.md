# Tipos de String

## Strings

* São imutáveis
* Uma vez criada, vai para o string pool.
* Caso seja criada com ?new? é um objeto fora da string pool.
* O Java Garbage Collection que coleta o ?lixo?, do espaço na memória que não é mais usado
* Mudar o valor de uma string muitas vezes gasta muito espaço na memória.
* Objeto de string criado usando a palavra-chave ?new? sempre cria um novo objeto na memória heap.

### Métodos da classe String

- indexOf
  Retorna o índice onde o início da string dada aparece nesta string (-1 se não for encontrado)

- length
  Número de caracteres em uma string

- substring
  os caracteres nesta string de index1 (inclusive) a index2 (exclusivo);se index2 for omitido, pega até o final da string

- toLowerCase:
  uma nova string com todas as letras minúsculas

- toUpperCase:
  uma nova string com todas as letras maiúsculas

- endsWith e startsWith:
O método endsWith verifica se a String termina com o valor especificado, 
por outro lado o startsWith verifica se a String começa com o valor especificado.

- concat: 
concatenação de Strings.

## StringBuilder

* A classe StringBuilder cria objetos e os armazena strings mutáveis 
* A classe StringBuilder faz parte do pacote java.lang.
* Um objeto StringBuilder é mutável (ou seja, pode ser alterado).

### StringBuilder - construtores

* Cria uma string vazia com capacidade inicial de 16 

`caracteresStringBuilder buf1 = new StringBuilder();`

* Cria uma string vazia com capacidade inicial fornecida no parâmetro

`StringBuilder buf2 = new StringBuilder(50);`

* Cria uma strings preenchido com argumento - a capacidade inicial é o comprimento da string fornecida mais 

`16StringBuilder buf3 = new StringBuilder("Olá");`

### Métodos do StringBuilder

- append():
  Concatena strings da classe StringBuilder

- insert():
  Insere dados em um dado índice

- delete():
  deleta dados entre dados índices

- deleteCharAt():
 deleta dados de um unico indice informado

- reverse(): 
retorna o conteúdo reverso da string

- setCharAt():
muda o caractere de um determinado índice (parecido com deleteCharAt())

- capacity(): 
retorna a capacidade atual da string

- length(): 
retorna o tamanho atual da string builder (menor ou igual a capacidade total)

- setLength(): 
define o comprimento exato da string no construtor para o novo valor (parâmetro).

- charAt(): 
retorna o caractere de um índice específico




