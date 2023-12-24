package Competition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "unused", "serial" })
public class GUI extends JFrame {
    @SuppressWarnings("rawtypes")
	private CompetitorViewPanel viewPanel;
    private CompetitorTablePanel tablePanel;
    private CompetitorEditPanel editPanel;

    public GUI() {
        initComponents();
        layoutComponents();
        addEventListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("rawtypes")
	private void initComponents() {
        viewPanel = new CompetitorViewPanel();
        tablePanel = new CompetitorTablePanel();
        editPanel = new CompetitorEditPanel();
    }

    private void layoutComponents() {
        JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tablePanel, viewPanel);
        JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane1, editPanel);

        setLayout(new BorderLayout());
        add(splitPane2, BorderLayout.CENTER);
    }

    private void addEventListeners() {
        // Add listeners for buttons or other components if needed
    }

    // Add methods to update view, table, and edit panels
}


