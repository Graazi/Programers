package estoque;
import java.util.Scanner;



public class Menu {
        private static Carrinho carrinho = new Carrinho();
        private static ADM adm = new ADM();
        private static Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) {
            int opcao, opcao2;
    
            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcao) {
                    case 1:
                        cadastrarUsuario();
                        break;
                    case 2:
                        adicionarProdutoAoCarrinho();
                        break;
                    case 3:
                        removerProdutoDoCarrinho();
                        break;
                    case 4:
                        exibirCarrinho();
                        break;
                    case 5:
                        exibirAreaAdministrativa();
                        break;
                    case 8:
                    
                    exibeMenuDePagamento();
                    opcao2 = scanner.nextInt();
                    scanner.nextLine();

                        switch (opcao2) {
                            case 1: // pagamento no crédito
                                System.out.println("Pagamento Aprovado");
                                break;
                            case 2: // pagamento no dédito
                                System.out.println("Pagamento Aprovado");
                                break;
                            case 3: // pagamento no pix
                                System.out.println("Pagamento Aprovado");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    case 0:
                        System.out.println("Obrigado por usar a Livraria Online. Volte sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } while (opcao != 0);
        }
    
        public static void exibirMenu() {
            System.out.println("======== Livraria Online ========");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Adicionar Produto ao Carrinho");
            System.out.println("3 - Remover Produto do Carrinho");
            System.out.println("4 - Exibir Carrinho de Compras");
            System.out.println("5 - Área Administrativa");
            System.out.println("8 - Pagar");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
        }

        public static void exibeMenuDePagamento() {
            System.out.println(" ");
            System.out.println("Escolha uma forma de pagamento: ");
            System.out.println("1- Crédito");
            System.out.println("2- Débito");
            System.out.println("3- Pix");
    }

    
        public static void cadastrarUsuario() {
            System.out.print("Digite o nome do usuário: ");
            String nome = scanner.nextLine();
    
           
            System.out.println("Usuário cadastrado com sucesso!");
        }
    
        public static void adicionarProdutoAoCarrinho() {
            System.out.print("Digite o título do produto: ");
            String titulo = scanner.nextLine();
    
            Produto produto = ADM.buscarProdutoPorTitulo(titulo);
            if (produto != null) {
                carrinho.adicionarItem(produto);
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    
        public static void removerProdutoDoCarrinho() {
            System.out.print("Digite o título do produto: ");
            String titulo = scanner.nextLine();
    
            Produto produto = ADM.buscarProdutoPorTitulo(titulo);
            if (produto != null) {
                carrinho.removerItem(produto);
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    
        public static void exibirCarrinho() {
            carrinho.exibirCarrinho();
        }
    
        public static void exibirAreaAdministrativa() {
            
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();
    
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
    
            if (usuario.equals("admin") && senha.equals("admin123")) {
                
                int opcao;
    
                do {
                    exibirMenuAreaAdministrativa();
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
    
                    switch (opcao) {
                        case 1:
                            listarProdutosAreaAdministrativa();
                            break;
                    case 2:
                        adicionarProdutoAreaAdministrativa();
                        break;
                    case 3:
                        removerProdutoAreaAdministrativa();
                        break;
                    case 4:
                            
                            break;
                        case 0:
                            System.out.println("Retornando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }
                } while (opcao != 0);
            } else {
                System.out.println("Acesso negado à área administrativa.");
            }
        }
    
        public static void exibirMenuAreaAdministrativa() {
            System.out.println("======== Área Administrativa ========");
            System.out.println("1 - Listar Produtos");
            System.out.println("2 - Adicionar Produto (Área Administrativa)");
            System.out.println("3 - Remover Produto (Área Administrativa)");
            System.out.println("4 - Outra Funcionalidade");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Digite a opção desejada: ");
        }
    
        public static void listarProdutosAreaAdministrativa() {
            System.out.println("Produtos cadastrados na área administrativa:");
            for (Produto produto : ADM.getProdutos()) {
                produto.exibirDetalhes();
            }
        }
    
        public static void adicionarProdutoAreaAdministrativa() {
            System.out.print("Digite o título do produto: ");
            String titulo = scanner.nextLine();
    
            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 
    
           
            estoque.Produto produto = new Produto(titulo, preco);
            ADM.adicionarProduto(produto);
    
            System.out.println("Produto adicionado com sucesso!");
        }
    
        public static void removerProdutoAreaAdministrativa() {
            System.out.print("Digite o título do produto: ");
            String titulo = scanner.nextLine();
    
            Produto produto = ADM.buscarProdutoPorTitulo(titulo);
            if (produto != null) {
                ADM.removerProduto(produto);
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }