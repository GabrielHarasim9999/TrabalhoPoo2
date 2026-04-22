public class Pocao extends Item{
    private String tipoEfeito;
    private int valorEfeito;
    private int duracao;

    @Override
    public void usar(Personagem alvo){
        alvo.vida += valorEfeito;
    }

}
public