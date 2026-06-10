public class Item {
    private int idItem;
    private String nome;
    private int id;
    private String tipo;
    private int valor;
    private int peso;
    private String raridade;

    public Item(int idItem, String nome, String tipo, int valor, int peso, String raridade) {
    }

    public Item(int idPocao, String nome, String efeito, int valor) {
    }

    public Item(String nome, int dano, int durabilidade) {

    }

    public Item(int defesa, int i, String nomeArmadura, String tipoArmadura, int durabilidade) {

    }


    public void usar(){

    }
    public void inspecionar(){

    }

    public void usar(Personagem alvo){

    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public int getValor() {
        return 0;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
