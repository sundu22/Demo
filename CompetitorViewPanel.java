package Competition;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;

@SuppressWarnings("serial")
public class CompetitorViewPanel<competitorDetailsTextArea> extends JPanel {
    private JTextComponent competitorDetailsTextArea;

    public CompetitorViewPanel() {
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        competitorDetailsTextArea = new JTextArea();
        competitorDetailsTextArea.setEditable(false);
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(new JScrollBar(), BorderLayout.CENTER);
    }

    public void updateCompetitorDetails(String details) {
        competitorDetailsTextArea.setText(details);
    }
}


