public class BioGerador {
    private float potenciaAtual;
    private float cargaAtual;
    private final float cargaMaxima;

    // Construtor vazio
    public BioGerador() {
        this.potenciaAtual = 0f;
        this.cargaAtual = 0f;
        this.cargaMaxima = 5f;
    }

    // Getters e Setters
    public float getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setPotenciaAtual(float potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    // Carregar biocombustível
    public void carregar(bioCombustivel b) throws GeradorCheioException {
        if (cargaAtual >= cargaMaxima) {
            throw new GeradorCheioException("O gerador está cheio!");
        }

        float potenciaGerada = b.processar() * 2.36f;
        potenciaAtual += potenciaGerada;

        cargaAtual++;
    }

    // Esvaziar gerador
    public void esvaziar() {
        potenciaAtual = 0f;
        cargaAtual = 0f;
    }
}
