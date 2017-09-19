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
        JPanel P01 = new JPanel();
        JPanel P02 = new JPanel();
        JPanel P03 = new JPanel();
        JPanel P04 = new JPanel();
        
        JButton B01 = new JButton("Botão um");
        
        JButton B02 = new JButton("Botão dois");
        
        JButton B03 = new JButton("Botão três");
        
        JButton B04 = new JButton("Botão quatro");
        
        JButton B05 = new JButton("Botão cinco");
        
        JButton B06 = new JButton("Botão seis");
        
        JButton B07 = new JButton("Botão sete");
        
        JButton B08 = new JButton("Botão oito");
        
        JButton B09 = new JButton("Botão nove");
        
        JButton B10 = new JButton("Botão dez");
        
        JLabel L01 = new JLabel("NORTE");
        JLabel L02 = new JLabel("SUL");
        JLabel L03 = new JLabel("CENTRO");
        JLabel L04 = new JLabel("LESTE");
        JLabel L05 = new JLabel("OESTE");
        
        BorderLayout Norte = new BorderLayout();
        BorderLayout Sul = new BorderLayout();
        BorderLayout Centro = new BorderLayout();
        BorderLayout Leste = new BorderLayout();
        BorderLayout Oeste = new BorderLayout();
        
        //Centralizando as Labels
        
        L01.setHorizontalAlignment(SwingConstants.CENTER);
        L02.setHorizontalAlignment(SwingConstants.CENTER);
        L03.setHorizontalAlignment(SwingConstants.CENTER);
        L04.setHorizontalAlignment(SwingConstants.CENTER);
        L05.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Propriedades
        
        super.setTitle("BORDERLAYOUT");
        
        P.setLayout(Norte);
        add(P,BorderLayout.NORTH);
        P.add(B01, BorderLayout.NORTH);
        P.add(B02, BorderLayout.SOUTH);
        P.add(L01, BorderLayout.CENTER);
        
        P01.setLayout(Sul);
        add(P01,BorderLayout.SOUTH);
        P01.add(B03, BorderLayout.NORTH);
        P01.add(B04, BorderLayout.SOUTH);
        P01.add(L02, BorderLayout.CENTER);
        
        P02.setLayout(Centro);
        add(P02,BorderLayout.CENTER);
        P02.add(B05, BorderLayout.NORTH);
        P02.add(B06, BorderLayout.SOUTH);
        P02.add(L03, BorderLayout.CENTER);
        
        P03.setLayout(Leste);
        add(P03,BorderLayout.EAST);
        P03.add(B07, BorderLayout.NORTH);
        P03.add(B08, BorderLayout.SOUTH);
        P03.add(L04, BorderLayout.CENTER);

        P04.setLayout(Oeste);
        add(P04,BorderLayout.WEST);
        P04.add(B09, BorderLayout.NORTH);
        P04.add(B10, BorderLayout.SOUTH);
        P04.add(L05, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Trabalho jframe = new Trabalho();
        jframe.setSize(800,600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(true);
        jframe.setVisible(true);
        
       
    }
    
}
