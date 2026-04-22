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
    public void alterarClima() {

    }

    public List<Inimigo> getListarInimigos() {
        return listarInimigos;
    }

    public List<String> getListaDeLocais() {
        return listaDeLocais;
    }

    public String getNomeRegiao() {
        return nomeRegiao;
    }

    public void setListaDeLocais(List<String> listaDeLocais) {
        this.listaDeLocais = listaDeLocais;
    }

    public void setListarInimigos(List<Inimigo> listarInimigos) {
        this.listarInimigos = listarInimigos;
    }

    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }

}

