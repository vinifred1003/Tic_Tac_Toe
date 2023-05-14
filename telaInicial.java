package Game;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class telaInicial extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               telaInicial frame = new telaInicial();
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
   public telaInicial() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,450,300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton("Start Game");
      btnNewButton.setForeground(Color.BLUE);
      btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
      btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               telaJogo Start = new telaJogo();
               Start.setVisible(true);
            }
         });
      btnNewButton.setBounds(102, 48, 217, 74);
      contentPane.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("Como Jogar");
      btnNewButton_1.setForeground(Color.MAGENTA);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            telaComoJogar instrucao = new telaComoJogar();
            instrucao.setVisible(true);
         }
      });
      btnNewButton_1.setBounds(102, 133, 217, 23);
      contentPane.add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("Sair");
      btnNewButton_2.setForeground(Color.RED);
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      
      btnNewButton_2.setBounds(168, 167, 83, 34);
      contentPane.add(btnNewButton_2);
      
   }
}
