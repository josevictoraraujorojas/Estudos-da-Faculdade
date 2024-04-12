Exercício 1) Quando (em quais situações) usar alocação de memória estática e quando
usar alocação de memória dinâmica?
A alocacao de memória estatica e usada quando o programa necessita fazer muita busca e consulta de elemento consulta de dados, melhor utilizada para programas simples, com o seu gasto de memória definido

A aloccao de memória dinamica e usada quando o programa necessita de muita insercao e remocao de dados, melhor utilizada para programas complexos, com o seu custo de memória muito flexiviel assim podendo ser utilizados para diferentes consumos da memória


Exercício 2) Implemente em Java um array com 10 alunos. Cada aluno deve possuir:
nome, peso e dataNascimento.
? Armazene somente 8 alunos, cada aluno deve ocupar uma posição do vetor
? Faça uma pesquisa no vetor para encontrar um dado aluno. Utilize como
chave de busca o nome do aluno
? Crie um método para inserir um aluno na posição 4, sem afetar os demais
alunos (rearranjando os demais)


Exercício 3) Usando o exemplo do professor em sala de aula, crie dois programas, sendo
um para vetor estático e o outro para vetor dinâmico com as seguintes operações:
? Criar um vetor vazio com 10 posições;
? Inserir elemento no final do vetor;
? Remover o primeiro elemento do vetor;
? Buscar um elemento do vetor de acordo com uma chave;
? Verificar se o vetor está vazio;
? Verificar se o vetor está cheio;
Analisar a complexidade dos dois programas.


Exercício 4) Qual a saída gerada pelo código abaixo?

i = 10 j=10


Exercício 5) Implemente em Java a classe Vetor.
Onde,
Vetor() é o construtor que inicializa o tamanho do vetor com TAM_MAX = 100.
Vetor(capacidade: int) é o construtor que inicializa o vetor com tamanho capacidade.
adiciona(elemento: String): boolean
insere elemento no final da lista, isto é, na primeira posição livre do vetor elementos[].
Retorna true (sucesso) ou false
adiciona(posicao:int, elemento: String): boolean
insere elemento na posição posicao do vetor elementos[]. Retorna true (sucesso) ou false
busca(posicao: int): String
retorna o String que está na posição posicao do vetor elementos[]
busca(elemento: String): int
busca pelo elemento no vetor elementos[] e retorna a sua posição, ou o valor -1 se não
encontrar.
tamanho(): int
retorna a quantidade de elementos inseridos em elementos[].
remove(posicao: int)
remove o String da posição posicao.
ToString(): String
retorna um String com os elementos da lista.


Exercício 6) Crie uma classe de teste para adicionar elementos no vetor (exercício
anterior) e imprimir o vetor.