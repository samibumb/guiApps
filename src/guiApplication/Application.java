package guiApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application extends JFrame{
    private JPanel applicationPanel;
    private JLabel autoworldlabel;
    private JButton logInButton;
    private JButton exitButton;
    private JLabel timeLabel;


    public Application() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LogIN log = new LogIN();
                log.setVisible(true);
                log.setSize(500,400);
                log.setLocationRelativeTo(null);

            }
        });
        clock();

    }
    public void clock(){
        Thread clock = new Thread(){
            public void run(){
                try {
                    while (true){
                        Calendar calendar = new GregorianCalendar();
                        int day = calendar.get(Calendar.DAY_OF_MONTH);
                        int month = calendar.get(Calendar.MONTH);
                        int year = calendar.get(Calendar.YEAR);

                        int second = calendar.get(Calendar.SECOND);
                        int minute = calendar.get(Calendar.MINUTE);
                        int hour = calendar.get(Calendar.HOUR);

                        timeLabel.setText(hour + ":" + minute + ":" + second + "   \n" + day + "/" + month + "/" + year);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Application");
        frame.setContentPane(new Application().applicationPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

    }

}
