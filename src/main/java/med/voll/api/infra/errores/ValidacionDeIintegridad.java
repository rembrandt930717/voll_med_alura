package med.voll.api.infra.errores;

public class ValidacionDeIintegridad extends RuntimeException {
    public ValidacionDeIintegridad(String s) {
        super(s);
    }
}
