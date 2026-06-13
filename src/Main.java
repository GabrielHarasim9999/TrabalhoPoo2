
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Personagem> PERSONAGENS = new ArrayList<>();
    private static final List<Mapa> MAPAS = new ArrayList<>();
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
            System.out.println("6- Voltar");
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

                case 6:
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
            System.out.println("12- Listar personagens");
            System.out.println("13- Listar inimigos");
            System.out.println("14- Listar armas");
            System.out.println("15- Cadastrar missão");
            System.out.println("16- Cadastrar mapa");
            System.out.println("17- Listar cidades");
            System.out.println("18- Listar dragões");
            System.out.println("19- Listar esqueletos");
            System.out.println("20- Listar missões");
            System.out.println("21- Listar NPCs");
            System.out.println("22- Listar itens");
            System.out.println("23- Listar poções");
            System.out.println("24- Listar armaduras");
            System.out.println("25- Jogar");
            System.out.println("0- Voltar");


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

                case 0:
                    continuar = false;
                    break;

                case 17:
                    listarCidades();
                    break;

                case 18:
                    listarDragoes();
                    break;

                case 19:
                    listarEsqueletos();
                    break;

                case 20:
                    listarMissoes();
                    break;

                case 21:
                    listarNPCs();
                    break;

                case 22:
                    listarItens();
                    break;

                case 23:
                    listarPocoes();
                    break;

                case 24:
                    listarArmaduras();
                    break;
                case 25:
                    jogar();
                    break;

                default:
                    System.out.println("Opção inválida");

            }


        }


    }
    public static void jogar() {

        if (PERSONAGENS.isEmpty()) {
            System.out.println("Cadastre um personagem primeiro.");
            return;
        }

        System.out.println("Escolha um personagem:");

        for (Personagem personagem : PERSONAGENS) {
            System.out.println(
                    personagem.getIdPersonagem() +
                            " - " +
                            personagem.getNome()
            );
        }

        int id = Integer.parseInt(sc.nextLine());

        Personagem escolhido = null;

        for (Personagem personagem : PERSONAGENS) {
            if (personagem.getIdPersonagem() == id) {
                escolhido = personagem;
                break;
            }
        }

        if (escolhido == null) {
            System.out.println("Personagem não encontrado.");
            return;
        }

        menuJogador(escolhido);
    }
    public static void menuJogador(Personagem personagem) {

        boolean jogando = true;

        while (jogando) {

            System.out.println("\n===== JOGANDO =====");
            System.out.println("Personagem: " + personagem.getNome());
            System.out.println("1 - Treinar");
            System.out.println("2 - Descansar");
            System.out.println("3 - Ver status");
            System.out.println("4 - Aceitar missão");
            System.out.println("5 - Explorar mapa");
            System.out.println("6 - Enfrentar inimigo");
            System.out.println("7 - Equipar arma");
            System.out.println("8 - Equipar armadura");
            System.out.println("9 - Tomar poção");
            System.out.println("0 - Sair");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    personagem.setNivel(personagem.getNivel() + 1);
                    personagem.setAtaque(personagem.getAtaque() + 5);

                    System.out.println(
                            personagem.getNome() +
                                    " treinou e subiu de nível!"
                    );
                    break;

                case 2:
                    personagem.setVida(
                            personagem.getVida() + 20
                    );

                    System.out.println(
                            personagem.getNome() +
                                    " descansou e recuperou vida."
                    );
                    break;

                case 3:
                    System.out.println(personagem);
                    break;

                case 4:
                    listarMissoes();
                    break;

                case 5:
                    listarMapas();
                    break;

                case 6:

                    if (INIMIGOS.isEmpty()) {
                        System.out.println("Não existem inimigos.");
                        break;
                    }

                    Inimigo inimigo = INIMIGOS.get(0);

                    System.out.println(
                            personagem.getNome() +
                                    " derrotou " +
                                    inimigo.getNome()
                    );

                    personagem.setNivel(
                            personagem.getNivel() + 1
                    );

                    break;

                case 7:
                    equiparArma(personagem);
                    break;

                case 8:
                    equiparArmadura(personagem);
                    break;

                case 9:
                    tomarPocao(personagem);
                    break;

                case 0:
                    jogando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    public static void equiparArma(Personagem personagem) {

        if (ARMAS.isEmpty()) {
            System.out.println("Nenhuma arma cadastrada.");
            return;
        }

        System.out.println("===== ARMAS DISPONÍVEIS =====");

        for (Arma arma : ARMAS) {
            System.out.println(
                    arma.getIdArma() + " - " +
                            arma.getNome()
            );
        }

        System.out.println("Digite o ID da arma:");
        int id = Integer.parseInt(sc.nextLine());

        for (Arma arma : ARMAS) {

            if (arma.getIdArma() == id) {

                personagem.setArmaEquipada(arma);

                System.out.println(
                        personagem.getNome() +
                                " equipou a arma " +
                                arma.getNome()
                );

                return;
            }
        }

        System.out.println("Arma não encontrada.");
    }
    public static void equiparArmadura(Personagem personagem) {

        if (ARMADURAS.isEmpty()) {
            System.out.println("Nenhuma armadura cadastrada.");
            return;
        }

        System.out.println("===== ARMADURAS DISPONÍVEIS =====");

        for (Armadura armadura : ARMADURAS) {
            System.out.println(
                    armadura.getIdArmadura() + " - " +
                            armadura.getNomeArmadura()
            );
        }

        System.out.println("Digite o ID da armadura:");
        int id = Integer.parseInt(sc.nextLine());

        for (Armadura armadura : ARMADURAS) {

            if (armadura.getIdArmadura() == id) {

                personagem.setArmaduraEquipada(armadura);

                System.out.println(
                        personagem.getNome() +
                                " equipou a armadura " +
                                armadura.getNomeArmadura()
                );

                return;
            }
        }

        System.out.println("Armadura não encontrada.");
    }public static void tomarPocao(Personagem personagem) {

        if (POCS.isEmpty()) {
            System.out.println("Nenhuma poção cadastrada.");
            return;
        }

        System.out.println("===== POÇÕES DISPONÍVEIS =====");

        for (Pocao pocao : POCS) {
            System.out.println(
                    pocao.getIdPocao() + " - " +
                            pocao.getNome()
            );
        }

        System.out.println("Digite o ID da poção:");
        int id = Integer.parseInt(sc.nextLine());

        for (Pocao pocao : POCS) {

            if (pocao.getIdPocao() == id) {

                personagem.setVida(
                        personagem.getVida() + 50
                );

                System.out.println(
                        personagem.getNome() +
                                " recuperou 50 pontos de vida."
                );

                return;
            }
        }

        System.out.println("Poção não encontrada.");
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

    public static void cadastrarMapa() {

        System.out.println("Digite o nome do mapa:");
        String nome = sc.nextLine();

        Mapa mapa = new Mapa(nome, INIMIGOS);

        MAPAS.add(mapa);

        System.out.println("Mapa cadastrado com sucesso!");
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

        System.out.println("Você quer continuar o jogo? (Sim/Não)");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Continuando o jogo...");
        } else if (resposta.equalsIgnoreCase("não")) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Resposta inválida");
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
        } else {
            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Tá bom");
            } else {
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
    public static void listarMapas() {

        if (MAPAS.isEmpty()) {
            System.out.println("Nenhum mapa cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE MAPAS =====");

        for (Mapa mapa : MAPAS) {
            System.out.println(mapa);
        }
    }

    public static void listarCidades() {

        if (CIDADES.isEmpty()) {
            System.out.println("Nenhuma cidade cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE CIDADES =====");

        for (Cidade cidade : CIDADES) {
            System.out.println(cidade);
        }
    }

    public static void listarDragoes() {

        if (DRAGÃOS.isEmpty()) {
            System.out.println("Nenhum dragão cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE DRAGÕES =====");

        for (Dragão dragao : DRAGÃOS) {
            System.out.println(dragao);
        }
    }

    public static void listarEsqueletos() {

        if (ESQUELETOS.isEmpty()) {
            System.out.println("Nenhum esqueleto cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE ESQUELETOS =====");

        for (Esqueleto esqueleto : ESQUELETOS) {
            System.out.println(esqueleto);
        }
    }

    public static void listarMissoes() {

        if (MISSAOS.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE MISSÕES =====");

        for (Missao missao : MISSAOS) {
            System.out.println(missao);
        }
    }

    public static void listarNPCs() {

        if (NPCS.isEmpty()) {
            System.out.println("Nenhum NPC cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE NPCs =====");

        for (NPC npc : NPCS) {
            System.out.println(npc);
        }
    }

    public static void listarItens() {

        if (ITEMS.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE ITENS =====");

        for (Item item : ITEMS) {
            System.out.println(item);
        }
    }

    public static void listarPocoes() {

        if (POCS.isEmpty()) {
            System.out.println("Nenhuma poção cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE POÇÕES =====");

        for (Pocao pocao : POCS) {
            System.out.println(pocao);
        }
    }

    public static void listarArmaduras() {

        if (ARMADURAS.isEmpty()) {
            System.out.println("Nenhuma armadura cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE ARMADURAS =====");

        for (Armadura armadura : ARMADURAS) {
            System.out.println(armadura);
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
                        (ArrayList) inventario
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
                        (ArrayList) inventario
                )
        );
        // Esqueletos
        ESQUELETOS.add(new Esqueleto(1, "Esqueleto Guerreiro", 80, 15));
        ESQUELETOS.add(new Esqueleto(2, "Esqueleto Arqueiro", 60, 20));

// Itens
        ITEMS.add(new Item(1, "Anel da Força", "Acessório", 500, 1, "Raro"));
        ITEMS.add(new Item(2, "Pedra Mágica", "Material", 300, 2, "Incomum"));
        ITEMS.add(new Item(3, "Pergaminho Antigo", "Consumível", 200, 1, "Comum"));

// Poções
        POCS.add(new Pocao(1, "Poção de Vida", "Recupera 50 de vida", 100));
        POCS.add(new Pocao(2, "Poção de Mana", "Recupera 50 de mana", 120));
        POCS.add(new Pocao(3, "Poção de Força", "Aumenta o ataque temporariamente", 200));

// Missões
        MISSAOS.add(new Missao(
                1,
                "Ameaça Goblin",
                "Elimine os goblins próximos da cidade.",
                "100 moedas de ouro",
                "Disponível"
        ));

        MISSAOS.add(new Missao(
                2,
                "Caçada ao Dragão",
                "Derrote o dragão Fafnir.",
                "Espada Lendária",
                "Disponível"
        ));

        MISSAOS.add(new Missao(
                3,
                "Escolta Real",
                "Proteja a caravana do reino.",
                "500 moedas de ouro",
                "Disponível"
        ));
        PERSONAGENS.add(
                new Personagem(
                        "Thoran",
                        "Jogador",
                        "Guerreiro",
                        3,
                        15,
                        300,
                        40,
                        50,
                        35,
                        new ArrayList<>()
                )
        );

        PERSONAGENS.add(
                new Personagem(
                        "Elandra",
                        "Jogador",
                        "Arqueira",
                        4,
                        12,
                        180,
                        80,
                        45,
                        15,
                        new ArrayList<>()
                )
        );
    }
}




