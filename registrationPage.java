import javax.swing.*;
import java.awt.*;

public class registrationPage {
    public void regisPage() {
        JFrame frame = new JFrame("Registration Page");
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

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.decode("#549AE0"));
        loginButton.setForeground(new Color(37, 105, 56));
        loginButton.setBounds(30, 350, 157, 39);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        loginButton.setFocusPainted(false);

        loginButton.addActionListener(e -> {
            LoginPage clicked = new LoginPage();
            clicked.showLoginPage();
            frame.setVisible(false); // Hide registration page
        });

        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(480, 0, 400, 450);
        rightPanel.setBackground(new Color(135, 205, 184));

        // Email Field
        JTextField emailField = new JTextField(" Email");
        emailField.setBounds(35, 137, 240, 40);
        emailField.setFont(new Font("SansSerif", Font.BOLD, 16));
        emailField.setForeground(Color.decode("#999999"));
        emailField.setBackground(Color.decode("#D9F7F3"));
        emailField.setBorder(BorderFactory.createLineBorder(Color.decode("#A1DCD0")));

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (emailField.getText().equals(" Email")) {
                    emailField.setText("");
                    emailField.setForeground(Color.decode("#333333"));
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (emailField.getText().isEmpty()) {
                    emailField.setText(" Email");
                    emailField.setForeground(Color.decode("#999999"));
                }
            }
        });

        // Username Field
        JTextField usernameField = new JTextField(" Username");
        usernameField.setBounds(35, 200, 240, 40);
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
        passwordField.setBounds(35, 265, 240, 40);
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

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBackground(Color.decode("#6AF073"));
        registerButton.setForeground(Color.decode("#256938"));
        registerButton.setBounds(75, 350, 157, 39);
        registerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        registerButton.setFocusPainted(false);

        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Registered successfully!");
        });

        // Add all components to frame
        frame.add(leftPanel);
        frame.add(rightPanel);
        rightPanel.add(emailField);
        rightPanel.add(usernameField);
        rightPanel.add(passwordField);
        rightPanel.add(registerButton);
        leftPanel.add(welcomeTxt);
        leftPanel.add(txt1);
        leftPanel.add(txt2);
        leftPanel.add(loginButton);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        registrationPage obj = new registrationPage();
        obj.regisPage();
    }
}
