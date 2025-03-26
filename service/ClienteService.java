package service;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteService {
    private ClienteDAO dao = new ClienteDAO();

    public void cadastrarCliente(Cliente cliente) {
        dao.salvar(cliente);
    }

    public Cliente buscarCliente(int id) {
        return dao.buscarPorId(id);
    }
}