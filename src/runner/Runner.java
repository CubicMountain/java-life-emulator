package runner;

import gui.MainWindow;

/**
 * Created by Cubic Mountain on 18.05.17.
 */
public class Runner {
    public static void main(String[] args){
        try {
            MainWindow mainWindow = new MainWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

