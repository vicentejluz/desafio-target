# desafio-target

1. Observe o trecho de código abaixo:

    ```bash
    int INDICE = 13, SOMA = 0, K = 0;

    enquanto K < INDICE faça

    {

    K = K + 1;

    SOMA = SOMA + K;

    }

    imprimir(SOMA);
    ```

    Ao final do processamento, qual será o valor da variável SOMA?
    <p><strong><code>SOMA = 91</code></strong></p>

2. Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

    <p>IMPORTANTE:</p>
    <p>Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;</p>

    [Resposta 2](https://github.com/vicentejluz/desafio-target/tree/main/pergunta_2/src/application/Main.java)

3) Descubra a lógica e complete o próximo elemento:

    <p>a) 1, 3, 5, 7,<strong><code>9</code></strong></p>

    <p>b) 2, 4, 8, 16, 32, 64, <strong><code>128</code></strong></p>

    <p>c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong></p>

    <p>d) 4, 16, 36, 64, <strong><code>100</code></strong></p>

    <p>e) 1, 1, 2, 3, 5, 8, <strong><code>13</code></strong></p>

    <p>f) 2,10, 12, 16, 17, 18, 19, <strong><code>200</code></strong></p>

4. Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

    Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

    **Na primeira ida:**

    ```
    - Eu vou na sala das lâmpadas.
    - Ligo o primeiro interruptor e deixo ligado por um tempo.
    - Em seguida, desligo o primeiro interruptor e ligo o segundo interruptor.
    - Agora, entro na sala das lâmpadas.
    - Se uma lâmpada estiver acesa, então é o interruptor conectado ao primeiro interruptor que controla essa lâmpada.
    - Se a lâmpada estiver desligada, mas ainda estiver quente ao toque, então é o interruptor conectado ao segundo interruptor que controla essa lâmpada.
    - Se a lâmpada estiver desligada e fria, então é o interruptor conectado ao terceiro interruptor que controla essa lâmpada.
    ```

    **Na segunda ida:**

    ```
    - Agora, sabendo qual interruptor controla uma das lâmpadas, ligo um dos interruptores que ainda não foi testado.
    - Entro na sala das lâmpadas novamente.
    - Se a lâmpada estiver acesa, então é o interruptor que eu liguei que controla essa lâmpada.
    - Se a lâmpada estiver desligada, o interruptor restante controla essa lâmpada.
    ```

5. Escreva um programa que inverta os caracteres de um string.

    <p>IMPORTANTE:</p>
    <p> a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;</p>
    <p>b) Evite usar funções prontas, como, por exemplo, reverse;</p>

    [Resposta 5](https://github.com/vicentejluz/desafio-target/blob/main/pergunta_5/src/application/Main.java)

6. Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:

    - O menor valor de faturamento ocorrido em um dia do mês;

    - O maior valor de faturamento ocorrido em um dia do mês;

    - Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

    <p>IMPORTANTE:</p>
    <p>a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;</p>
    <p>b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;</p>

    [Resposta 6](https://github.com/vicentejluz/desafio-target/blob/main/pergunta_6/src/application/Main.java)

7. Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

    - SP – R$67.836,43
    - RJ – R$36.678,66
    - MG – R$29.229,88
    - ES – R$27.165,48
    - Outros – R$19.849,53

     Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

    [Resposta 7](https://github.com/vicentejluz/desafio-target/blob/main/pergunta_7/src/application/Main.java)
