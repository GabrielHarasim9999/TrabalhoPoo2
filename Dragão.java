public class Dragão extends Inimigo{
    private String tipoElemento;
    private int alcanceVoo;

    public void ataqueEmArea(){

    }
    public void voar(){

    }
    public void soproElemental(Personagem alavo){

    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void add(Inimigo inimigo) {
        super.add(inimigo);
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque);
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }

    @Override
    public void setRecompensaXP(int recompensaXP) {
        super.setRecompensaXP(recompensaXP);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getRecompensaXP() {
        return super.getRecompensaXP();
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void atacarJogador(Personagem jogador) {
        super.atacarJogador(jogador);
    }

    public int getAlcanceVoo() {
        return alcanceVoo;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setAlcanceVoo(int alcanceVoo) {
        this.alcanceVoo = alcanceVoo;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

}
