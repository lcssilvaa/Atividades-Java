import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        n1 = sc.nextInt();

        System.out.println("Digite outro número");
        n2 = sc.nextInt();

        for(int x = n1; x <= n2; x++){
            System.out.println(x);
        }

        sc.close();
    }
    
}
