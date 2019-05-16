package guiApplication;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableCars extends JFrame{
    private JPanel tablePanel;
    JTable carTable;
    private JButton exitButton;
    private JLabel label;
    private JButton backButton;

    public TableCars() {

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(tablePanel);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.setSize(1100,800);
                menu.setLocationRelativeTo(null);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TableCars");
        frame.setContentPane(new TableCars().tablePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1100,900);
    }

    private void createUIComponents() {

        setLayout(new FlowLayout());

        String[] column={"Brand","Model","Year","Fuel","Engine Size","Transmission","Price"};
        Object[][] data={{"Audi","A7","2018","Diesel","3.000","4X4","50.000€"},
                {"Mercedes","S500","2018","Diesel","3.000","4x4","70.000€"},
                {"Mercedes","G500","2017","Petrol","4.000" ,"6x6","300.000€"},
                {"Audi","Q8","2019","Petrol","3.500","4x4","120.000€"},
                {"Audi","A6","2018","Diesel","2.000","4x4","60.000€"},
                {"Mercedes","C220","2017","Diesel","2.200","2x4","35.000€"},
                {"Audi","A6","2019","Petrol" ,"3.000","4x4","50.000€"},
                {"Audi","A8","2019","Petrol" ,"3.000","4x4","80.000€"},
                {"BMW","850Li","2019","Hybrid" ,"4.000" ,"4x4","150.000€"},
                {"BMW","520d","2019","Diesel" ,"2.000","4x4","50.000€"},
                {"BMW","850Li","2019","Hybrid","4.000","4x4","150.000€"},
        };
        carTable = new JTable(data,column);
        carTable.setPreferredScrollableViewportSize(new Dimension(500,500));
        carTable.setFillsViewportHeight(true);
        JScrollPane pane = new JScrollPane(carTable);
        add(pane);
        carTable.setVisible(true);

    }
}
