import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "", sexo = "", estadoCivil = "";
        int idade = 0;
        double salario = 0;
        
        while (true) {
            System.out.println("Digite seu nome:");
            nome = sc.nextLine();
            
            if (nome.length() < 3) {
                System.out.println("Seu nome precisa ter mais de 3 caracteres.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("\nDigite sua idade:");
            idade = sc.nextInt();
            
            if (idade < 0 || idade > 150) {
                System.out.println("Sua idade precisa ser maior que 0 e menor que 150.");
            } else {
                break;
            }
        }

        sc.nextLine();

        while (true) {
            System.out.println("\nDigite seu salário:");
            salario = sc.nextDouble();
            
            if (salario < 0) {
                System.out.println("Seu salário precisa ser maior que 0.");
            } else {
                break;
            }
        }

        sc.nextLine();

        while (true) {
            System.out.println("\nDigite seu sexo (F ou M):");
            sexo = sc.nextLine().toLowerCase();

            if (sexo.equals("f") || sexo.equals("m")) {
                break;
            } else {
                System.out.println("Inválido (Digite F ou M).");
            }
        }

        while (true) {
            System.out.println("\nDigite seu estado civil (S, C, V ou D):");
            estadoCivil = sc.nextLine().toLowerCase();

            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) {
                break;
            } else {
                System.out.println("Inválido (Digite S, C, V ou D).");
            }
        }

        System.out.println("\nSeu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu salário é: " + salario);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Seu estado civil é: " + estadoCivil);
    }
}