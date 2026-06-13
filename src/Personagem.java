import java.util.ArrayList;

public class Personagem {
    private String nome;
    protected String tipoUsuario;
    private String classe;
    private int id;
    private int nivel;
    protected int vida;
    private int mana;
    protected int ataque;
    protected int defesa;
    private ArrayList inventario;

    public Personagem(String nome, String tipoUsuario, String classe, int id, int nivel, int vida, int mana, int ataque, int defesa, ArrayList inventario){
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.classe = classe;
        this.id = id;
        this.nivel = 1;
        this.vida = vida;
        this.mana = mana;
        this.ataque = ataque;
        this.defesa = defesa;

    }

    public void atacar(Inimigo inimigo){
        inimigo.receberDano(this.ataque);

    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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

    @Override
    public String toString() {
        return super.toString();
    }

    public ArrayList getInventario() {
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

    public void setInventario(ArrayList inventario) {
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

    public int getIdPersonagem() { return id; }

    public void setArmaEquipada(Arma arma) {
    }

    public void setArmaduraEquipada(Armadura armadura) {
    }
}

