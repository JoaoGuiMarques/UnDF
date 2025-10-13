#include <stdio.h>
#include <wiringPi.h>

int main()
{
    wiringPiSetup();           // inicia a biblioteca WiringPi
    pinMode(1, OUTPUT);        // configura o pino 1 como saída
    pinMode(4, OUTPUT);        // configura o pino 4 como saída
    pinMode(5, OUTPUT);        // configura o pino 5 como saída

    printf("Exemplo 1 - Ligar SEMÁFORO\n"); // imprime mensagem na tela

    while(1)
    {
        digitalWrite(1, HIGH); // liga o pino 1 (vermelho)
        delay(5000);           // espera 5 segundos
        digitalWrite(1, LOW);  // desliga o pino 1

        digitalWrite(4, HIGH); // liga o pino 4 (amarelo)
        delay(2000);           // espera 2 segundos
        digitalWrite(4, LOW);  // desliga o pino 4

        digitalWrite(5, HIGH); // liga o pino 5 (verde)
        delay(3000);           // espera 3 segundos
        digitalWrite(5, LOW);  // desliga o pino 5
    }

    return 0;
}

