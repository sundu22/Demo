package Competition;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CompetitorEditPanel extends JPanel {
    private JTextField nameTextField;
    private JTextField scoreTextField;
    private JButton saveButton;

    public CompetitorEditPanel() {
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        nameTextField = new JTextField();
        scoreTextField = new JTextField();
        saveButton = new JButton("Save");
    }

    private void layoutComponents() {
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Name:"));
        add(nameTextField);
        add(new JLabel("Score:"));
        add(scoreTextField);
        add(new JLabel()); // Empty label for spacing
        add(saveButton);
    }

    // Add methods to handle save button click and update competitor details
}


