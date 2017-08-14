/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.util.EventListener;

/**
 *
 * @author martin
 */
public interface AutenticacaoListener extends EventListener {
    public void autenticacaoRealizada(AutenticacaoEvent e);
}
