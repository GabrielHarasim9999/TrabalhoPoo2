import java.util.List;

public class Cidade {
    private String nome;
    private int populacao;
    private java.util.List<NPC> npcs;
    private java.util.List<String> lojas;

    public Cidade(int idCidade, String nome, String reino, int populacao) {
    }

    public void acessarLojas(String nome) {

    }
    public void adiconarNPC(NPC npc) {
        npcs.add(npc);

    }
    public void listarLojas(){
        for (String loja: lojas){
            System.out.println(loja);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public List<NPC> getNpcs() {
        return npcs;
    }

    public List<String> getLojas() {
        return lojas;
    }

    public void setLojas(List<String> lojas) {
        this.lojas = lojas;
    }

    public void setNpcs(List<NPC> npcs) {
        this.npcs = npcs;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
