package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaJogo extends JFrame {
   private String jogador="x";
   private JPanel contentPane;
   String [][] jogoDaVelha = new String[3][3];
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               telaJogo frame = new telaJogo();
               frame.setVisible(true);
            }
            catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public telaJogo() {
      getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,497,300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(contentPane);
      contentPane.setLayout(new GridLayout(3,3,3,3));

      JButton b1 = new JButton("");
      b1.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[0][0] == null){
            b1.setText(jogador);
            jogoDaVelha[0][0] = jogador;
            inverteJogador();
            }
            }
      });
      contentPane.add(b1);
      
      JButton b2 = new JButton("");
      b2.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[0][1] == null){
            b2.setText(jogador);
            jogoDaVelha[0][1] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b2);
      
      JButton b3 = new JButton("");
      b3.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[0][2] == null){
            b3.setText(jogador);
            jogoDaVelha[0][2] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b3);
      
      JButton b4 = new JButton("");
      b4.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[1][0] == null){
            b4.setText(jogador);
            jogoDaVelha[1][0] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b4);
      
      JButton b5 = new JButton("");
      b5.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[1][1] == null){
            b5.setText(jogador);
            jogoDaVelha[1][1] = jogador;
            inverteJogador();  
         }
            }
      });
      contentPane.add(b5);
      
      JButton b6 = new JButton("");
      b6.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[1][2] == null){
            b6.setText(jogador);
            jogoDaVelha[1][2] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b6);
      
      JButton b7 = new JButton("");
      b7.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[2][0] == null){
            b7.setText(jogador);
            jogoDaVelha[2][0] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b7);
      
      JButton b8 = new JButton("");
      b8.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (jogoDaVelha[2][1] == null){
            b8.setText(jogador);
            jogoDaVelha[2][1] = jogador;
            inverteJogador();  
         }
         }
      });
      contentPane.add(b8);
      
      JButton b9 = new JButton("");
      b9.setFont(new Font("Tahoma", Font.PLAIN, 50));
      b9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            b9.setText(jogador);
            jogoDaVelha[2][2] = jogador;
            inverteJogador();  
         }
      });
      contentPane.add(b9);
   

   }
   public void verificaVencedor() {
     
         for(int i=0; i<=2 ; i++) {
            if(jogoDaVelha[i][0] != null && 
               jogoDaVelha[i][0].equals(jogoDaVelha[i][1]) && 
               jogoDaVelha[i][1].equals(jogoDaVelha[i][2])) {
                System.out.println("Vencedor: " + jogoDaVelha[i][0]);
                telaInicial voltar = new telaInicial();
                voltar.setVisible(true);
                return;
            }
        }
         for(int j=0; j<=2 ; j++) {
            if(jogoDaVelha[0][j] != null && 
               jogoDaVelha[0][j].equals(jogoDaVelha[1][j]) && 
               jogoDaVelha[1][j].equals(jogoDaVelha[2][j])) {
                
                System.out.println("Vencedor: " + jogoDaVelha[0][j]);
                telaInicial voltar = new telaInicial();
                voltar.setVisible(true);
                return;
            }
        }
         if(jogoDaVelha[0][0] != null && 
               jogoDaVelha[0][0].equals(jogoDaVelha[1][1]) && 
               jogoDaVelha[1][1].equals(jogoDaVelha[2][2])) {
                
                System.out.println("Vencedor: " + jogoDaVelha[0][0]);
                telaInicial voltar = new telaInicial();
                voltar.setVisible(true);
                return;
           }
         if(jogoDaVelha[0][2] != null && 
               jogoDaVelha[0][2].equals(jogoDaVelha[1][1]) && 
               jogoDaVelha[1][1].equals(jogoDaVelha[2][0])) {
                
                System.out.println("Vencedor: " + jogoDaVelha[0][2]);
                telaInicial voltar = new telaInicial();
                voltar.setVisible(true);
                return;
    }         
    
      
         
         
               System.out.println("Não há vencedor ainda");
   }
   
   
   public void inverteJogador() {
      if(jogador.equals("x"))
         jogador="o";
      else
         jogador="x";
   
      verificaVencedor();
      
      boolean empate = true;
      for (int i = 0; i < jogoDaVelha.length; i++) {
          for (int j = 0; j < jogoDaVelha[i].length; j++) {
              if (jogoDaVelha[i][j] == null) {
                  empate = false;
                  break;
              }
          }
          if (!empate) { 
             break;
          }
      }
      if (empate) {
         System.out.println("Empatou");
         telaInicial voltar = new telaInicial();
         voltar.setVisible(true);
         
      }
      





   }
   
}
