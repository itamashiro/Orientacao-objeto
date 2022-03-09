
package orientacaoobjeto;

import java.time.LocalDate;


public class OrientacaoObjeto {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao");
        curso2.setCargaHoraria(12);
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria descricao");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
    
}
