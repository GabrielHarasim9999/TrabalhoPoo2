public class Inimigo {
    private String nome;
    private String tipo;
    protected int vida;
    protected int ataque;
    private int recompensaXP;
    private int defesa;

    public void atacarJogador(Personagem jogador){
        jogador.receberDano(ataque);

    }
    public void receberDano(int dano){

        this.vida -= Math.max(0, dano - defesa);

    }

    public void add(Inimigo inimigo) {

    }
}

