public class Missao {
    private String titulo;
    private String descricao;
    private String recompensa;
    private String status;

    public Missao(int idMissao, String titulo, String descricao, String recompensa, String status) {
    }

    public void iniciar(){
        status ="em andamento";

    }
    public void concluir(){
        status="Concluída";

    }

    public String getDescricao() {
        return descricao;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public String getStatus() {
        return status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

