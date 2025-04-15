package Sala_Daniel.Lista_03;
import java.util.Scanner;

public class Equacao2grau {

    public static void main(String[] args) {
        
        double a, b, c, delta, x1 = 0, x2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo a calculadora de equações de 2° grau!");
        
        do {
            System.out.println("\nDigite o valor de A:");
            a = sc.nextDouble(); 

            System.out.println("Digite o valor de B:");
            b = sc.nextDouble();

            System.out.println("Digite o valor de C:");
            c = sc.nextDouble();

        
            if(a == 0 && b == 0 && c != 0) {
                System.out.println("Coeficientes informados incorretamente. A equação é inválida.");
            }
        } while(a == 0 && b == 0 && c != 0); 

        if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de 1° grau!");
            double eq1grau = -c / b;  // Fórmula correta para equação de 1º grau: b * x + c = 0, logo x = -c / b
            System.out.println("O valor da equação é: x = " + eq1grau);
            return; 
            
        }

        delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais distintas:");
            System.out.println("As raízes reais são: x1 = " + x1 + " e x2 = " + x2);
        }

        if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("A única raiz real é: x = " + x1);
        }

        if (delta < 0) {
            x1 = -b / (2 * a);
            x2 = Math.sqrt(-delta) / (2 * a);
            System.out.println("Esta equação não possui raízes reais:");
            System.out.println("As raízes complexas são: x1 = " + x1 + " + " + " x2: " + x2);
        }
        
        sc.close();
    } 
}