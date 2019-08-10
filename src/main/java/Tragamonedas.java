import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tragamonedas {

    List<TamborBuilder> tambores= new ArrayList<>();

    public Tragamonedas(List<TamborBuilder> tamborBuilders){
        this.tambores = tamborBuilders;
    }

    public void activar(){
        final int primerPosicion;
        tambores.stream().forEach(t->t.girar());
        TamborBuilder t =tambores.stream().findFirst().get();
        if( t != null){
            primerPosicion=t.obtenerPosicion();
            if(tambores.stream().filter(p->p.obtenerPosicion() != primerPosicion).collect(Collectors.toList()).isEmpty()){
                entregarPremio();
            }
        }

    }
    public void entregarPremio(){
        System.out.println("Entregar premio");
    }


}
