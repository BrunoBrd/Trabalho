/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */

      
 import javax.swing.*;
import java.awt.BorderLayout;

public class Trabalho extends JFrame{
    
    public Trabalho(){
        //Objetos
        JPanel P = new JPanel();
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        JPanel P4 = new JPanel();
        
        JButton B1 = new JButton("Botão 1");
        JButton B2 = new JButton("Botão 2");
        JButton B3 = new JButton("Botão 3");
        JButton B4 = new JButton("Botão 4");
        JButton B5 = new JButton("Botão 5");
        JButton B6 = new JButton("Botão 6");
        JButton B7 = new JButton("Botão 7");
        JButton B8 = new JButton("Botão 8");
        JButton B9 = new JButton("Botão 9");
        JButton B10 = new JButton("Botão 10");
        
        JLabel L1 = new JLabel("NORTE ");
        JLabel L2 = new JLabel("SUL");
        JLabel L3 = new JLabel("CENTRO");
        JLabel L4 = new JLabel("LESTE");
        JLabel L5 = new JLabel("OESTE");
        
        BorderLayout N = new BorderLayout();
        BorderLayout S = new BorderLayout();
        BorderLayout C = new BorderLayout();
        BorderLayout L = new BorderLayout();
        BorderLayout O = new BorderLayout();
        
        //Centralizando as Labels
        
        L1.setHorizontalAlignment(SwingConstants.CENTER);
        L2.setHorizontalAlignment(SwingConstants.CENTER);
        L3.setHorizontalAlignment(SwingConstants.CENTER);
        L4.setHorizontalAlignment(SwingConstants.CENTER);
        L5.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Propriedades
        
        super.setTitle("TRABALHANDO COM BORDERLAYOUT");
        
        P.setLayout(N);
        add(P,BorderLayout.NORTH);
        P.add(B1, BorderLayout.NORTH);
        P.add(B2, BorderLayout.SOUTH);
        P.add(L1, BorderLayout.CENTER);
        
        P1.setLayout(S);
        add(P1,BorderLayout.SOUTH);
        P1.add(B3, BorderLayout.NORTH);
        P1.add(B4, BorderLayout.SOUTH);
        P1.add(L2, BorderLayout.CENTER);
        
        P2.setLayout(C);
        add(P2,BorderLayout.CENTER);
        P2.add(B5, BorderLayout.NORTH);
        P2.add(B6, BorderLayout.SOUTH);
        P2.add(L3, BorderLayout.CENTER);
        
        P3.setLayout(L);
        add(P3,BorderLayout.EAST);
        P3.add(B7, BorderLayout.NORTH);
        P3.add(B8, BorderLayout.SOUTH);
        P3.add(L4, BorderLayout.CENTER);

        P4.setLayout(O);
        add(P4,BorderLayout.WEST);
        P4.add(B9, BorderLayout.NORTH);
        P4.add(B10, BorderLayout.SOUTH);
        P4.add(L5, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Trabalho jframe = new Trabalho();
        jframe.setSize(800,600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(true);
        jframe.setVisible(true);
        
       
    }
    
}
