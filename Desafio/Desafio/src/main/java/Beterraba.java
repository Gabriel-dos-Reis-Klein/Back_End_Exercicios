public class Beterraba extends bioCombustivel {

    public Beterraba() {
        super();
    }

    public Beterraba(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return (quilogramas * 1.2f) + 1000;
    }
}
