public class Mago  extends Personagem{
    private int mana;
    private int poderMagico;

    public Mago(String nome, int id) {
        super(nome, id);
    }

    public void lancarFeitico(Inimigo alvo){
        alvo.receberDano(poderMagico);

    }
}
public