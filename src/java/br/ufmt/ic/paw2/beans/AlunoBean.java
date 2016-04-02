/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.paw2.beans;

import br.ufmt.ic.paw2.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author aluno
 */
@ManagedBean
@RequestScoped
public class AlunoBean {

    private List<Aluno> listaAlunos;
    private Aluno alunoSelecionado;
    /**
     * Creates a new instance of AlunoBean
     */
    public AlunoBean() {
        
        alunoSelecionado = new Aluno();
        
        listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Thiago", "123"));
        listaAlunos.add(new Aluno("Augusto","321"));
        listaAlunos.add(new Aluno("Dieson","321"));
        listaAlunos.add(new Aluno("Rachel","321"));
    }
    
    public String selecionarAluno(Aluno aluno){
        this.alunoSelecionado = aluno;
        return "edita-aluno";
    }
    
    public Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public void setAlunoSelecionado(Aluno alunoSelecionado) {
        this.alunoSelecionado = alunoSelecionado;
    }
    
    public List<Aluno> getListaAlunos(){
        return listaAlunos;
    }
    
}
