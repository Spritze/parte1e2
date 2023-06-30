package exercicio1;


import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        int numero1, numero2, soma;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite um valor decimal inteiro:");
        numero1 = numeros.nextInt();
        System.out.println("Digite um segundo valor decimal inteiro:");
        numero2 = numeros.nextInt();
        soma = numero1 + numero2;
        System.out.println(("O resultado da soma dos numeros digitados é:" + soma));
    }
}