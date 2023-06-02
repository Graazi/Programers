import java.util.Scanner;

import pedido.Carrinho;

public class Menu {
        public static void main (String []args) throws Exception {
        Scanner in = new Scanner(System.in);

        String nomeCliente, livro;
        int op, op2, numeroPedido = 0;
        int cpf, cliente, pagamento;
        String senha;
        double preco;
        Carrinho pedidoNovo; 
        

        {
                exibeMenu();
                op = in.nextInt();
                in.nextLine();
                switch (op) {
                        case 1: // cadastro do cliente (criar lista de clientes)
                                System.out.println("Insira seu nome: ");
                                nomeCliente = in.nextLine();
                                System.out.println("Insira seu CPF: ");
                                cpf = in.nextInt();
                                System.out.println("Crie uma senha: ");
                                senha = in.nextLine();
                                
                                break;
                        case 2://adicionar pedido
                        System.out.println("Insira seu pedido: ");
                                        System.out.println("Livro: ");
                                        livro = in.nextLine();
                                        numeroPedido++;
                                        System.out.println(" Preço :");
                                        preco = in.nextInt();
                                        pedidoNovo = new Carrinho(livro, numeroPedido, preco);
                                        break;
                        case 3: // cancelar pedido (remover algum item da lista)
                                System.out.println("Insira o código do pedido você gostaria de retirar: ");
                                int codPedido = in.nextInt();
                                break;
                        case 4: // ver carrinho
                                System.out.println("Carrinho: ");
                                        
                                        break;
                        case 5: // exibir a parcial (mostrar todos os itens pedidos até o momento)
                                System.out.println("Parcial do pedido:");
                                        
                                        break;
                        case 6: // fechar o pedido e realizar pagamento
                                System.out.println("Seus pedidos foram: ");
                                        
                                        exibeMenuDePagamento();
                                        op2 = in.nextInt(); in.nextLine();

                                       
                switch (op2) {
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
                                break;

                        case 7: // cancelar pedido (remover algum item da lista)

                        case 0:
                                System.out.println("Tchau! Obrigada por utilizar nosso app!!");
                                break;
                        default:
                                System.out.println("Opção inválida");
                                break;
                        }
                } while (op != 0);
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
