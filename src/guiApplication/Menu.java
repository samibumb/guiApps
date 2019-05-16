package guiApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JButton listOfAvailableCarsButton;
    private JButton addACarButton;
    private JPanel menuPanel;
    private JLabel AutoWorld;

    public Menu(){
        add(menuPanel);

        listOfAvailableCarsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableCars cars = new TableCars();
                cars.setVisible(true);
                cars.setSize(1100,900);
                cars.setLocationRelativeTo(null);
            }
        });
        addACarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarToAdd car = new CarToAdd();
                car.setVisible(true);
                car.setSize(1100,900);
                car.setLocationRelativeTo(null);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().menuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
