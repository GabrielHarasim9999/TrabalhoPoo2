public class Esqueleto extends Inimigo{
    private String tipoOsso;
    private int resistenciaMagia;
    private String vulnerabilidade;
    private String armaEquipada;
    private boolean reanimavel;
    private int tempoParaReanimar;

    public void atacarJogador(Personagem jogador){

    }
    public void defender(){

    }
    public void desmontar(){

    }
    public void reanimar(){

    }
    public void resistirMagia(String tipoMagia){

    }
    public <Arma> void equiparArma(Arma arma){
        this.armaEquipada = (String) arma;

    }
    public void perderMembro(){

    }

    @Override
    public void setRecompensaXP(int recompensaXP) {
        super.setRecompensaXP(recompensaXP);
    }

    @Override
    public int getRecompensaXP() {
        return super.getRecompensaXP();
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public int getResistenciaMagia() {
        return resistenciaMagia;
    }

    public int getTempoParaReanimar() {
        return tempoParaReanimar;
    }

    public String getArmaEquipada() {
        return armaEquipada;
    }

    public String getTipoOsso() {
        return tipoOsso;
    }

    public String getVulnerabilidade() {
        return vulnerabilidade;
    }

    public void setArmaEquipada(String armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    public void setReanimavel(boolean reanimavel) {
        this.reanimavel = reanimavel;
    }

    public void setResistenciaMagia(int resistenciaMagia) {
        this.resistenciaMagia = resistenciaMagia;
    }

    public void setTempoParaReanimar(int tempoParaReanimar) {
        this.tempoParaReanimar = tempoParaReanimar;
    }

    public void setTipoOsso(String tipoOsso) {
        this.tipoOsso = tipoOsso;
    }

    public void setVulnerabilidade(String vulnerabilidade) {
        this.vulnerabilidade = vulnerabilidade;
    }

    public boolean isReanimavel() {
        return reanimavel;
    }

    @Override
    public void add(Inimigo inimigo) {
        super.add(inimigo);
    }
}
