package test;

import model.Cliente;
import service.ClienteService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteServiceTest {
    @Test
    public void testCadastroCliente() {
        ClienteService service = new ClienteService();
        Cliente cliente = new Cliente(1, "João", "joao@email.com");
        service.cadastrarCliente(cliente);
        assertEquals("João", service.buscarCliente(1).getNome());
    }
}


