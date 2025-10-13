#include <stdio.h>
#include <wiringPi.h>

int main() {
    wiringPiSetup();           // inicia a biblioteca WiringPi
    pinMode(1, OUTPUT);        // configura o pino 1 como saída

    printf("Exemplo 1 - Ligar LED\n"); // imprime mensagem na tela

    while(1)
    {
        digitalWrite(1, HIGH); // liga o pino 1
    }

    return 0;
}

