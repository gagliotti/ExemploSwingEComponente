/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

/**
 *
 * @author martin
 */
public interface IAutenticador {

    void addListener(AutenticacaoListener listener);

    void autenticar(String login, String senha);
    
}
