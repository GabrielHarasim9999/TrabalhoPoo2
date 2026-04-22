public class Guerreiro extends Personagem{
    private int forca;
    private int resistencia;

    public Guerreiro(String nome, int id) {
        super(nome, id);
    }

    public void ataquePesado(Inimigo alvo){
        alvo.receberDano(ataque *2);

    }
}

