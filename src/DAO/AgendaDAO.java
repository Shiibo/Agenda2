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
             pstm.setString(4, contato.getTelefone());
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
     
    public static List<agenda.Contato> getContato (){
     
    String sql = "SELECT * FROM contato;";
    
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
            c.setEndereco(rset.getString("endereco"));
            c.setTelefone(rset.getString("telefone"));
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
             pstm.setString(4, contato.getTelefone());
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
    
    public static void SaveComp(Compromisso compromisso){
        String sql = "INSERT INTO compromisso(titulo, descricao, horainicio, horafim, local) VALUES (?, ?, ?, ?, ?)";
        //titulo, descricao, datainicio, datafim, local, participantes
        
        List<Contato> contatos = new ArrayList<Contato>();
        contatos = getContato();
        
        
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, compromisso.getTitulo());
             pstm.setString(2, compromisso.getDescricao());
             pstm.setTimestamp(3, compromisso.getHorainicio());
             pstm.setTimestamp(4, compromisso.getHorafim());
             pstm.setString(5, compromisso.getLocal());
             //this.AreaMenuPesquisa.append(bd.get(i).getNome()+"\n");
             
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
    
    public static void AddPart(int idcomp, int idcontato){
        String sql = "INSERT INTO compromissocontato VALUES (?, ?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setInt(1, idcomp);
             pstm.setInt(2, idcontato);
            
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
    
    public static int GetIdComp(String titulo, String descricao){
         String sql = "SELECT id FROM compromisso WHERE titulo = ? AND descricao = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        int id = 0;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        pstm.setString(1, titulo);
        pstm.setString(2, descricao);
        
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            id = rset.getInt("id");
             }
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
        
    return id;
    }
    
    public static List<agenda.Compromisso> getCompromisso (){
     
    String sql = "SELECT * FROM compromisso;";
    
    List<Compromisso> compromissos = new ArrayList<Compromisso>();
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    ResultSet rset = null;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            
            Compromisso c = new Compromisso();
            /*private static int id;
    private String titulo;
    private String descricao;
    private Timestamp horainicio;
    private Timestamp horafim;
    private String local;*/
            c.setId(rset.getInt("id"));
            c.setTitulo(rset.getString("titulo"));
            c.setDescricao(rset.getString("descricao"));
            c.setHorainicio(rset.getTimestamp("horainicio"));
            c.setHorafim(rset.getTimestamp("horafim"));
            c.setLocal(rset.getString("local"));
            
            compromissos.add(c); }
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
        return compromissos;
    }
    
    public static boolean ExistComp(String t1, String t2) {
    
    boolean b = true;
    
    String sql = "SELECT * FROM compromisso WHERE horainicio OR horafim BETWEEN ? and ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        int cont = 0;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        pstm.setString(1, t1);
        pstm.setString(2, t2);
        
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            cont++;
             }
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
    
    if (cont > 0){
        b = true;
    }
    else {
        b = false;
    }
    
    return b;
    }
}