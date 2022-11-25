package DAO;

import Factory.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import agenda.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection conn;
    public static void SaveU(Usuario usuario){
         String sql = "INSERT INTO usuario(nome, senha, nascimento, endereco, telefone, email) VALUES (?, ?, ?, ?, ?, ?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, usuario.getNome());
             pstm.setString(2, usuario.getSenha());
             pstm.setDate(3, usuario.getNascimento());
             pstm.setString(4, usuario.getEndereco());
             pstm.setInt(5, usuario.getTelefone());
             pstm.setString(6, usuario.getEmail());
             
             pstm.execute();
         } catch (Exception e){
             e.printStackTrace();
         }finally{
             try {
                 if(pstm!=null){
                     pstm.close();
                 }
                 
                 if(conn!=null){
                     conn.close();
                 }
             }catch (Exception e){
             e.printStackTrace();
             }
         }
     }
     
    public static void UpdateU(Usuario usuario){
        String sql = "UPDATE contato SET nome = ?, senha = ?, nascimento = ?, endereco = ?, telefone = ?, email = ? "+"WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, usuario.getNome());
             pstm.setString(2, usuario.getSenha());
             pstm.setDate(3, usuario.getNascimento());
             pstm.setString(4, usuario.getEndereco());
             pstm.setInt(5, usuario.getTelefone());
             pstm.setString(6, usuario.getEmail());
             pstm.setInt(7, usuario.getId());
            
             pstm.execute();
             
             
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                 if(pstm!=null){
                     pstm.close();
                 }
                 
                 if(conn!=null){
                     conn.close();
                 }
             }catch (Exception e){
             e.printStackTrace();
             }
        }
    }
    
    public ResultSet autenticacaoUsuario(Usuario objusuario) throws Exception{
        conn = new ConnectionFactory().createConnectionToMySQL();
        
        try {
            String sql = "select * from usuario where nome = ? and senha = ?";
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getNome());
            pstm.setString(2, objusuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
