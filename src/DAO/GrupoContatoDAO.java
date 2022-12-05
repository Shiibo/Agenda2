/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
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
 * @author User
 */
public class GrupoContatoDAO {
    public static void Save(GrupoContato grupocontato){
         String sql = "INSERT INTO grupocontato(fkIDgrupo, fkIDcont) VALUES (?,?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setInt(1, grupocontato.getIdGrupo());
             pstm.setInt(2, grupocontato.getIdContato());

             
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
    
    public static void Update(GrupoContato grupocontato){
         String sql = "Update grupocontato(fkIDgrupo, fkIDcont) VALUES (?,?)";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setInt(1, grupocontato.getIdGrupo());
             pstm.setInt(2, grupocontato.getIdContato());

             
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
    
    public static void Delete(GrupoContato grupocontato){
         String sql = "DELETE FROM grupocontato WHERE fkIDgrup = ? and fkIDcont = ?";
         
         Connection conn = null;
         PreparedStatement pstm = null;
         
         try {
             conn = ConnectionFactory.createConnectionToMySQL();
             
             pstm = (PreparedStatement) conn.prepareStatement(sql);
             pstm.setInt(1, grupocontato.getIdGrupo());
             pstm.setInt(2, grupocontato.getIdContato());

             
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
    
    public static List<agenda.GrupoContato> getContatoGrupo (int id){
     
    String sql = "SELECT nome, telefone FROM contato c WHERE id IN (SELECT fkIDcont FROM grupocontato gc WHERE fkIDgrupo = ?);";
    
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
        return grupocontato;
    }
}
