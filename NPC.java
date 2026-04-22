public class NPC {
    private String dialogo;
    private String tipo;
    private String nome;

    public void conversar() {

    }
    public void oferecerMissao(){

    }
    public void comprarItem(Item item, Personagem jogador){

    }
    public void venderItem(Item item, Personagem jogador){
        jogador.adicionarItem(item);

    }
}
public