# Tipos de String

## Strings

- String � imut�vel em Java. Portanto, � adequado para uso em um ambiente multithread. 
Podemos compartilh�-lo entre fun��es porque n�o h� preocupa��o com inconsist�ncia de dados.

- Quando criamos uma String usando aspas duplas, a JVM primeiro procura a String com o mesmo valor no pool de strings. 
Se encontrado, ele retorna a refer�ncia do objeto string do pool. 
Caso contr�rio, ele cria o objeto String no pool de String e retorna a refer�ncia. 
A JVM economiza muita mem�ria usando a mesma String em diferentes encadeamentos.

### M�todos da classe String

- indexOf
  Retorna o �ndice onde o in�cio da string dada aparece nesta string (-1 se n�o for encontrado)

- length
  N�mero de caracteres em uma string

- substring
  os caracteres nesta string de index1 (inclusive) a index2 (exclusivo);se index2 for omitido, pega at� o final da string

- toLowerCase


- toUpperCase()

