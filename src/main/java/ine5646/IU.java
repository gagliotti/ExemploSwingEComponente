/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author martin
 */
public class IU extends JFrame implements AutenticacaoListener{
    protected JLabel loginLabel;
    protected JLabel senhaLabel;
    protected JTextField loginArea;
    protected JTextField senhaArea;
    protected JButton autenticarBotao;
    protected JPanel painelDir, painelEsq;
    protected JLabel autenticacaoMsg;
    protected Autenticador autenticador;
    
    public IU(){
        super("Tela de autenticacao");
        this.setSize(600, 100);
        
        this.loginLabel = new JLabel("Digite o login");
        this.senhaLabel = new JLabel("Digite a senha");
        
        this.loginArea = new JTextField(10);
        this.senhaArea = new JTextField(10);
        
        this.autenticarBotao = new JButton("Autenticar");
        this.autenticarBotao.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handler(evt);
            }
        });
        
        this.painelDir = new JPanel(new FlowLayout());
        this.painelDir.add(this.loginLabel);
        this.painelDir.add(this.loginArea);
        this.painelDir.add(this.senhaLabel);
        this.painelDir.add(this.senhaArea);
        this.painelDir.add(this.autenticarBotao);
        
        this.autenticacaoMsg = new JLabel("");
        this.painelEsq = new JPanel(new FlowLayout());
        this.painelEsq.add(this.autenticacaoMsg);
        
        this.setLayout(new FlowLayout());
        
        this.add(this.painelDir);
        this.add(this.painelEsq);
        this.show();
        
        this.autenticador = new Autenticador();
        this.autenticador.addListener(this);
    }
    
    private void handler(java.awt.event.ActionEvent evt) {                         
        this.autenticador.autenticar(this.loginArea.getText(), this.senhaArea.getText());
    }

    @Override
    public void autenticacaoRealizada(AutenticacaoEvent e) {
        if(e.isResultadoAutenticacao())
            this.autenticacaoMsg.setText("Seja bem-vindo");
        else
            this.autenticacaoMsg.setText("Login ou senha incorretos");
    }
}
