public class Cidade {
    private String nome;
    private int populacao;
    private java.util.List<NPC> npcs;
    private java.util.List<String> lojas;

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
}
public