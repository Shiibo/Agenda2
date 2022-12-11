package agenda;

import java.util.ArrayList;
import java.sql.Timestamp;

public class Compromisso {
    /*`id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `horainicio` DATETIME NOT NULL,
  `horafim` DATETIME NOT NULL,
  `local` VARCHAR(45) NOT NULL,
  `participantes` VARCHAR(45) NULL,*/
    
    private int id;
    private String titulo;
    private String descricao;
    private String participantes;
    private Timestamp horainicio;
    private Timestamp horafim;
    private String local;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Timestamp horainicio) {
        this.horainicio = horainicio;
    }

    public Timestamp getHorafim() {
        return horafim;
    }

    public void setHorafim(Timestamp horafim) {
        this.horafim = horafim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }           
}
