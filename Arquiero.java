public class Arquiero extends Personagem {
    private String agilidade;
    private int precisao;

    public Arquiero(String nome, int id) {
        super(nome, id);
    }

    public void tiroPreciso(Inimigo alvo){
        alvo.receberDano(ataque +precisao);

    }
}
public