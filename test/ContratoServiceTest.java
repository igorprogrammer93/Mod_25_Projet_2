package test;

import model.*;
import service.ContratoService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoServiceTest {
    @Test
    public void testCriarContrato() {
        Cliente cliente = new Cliente(1, "João", "joao@email.com");
        Produto produto = new Produto(1, "Notebook", 2500.0);
        Contrato contrato = new Contrato(1, cliente, produto, 2);

        ContratoService service = new ContratoService();
        service.criarContrato(contrato);
        assertEquals(1, service.listarContratos().size());
    }
}
