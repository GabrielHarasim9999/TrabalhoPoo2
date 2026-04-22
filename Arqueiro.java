public class Arqueiro extends Personagem {
    private String agilidade;
    private int precisao;

    public Arqueiro(String nome, int id) {
        super(nome, id);
    }

    public void tiroPreciso(Inimigo alvo){
        alvo.receberDano(ataque +precisao);

    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
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
    public String getInventario() {
        return super.getInventario();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
