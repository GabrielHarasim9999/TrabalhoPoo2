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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDialogo() {
        return dialogo;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}