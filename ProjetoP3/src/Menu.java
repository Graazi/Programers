import java.util.Scanner;

public class Menu {
        Scanner in = new Scanner(System.in);

        String nomeCliente;
        int cpf, cliente, pagamento;
        String senha;
        

        {
                exibeMenu();
                cliente = in.nextInt();
                in.nextLine();
                switch (cliente) {
                        case 1: // cadastro do cliente (criar lista de clientes)
                                System.out.println("Insira seu nome: ");
                                nomeCliente = in.nextLine();
                                System.out.println("Insira seu CPF: ");
                                cpf = in.nextInt();
                                System.out.println("Crie uma senha: ");
                                senha = in.nextLine();
                                
                                break;
                        case 2:

                }

                switch (pagamento) {
                        case 1: // pagamento no cartão
                                System.out.println("Pagamento Aprovado! Volte sempre!");
                                break;
                        case 2: // pagamento no boleto
                                System.out.println("Pagamento Aprovado! Volte sempre!");
                                break;
                        case 3: // pagamento no pix
                                System.out.println("Pagamento Aprovado! Volte sempre!");
                                break;
                        default:
                                System.out.println("Opção inválida! Volte sempre!");
                                break;
                }
        }

        public static void exibeMenu() {
                System.out.println("Opções:");
                System.out.println("1 - Cadastro de Cliente");
                System.out.println("2 - Adicionar livro no carrinho");
                System.out.println("3 - Remover livro do carrinho");
                System.out.println("4 - Ver Carrinho");
                System.out.println("5 - Exibir a Parcial");
                System.out.println("6 - Fechar o pedido e realizar pagamento");
                System.out.println("7 - Cancelar Pedido");
                System.out.println("0 - Sair");
        }

        public static void exibeMenuDePagamento() {
                System.out.println(" ");
                System.out.println("Escolha uma forma de pagamento: ");
                System.out.println("1- Cartão");
                System.out.println("2- Boleto");
                System.out.println("3- Pix");

        }

}