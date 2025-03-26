package dao;

import model.Produto;
import java.util.*;

public class ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) { produtos.add(produto); }
    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    public List<Produto> listar() { return produtos; }
}
