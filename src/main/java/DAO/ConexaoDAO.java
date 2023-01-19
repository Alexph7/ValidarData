package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ph757
 */
public class ConexaoDAO {

    public Connection conexaoBD() {
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/controledevendas", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe ConexaoDAO Método conector()" + e.getMessage());
        }
        return conexao;
    }

}
