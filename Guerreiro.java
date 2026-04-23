import java.util.ArrayList;

public class Guerreiro extends Personagem{
    private int forca;
    private int resistencia;

    public Guerreiro(String nome, int id) {
        super(nome, id);
    }

    public void ataquePesado(Inimigo alvo){
        alvo.receberDano(ataque *2);

    }

    @Override
    public ArrayList getInventario() {
        return super.getInventario();
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
    public int getVida() {
        return super.getVida();
    }

    @Override
    public int getNivel() {
        return super.getNivel();
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
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
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }

    @Override
    public void setInventario(ArrayList inventario) {
        super.setInventario(inventario);
    }

    @Override
    public String getClasse() {
        return super.getClasse();
    }

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public void setNivel(int nivel) {
        super.setNivel(nivel);

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
    public void atacar(Inimigo inimigo) {
        super.atacar(inimigo);
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void usarHabilidade() {
        super.usarHabilidade();
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}

