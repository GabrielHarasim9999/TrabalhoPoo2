import java.util.ArrayList;

public class Arqueiro extends Personagem {
    private String agilidade;
    private int precisao;

    public Arqueiro(String nome, String tipoUsuario, String classe, int id, int nivel, int vida,int mana, int ataque, int defesa, ArrayList inventario, String agilidade, int Precisao) {
        super(nome,tipoUsuario,classe,id,nivel,mana,ataque,vida,defesa,inventario);
        this.agilidade = agilidade;
        this.precisao = precisao;

    }

    public void tiroPreciso(Inimigo alvo){
        alvo.receberDano(ataque +precisao);

    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    @Override
    public String getClasse() {
        return super.getClasse();
    }

    @Override
    public void setClasse(String classe) {
        super.setClasse(classe);
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque);
    }


    @Override
    public void setInventario(ArrayList inventario) {
        super.setInventario(inventario);
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override
    public int getNivel() {
        return super.getNivel();
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
    public ArrayList getInventario() {
        return super.getInventario();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    public String getAgilidade() {
        return agilidade;
    }

    @Override
    public void setNivel(int nivel) {
        super.setNivel(nivel);
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
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
    public void usarHabilidade() {
        super.usarHabilidade();
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setAgilidade(String agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTipoUsuario() {
        return super.getTipoUsuario();
    }

    @Override
    public void setTipoUsuario(String tipoUsuario) {
        super.setTipoUsuario(tipoUsuario);
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void atacar(Inimigo inimigo) {
        super.atacar(inimigo);
    }
}

