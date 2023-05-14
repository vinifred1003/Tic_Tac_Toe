package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaComoJogar extends JFrame {

   private JPanel Painel;
   private JTextField TituloComoJogar;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               telaComoJogar frame = new telaComoJogar();
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
   public telaComoJogar() {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(100,100,450,300);
      Painel = new JPanel();
      Painel.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(Painel);
      Painel.setLayout(null);
      
      TituloComoJogar = new JTextField();
      TituloComoJogar.setFont(new Font("Tahoma", Font.PLAIN, 25));
      TituloComoJogar.setForeground(new Color(255, 0, 0));
      TituloComoJogar.setToolTipText("Uma empresa Inovadora fundada em 2013 .\r\nCEO Vin\u00EDcius Fedrigo Frederico\r\n(c)BALACOBACO SOFTWARE");
      TituloComoJogar.setText("COMO JOGAR");
      TituloComoJogar.setHorizontalAlignment(SwingConstants.CENTER);
      TituloComoJogar.setBounds(62, 42, 319, 41);
      Painel.add(TituloComoJogar);
      TituloComoJogar.setColumns(10);
      
      JTextArea TextoComoJogar = new JTextArea();
      TextoComoJogar.setText("Regras: No modo b\u00E1sico do jogo, participam duas \r\npessoas, que jogam alternadamente, preenchendo \r\ncada um dos espa\u00E7os vazios. Cada participante poder\u00E1 \r\nusar um s\u00EDmbolo (X ou O). Vence o jogador que \r\nconseguir formar primeiro uma linha com tr\u00EAs s\u00EDmbolos \r\niguais, seja ela na horizontal, vertical ou diagonal.");
      TextoComoJogar.setBounds(0, 94, 434, 133);
      Painel.add(TextoComoJogar);
      
      JButton Voltar = new JButton("Voltar");
      Voltar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            telaInicial voltar = new telaInicial();
            voltar.setVisible(true);
         }
      });
      Voltar.setBounds(178, 230, 89, 23);
      Painel.add(Voltar);
   }
}
