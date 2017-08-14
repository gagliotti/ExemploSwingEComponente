/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin
 */
public class Autenticador implements IAutenticador {
    protected String login, senha;
    protected List<AutenticacaoListener> listeners;
    
    public Autenticador(){
        this.login = "jose";
        this.senha = "1234";
        this.listeners = new ArrayList<>();
    }
    
    @Override
    public void autenticar(String login, String senha){
        this.fireAutenticacaoEvent(this.login.equals(login) && this.senha.equals(senha));
    }
    
    @Override
    public void addListener(AutenticacaoListener listener){
        this.listeners.add(listener);
    }
    
    private void fireAutenticacaoEvent(boolean resultadoAutenticacao){
        for(AutenticacaoListener listener : this.listeners)
            listener.autenticacaoRealizada(new AutenticacaoEvent(this, resultadoAutenticacao));
    }
}
