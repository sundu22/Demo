package CompetitionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        createView();

        setTitle("Login System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the window
    }

    private void createView() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);

        // Username
        JLabel labelUsername = new JLabel("Username:");
        panel.add(labelUsername, c);

        usernameField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(usernameField, c);

        // Password
        JLabel labelPassword = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(labelPassword, c);

        passwordField = new JPasswordField(20);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(passwordField, c);

        // Login Button
        JButton buttonLogin = new JButton("Login");
        c.gridx = 1;
        c.gridy = 2;
        panel.add(buttonLogin, c);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        add(panel);
    }

    private void performLogin() {
        String username = usernameField.getText();
        @SuppressWarnings("unused")
		String password = new String(passwordField.getPassword());

        // Here you should include your login logic
        JOptionPane.showMessageDialog(this, "Login Attempt: " + username);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}
