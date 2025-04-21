import javax.swing.*;
import java.awt.*;

public class LoginPage {

    public void showLoginPage() {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(800, 450);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setSize(480, 450);
        leftPanel.setBackground(new Color(75, 157, 106));

        JLabel welcomeTxt = new JLabel("Welcome Back!");
        welcomeTxt.setBounds(30, 10, 300, 100);
        welcomeTxt.setForeground(new Color(80, 235, 147));
        welcomeTxt.setFont(new Font("SansSerif", Font.BOLD, 32));

        JLabel txt1 = new JLabel("GEAR UP");
        txt1.setBounds(30, 60, 300, 200);
        txt1.setForeground(new Color(80, 235, 147));
        txt1.setFont(new Font("SansSerif", Font.BOLD, 50));

        JLabel txt2 = new JLabel("YOUR LIFE.");
        txt2.setBounds(30, 200, 300, 100);
        txt2.setForeground(new Color(80, 235, 147));
        txt2.setFont(new Font("SansSerif", Font.BOLD, 50));

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(new Color(106, 240, 115));
        registerButton.setForeground(new Color(37, 105, 56));
        registerButton.setBounds(30, 350, 157, 39);
        registerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        registerButton.setFocusPainted(false);

        registerButton.addActionListener(e -> {
            registrationPage regisClicked = new registrationPage();
            regisClicked.regisPage();
            frame.setVisible(false); // Hide login page
        });

        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(480, 0, 400, 450);
        rightPanel.setBackground(new Color(135, 205, 184));

        // Username Field
        JTextField usernameField = new JTextField(" Username");
        usernameField.setBounds(35, 137, 240, 40);
        usernameField.setFont(new Font("SansSerif", Font.BOLD, 16));
        usernameField.setForeground(Color.decode("#999999"));
        usernameField.setBackground(Color.decode("#D9F7F3"));
        usernameField.setBorder(BorderFactory.createLineBorder(Color.decode("#A1DCD0")));

        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (usernameField.getText().equals(" Username")) {
                    usernameField.setText("");
                    usernameField.setForeground(Color.decode("#333333"));
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText(" Username");
                    usernameField.setForeground(Color.decode("#999999"));
                }
            }
        });

        // Password Field
        JPasswordField passwordField = new JPasswordField(" Password");
        passwordField.setBounds(35, 235, 240, 40);
        passwordField.setFont(new Font("SansSerif", Font.BOLD, 16));
        passwordField.setForeground(Color.decode("#999999"));
        passwordField.setBackground(Color.decode("#D9F7F3"));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.decode("#A1DCD0")));
        passwordField.setEchoChar((char) 0);

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                String pass = new String(passwordField.getPassword());
                if (pass.equals(" Password")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('\u2022');
                    passwordField.setForeground(Color.decode("#333333"));
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                String pass = new String(passwordField.getPassword());
                if (pass.isEmpty()) {
                    passwordField.setText(" Password");
                    passwordField.setEchoChar((char) 0);
                    passwordField.setForeground(Color.decode("#999999"));
                }
            }
        });

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.decode("#549AE0"));
        loginButton.setForeground(Color.decode("#256938"));
        loginButton.setBounds(75, 320, 157, 39);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        loginButton.setFocusPainted(false);

        loginButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Login successfully!");
            
        });

        // Add components
        rightPanel.add(usernameField);
        rightPanel.add(passwordField);
        leftPanel.add(registerButton);
        rightPanel.add(loginButton);
        leftPanel.add(txt1);
        leftPanel.add(txt2);
        leftPanel.add(welcomeTxt);
        frame.add(leftPanel);
        frame.add(rightPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LoginPage obj = new LoginPage();
        obj.showLoginPage();
    }
}
