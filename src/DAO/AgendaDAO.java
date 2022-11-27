package DAO;

import Factory.ConnectionFactory;
import agenda.Contato;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;


public class AgendaDAO {
    
    public static void Save(Contato contato){
         String sql = "INSERT INTO contato(nome, nascimento, endereco, telefone, email) VALUES (?, ?, ?, ?, ?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, contato.getNome());
             pstm.setDate(2, contato.getNascimento());
             pstm.setString(3, contato.getEndereco());
             pstm.setInt(4, contato.getTelefone());
             pstm.setString(5, contato.getEmail());
             
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
     
    public List<agenda.Contato> getContato (){
     
    String sql = "SELECT * FROM contato";
    
    List<Contato> contatos = new ArrayList<Contato>();
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    ResultSet rset = null;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            
            Contato c = new Contato();
            //nome, nascimento, endereco, telefone, email
            c.setId(rset.getInt("id"));
            c.setNome(rset.getString("nome"));
            c.setNascimento(rset.getDate("nascimento"));
            c.setEndereco(rset.getString("enderco"));
            c.setTelefone(rset.getInt("telefone"));
            c.setEmail(rset.getString("email"));
            
            contatos.add(c); }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
            if(rset!=null){
                rset.close();
            }
                if(pstm!=null){
                pstm.close();
            }
                if(conn!=null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                }
        return contatos;
    }
    
    public void Update(Contato contato){
        String sql = "UPDATE contatos SET nome = ?, nascimento = ?, endereco = ?, telefone = ?, email = ? "+"WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, contato.getNome());
             pstm.setDate(2, contato.getNascimento());
             pstm.setString(3, contato.getEndereco());
             pstm.setInt(4, contato.getTelefone());
             pstm.setString(5, contato.getEmail());
             pstm.setInt(6, contato.getId());
            
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
    
    public void Delete(int id){
        String sql = "DELETE FROM contatos WHERE id = ?";
        
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory. createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
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
}