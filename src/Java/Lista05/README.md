- # Array bidimensional

<img src="https://www.linuxteaching.com/storage/img/images_2/use_of_twodimensional_array_in_php.png">

### Declaração de Array bidimensional

A declaração de Arrays segue a estrutura de declaração de variáveis, porém, é importante observar
que um Array em Java, é um objeto. Logo, não podemos simplesmente declarar um Array, nós somos
obrigados a criar uma instância com o operador 'new'.

A primeira parte é o tipo que os elementos do nosso Array devem ter. Na sequência, abrimos e
fechamos colchetes, indicando ao interpretador do Java que estamos declarando um Array e não uma variável.
Por fim, devemos dar um nome para o nosso Array para podermos manipular seus elementos.

```
tipo[][] nome = new tipo[quantidade de linhas][quantidade de colunas];
```

### Acessando o Array bidimensional

Podemos acessar todas as posições de um array usando 2 laços for e a propriedade
length do array.

```
for (int i = 0; i < nomeArray.length; i++) {
Acessa as linhas do Array bidimensional
  for(int j = 0; i < nomearray[0].lenght; j++){
Acessa as colunas do Array bidimensional
}
```
