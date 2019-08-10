import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TragamonedasTest {

    @Test
    public void activarGiraTodoLosTambores(){
        List<TamborBuilder> tamborBuilders = new ArrayList<>();
        tamborBuilders.add(new TamborMock());
        tamborBuilders.add(new TamborMock());
        tamborBuilders.add(new TamborMock());
        Tragamonedas tragamonedas = new Tragamonedas(tamborBuilders);
        tragamonedas.activar();
        final ArrayList<Boolean> giraron = new ArrayList<Boolean>();
        tragamonedas.tambores.stream().forEach(t -> { if(t.obtenerPosicion() == 0)
                                                            giraron.add(false);
                                                    else
                                                        giraron.add(true);
                                                        });
        Assertions.assertThat(giraron.contains(false)).isFalse();
    }

    @Test
    public void ganarMock(){
        List<TamborBuilder> tamborBuilders = new ArrayList<>();
        tamborBuilders.add(new TamborMock());
        tamborBuilders.add(new TamborMock());
        tamborBuilders.add(new TamborMock());
        Tragamonedas tragamonedas = new Tragamonedas(tamborBuilders);
    }

}
