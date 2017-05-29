package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Cubic Mountain on 18.05.17.
 */
public class MainWindow extends JFrame {
    public MainWindow() throws Exception/*HeadlessException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException*/ {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(50, 50, 700, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Map());
        setVisible(true);
    }


}
