# Tipos de String

## Strings

- String é imutável em Java. Portanto, é adequado para uso em um ambiente multithread. 
Podemos compartilhá-lo entre funções porque não há preocupação com inconsistência de dados.

- Quando criamos uma String usando aspas duplas, a JVM primeiro procura a String com o mesmo valor no pool de strings. 
Se encontrado, ele retorna a referência do objeto string do pool. 
Caso contrário, ele cria o objeto String no pool de String e retorna a referência. 
A JVM economiza muita memória usando a mesma String em diferentes encadeamentos.

### Métodos da classe String

- indexOf
  Retorna o índice onde o início da string dada aparece nesta string (-1 se não for encontrado)

- length
  Número de caracteres em uma string

- substring
  os caracteres nesta string de index1 (inclusive) a index2 (exclusivo);se index2 for omitido, pega até o final da string

- toLowerCase


- toUpperCase()

