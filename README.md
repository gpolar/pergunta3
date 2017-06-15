
[![Gps|Gustavopolarsa]()](http://www.gustavopolarsa.com)

# Pergunta 3

O presente projeto é um aplicativo Java para fazer a seguinte lógica:

Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. O termino da leitura da stream deve ser garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream. Voce tera acesso a leitura da stream através dos métodos de interface fornecidos ao termino do enunciado

A documentação no mesmo esta no JavaDoc e nos testes Unitários(JUnit), também os metodos estão amigaveis para entender a funcionalidade dos mesmos.

# Pergunta 4

O deadLock traduzindo seria um bloqueo que é feito pelo seguinte exemplo o processo 1 espera que o processo 2 acabe, e o processo 2 espera que o processo 1 acabe assim como cada um espera de uma forma circular, nunca vai ter um final de um e inicio de outro, pelo que gera um DeadLock, um jeito simple de fazer é primeiro se uma pessoa esta trabalhando com threads por exemplo, que sejam independiente ou seja que não dependam uma da outra, e se por exemplo essas threads consuman metodos iguais, utilizar um syncronized ajudaria para enfilar algumas requisiçoes assim evitar um possivel deadLock.

# Pergunta 5

O Stream e o ParallelStreams, trabalham um de um jeito serial e outro paralelo.

O Stream ao ser serial os dados são processados em ordem em fila, por outro lado o ParallelStreams ele separa as informações e processa as informações paralelamente dependendo dos processadores do computador. um exemplo simples de entender é por exemplo se a gente que leer os carateres da seguinte palavra e imprimir em ordem mostrado("abcdefghijk"), se a gente utiliza o Stream com um foreach imprimindo as variaveis ele vai imprimir "a b c d e f g h i j k"( porque o processamento é serial), mas se a gente faz o mesmo procedimento com o  ParallelStreams ele vai imprimir num ordem aleatorio("a d c h g ...."), porque ele ao trabalhar paralelamente separa a lista como a VM veja melhor e processa as informações em threads de acordo a quantidade de processadores, e por isso o print vai ser diferente.

Com isso é bom saber quando utilizar o Stream e o ParallelStreams, para isso é bom ter presente algumas informações

- Tudo vai depender do que precisa, e não todos os tipos de dados são melhores que outros, por exemplo o arraylist ao ter possição dos objectos fica mais ubicar eles pelo que trabalhando talvez com um ParallelStreams seja mais rapido e LinkedList ao não ter uma possição definida fica mais confuso para o ParallelStreams dividir as informações.
- Também a quantidade de dados vai ajudar a decidir se a gente trabalha com stream paralelos o seriais.
- O processamento da memoria que vai utilizar também é bom ter presente porque o stream paralelo ao utilizar threards pode aumentar o processamento do server
- Por exemplo se a gente quer funções como findAny, findFirts o processamento paralelo pode resultar complicado porque talvez ele não traga a informação que a gente precisa e ao não sabe qual é a primer valor que desejamos fique mais complexo para VM separar as informações.

Ou seja para concluir nao tudo pode ser paralelo e nao tudo pode ser serial e como recomendação minha a gente pode seguir essas dicas mas também sempre é bom fazer testes com os dois assim fazer uma decisão melhor


