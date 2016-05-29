/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author lc
 */
public class DAO { public class UsuarioDAO { 
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection(); 
    } public void adiciona(Admin usuario){
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getUsuario()); 
            stmt.setString(4, usuario.getSenha()); 
            stmt.execute();
            stmt.close(); 
        } catch (SQLException u) { throw new RuntimeException(u); } } }
    
}
