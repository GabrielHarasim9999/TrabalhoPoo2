
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Personagem> PERSONAGENS = new ArrayList<>();

    private static int idCliente = 1;

    public static void main(String[] args) {

        System.out.println("=========== Nomeie o Personagem ===========");

        System.out.print("Digite o nome do Personagem: ");
        String nome = sc.nextLine();

        System.out.print("Escolha a classe dele: ");
        String classe = sc.nextLine();

        System.out.print("Escolha a arma dele: ");
        String arma = sc.nextLine();

        System.out.print("Digite o tipo do usuário: ");
        String tipoUsuario = sc.nextLine();

        System.out.println("Jogador entrou!");

        // Criando inventário vazio
        ArrayList<Item> inventario = new ArrayList<>();

        // Criando personagem (ajuste conforme seu construtor real)
        Personagem personagem1 = new Personagem(nome,
                tipoUsuario,
                classe,
                idCliente++,
                1,      // nível
                100,    // vida
                50,     // mana
                10,     // ataque
                5,      // defesa
                inventario
        );

        PERSONAGENS.add(personagem1);

        System.out.println("Jogador " + nome + " criado com sucesso!");
    }
}

