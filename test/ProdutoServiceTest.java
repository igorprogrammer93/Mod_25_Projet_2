package test;

import model.Produto;
import service.ProdutoService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTest {
    @Test
    public void testCadastroProduto() {
        ProdutoService service = new ProdutoService();
        Produto produto = new Produto(1, "Notebook", 2500.0);
        service.cadastrarProduto(produto);
        assertEquals("Notebook", service.buscarProduto(1).getNome());
    }
}