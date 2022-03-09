
package orientacaoobjeto;

public class Curso extends Conteudo {
    
  private int cargaHoraria;

 public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }
public int cargaHoraria(){
    return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
}
public String toString(){
    return "Curso: " +
            "titulo " + getTitulo() +
            " descricao " + getDescricao() +
            " data " + cargaHoraria;
}
}
