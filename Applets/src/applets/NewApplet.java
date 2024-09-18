/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author sangr
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g){
        g.drawString("Niraj Sangroula", 120, 120);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
