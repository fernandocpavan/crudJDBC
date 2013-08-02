/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fernando_pavan
 */
public class MarcaTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private List<Marca> linhas;
    /*
     * Retorma a quantidade de linha na tabela
     */
    private String[] colunas = {"id", "nome"};

    public MarcaTableModel() {
        linhas = new ArrayList<Marca>();
    }

    public MarcaTableModel(List<Marca> marcas) {
        linhas = new ArrayList<Marca>();
    }

    public int getRowCount() {
        return linhas.size();
    }
    /*
     * Retorna a quantidade de colunas
     */

    public int getColumnCount() {
        return colunas.length;
    }
    /*
     * retorna o nome da coluna
     */

    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
/*
 * 
 */
    public Class getColumnClass(int columnindex) {
        if (columnindex == COL_ID) {
            return Integer.class;
        } else if (columnindex == COL_NOME) {
            return String.class;
        }
        return null;
    }
    

    /*
     * Retorna os dados do objeto da linha
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pegar cinteudo da linha
        Marca m = linhas.get(rowIndex);
        if (columnIndex == COL_ID) {
            return m.getId();
        } else if (COL_NOME == COL_NOME) {
            return m.getNome();
        }
        return "";
    }
    /*
     * altera os dados de uma linha
     */

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Marca m = linhas.get(rowIndex);
        if (columnIndex == COL_NOME) {
            m.setId((Integer) aValue);
        } else if (columnIndex == COL_NOME) {
            m.setNome(aValue.toString());
        }
    }
    /*
     * indica se a célula é editavel
     */
    public boolean isCellEditablre (int rowIndex, int columnIndex){
        return false;
    }
    
    /*
     *retorna a marca referente a linha especifica
     */
    public Marca getMarca(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    public void addMarca(Marca marca){
        //adicionao registro
        linhas.add(marca);
        
        //pega a quantidade de registros os registroscomeçam com zero
        int ultimoIndice = getRowCount() - 1;
        
        //notifica a mudança
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    /*
     * atualiza uma linha
     */
    public void updateMarca(int indiceLinha, Marca marca){
        linhas.set(indiceLinha, marca);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
    /*
     * remove linha
     */
    public void removeMarca(int indiceLinha, Marca marca){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    /*
     * remove todos os registros
     */
    public void limpar(){
        linhas.clear();
    }
}
