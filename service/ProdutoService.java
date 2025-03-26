package service;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {
    private ProdutoDAO dao = new ProdutoDAO();

    public void cadastrarProduto(Produto produto) {
        dao.salvar(produto);
    }

    public Produto buscarProduto(int id) {
        return dao.buscarPorId(id);
    }
}