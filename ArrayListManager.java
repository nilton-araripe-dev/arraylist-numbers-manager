import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListManager{
public static void main(String[] args){
Scanner leitor = new Scanner(System.in);
ArrayList<Double> numeros = new ArrayList<>();

int opcao = -1;
boolean dadosInseridos = false;

while(opcao != 0){
System.out.println("---Menu---");
System.out.println("Selecione uma opção");
System.out.println("1 - Adicionar números");
System.out.println("2 - Mostrar números");
System.out.println("3 - Mostrar média");
System.out.println("4 - Mostrar maior número");
System.out.println("5 - Mostrar menor número");
System.out.println("6 - Buscar número");
System.out.println("7 - Remove por indice");
System.out.println("8 - Mostra quantidade de pares");
System.out.println("9 - Limpar lista");
System.out.println("0 - Sair");
opcao = leitor.nextInt();

switch(opcao){
case 1:
System.out.println("Quantos números deseja inserir?");
int quantidade = leitor.nextInt();

for (int i = 0; i < quantidade; i++){
System.out.println("Digite os números que deseja inserir " + (i + 1));
numeros.add(leitor.nextDouble());
}
System.out.println("Números adicionados com sucesso");
dadosInseridos = true;
break;

case 2:
if (numeros.size() == 0){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Seus números digitados são:");
for (int i = 0; i < numeros.size(); i++){
System.out.println(numeros.get(i));
}
}
break;

case 3:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Sua media é: " + verMedia(numeros));
}
break;

case 4:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Seu maior número é: " + verMaior(numeros));
}
break;

case 5:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Seu menor número é: " + verMenor(numeros));
}
break;

case 6:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Qual número você deseja buscar?");
double buscar = leitor.nextDouble();
boolean encontrado = false;

for (int i = 0; i < numeros.size(); i++){
if (buscar == numeros.get(i)){
encontrado = true;
}
}
if (encontrado){
System.out.println("Seu número foi encontrado");
} else {
System.out.println("Seu número não foi encontrado");
}
}
break;

case 7:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Qual o indice do número que você deseja remover?");
int indice = leitor.nextInt();

if (indice >= 0 && indice <= numeros.size()){
numeros.remove(indice);
System.out.println("Número removido com sucesso");
} else {
System.out.println("Indice invalido");
}
}
break;

case 8:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primeiro");
} else {
System.out.println("Quantidade total de números pares: " + verPares(numeros));
}
break;

case 9:
if (!dadosInseridos){
System.out.println("Você precisa adicionar números primero");
} else {
System.out.println("Digite 1 para confirmar");
int confirmacao = leitor.nextInt();
boolean delete = false;
if (confirmacao == 1){
delete = true;
}

if (delete){
numeros.clear();
System.out.println("Lista vazia");
dadosInseridos = false;
} else {
System.out.println("Confirmação exigida");
}
}
break;

case 0:
System.out.println("Encerrando...");
break;

default:
System.out.println("Opção invalida");
}
}
leitor.close();
}

public static double verMedia(ArrayList<Double> numeros){
double soma = 0;
for (int i = 0; i < numeros.size(); i++){
soma += numeros.get(i);
}
return soma / numeros.size();
}

public static double verMaior(ArrayList<Double> numeros){
double maior = numeros.get(0);
for (int i = 0; i < numeros.size(); i++){
if (numeros.get(i) > maior ) {
maior = numeros.get(i);
}
}
return maior;
}
public static double verMenor(ArrayList<Double> numeros){
double menor = numeros.get(0);
for (int i = 0; i < numeros.size(); i++){
if (numeros.get(i) < menor ) {
menor = numeros.get(i);
}
}
return menor;
}

public static int verPares(ArrayList<Double> numeros){
int contador = 0;
for (int i = 0; i < numeros.size(); i++){
if (numeros.get(i) % 2 == 0 && numeros.get(i) == numeros.get(i).intValue()){
contador++;
}
}
return contador;
}
}
