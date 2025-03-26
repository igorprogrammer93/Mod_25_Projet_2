package dao;

import model.Contrato;
import java.util.*;

public class ContratoDAO {
    private List<Contrato> contratos = new ArrayList<>();

    public void salvar(Contrato contrato) { contratos.add(contrato); }
    public List<Contrato> listar() { return contratos; }
}