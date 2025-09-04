import java.util.ArrayList;

public class BiogeradorTeste {
    public static void main(String[] args) {
        // Criando lista de biocombustíveis
        ArrayList<bioCombustivel> combustiveis = new ArrayList<>();
        combustiveis.add(new CanaAcucar(2000));
        combustiveis.add(new Beterraba(3000));
        combustiveis.add(new Milho(1500));
        combustiveis.add(new Beterraba(3500));
        combustiveis.add(new Beterraba(2000));

        // Criando objeto Biogerador
        BioGerador gerador = new BioGerador();

        // Carregando os combustíveis
        for (bioCombustivel b : combustiveis) {
            try {
                gerador.carregar(b);
            } catch (GeradorCheioException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        // Exibindo resultados
        System.out.printf("Potência gerada no gerador 01: %.2f\n", gerador.getPotenciaAtual());
        System.out.println("Carga atual do gerador 01: " + (int)gerador.getCargaAtual());
    }
}
