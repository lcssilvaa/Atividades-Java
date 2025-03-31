package Sala_Daniel.Lista_03;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List <String> operacoes = Arrays.asList("+", "-", "*", "/", "^");
        double n1, n2, resultado = 0;
        String resposta;

        System.out.println("Digite o primeiro número:");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Qual das operações a seguir você deseja realizar:");
        System.out.println("\nPara adição, digite: +");
        System.out.println("Para subtração, digite: - ");
        System.out.println("Para multiplicação, digite: *");
        System.out.println("Para divisão, digite: /");
        System.out.println("Para potenciação, digite: ^");
        resposta = sc.nextLine();

        while (!operacoes.contains(resposta)) {
            System.out.println("Resposta inválida, tente novamente:");
            resposta = sc.nextLine();
        }
            
        switch (resposta) {
            case "+":
            resultado = n1 + n2;
                break;
        
            case "-":
            resultado = n1 - n2;
                break;

            case "*":
            resultado = n1 * n2;
                break;

            case "/":
            resultado = n1 / n2;
                break;

            case "^":
            resultado = Math.pow(n1, n2);
                break;
        }

        System.out.println("O resultado da sua operação é: " + resultado);
        sc.close();
        }
    }
    

