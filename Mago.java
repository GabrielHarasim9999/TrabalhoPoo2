public class Mago  extends Personagem{
    private int mana;
    private int poderMagico;

    public Mago(String nome, int id) {
        super(nome, id);
    }

    public void lancarFeitico(Inimigo alvo){
        alvo.receberDano(poderMagico);

    }

    @Override
    public void usarHabilidade() {
        super.usarHabilidade();
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void setInventario(String inventario) {
        super.setInventario(inventario);
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
    public String getInventario() {
        return super.getInventario();
    }

    @Override
    public void setNivel(int nivel) {
        super.setNivel(nivel);
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public int getPoderMagico() {
        return poderMagico;
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
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getNivel() {
        return super.getNivel();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void adicionarItem(Item item) {
        super.adicionarItem(item);
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void atacar(Inimigo inimigo) {
        super.atacar(inimigo);
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }
}
