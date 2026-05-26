public class Armadura extends Item{
    public int idArmadura;
    private String defesa;
    public String nomeArmadura;
    private String tipoArmadura;
    private String durabilidade;

    public Armadura(int defesa, int i, String nomeArmadura, String tipoArmadura, int durabilidade) {
        super();
    }

    public void reduzirDano(){

    }
    public void reduzirDuarabilidade(){

    }

    @Override
    public void usar(Personagem alvo) {

    }

    public String getNomeArmadura() {
        return nomeArmadura;
    }

    public int getIdArmadura() {
        return idArmadura;
    }

    public void setIdArmadura(int idArmadura) {
        this.idArmadura = idArmadura;
    }

    public void setNomeArmadura(String nomeArmadura) {
        this.nomeArmadura = nomeArmadura;
    }

    @Override
    public void setRaridade(String raridade) {
        super.setRaridade(raridade);
    }

    @Override
    public String getRaridade() {
        return super.getRaridade();
    }

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getValor() {
        return super.getValor();
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getDefesa() {
        return defesa;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public String getDurabilidade() {
        return durabilidade;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }

    public void setDurabilidade(String durabilidade) {
        this.durabilidade = durabilidade;
    }
}

