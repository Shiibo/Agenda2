/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import agenda.Compromisso;
import agenda.Contato;
import agenda.Grupo;
import agenda.GrupoContato;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabif
 */
public class CompromissoDAO {
    
    public static List<agenda.Compromisso> getCompromissos (){
        
    String sql = "SELECT * FROM compromisso";
    
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
    
    public static List<agenda.Contato> getCompromissoContato (int id){
     
    String sql = "SELECT id, nome, telefone FROM contato c WHERE id IN (SELECT fkIDcont FROM compromissocontato cc WHERE fkIDcompromisso = ?);";
    
    List<Grupo> grupo = new ArrayList<Grupo>();
    List<Contato> contato = new ArrayList<Contato>();
    List<GrupoContato> grupocontato = new ArrayList<GrupoContato>();
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    ResultSet rset = null;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        GrupoContato gp = new GrupoContato();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        pstm.setInt(1, id);
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            
            Grupo g = new Grupo();
            Contato c = new Contato();
            
            //nome, nascimento, endereco, telefone, email
            c.setId(rset.getInt("id"));
            c.setNome(rset.getString("nome"));
            c.setTelefone(rset.getString("telefone"));
            
            grupocontato.add(gp);
            contato.add(c);
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
        return contato;
    }
    
    public static void RemovePart(int idcomp, int idcontato){
        String sql = "DELETE FROM compromissocontato WHERE fkIDcompromisso = ? AND fkIDcont = ?";
        
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
    
    public static void Update(Compromisso compromisso, int id){
        String sql = "UPDATE compromisso SET titulo = ?, descricao = ?, horainicio = ?, horafim = ?, local = ? "+"WHERE id = ?";
        
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
             pstm.setInt(6, id);
            
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
    
    public static void DeleteC(int id){
        String sql = "DELETE FROM compromisso WHERE id = ?;";
        
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
    
    public static void DeleteCC(int id){
        String sql = "DELETE FROM compromissocontato WHERE fkIDcompromisso = ?;";
        
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
    
    public static boolean MesmoComp(String t1, String t2, String t3) {
    
    boolean b = true;
    
    String sql = "SELECT * FROM compromisso WHERE (id = ?) AND (horainicio OR horafim BETWEEN ? and ?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        int cont = 0;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        pstm.setString(1, t1);
        pstm.setString(2, t2);
        pstm.setString(3, t3);
        
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
