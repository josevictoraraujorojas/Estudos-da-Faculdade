## Exercício 1) O que é um Tipo Abstrato de Dados (TAD) e qual a característica fundamental na sua utilização?

Um TAD é uma forma de
definir um novo tipo de
dado juntamente com as
operações que manipulam
esse novo tipo de dado

? Encapsulamento: definição isolada de outras unidades do programa

? Invisibilidade e proteção: representação do tipo deve ser acessada
somente no ambiente encapsulado

## Exercício 2) Quais as vantagens de se programar com TADs?

Reutilização

? Possibilidade de utilização do mesmo
TAD em diversas aplicações diferentes

? Possibilidade de alterar o TAD sem
alterar as aplicações que o utilizam

Segurança

? Clientes não podem alterar a
representação

? Clientes não podem tornar os dados
inconsistentes


## Exercício 3) Faça a especificação de um sistema de controle de reservas de um clube que aluga quadras poliesportivas usando TAD.

ControleReservas




## Exercício 4) Desenvolva um TAD para um cubo. Inclua as operações de inicializaçõe necessárias e as operações que retornem os tamanhos de cada lado, a sua área e o seu volume.

## Exercício 5) Desenvolva um TAD para um cilindro. Inclua as operações de inicializações necessárias e as operações que retornem a sua altura e raio, a sua área e o seu volume.

## Exercício 6) Desenvolva um TAD para um esfera. Inclua as operações de inicializações necessárias e as operações que retornem seu raio, a sua área e o seu volume.

## Exercício 7) Vamos supor que um número real seja representado por uma classe Java,
## como esta:
## class RealType {
## int left;
## int right;
## };
## onde left e right representam os dígitos posicionados à esquerda e à direita do ponto
## decimal, respectivamente. Se left for um inteiro negativo, o número real representado será
## negativo.
## a) Escreva um método para inserir um número real e criar uma estrutura representado
## esse número;
## b) Escreva um método que aceite esse tipo e retorne o número real representado por ela;
## c) Escreva métodos add, substract e multiply que aceitem dois desses tipos e definam o
## valor de um terceiro tipos para representar o número que seja a soma, a diferença e o
## produto, respectivamente, dos dois tipos de entrada.


## Exercício 8) Defina um Tipo Abstrato de Dados TMatriz, para representar matrizes
## quadradas de tamanho n. Implemente as operações para somar e multiplicar 2 matrizes.
## Implemente ainda a operação do cálculo da matriz inversa.


## Exercício 9) Suponha dois vetores, um de estudantes e outro de funcionários. Cada tipo
## de estudante contém campos para um último nome, um primeiro nome e um índice de
## pontos de graduação. Cada tipo de funcionário contém membros para um último nome,
## um primeiro nome e um salário. Ambos os vetores são classificados em ordem alfabética
## pelo último e pelo primeiro nome. Dois registros com o último e o primeiro nome iguais
## não aparecem no mesmo vetor. Escreva um método em Java para conceder um aumento
## de 10% a todo funcionário que tenha um registro de estudante cujo índice de pontos de
## graduação seja maior que 3.0. 