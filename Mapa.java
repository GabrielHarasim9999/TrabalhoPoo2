import java.util.ArrayList;
import java.util.List;

public class Mapa {
    public int idMapa;
    private String nomeRegiao;
    public List<Inimigo> listarInimigos = new ArrayList<>();

    public Mapa(String nomeRegiao,
                List<Inimigo> listarInimigos) {

        this.nomeRegiao = nomeRegiao;
        this.listarInimigos = listarInimigos;
    }

    public List<Inimigo> listarInimigos(){
        return List.of();

    }
    public void spawnarInimigos(Inimigo inimigo){
        inimigo.add(inimigo);

    }
    public void alterarClima() {

    }

    public List<Inimigo> getListarInimigos() {
        return listarInimigos;
    }
    public String getNomeRegiao() {
        return nomeRegiao;
    }
    public void setListarInimigos(List<Inimigo> listarInimigos) {
        this.listarInimigos = listarInimigos;
    }
    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }


}

