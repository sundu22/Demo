package Competition;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CompetitorTablePanel extends JPanel {
    private JTable competitorTable;

    public CompetitorTablePanel() {
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        competitorTable = new JTable(); // You need to set the table model and data
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(new JScrollPane(competitorTable), BorderLayout.CENTER);
    }

    // Add methods to update the table model and data
}


