package CompetitionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class WelcomeFrame extends JFrame {
    public WelcomeFrame() {
        createView();

        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the window
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel welcomeLabel = new JLabel("Welcome to the Application!");
        welcomeLabel.setPreferredSize(new Dimension(250, 100));
        panel.add(welcomeLabel);

        JButton closeButton = new JButton("Close");
        panel.add(closeButton);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit application
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WelcomeFrame frame = new WelcomeFrame();
            frame.setVisible(true);
        });
    }
}
