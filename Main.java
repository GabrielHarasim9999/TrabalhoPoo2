
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Personagem> PERSONAGENS = new ArrayList<>();
    private static final List<Mapa> MAPAS= new ArrayList<>();
    private static final List<Inimigo> INIMIGOS = new ArrayList<>();
    private static final List<Arma> ARMAS = new ArrayList<>();
    private static final List<Armadura> ARMADURAS = new ArrayList<>();
    private static final List<Cidade> CIDADES = new ArrayList<>();
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

            int escolha = Integer.parseInt(sc.nextLine().trim());

            switch (escolha) {
                case 0:
                    menuPrincipal();
                    break;

                case 1:
                    Continuar();
                    break;

                case 2:
                    comecarNovoJogo();
                    break;

                case 3:
                    carregarJogoSalvo();
                    break;

                case 4:
                    salvarJogo();
                    break;

                case 5:
                    sairDoJogo();
                    continuar = false;
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
            System.out.println("7- Cadastrar inimigo");
            System.out.println("8- Cadastrar cidade");
            System.out.println("9- Cadastrar dragão");
            System.out.println("10- Cadastrar esqueleto");
            System.out.println("11- Cadastrar poção");
            System.out.println("12- Listar personagens");
            System.out.println("13- Listar inimigos");
            System.out.println("14- Listar armas");
            System.out.println("15- Cadastrar Missão");
            System.out.println("16- Cadastrar Mapa");
            System.out.println("17- Carregar dados Iniciais:");


            int escolha = Integer.parseInt(sc.nextLine().trim());

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
                    cadastrarItem();
                    break;

                case 6:
                    cadastrarTipoNPC();
                    break;
                case 7:
                    cadastrarInimigo();
                    break;

                case 8:
                    cadastrarCidade();
                    break;

                case 9:
                    cadastrarDragao();
                    break;

                case 10:
                    cadastrarEsqueleto();
                    break;

                case 11:
                    cadastrarPocao();
                    break;
                case 12:
                    listarPersonagens();
                    break;

                case 13:
                    listarInimigos();
                    break;

                case 14:
                    listarArmas();
                    break;

                case 15:
                    cadastrarMissao();
                    break;

                case 16:
                    cadastrarMapa();
                    break;

                case 17:
                    carregarDadosIniciais();

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
        ArrayList inventario = new ArrayList();


        int idPersonagem = PERSONAGENS.size() + 1;
        Personagem personagem = new Personagem(nome, tipoUsuario, classe, idPersonagem, nivel, vida, mana, ataque, defesa, inventario);
        PERSONAGENS.add(personagem);
        System.out.println("O personagem foi cadastrado: " + personagem.toString());
    }

    public static void cadastrarMapa(){
        System.out.println("Digite o nome do mapa:");
        String nome = sc.nextLine();
        int idMapa =MAPAS.size() + 1;
        Mapa mapa = new Mapa(nome,INIMIGOS);
    }

    public static void cadastrarOTipoDeArma() {
        System.out.println("Digite o nome da arma:");
        String nome = sc.nextLine();
        System.out.println("Digite o dano da arma:");
        int dano = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a durabilidade da arma");
        int durabilidade = Integer.parseInt(sc.nextLine());

        int idArma = ARMAS.size() + 1;
        Arma arma = new Arma(idArma, dano, nome, durabilidade);
        ARMAS.add(arma);
        System.out.println("A arma foi cadastrado: " + arma.toString());
    }

    public static void cadastrarOTipoDeArmadura() {
        System.out.println("Digite o nome da armadura:");
        String nomeArmadura = sc.nextLine();
        System.out.println("Digite a defesa da armadura:");
        int defesa = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a durabilidade da armadura:");
        int durabilidade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o tipo de armadura:");
        String tipoArmadura = sc.nextLine();

        int idArmadura = ARMADURAS.size() + 1;
        Armadura armadura = new Armadura(idArmadura, defesa, nomeArmadura, tipoArmadura, durabilidade);
        ARMADURAS.add(armadura);
    }

    public static void cadastrarOTipoDeMissao() {
        System.out.println("Digite o título da missão");
        String titulo = sc.nextLine();
        System.out.println("Digite a descrição da missão");
        String descricao = sc.nextLine();
        System.out.println("Digite a recompensa da missão");
        String recompensa = sc.nextLine();
        System.out.println("Digite o status da missão");
        String status = sc.nextLine();

    }

    public static void cadastrarItem() {
        System.out.println("Digite o nome do item:");
        String nome = sc.nextLine();
        System.out.println("Digite o tipo de item:");
        String tipo = sc.nextLine();
        System.out.println("Digite o valor do item:");
        int valor = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o peso do item:");
        int peso = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a raridade do item:");
        String raridade = sc.nextLine();

        int idItem = ITEMS.size() + 1;
        Item item = new Item(idItem, nome, tipo, valor, peso, raridade);
        ITEMS.add(item);

    }

    public static void cadastrarTipoNPC() {
        System.out.println("Digite o dialogo da npc:");
        String dialogo = sc.nextLine();
        System.out.println("Digite o nome do NPC");
        String nome = sc.nextLine();
        System.out.println("Digite o tipo de npc:");
        String tipo = sc.nextLine();

        int idNPC = NPCS.size() + 1;
        NPC npc = new NPC(idNPC, dialogo, nome, tipo);
        NPCS.add(npc);

    }

    public static void Continuar() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n----------------");
            System.out.println("Você quer continuar o jogo? (Sim/Não)");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Continuando o jogo de onde parou");
            } else {
                if (resposta.equalsIgnoreCase("não")) {
                    System.out.println("Saindo do jogo");
                } else {
                    System.out.println("Resposta inválida");
                }
            }
        }
    }

    public static void comecarNovoJogo() {
        boolean comecar = true;
        System.out.println("Você deseja começar um novo jogo?(Sim/Não)");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Começando um novo jogo...");
        } else {
            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Tá bom...");
            } else {
                System.out.println("Opção inválida");

            }
        }
    }

    public static void carregarJogoSalvo() {
        boolean carregar = true;
        System.out.println("Você deseja carregar um jogo salvo?(Sim/Não");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Carregando um jogo salvo...");
        } else {
            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Tá bom...");
            } else {
                System.out.println("Opção inválida");
            }

        }

    }

    public static void sairDoJogo() {
        boolean sair = true;
        System.out.println("Você deseja sair do jogo?(Sim/Não)");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Saindo do jogo...");
        }else{
            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Tá bom");
            }else{
                System.out.println("Opção Inválida");

            }
        }
    }

    public static void salvarJogo() {
        boolean salvar = true;
        System.out.println("Você deseja salvar o jogo?(Sim/Não)");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Salvando o jogo...");
        } else {
            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Tá bom");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastrarInimigo() {

        System.out.println("Digite o nome do inimigo:");
        String nome = sc.nextLine();

        System.out.println("Digite o nível do inimigo:");
        int nivel = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a vida do inimigo:");
        int vida = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o ataque do inimigo:");
        int ataque = Integer.parseInt(sc.nextLine());

        int idInimigo = INIMIGOS.size() + 1;

        Inimigo inimigo = new Inimigo(idInimigo, nome, nivel, vida);

        INIMIGOS.add(inimigo);

        System.out.println("O inimigo foi cadastrado: " + inimigo.toString());
    }

    public static void cadastrarCidade() {

        System.out.println("Digite o nome da cidade:");
        String nome = sc.nextLine();

        System.out.println("Digite o reino da cidade:");
        String reino = sc.nextLine();

        System.out.println("Digite a população da cidade:");
        int populacao = Integer.parseInt(sc.nextLine());

        int idCidade = CIDADES.size() + 1;

        Cidade cidade = new Cidade(idCidade, nome, reino, populacao);

        CIDADES.add(cidade);

        System.out.println("A cidade foi cadastrada: " + cidade.toString());
    }

    public static void cadastrarDragao() {

        System.out.println("Digite o nome do dragão:");
        String nome = sc.nextLine();

        System.out.println("Digite o elemento do dragão:");
        String elemento = sc.nextLine();

        System.out.println("Digite a vida do dragão:");
        int vida = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o ataque do dragão:");
        int ataque = Integer.parseInt(sc.nextLine());

        int idDragao = DRAGÃOS.size() + 1;

        Dragão dragao = new Dragão(idDragao, nome, elemento, vida, ataque);

        DRAGÃOS.add(dragao);

        System.out.println("O dragão foi cadastrado: " + dragao.toString());
    }

    public static void cadastrarEsqueleto() {

        System.out.println("Digite o nome do esqueleto:");
        String nome = sc.nextLine();

        System.out.println("Digite a vida do esqueleto:");
        int vida = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o ataque do esqueleto:");
        int ataque = Integer.parseInt(sc.nextLine());

        int idEsqueleto = ESQUELETOS.size() + 1;

        Esqueleto esqueleto = new Esqueleto(idEsqueleto, nome, vida, ataque);

        ESQUELETOS.add(esqueleto);

        System.out.println("O esqueleto foi cadastrado: " + esqueleto.toString());
    }

    public static void cadastrarMissao() {

        System.out.println("Digite o título da missão:");
        String titulo = sc.nextLine();

        System.out.println("Digite a descrição da missão:");
        String descricao = sc.nextLine();

        System.out.println("Digite a recompensa da missão:");
        String recompensa = sc.nextLine();

        System.out.println("Digite o status da missão:");
        String status = sc.nextLine();

        int idMissao = MISSAOS.size() + 1;

        Missao missao = new Missao(idMissao, titulo, descricao, recompensa, status);

        MISSAOS.add(missao);

        System.out.println("A missão foi cadastrada: " + missao.toString());
    }

    public static void cadastrarPocao() {

        System.out.println("Digite o nome da poção:");
        String nome = sc.nextLine();

        System.out.println("Digite o efeito da poção:");
        String efeito = sc.nextLine();

        System.out.println("Digite o valor da poção:");
        int valor = Integer.parseInt(sc.nextLine());

        int idPocao = POCS.size() + 1;

        Pocao pocao = new Pocao(idPocao, nome, efeito, valor);

        POCS.add(pocao);

        System.out.println("A poção foi cadastrada: " + pocao.toString());
    }


    public static void listarInimigos() {

        if (INIMIGOS.isEmpty()) {
            System.out.println("Nenhum inimigo cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE INIMIGOS =====");

        for (Inimigo inimigo : INIMIGOS) {
            System.out.println(inimigo);
        }

    }

    public static void listarArmas() {

        if (ARMAS.isEmpty()) {
            System.out.println("Nenhuma arma cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE ARMAS =====");

        for (Arma arma : ARMAS) {
            System.out.println(arma);
        }
    }

    public static void listarPersonagens() {

        if (PERSONAGENS.isEmpty()) {
            System.out.println("Nenhum personagem cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE PERSONAGENS =====");

        for (Personagem personagem : PERSONAGENS) {
            System.out.println(personagem);
        }
    }
    private static void carregarDadosIniciais() {

        // Armas
        ARMAS.add(new Arma(1, 25, "Espada de Ferro", 100));
        ARMAS.add(new Arma(2, 40, "Machado de Guerra", 80));
        ARMAS.add(new Arma(3, 15, "Arco Curto", 120));

        // Armaduras
        ARMADURAS.add(new Armadura(1, 15, "Armadura de Couro", "Leve", 100));
        ARMADURAS.add(new Armadura(2, 30, "Armadura de Aço", "Pesada", 150));

        // NPCs
        NPCS.add(new NPC(1, "Bem-vindo à cidade!", "Carlos", "Mercador"));
        NPCS.add(new NPC(2, "Preciso de ajuda para uma missão.", "Merlin", "Mago"));

        // Inimigos
        INIMIGOS.add(new Inimigo(1, "Goblin", 2, 50));
        INIMIGOS.add(new Inimigo(2, "Orc", 5, 120));

        // Cidades
        CIDADES.add(new Cidade(1, "Valedoria", "Reino do Norte", 5000));
        CIDADES.add(new Cidade(2, "Pedraviva", "Reino do Sul", 3000));

        // Dragões
        DRAGÃOS.add(new Dragão(1, "Fafnir", "Fogo", 500, 80));
        DRAGÃOS.add(new Dragão(2, "Glacius", "Gelo", 450, 70));

        // Personagens
        List<Item> inventario = new ArrayList<>();

        PERSONAGENS.add(
                new Personagem(
                        "Arthur",
                        "Jogador",
                        "Guerreiro",
                        1,
                        10,
                        200,
                        50,
                        35,
                        20,
                        inventario
                )
        );

        PERSONAGENS.add(
                new Personagem(
                        "Luna",
                        "Jogador",
                        "Maga",
                        2,
                        8,
                        120,
                        200,
                        45,
                        10,
                        inventario
                )
        );
    }
}




