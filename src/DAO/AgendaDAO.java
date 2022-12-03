package DAO;

import Factory.ConnectionFactory;
import agenda.Contato;
import agenda.Compromisso;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;


public class AgendaDAO {
    
    public static ArrayList<agenda.Compromisso> participantes = new ArrayList<agenda.Compromisso>();
    
    //Contatos
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
     
    public static List<agenda.Contato> getContatos (){
     
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
    
    public static void Update(Contato contato){
        String sql = "UPDATE contato SET nome = ?, nascimento = ?, endereco = ?, telefone = ?, email = ? "+"WHERE id = ?";
        
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
    
    public static void Delete(int id){
        String sql = "DELETE FROM contato WHERE id = ?";
        
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
    
    
    //Compromissos
    public static void SaveComp(Compromisso compromisso){
         String sql = "INSERT INTO compromisso(titulo, descricao, horainicio, horafim, local) VALUES (?, ?, ?, ?, ?)";
           //titulo, descricao, horainicio, horafim, local, participantes
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, compromisso.getTitulo());
             pstm.setString(2, compromisso.getDescricao());
             pstm.setDate(3, compromisso.getHorainicio());
             pstm.setDate(4, compromisso.getHorafim());
             pstm.setString(5, compromisso.getLocal());
             for (int i = 0; i > participantes.size(); i++){
                 pstm.setString(6, String.valueOf(participantes.get(i)));
                };
             
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
    
    public static void SavePart(Compromisso compromisso){
        String sql = "INSERT INTO compromisso(titulo, descricao, horainicio, horafim, local) VALUES (?, ?, ?, ?, ?)";
           //titulo, descricao, horainicio, horafim, local, participantes
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, compromisso.getTitulo());
             pstm.setString(2, compromisso.getDescricao());
             pstm.setDate(3, compromisso.getHorainicio());
             pstm.setDate(4, compromisso.getHorafim());
             pstm.setString(5, compromisso.getLocal());
             for (int i = 0; i > participantes.size(); i++){
                 pstm.setString(6, String.valueOf(participantes.get(i)));
                };
             
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
     
    public static List<agenda.Contato> getComp (){
     
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
    
    public static void UpdateComp(Contato contato){
        String sql = "UPDATE contato SET nome = ?, nascimento = ?, endereco = ?, telefone = ?, email = ? "+"WHERE id = ?";
        
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
    
    public static void DeleteComp(int id){
        String sql = "DELETE FROM contato WHERE id = ?";
        
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