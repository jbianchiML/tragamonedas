import java.util.Random;

public class TamborMock implements TamborBuilder{


    Tambor tambor = new Tambor();

    @Override
    public void girar() {
        tambor.girar();
    }

    @Override
    public int obtenerPosicion() {
        return 3;
    }
}
