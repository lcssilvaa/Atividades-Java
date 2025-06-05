import java.util.Scanner;

public class ConversorHorario {
    public static String converterHorario(int hora, int minuto) {
        String periodo = (hora >= 12) ? "P.M." : "A.M.";
        hora = (hora == 0) ? 12 : (hora > 12) ? hora - 12 : hora;
        return String.format("%02d:%02d %s", hora, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a hora (24h) ou -1 para sair: ");
            int hora = scanner.nextInt();
            if (hora == -1) break;

            System.out.print("Digite os minutos: ");
            int minuto = scanner.nextInt();

            System.out.println("Horário convertido: " + converterHorario(hora, minuto));
        }

        scanner.close();
    }
}
