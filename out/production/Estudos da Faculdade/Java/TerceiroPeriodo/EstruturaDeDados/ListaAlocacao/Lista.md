Exerc�cio 1) Quando (em quais situa��es) usar aloca��o de mem�ria est�tica e quando
usar aloca��o de mem�ria din�mica?
A alocacao de mem�ria estatica e usada quando o programa necessita fazer muita busca e consulta de elemento consulta de dados, melhor utilizada para programas simples, com o seu gasto de mem�ria definido

A aloccao de mem�ria dinamica e usada quando o programa necessita de muita insercao e remocao de dados, melhor utilizada para programas complexos, com o seu custo de mem�ria muito flexiviel assim podendo ser utilizados para diferentes consumos da mem�ria


Exerc�cio 2) Implemente em Java um array com 10 alunos. Cada aluno deve possuir:
nome, peso e dataNascimento.
? Armazene somente 8 alunos, cada aluno deve ocupar uma posi��o do vetor
? Fa�a uma pesquisa no vetor para encontrar um dado aluno. Utilize como
chave de busca o nome do aluno
? Crie um m�todo para inserir um aluno na posi��o 4, sem afetar os demais
alunos (rearranjando os demais)


Exerc�cio 3) Usando o exemplo do professor em sala de aula, crie dois programas, sendo
um para vetor est�tico e o outro para vetor din�mico com as seguintes opera��es:
? Criar um vetor vazio com 10 posi��es;
? Inserir elemento no final do vetor;
? Remover o primeiro elemento do vetor;
? Buscar um elemento do vetor de acordo com uma chave;
? Verificar se o vetor est� vazio;
? Verificar se o vetor est� cheio;
Analisar a complexidade dos dois programas.


Exerc�cio 4) Qual a sa�da gerada pelo c�digo abaixo?

i = 10 j=10


Exerc�cio 5) Implemente em Java a classe Vetor.
Onde,
Vetor() � o construtor que inicializa o tamanho do vetor com TAM_MAX = 100.
Vetor(capacidade: int) � o construtor que inicializa o vetor com tamanho capacidade.
adiciona(elemento: String): boolean
insere elemento no final da lista, isto �, na primeira posi��o livre do vetor elementos[].
Retorna true (sucesso) ou false
adiciona(posicao:int, elemento: String): boolean
insere elemento na posi��o posicao do vetor elementos[]. Retorna true (sucesso) ou false
busca(posicao: int): String
retorna o String que est� na posi��o posicao do vetor elementos[]
busca(elemento: String): int
busca pelo elemento no vetor elementos[] e retorna a sua posi��o, ou o valor -1 se n�o
encontrar.
tamanho(): int
retorna a quantidade de elementos inseridos em elementos[].
remove(posicao: int)
remove o String da posi��o posicao.
ToString(): String
retorna um String com os elementos da lista.


Exerc�cio 6) Crie uma classe de teste para adicionar elementos no vetor (exerc�cio
anterior) e imprimir o vetor.