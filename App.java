import model.*;
import service.*;

public class App {
    public static void main(String[] args) {
        System.out.println("E-commerce iniciado!\n");

        // Criando serviços
        ClienteService clienteService = new ClienteService();
        ProdutoService produtoService = new ProdutoService();
        ContratoService contratoService = new ContratoService();

        // Cadastrando cliente e produto
        Cliente cliente = new Cliente(1, "Maria", "maria@email.com");
        Produto produto = new Produto(1, "Smartphone", 1999.90);

        clienteService.cadastrarCliente(cliente);
        produtoService.cadastrarProduto(produto);

        // Criando contrato
        Contrato contrato = new Contrato(1, cliente, produto, 3);
        contratoService.criarContrato(contrato);

        // Mostrando contrato
        System.out.println("Contrato criado:");
        System.out.println("Cliente: " + contrato.getCliente().getNome());
        System.out.println("Produto: " + contrato.getProduto().getNome());
        System.out.println("Quantidade: " + contrato.getQuantidade());
        System.out.println("Valor total: R$ " + (contrato.getProduto().getPreco() * contrato.getQuantidade()));
    }
}