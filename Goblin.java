public class Goblin extends Inimigo{
    private int nivelAstucia;
    private int coragem;
    private String tipoGoblin;
    private String armaPrincipal;
    private int chanceFuga;
    private boolean rouboAtivo;

    public void atacarJogador(Personagem jogador){

    }
    public void atacarEmGrupo(){

    }
    public void fugir(){

    }
    public void roubarItem(Personagem jogador){

    }
    public void emboscar(Personagem alvo){

    }
    public void chamarReforcos(){

    }
    public void esconder(){

    }
    public void provocar(){

    }

    @Override
    public String getNome() {
        return super.getNome();
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
    public void setNome(String nome) {
        super.setNome(nome);
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
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public int getRecompensaXP() {
        return super.getRecompensaXP();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setRecompensaXP(int recompensaXP) {
        super.setRecompensaXP(recompensaXP);
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void add(Inimigo inimigo) {
        super.add(inimigo);
    }

    public boolean isRouboAtivo() {
        return rouboAtivo;
    }

    public int getChanceFuga() {
        return chanceFuga;
    }

    public int getCoragem() {
        return coragem;
    }

    public int getNivelAstucia() {
        return nivelAstucia;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public String getTipoGoblin() {
        return tipoGoblin;
    }

    public void setChanceFuga(int chanceFuga) {
        this.chanceFuga = chanceFuga;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public void setNivelAstucia(int nivelAstucia) {
        this.nivelAstucia = nivelAstucia;
    }

    public void setTipoGoblin(String tipoGoblin) {
        this.tipoGoblin = tipoGoblin;
    }

    public void setRouboAtivo(boolean rouboAtivo) {
        this.rouboAtivo = rouboAtivo;
    }

}
