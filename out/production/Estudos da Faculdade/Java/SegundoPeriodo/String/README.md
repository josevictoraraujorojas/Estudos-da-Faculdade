# Tipos de String

## Strings

* S�o imut�veis
* Uma vez criada, vai para o string pool.
* Caso seja criada com ?new? � um objeto fora da string pool.
* O Java Garbage Collection que coleta o ?lixo?, do espa�o na mem�ria que n�o � mais usado
* Mudar o valor de uma string muitas vezes gasta muito espa�o na mem�ria.
* Objeto de string criado usando a palavra-chave ?new? sempre cria um novo objeto na mem�ria heap.

### M�todos da classe String

- indexOf
  Retorna o �ndice onde o in�cio da string dada aparece nesta string (-1 se n�o for encontrado)

- length
  N�mero de caracteres em uma string

- substring
  os caracteres nesta string de index1 (inclusive) a index2 (exclusivo);se index2 for omitido, pega at� o final da string

- toLowerCase:
  uma nova string com todas as letras min�sculas

- toUpperCase:
  uma nova string com todas as letras mai�sculas

- endsWith e startsWith:
O m�todo endsWith verifica se a String termina com o valor especificado, 
por outro lado o startsWith verifica se a String come�a com o valor especificado.

- concat: 
concatena��o de Strings.

## StringBuilder

* A classe StringBuilder cria objetos e os armazena strings mut�veis 
* A classe StringBuilder faz parte do pacote java.lang.
* Um objeto StringBuilder � mut�vel (ou seja, pode ser alterado).

### StringBuilder - construtores

* Cria uma string vazia com capacidade inicial de 16 

`caracteresStringBuilder buf1 = new StringBuilder();`

* Cria uma string vazia com capacidade inicial fornecida no par�metro

`StringBuilder buf2 = new StringBuilder(50);`

* Cria uma strings preenchido com argumento - a capacidade inicial � o comprimento da string fornecida mais 

`16StringBuilder buf3 = new StringBuilder("Ol�");`

### M�todos do StringBuilder

- append():
  Concatena strings da classe StringBuilder

- insert():
  Insere dados em um dado �ndice

- delete():
  deleta dados entre dados �ndices

- deleteCharAt():
 deleta dados de um unico indice informado

- reverse(): 
retorna o conte�do reverso da string

- setCharAt():
muda o caractere de um determinado �ndice (parecido com deleteCharAt())

- capacity(): 
retorna a capacidade atual da string

- length(): 
retorna o tamanho atual da string builder (menor ou igual a capacidade total)

- setLength(): 
define o comprimento exato da string no construtor para o novo valor (par�metro).

- charAt(): 
retorna o caractere de um �ndice espec�fico




