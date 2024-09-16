# Array unidimensional

<img src="https://www.criandobits.com.br/wp-content/uploads/2022/01/arrayUnidimensional.png">

### Declaração de Array unidimensional

A declaração de Arrays segue a estrutura de declaração de variáveis, porém, é importante observar
que um Array em Java, é um objeto. Logo, não podemos simplesmente declarar um Array, nós somos 
obrigados a criar uma instância com o operador 'new'. 

A primeira parte é o tipo que os elementos do nosso Array devem ter. Na sequência, abrimos e 
fechamos colchetes, indicando ao interpretador do Java que estamos declarando um Array e não uma variável. 
Por fim, devemos dar um nome para o nosso Array para podermos manipular seus elementos.

```
tipo[] nome = new tipo[quantidade de colunas];
```
### Acessando o Array

Podemos acessar todas as posições de um array usando um simples laço for e a propriedade 
length do array.

```
for (int i = 0; i < nomeArray.length; i++) {
Código a executar para cada elemento
}
```

