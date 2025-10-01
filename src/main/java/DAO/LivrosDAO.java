/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Livros;

/**
 *
 * @author Aluno
 */
public class LivrosDAO {
    
    private Connection con;

    public ArrayList<Livros> retornarListaDeLivros(int idUsuario)
            throws SQLException {
        
        con = ConexaoDB.getConexao();
        String sql = "SELECT * FROM tb_livros WHERE usuario_id = ?";
        ArrayList<Livros> listaDeLivros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Livros l = new Livros();
                l.setId(rs.getInt("id"));
                l.setNome(rs.getString("nomeLivro"));
                l.setEditora(rs.getString("editora"));
                l.setAno(rs.getInt("ano"));
                l.setDisponivel(rs.getBoolean("disponivel"));

                listaDeLivros.add(l);
            }
        } catch (SQLException e) {
            System.out.println("ERRO, ao listar livros -> " + e);
        } finally {
            con.close();
            System.out.println("Conexão fechada. (Listar livros)");
        }

        return listaDeLivros;
    }
    
    public void salvar(Livros l) throws SQLException {
        Connection con = ConexaoDB.getConexao();
        String sql = "INSERT INTO tb_livros (nomeLivro, editora, ano, disponivel, usuario_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, l.getNome());
            ps.setString(2, l.getEditora());
            ps.setInt(3, l.getAno());
            ps.setBoolean(4, l.isDisponivel());
            ps.setInt(5, l.getUsuario_id()); // ✅ Agora você está associando o livro ao usuário

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar livro: " + e.getMessage());
            throw e;
        }
    }
    
}


