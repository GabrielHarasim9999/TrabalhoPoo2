public class Inimigo {
    private String nome;
    private String tipo;
    protected int vida;
    protected int ataque;
    private int recompensaXP;
    private int defesa;

    public Inimigo(int idInimigo, String nome, int nivel, int vida) {
    }

    public void atacarJogador(Personagem jogador){
        jogador.receberDano(ataque);

    }
    public void receberDano(int dano){

        this.vida -= Math.max(0, dano - defesa);

    }

    public void add(Inimigo inimigo) {

    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getRecompensaXP() {
        return recompensaXP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setRecompensaXP(int recompensaXP) {
        this.recompensaXP = recompensaXP;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
