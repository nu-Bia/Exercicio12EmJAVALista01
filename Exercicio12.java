//12) Escreva um algoritmo para ler as dimensões de um círculo (raio), calcular e escrever a 
//área do círculo. a=pi*r² 
import java.util.Scanner;

public class Exercicio12 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o Raio do circulo");

double r= sc.nextInt();
 r = r * r;
System.out.println ("A área do circulo é de : " + 3,14 * r);


}}

