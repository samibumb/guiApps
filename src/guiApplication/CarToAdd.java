package guiApplication;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarToAdd extends JFrame{
    private JPanel cartoaddPanel;
    private JTextField brandField;
    private JLabel modelLabel;
    private JLabel yearLabel;
    private JLabel brandLabel;
    private JLabel fuelLabel;
    private JLabel engineLabel;
    private JLabel transmissionLabel;
    private JLabel priceLabel;
    private JTextField modelField;
    private JTextField yearField;
    private JTextField fuelField;
    private JTextField engineField;
    private JTextField transmissionField;
    private JTextField priceField;
    private JTable table1;
    private JButton addButton;
    private JScrollPane scroll;
    private JButton euroSymbolButton;
    private JButton clearButton;
    private JButton exitButton;
    private JButton sellACarButton;


    CarToAdd(){
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.addColumn("Brand");
        model.addColumn("Model");
        model.addColumn("Year");
        model.addColumn("Fuel");
        model.addColumn("Engine Size");
        model.addColumn("Transmission");
        model.addColumn("Price");


        euroSymbolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                priceField.setText(priceField.getText()+"€");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
                tableModel.addRow(new Object[]{brandField.getText(),modelField.getText(),yearField.getText(),fuelField.getText(),engineField.getText(),
                transmissionField.getText(),priceField.getText()});

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brandField.setText("");
                modelField.setText("");
                yearField.setText("");
                fuelField.setText("");
                engineField.setText("");
                transmissionField.setText("");
                priceField.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(cartoaddPanel);
        sellACarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
                int selectedRow = table1.getSelectedRow();
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null,"Car sold.", "",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CarToAdd");
        frame.setContentPane(new CarToAdd().cartoaddPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
