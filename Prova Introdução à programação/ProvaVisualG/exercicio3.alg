algoritmo "exercicio3"

var

kmEstrada: real
kmCidade: real

kmLitroEstrada: real
kmLitroCidade: real 

valorCombustivel: real

totalLitros: real
totalValor: real

inicio

kmEstrada <- 100
kmCidade <- 50

kmLitroEstrada <- 8
kmLitroCidade <- 6

valorCombustivel <- 6.31

totalLitros <- (kmEstrada / kmLitroEstrada) + (kmCidade / kmLitroCidade)
totalValor <- totalLitros * valorCombustivel

escreval ("Distância na estrada percorrida: " + kmEstrada + "Km.")
escreval ("Distância na cidade percorrida: " + kmCidade + "Km.")
escreva ("Média de consumo na estrada: " + kmLitroEstrada + "Km. ")
escreval ("Média de consumo na cidade: " + kmLitroCidade + "Km.")
escreval ("Total de litros de combustível: " + totalLitros + ".")
escreval ("Valor total de abastecimento: R$" + totalValor + ".")

fimalgoritmo