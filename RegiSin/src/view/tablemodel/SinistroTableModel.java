package view.tablemodel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelDominio.Evento;
import modelDominio.Sinistro;
import view.RegiSinUsuario;

public class SinistroTableModel extends AbstractTableModel {

    private ArrayList<Sinistro> listaSinistro;

    // método construtor que recebe a lista de eventos
    public SinistroTableModel(ArrayList<Sinistro> listaSinistro) {
        this.listaSinistro = listaSinistro;
    }

    // método que retorna a quantidade de elementos da tabela (tamanho da lista)
    @Override
    public int getRowCount() {
        return this.listaSinistro.size();
    }

    // método que retorna a quantidade de colunas da tabela
    @Override
    public int getColumnCount() {
        return 5;
    }

    // método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // obtendo cada um dos objetos da lista
        Sinistro sinistro = this.listaSinistro.get(rowIndex);

        int codEvento = sinistro.getCodEvento();
        Evento dadosEvento = RegiSinUsuario.ccont.dadosEvento(codEvento);
        String nomeLiteralEvento = dadosEvento.getNomeEventoDados();
        // verificando a coluna em questão para retornar o atributo específico
        switch (columnIndex) {
            case 0:
                return sinistro.getVitima();
            case 1:
                return nomeLiteralEvento;
            case 2:
                return sinistro.getDataSinistro();
            case 3:
                return sinistro.getCidadeSinistro();
            case 4:
                return sinistro.getSituacaoSinistro();
            default:
                return "";

        }
    }

    // método que retorna o nome da coluna
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Vítima";
            case 1:
                return "Evento";
            case 2:
                return "Data";
            case 3:
                return "Cidade";
            case 4:
                return "Situação";
            default:
                return "NoName";
        }
    }

    // método que retorna a Marca a partir de uma determinada linha
    public Sinistro getSinistro(int row) {
        Sinistro sinistro = this.listaSinistro.get(row);
        return sinistro;
    }

}
