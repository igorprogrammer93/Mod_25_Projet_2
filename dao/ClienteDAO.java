package dao;

import model.Cliente;
import java.util.*;

public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) { clientes.add(cliente); }
    public Cliente buscarPorId(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
    public List<Cliente> listar() { return clientes; }
}
