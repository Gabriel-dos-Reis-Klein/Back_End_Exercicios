public class Milho extends bioCombustivel {

    public Milho() {
        super();
    }

    public Milho(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return quilogramas + 1000;
    }
}
