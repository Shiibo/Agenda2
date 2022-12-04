package agenda;

public class Agenda {

    public static void main(String[] args) {
        TInicial t1 = new TInicial();
        TContato t2 = new TContato();
        TCompromisso t3 = new TCompromisso();
        TMain t4 = new TMain();
        TGrupo t5 = new TGrupo();
        TUsuario t6 = new TUsuario();
        
        t1.setTelas(t2, t3, t4, t5, t6);
        t2.setTelas(t1, t3, t4, t5, t6);
        t3.setTelas(t1, t2, t4, t5, t6);
        t4.setTelas(t1, t2, t3, t5, t6);
        t5.setTelas(t1, t2, t3, t4, t6);
        t6.setTelas(t1, t2, t3, t4, t5);
        
        t1.setVisible(true); 
    }
    
}
