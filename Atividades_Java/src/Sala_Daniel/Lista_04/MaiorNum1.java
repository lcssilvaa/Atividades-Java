import java.util.Scanner;

public class MaiorNum1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float [] num = new float[5];
        float maior = 0;
        String[] ordem = new String[] {"1°", "2°", "3°", "4°", "5°"};

        for(int x = 0; x < 5; x++) {
            System.out.println("Digite o " + ordem[x] + " número:");
            num[x] = sc.nextFloat();
        

        if(x == 0) {
            maior = num[x]; 
         }
         if(num [x] > maior) {
             maior = num[x];
         }
     }
         System.out.println("O maior número é: " + maior);
    
}
}