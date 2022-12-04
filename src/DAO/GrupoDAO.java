/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import agenda.Contato;
import agenda.Grupo;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class GrupoDAO {
    public static void Save(Grupo grupo){
         String sql = "INSERT INTO grupo(nomegrupo) VALUES (?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, grupo.getNome());

             
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
    
    public static void Update(Grupo grupo){
         String sql = "Update grupo(nomegrupo) VALUES (?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, grupo.getNome());

             
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
    
    public static void Delete(Grupo grupo){
         String sql = "DELETE FROM grupo WHERE id = ?";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setString(1, grupo.getNome());

             
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
    
    public static List<agenda.Grupo> getGrupo (){
     
    String sql = "SELECT * FROM grupo";
    
    List<Grupo> grupo = new ArrayList<Grupo>();
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    ResultSet rset = null;
    
    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        rset = pstm.executeQuery();
        
        while (rset.next()) {
            
            Grupo g = new Grupo();
            //nome, nascimento, endereco, telefone, email
            g.setId(rset.getInt("idgrupo"));
            g.setNome(rset.getString("nomegrupo"));
            
            grupo.add(g); }
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
        return grupo;
    }
    
}
