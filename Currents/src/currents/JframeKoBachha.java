/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Niraj Sangroula
 */
public class JframeKoBachha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Niraj Tests JFrame ko Bachha");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi, how are you? ----------->");
            }
            
        });
        button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                label.setText("You just pressed mouse! :)");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                label.setText("You just released mouse! :)");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("You just entered your mouse! :)");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("You just exited from mouse! :)");
            }
            
        });
        button.setSize(100, 10);
        button.setText("Login");
        label.setText("Password");
        JTextField jTextField = new JTextField();
        jTextField.setColumns(10);
        panel.add(label);
        panel.add(jTextField);
        panel.add(button);
        jFrame.add(panel);
        
    }
    
}
