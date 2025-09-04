public class CanaAcucar extends bioCombustivel {

    public CanaAcucar() {
        super();
    }

    public CanaAcucar(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return quilogramas * 3.5f;
    }
}
