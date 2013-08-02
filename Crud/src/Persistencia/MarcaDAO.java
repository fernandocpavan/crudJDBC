/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import br.com.model.Marca;
import java.util.List;

/**
 *
 * @author fernando_pavan
 */
public interface MarcaDAO {
    void inserir(Marca m);
    void atualizar(Marca m);
    void excluir(int id);
    List<Marca> getMarcas();
    List<Marca> getMarcasByNome(String nome);
    Marca getMarcasById(int id);
}
