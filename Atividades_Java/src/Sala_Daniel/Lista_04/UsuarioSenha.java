
import java.util.Scanner;

public class UsuarioSenha {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        while(true) {

            System.out.println("Digite sua senha:");
        String senha = sc.nextLine();

        if (!senha.equals(nome)) {
            System.out.println("Senha válida!");
            break;
        }

        else {
            System.out.println("Senha inválida! (não pode ser a mesma do nome)");
            continue;
        }

        }

        sc.close();
    }
}

