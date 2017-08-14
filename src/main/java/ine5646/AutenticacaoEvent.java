/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.util.EventObject;

/**
 *
 * @author martin
 */
class AutenticacaoEvent extends EventObject {
    protected boolean resultadoAutenticacao;

    public void setResultadoAutenticacao(boolean resultadoAutenticacao) {
        this.resultadoAutenticacao = resultadoAutenticacao;
    }

    public boolean isResultadoAutenticacao() {
        return resultadoAutenticacao;
    }
    
    public AutenticacaoEvent(Object origem, boolean resultadoAutenticacao){
        super(origem);
        this.resultadoAutenticacao = resultadoAutenticacao;
    } 
}
