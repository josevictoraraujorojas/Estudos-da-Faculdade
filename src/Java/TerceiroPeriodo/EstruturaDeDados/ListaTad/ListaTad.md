## Exerc�cio 1) O que � um Tipo Abstrato de Dados (TAD) e qual a caracter�stica fundamental na sua utiliza��o?

Um TAD � uma forma de
definir um novo tipo de
dado juntamente com as
opera��es que manipulam
esse novo tipo de dado

? Encapsulamento: defini��o isolada de outras unidades do programa

? Invisibilidade e prote��o: representa��o do tipo deve ser acessada
somente no ambiente encapsulado

## Exerc�cio 2) Quais as vantagens de se programar com TADs?

Reutiliza��o

? Possibilidade de utiliza��o do mesmo
TAD em diversas aplica��es diferentes

? Possibilidade de alterar o TAD sem
alterar as aplica��es que o utilizam

Seguran�a

? Clientes n�o podem alterar a
representa��o

? Clientes n�o podem tornar os dados
inconsistentes


## Exerc�cio 3) Fa�a a especifica��o de um sistema de controle de reservas de um clube que aluga quadras poliesportivas usando TAD.

ControleReservas




## Exerc�cio 4) Desenvolva um TAD para um cubo. Inclua as opera��es de inicializa��e necess�rias e as opera��es que retornem os tamanhos de cada lado, a sua �rea e o seu volume.

## Exerc�cio 5) Desenvolva um TAD para um cilindro. Inclua as opera��es de inicializa��es necess�rias e as opera��es que retornem a sua altura e raio, a sua �rea e o seu volume.

## Exerc�cio 6) Desenvolva um TAD para um esfera. Inclua as opera��es de inicializa��es necess�rias e as opera��es que retornem seu raio, a sua �rea e o seu volume.

## Exerc�cio 7) Vamos supor que um n�mero real seja representado por uma classe Java,
## como esta:
## class RealType {
## int left;
## int right;
## };
## onde left e right representam os d�gitos posicionados � esquerda e � direita do ponto
## decimal, respectivamente. Se left for um inteiro negativo, o n�mero real representado ser�
## negativo.
## a) Escreva um m�todo para inserir um n�mero real e criar uma estrutura representado
## esse n�mero;
## b) Escreva um m�todo que aceite esse tipo e retorne o n�mero real representado por ela;
## c) Escreva m�todos add, substract e multiply que aceitem dois desses tipos e definam o
## valor de um terceiro tipos para representar o n�mero que seja a soma, a diferen�a e o
## produto, respectivamente, dos dois tipos de entrada.


## Exerc�cio 8) Defina um Tipo Abstrato de Dados TMatriz, para representar matrizes
## quadradas de tamanho n. Implemente as opera��es para somar e multiplicar 2 matrizes.
## Implemente ainda a opera��o do c�lculo da matriz inversa.


## Exerc�cio 9) Suponha dois vetores, um de estudantes e outro de funcion�rios. Cada tipo
## de estudante cont�m campos para um �ltimo nome, um primeiro nome e um �ndice de
## pontos de gradua��o. Cada tipo de funcion�rio cont�m membros para um �ltimo nome,
## um primeiro nome e um sal�rio. Ambos os vetores s�o classificados em ordem alfab�tica
## pelo �ltimo e pelo primeiro nome. Dois registros com o �ltimo e o primeiro nome iguais
## n�o aparecem no mesmo vetor. Escreva um m�todo em Java para conceder um aumento
## de 10% a todo funcion�rio que tenha um registro de estudante cujo �ndice de pontos de
## gradua��o seja maior que 3.0. 