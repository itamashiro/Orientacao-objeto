
package orientacaoobjeto;

import java.time.LocalDate;


public class Mentoria extends Conteudo{
    private LocalDate data;
 
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }
    
public LocalDate getData(){
    return data;
}
public void setData(LocalDate cargaHoraria){
    this.data = data;
}
public String toString(){
    return "Mentoria" +
            "titulo " + getTitulo() +
            "descricao " + getDescricao() +
            " data " + data;
}
}
