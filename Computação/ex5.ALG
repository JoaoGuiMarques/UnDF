Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/10/2025
Var
num, dig1, dig3: inteiro


Inicio

escreva("Escreva um número de 3 dígitos: ")
leia(num)

se (num >= 100) e (num <= 999) entao

dig1 <- num div 100
dig3 <- num mod 10

se (dig1 = dig3) então
escreva ("O número ", num, " é um palíndromo")
senão

escreva ("O número ", num, " não é um palíndromo")
fimse

senao
escreva("Número incompatível")

fimse


Fimalgoritmo
