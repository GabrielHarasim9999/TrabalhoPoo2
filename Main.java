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

}
