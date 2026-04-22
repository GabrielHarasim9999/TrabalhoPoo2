public abstract class Item {
    private String nome;
    private int id;
    private String tipo;
    private int valor;
    private int peso;
    private String raridade;

    public void usar(){

    }
    public void inspecionar(){

    }

    public abstract void usar(Personagem alvo);
}
public