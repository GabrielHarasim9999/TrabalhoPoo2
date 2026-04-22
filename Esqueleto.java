public class Esqueleto extends Inimigo{
    private String tipoOsso;
    private int resistenciaMagia;
    private String vulnerabilidade;
    private String armaEquipada;
    private boolean reanimavel;
    private int tempoParaReanimar;

    public void atacarJogador(Personagem jogador){

    }
    public void defender(){

    }
    public void desmontar(){

    }
    public void reanimar(){

    }
    public void resistirMagia(String tipoMagia){

    }
    public <Arma> void equiparArma(Arma arma){
        this.armaEquipada = (String) arma;

    }
    public void perderMembro(){

    }
}
