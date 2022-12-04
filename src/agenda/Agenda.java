package agenda;

public class Agenda {

    public static void main(String[] args) {
        TInicial t1 = new TInicial();
        TContato t2 = new TContato();
        TCompromisso t3 = new TCompromisso();
        TMain t4 = new TMain();
        TGrupo t5 = new TGrupo();
        TUsuario t6 = new TUsuario();
        TCriarGrupo t7 = new TCriarGrupo();
        TVisualizarGrupos t8 = new TVisualizarGrupos();
        
        t1.setTelas(t2, t3, t4, t5, t6, t7);
        t2.setTelas(t1, t3, t4, t5, t6, t7);
        t3.setTelas(t1, t2, t4, t5, t6, t7);
        t4.setTelas(t1, t2, t3, t5, t6, t7, t8);
        t5.setTelas(t1, t2, t3, t4, t6, t7);
        t6.setTelas(t1, t2, t3, t4, t5, t7);
        t7.setTelas(t1, t2, t3, t4, t5, t6);
        t8.setTelas(t1, t2, t3, t4, t5, t6, t7);
        
        t3.setVisible(true); 
    }
    
}
