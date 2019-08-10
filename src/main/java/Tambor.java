import java.util.Random;

public class Tambor implements TamborBuilder {


    private int posicion=0;


    @Override
    public void girar() {
        Random r= new Random();
        this.posicion=r.nextInt((8-1)+1)+1;
        System.out.println(this.posicion);
    }

    @Override
    public int obtenerPosicion() {
        return posicion;

    }
}
