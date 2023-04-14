public class Menu {
    
    private String user;
    private String adm;
    private String cliente;
    
    
}

    
public static void exibeMenu() {
        System.out.println("Opções:");
        System.out.println("1 - Cadastro de Cliente");
        System.out.println("2 - Adcionar livro do carrinho");
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
        System.out.println("1- Crédito");
        System.out.println("2- Débito");
        System.out.println("3- Pix");

}
