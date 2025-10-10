Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/10/2025
Var
a, b, c, soma, med: real


Inicio

escreva("Escreva um número: ")
leia(a)
escreva("Escreva um número: ")
leia(b)
escreva("Escreva um número: ")
leia(c)

soma <- a+b+c
med <- soma/3

se (med mod 2 = 0) então
escreva ("A média de ", a,",", b,",", c, " é: ", med, ", e é um número par")
senão

escreva ("A média de ", a,",", b,",", c, " é: ", med, ", e é um número ímpar")

fimse


Fimalgoritmo