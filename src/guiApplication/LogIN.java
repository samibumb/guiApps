package guiApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class LogIN extends JFrame{
    private JPanel loginPanel;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton cancelButton;
    private JButton enterButton;
    private JLabel emptyUserName;
    private JLabel emptyPassword;
    private JButton tryAgainButton;
    private JLabel loginlabel;

    public LogIN(){
        emptyUserName.setVisible(false);
        emptyPassword.setVisible(false);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameTextField.getText().equals("") || passwordTextField.getPassword().equals("")){
                    emptyUserName.setVisible(true);
                    emptyPassword.setVisible(true);
                }else if (usernameTextField.getText().equals("")){
                    emptyUserName.setVisible(true);
                }else if (String.valueOf(passwordTextField.getPassword()).equals("")) {
                    emptyPassword.setVisible(true);
                }else if (usernameTextField.getText().equals("samibumb") && passwordTextField.getText().equals("sami")){
                    JOptionPane.showMessageDialog(null,"Welcome Sami!","",JOptionPane.PLAIN_MESSAGE);
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    menu.setSize(1100,800);
                    menu.setLocationRelativeTo(null);
                    menu.setResizable(false);

                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password","",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyUserName.setVisible(false);
                emptyPassword.setVisible(false);
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(loginPanel);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("LogIN");
        frame.setContentPane(new LogIN().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,400);
    }
}
