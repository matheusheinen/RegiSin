package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Usuario;
import view.RegiSinUsuario;

public class UsuarioTableModel extends AbstractTableModel {

    private ArrayList<Usuario> listaUsuarios;

    public UsuarioTableModel(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public int getRowCount() {
        return this.listaUsuarios.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.listaUsuarios.get(rowIndex);

        String tipoUsuario;
        if (usuario.getTipo() == 0) {
            tipoUsuario = "Pessoa";
        } else if (usuario.getTipo() == 1) {
            tipoUsuario = "Entidade";
        } else {
            tipoUsuario = "Administrador";
        }

        switch (columnIndex) {
            case 0:
                return usuario.getNomeUsuario();
            case 1:
                return usuario.getSenha();
            case 2:
                return usuario.getEmail();
            case 3:
                return tipoUsuario;
            default:
                return "";

        }
    }

    // método que retorna o nome da coluna
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nome";
            case 1:
                return "Telefone";
            case 2:
                return "Email";
            case 3:
                return "Tipo";
            default:
                return "NoName";
        }
    }

    public Usuario getUsuario(int row) {
        Usuario usuario = this.listaUsuarios.get(row);
        return usuario;
    }

}
