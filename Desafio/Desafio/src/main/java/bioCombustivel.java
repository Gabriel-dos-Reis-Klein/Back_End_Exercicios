import java.util.Random;

public class bioCombustivel {
    protected float quilogramas;

    // Construtor padrão
    public bioCombustivel() {
        this(1000f);
    }

    // Construtor com quilogramas
    public bioCombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    // Getter e Setter
    public float getQuilogramas() {
        return quilogramas;
    }

    public void setQuilogramas(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    // Processar (retorna quilogramas × n, com n aleatório entre 1 e 3)
    public float processar() {
        Random random = new Random();
        float n = 1 + random.nextInt(3); // 1, 2 ou 3
        return quilogramas * n;
    }
}
