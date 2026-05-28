public class Pocao extends Item{
    private String tipoEfeito;
    private int valorEfeito;
    private int duracao;

    public Pocao(int idItem, String nome, String tipo, int valor, int peso, String raridade) {
        super(idItem, nome, tipo, valor, peso, raridade);
    }

    public Pocao(int idPocao, String nome, String efeito, int valor) {
        super(idPocao, nome , efeito, valor );
    }

    @Override
    public void usar(Personagem alvo){
        alvo.vida += valorEfeito;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    @Override
    public int getValor() {
        return super.getValor();
    }

    @Override
    public String getRaridade() {
        return super.getRaridade();
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    @Override
    public void setRaridade(String raridade) {
        super.setRaridade(raridade);
    }

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }

    @Override
    public void inspecionar() {
        super.inspecionar();
    }

    public int getDuracao() {
        return duracao;
    }

    public int getValorEfeito() {
        return valorEfeito;
    }

    public String getTipoEfeito() {
        return tipoEfeito;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setTipoEfeito(String tipoEfeito) {
        this.tipoEfeito = tipoEfeito;
    }

    public void setValorEfeito(int valorEfeito) {
        this.valorEfeito = valorEfeito;
    }
}
