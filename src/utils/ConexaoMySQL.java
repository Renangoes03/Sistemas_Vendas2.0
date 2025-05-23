package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Renangoes03
 */
public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/sistema_vendas";
    private static final String USUARIO = "Renangoes03";
    private static final String SENHA = "Re311505";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }

    public static void desconectar(Connection conexao) {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println("❌ Erro ao desconectar: " + e.getMessage());
        }
    }

    public static void fecharConexao(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            System.out.println("⚠️ Erro ao fechar ResultSet: " + e.getMessage());
        }

        try {
            if (stmt != null) stmt.close();
        } catch (Exception e) {
            System.out.println("⚠️ Erro ao fechar Statement: " + e.getMessage());
        }

        try {
            if (conn != null) conn.close();
        } catch (Exception e) {
            System.out.println("⚠️ Erro ao fechar conexão: " + e.getMessage());
        }
    }

    // Sobrecarga opcional para quem quiser usar só conn + stmt
    public static void fecharConexao(Connection conn, Statement stmt) {
        fecharConexao(conn, stmt, null);
    }
}
