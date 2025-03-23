package Sala_Daniel.Lista_03;
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        
        float n1, n2, n3, maior, menor, media;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();

        maior = n1;

        if(n2 > maior) {
            maior = n2;
        }
        if(n3 > maior ) {
            maior = n3;
        }

        menor = n1;

        if(n2 < menor) {
            menor = n2;
        }
        if(n3 < menor) {
            menor = n3;
        }

        media = (n1 + n2 + n3) / 3;

        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
        System.out.println("A média entre os números é: " + media);

        sc.close();
    }
    
}
