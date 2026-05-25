
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Personagem> PERSONAGENS = new ArrayList<>();
    private static final List<Inimigo> INIMIGOS = new ArrayList<>();
    private static final List<Arma> ARMAS = new ArrayList<>();
    private static final List<Armadura> ARMADURAS = new ArrayList<>();
    private static final List<Cidade>  CIDADES = new ArrayList<>();
    private static final List<Dragão> DRAGÃOS = new ArrayList<>();
    private static final List<Esqueleto> ESQUELETOS = new ArrayList<>();
    private static final List<Missao> MISSAOS = new ArrayList<>();
    private static final List<Item> ITEMS = new ArrayList<>();
    private static final List<NPC> NPCS = new ArrayList<>();
    private static final List<Pocao> POCS = new ArrayList<>();

    private static int idPersonagem = 1;

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.print("\n-------------------");
            System.out.println(" Aetherfall ");
            System.out.println("-------------------");
            System.out.println("0- Menu Principal");
            System.out.println("1- Continuar jogo");
            System.out.println("2- Começar novo jogo");
            System.out.println("3- Carregar jogo salvo");
            System.out.println("4- Salvar jogo");
            System.out.println("5- Sair do jogo");
            System.out.println("Escolha uma opcao: ");

            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    menuPrincipal();
                    break;

                case 1:
                    Continuar();
                    break;

                case 2:
                    comecarNovo();
                    break;

                case 3:
                    carregarJogoSalvo();
                    break;

                case 4:
                    salvarJogo();
                    break;

                case 5:
                    escolha = Integer.parseInt(sc.nextLine());
                    System.out.println("Saindo do Jogo");
                    break;

                default:
                    System.out.println("Comando não existe");
            }

        }

        sc.close();
        ;
    }

    public static void menuPrincipal() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n----------------");
            System.out.println(" Menu Principal");
            System.out.println("1- Escolha o personagem");
            System.out.println("2- Escolha o tipo arma");
            System.out.println("3- Escolha o tipo armadura");
            System.out.println("4- Escolha a missão");
            System.out.println("5- Escolha o item");
            System.out.println("6- Escolha o tipo de npc");


            int escolha = Integer.parseInt(sc.nextLine());
            switch (escolha) {
                case 1:
                    cadastrarOPersonagem();
                    break;


                case 2:
                    cadastrarOTipoDeArma();
                    break;

                case 3:
                    cadastrarOTipoDeArmadura();
                    break;

                case 4:
                    cadastrarOTipoDeMissao();
                    break;

                case 5:
                    cadastratItem();
                    break;

                case 6:
                    cadastrarTipoNPC();
                    break;

                default:
                    System.out.println("Opção inválida");

            }


        }

    }

        public static void cadastrarOPersonagem() {

        System.out.println("Digite o nome do personagem: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tipo do personagem:");
        String tipoUsuario = sc.nextLine();

        System.out.println("Digite a classe do personagem:");
        String classe = sc.nextLine();

        System.out.println("Digite o nivel:");
        int nivel = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a ataque do personagem:");
        int ataque = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a defesa do personagem:");
        int defesa = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a vida do personagem:");
        int vida = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a mana do personagem:");
        int mana = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o inventário do personagem:");
        ArrayList inventario =  new ArrayList();


        int idPersonagem = PERSONAGENS.size() + 1;
        Personagem personagem = new Personagem(nome,tipoUsuario,classe,idPersonagem,nivel,vida,mana,ataque,defesa,inventario);
        PERSONAGENS.add(personagem);
        System.out.println("O personagem foi cadastrado: " + personagem.toString());
        }
        //System.out.println("=========== Nomeie o Personagem ===========");

        //System.out.print("Digite o nome do Personagem: ");
       // String nome = sc.nextLine();

        //System.out.print("Escolha a classe dele: ");
        //String classe = sc.nextLine();

        //System.out.print("Escolha a arma dele: ");
        //String arma = sc.nextLine();

        //System.out.print("Digite o tipo do usuário: ");
        //String tipoUsuario = sc.nextLine();

        //System.out.println("Jogador entrou!");

        // Criando inventário vazio
        //ArrayList<Item> inventario = new ArrayList<>();

        // Criando personagem (ajuste conforme seu construtor real)
        //Personagem personagem1 = new Personagem(nome,
          //      tipoUsuario,
            //    classe,
              //  idPersonagem++,
                //1,      // nível
                //100,    // vida
                //50,     // mana
                //10,     // ataque
                //5,      // defesa
                //inventario
       // );

        //PERSONAGENS.add(personagem1);

        //System.out.println("Jogador " + nome + " criado com sucesso!");
    }
}

