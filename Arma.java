public class Arma  extends Item{
    private int dano;
    private int durabilidade;

    @Override
    public void usar(Personagem alvo){

    } public int calcularDano(){
        return dano;
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
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getRaridade() {
        return super.getRaridade();
    }

    @Override
    public void setRaridade(String raridade) {
        super.setRaridade(raridade);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    @Override
    public int getValor() {
        return super.getValor();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }

    @Override
    public void inspecionar() {
        super.inspecionar();
    }

    public int getDano() {
        return dano;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public void usar() {
        super.usar();
    }

}
