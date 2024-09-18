/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;

import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Niraj Sangroula
 */
public class TestJFrame extends JFrame{

    Panel p1;
    TestJFrame(){
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new Panel();
        JTextField jTF = new JTextField();
        jTF.setColumns(ALLBITS);
        p1.add(jTF);
        p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(p1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TestJFrame();
    }
    
}
