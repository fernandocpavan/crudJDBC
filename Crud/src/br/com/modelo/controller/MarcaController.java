package br.com.modelo.controller;

import Persistencia.MarcaDAO;
import Persistencia.MarcaDAOJDBC;
import br.com.model.Marca;
import java.util.List;



/**
 *
 * @author fernando_pavan
 */
public class MarcaController {

    public void inserir(Marca m) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.inserir(m);
    }

    public void atulaizar(Marca m) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);
    }

    public void excluir(int id) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.excluir(id);
    }

    public List<Marca> getMarca() {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcas();
    }

    public List<Marca> getMarcaByNome(String nome) {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcasByNome(nome);
    }

    public Marca getMarcaById(int id) {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcasById(id);
    }
}