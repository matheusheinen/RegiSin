package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Evento;
import view.RegiSinUsuario;

public class EventoTableModel extends AbstractTableModel {

    private ArrayList<Evento> listaEventos;

    // método construtor que recebe a lista de eventos
    public EventoTableModel(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    // método que retorna a quantidade de elementos da tabela (tamanho da lista)
    @Override
    public int getRowCount() {
        return this.listaEventos.size();
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
        Evento evento = this.listaEventos.get(rowIndex);

        Evento dadosEvento = RegiSinUsuario.ccont.dadosEvento(evento.getCodEvento());
        String nomeLiteralEvento = dadosEvento.getNomeEventoDados();
        int totalSinistrosEvento = dadosEvento.getTotalSinistroDados();
        // verificando a coluna em questão para retornar o atributo específico
        switch (columnIndex) {
            case 0:
                return nomeLiteralEvento;
            case 1:
                return totalSinistrosEvento;
            case 2:
                return evento.getDataEvento();
            case 3:
                return evento.getCidadeEvento();
            case 4:
                return evento.getDescricaoEvento();
            default:
                return "";

        }
    }

    // método que retorna o nome da coluna
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Evento";
            case 1:
                return "Número de Sinistros";
            case 2:
                return "Data";
            case 3:
                return "Cidade";
            case 4:
                return "Descrição";
            default:
                return "NoName";
        }
    }

    // método que retorna a Marca a partir de uma determinada linha
    public Evento getEvento(int row) {
        Evento evento = this.listaEventos.get(row);
        return evento;
    }

}
