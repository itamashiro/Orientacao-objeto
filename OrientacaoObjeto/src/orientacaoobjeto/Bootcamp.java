/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjeto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal= dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();
@Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome,bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao)&& Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal)&& Objects.equals(devsInscritos, bootcamp.devsInscritos)&& Objects.equals(conteudo,bootcamp.conteudo);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, descricao,dataInicial, dataFinal,devsInscritos,conteudo);
    }
}
