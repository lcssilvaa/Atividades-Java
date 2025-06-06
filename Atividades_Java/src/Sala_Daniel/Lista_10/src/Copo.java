public class Copo {
    String material; // Vidro, Plástico
    double capacidadeMl;
    String cor;
    double alturaCm;
    double conteudoAtualMl;

    public Copo(String material, double capacidadeMl, String cor, double alturaCm) {
        this.material = material;
        this.capacidadeMl = capacidadeMl;
        this.cor = cor;
        this.alturaCm = alturaCm;
        this.conteudoAtualMl = 0; // Copo inicia vazio
    }

    public void encher(double quantidadeMl) {
        if (conteudoAtualMl + quantidadeMl <= capacidadeMl) {
            this.conteudoAtualMl += quantidadeMl;
            System.out.println("Copo " + cor + " preenchido para " + conteudoAtualMl + "ml.");
        } else {
            System.out.println("Não é possível encher, o copo " + cor + " irá transbordar.");
        }
    }

    public void esvaziar() {
        if (conteudoAtualMl > 0) {
            System.out.println("Copo " + cor + " esvaziado. Conteúdo: " + conteudoAtualMl + "ml.");
            this.conteudoAtualMl = 0;
        } else {
            System.out.println("O copo " + cor + " já está vazio.");
        }
    }

    public void lavar() {
        System.out.println("Copo " + cor + " lavado.");
        this.conteudoAtualMl = 0; // Garante que está vazio após lavar
    }
}