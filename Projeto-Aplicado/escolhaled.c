#include <stdio.h>
#include <wiringPi.h>

int main(void) //in�cio do programa
{
    int escolha;  //declara vari�vel escolha, que armazena o n�mero do LED a ser escolhido
    int tempo;    //declara vari�vel tempo, armazenando o tempo em segundos

    wiringPiSetup();            // inicia a biblioteca WiringPi
    pinMode(1, OUTPUT);         // configura o pino 1 como sa�da
    pinMode(4, OUTPUT);         // configura o pino 4 como sa�da
    pinMode(5, OUTPUT);         // configura o pino 5 como sa�da

    printf("Escolha o LED que voc� deseja acender:\n");  // imprime mensagem na tela
    printf("1 - Verde\n");       // imprime mensagem na tela
    printf("2 - Amarelo\n");     // imprime mensagem na tela
    printf("3 - Vermelho\n");    // imprime mensagem na tela
    scanf("%d", &escolha);       // l� o n�mero digitado pelo usu�rio (%d) e armazena na vari�vel �escolha�

    printf("Por quantos segundos o LED deve ficar aceso? ");
    scanf("%d", &tempo);         // l� o n�mero digitado pelo usu�rio (%d) e armazena na vari�vel �tempo�

    switch (escolha) // cria poss�veis casos de acordo com a escolha do usu�rio
    {
        case 1:
            printf("LED verde ficar� aceso por %d segundos...\n", tempo);
            digitalWrite(1, HIGH);
            delay(tempo * 1000);  // tempo em segundos convertido para milissegundos
            digitalWrite(1, LOW);
            break;

        case 2:
            printf("LED amarelo ficar� aceso por %d segundos...\n", tempo);
            digitalWrite(4, HIGH);
            delay(tempo * 1000);
            digitalWrite(4, LOW);
            break;

        case 3:
            printf("LED vermelho ficar� aceso por %d segundos...\n", tempo);
            digitalWrite(5, HIGH);
            delay(tempo * 1000);
            digitalWrite(5, LOW);
            break;

        default:
            printf("Op��o inv�lida!\n"); // caso o usu�rio digite um n�mero diferente de 1, 2 ou 3
    }

    printf("LED apagado. Programa conclu�do.\n"); // mensagem exibida no final
    return 0;
}

