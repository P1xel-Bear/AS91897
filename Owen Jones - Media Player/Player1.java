
/**
 * Write a description of class Player1 here.
 *
 * @author Owen J
 * @version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

public class Player1 extends JFrame implements ActionListener
{

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;

    //Constants
    final String WINDOWNAME = "Player";
    final int WIDTH = 1280;
    final int HEIGHT = 720;
    /**
     * Constructor for objects of class Player1
     */
    public Player1()
    {
        //Create Menu Bar
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        //Create Menu
        menu = new JMenu("File");
        menuBar.add(menu);
        
        //Create Items In Menu
        menuItem = new JMenuItem("Quit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        setTitle(WINDOWNAME);
        this.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println(e);
        String cmd = e.getActionCommand();
        switch (cmd){
            case "Quit" : System.exit(0);
                break;
        }    
    }
}
