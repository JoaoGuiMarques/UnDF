#include <stdio.h>
#include <wiringPi.h>

int main(void) //início do programa
{
    int escolha;  //declara variável escolha, que armazena o número do LED a ser escolhido
    int tempo;    //declara variável tempo, armazenando o tempo em segundos

    wiringPiSetup();            // inicia a biblioteca WiringPi
    pinMode(1, OUTPUT);         // configura o pino 1 como saída
    pinMode(4, OUTPUT);         // configura o pino 4 como saída
    pinMode(5, OUTPUT);         // configura o pino 5 como saída

    printf("Escolha o LED que você deseja acender:\n");  // imprime mensagem na tela
    printf("1 - Verde\n");       // imprime mensagem na tela
    printf("2 - Amarelo\n");     // imprime mensagem na tela
    printf("3 - Vermelho\n");    // imprime mensagem na tela
    scanf("%d", &escolha);       // lê o número digitado pelo usuário (%d) e armazena na variável “escolha”

    printf("Por quantos segundos o LED deve ficar aceso? ");
    scanf("%d", &tempo);         // lê o número digitado pelo usuário (%d) e armazena na variável “tempo”

    switch (escolha) // cria possíveis casos de acordo com a escolha do usuário
    {
        case 1:
            printf("LED verde ficará aceso por %d segundos...\n", tempo);
            digitalWrite(1, HIGH);
            delay(tempo * 1000);  // tempo em segundos convertido para milissegundos
            digitalWrite(1, LOW);
            break;

        case 2:
            printf("LED amarelo ficará aceso por %d segundos...\n", tempo);
            digitalWrite(4, HIGH);
            delay(tempo * 1000);
            digitalWrite(4, LOW);
            break;

        case 3:
            printf("LED vermelho ficará aceso por %d segundos...\n", tempo);
            digitalWrite(5, HIGH);
            delay(tempo * 1000);
            digitalWrite(5, LOW);
            break;

        default:
            printf("Opção inválida!\n"); // caso o usuário digite um número diferente de 1, 2 ou 3
    }

    printf("LED apagado. Programa concluído.\n"); // mensagem exibida no final
    return 0;
}

