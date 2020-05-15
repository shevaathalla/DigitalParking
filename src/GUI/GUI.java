/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import digitalparking.FrmMainPRT;
import javax.swing.UIManager;

/**
 *
 * @author HP ProBook
 */
public class GUI {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new FrmMenu().setVisible(true);
    }

}
