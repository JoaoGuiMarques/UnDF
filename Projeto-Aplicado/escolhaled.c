#include <stdio.h>
#include <wiringPi.h>

int main(void) //início do programa
{
    int escolha;  //declara variável escolha, que armazena o número do LED a ser escolhido
    int tempo;    //declara variável tempo, armazenando o tempo em segundos

    wiringPiSetup();            // inicia a biblioteca WiringPi
    pinMode(1, OUTPUT);         // configura o pino 1 como saída, físico 12
    pinMode(4, OUTPUT);         // configura o pino 4 como saída, físico 16
    pinMode(5, OUTPUT);         // configura o pino 5 como saída, físico 18
	
	while(1) {
	
    printf("Escolha o LED que você deseja acender ou 0 se você deseja sair:\n");  // imprime mensagem na tela
    printf("1 - Verde\n");       // imprime mensagem na tela
    printf("2 - Amarelo\n");     // imprime mensagem na tela
    printf("3 - Vermelho\n");    // imprime mensagem na tela
    printf("0 - Sair\n");
    printf("Digite o número: ");
    scanf("%d", &escolha);       // lê o número digitado pelo usuário (%d) e armazena na variável “escolha”

	if (escolha == 0) {
		printf("Programa encerrado\n");
		break;
	}
	
	if (escolha < 1 || escolha > 3 ) { // Se a opção for inválida (não for 1, 2 ou 3), mostra erro e volta pro menu
		printf("Opção inválida! Digite 1, 2, 3 ou 0 para sair.\n");
		continue; // volta pro início do while
	}
		
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
    }

    printf("LED apagado...\n"); // mensagem exibida no final
	}
	
    return 0;
}
