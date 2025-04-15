import java.util.Scanner;

public class PedirNota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite uma nota");
        float nota = sc.nextFloat();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida!");
            break;
        }

        else {
            System.out.println("Nota inválida!");
            continue;
        }

        }

        sc.close();
    }
}
       