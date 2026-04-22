import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private String nomeRegiao;
    private List<String> listaDeLocais = new ArrayList<>();
    public List<Inimigo> listarInimigos = new ArrayList<>();

    public List<Inimigo> listarInimigos(){
        return List.of();

    }
    public void spawnarInimigos(Inimigo inimigo){
        inimigo.add(inimigo);

    }
    public void alterarClima(){

    }
}
