package service;

import dao.ContratoDAO;
import model.Contrato;
import java.util.*;

public class ContratoService {
    private ContratoDAO dao = new ContratoDAO();

    public void criarContrato(Contrato contrato) {
        dao.salvar(contrato);
    }

    public List<Contrato> listarContratos() {
        return dao.listar();
    }
}

