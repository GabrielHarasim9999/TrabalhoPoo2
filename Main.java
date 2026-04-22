import java.util.*;

class Personagem{
    private String nome;
    private int id;
    private int nivel;
    protected int vida;
    private int mana;
    protected int ataque;
    protected int defesa;
    private String inventario;

    public Personagem(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.nivel = 1;
    }



    public void atacar(Inimigo inimigo){
        inimigo.receberDano(this.ataque);

    }
    public void defender(){

    }
    public void usarHabilidade(){

    }
    public void receberDano(int dano){
        this.vida -=Math.max(0, dano - defesa);

    }
    public void adicionarItem(Item item){
        inventario.add(item);
    }

    public int getAtaque() {
        return ataque;
    }

    public int getId() {
        return id;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getMana() {
        return mana;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public String getInventario() {
        return inventario;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
