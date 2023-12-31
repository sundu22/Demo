package CompetitionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class CompetitorFrame extends JFrame {
    private List<Competitor> competitors;
    private DefaultListModel<Competitor> competitorListModel;
    private JList<Competitor> competitorJList;
    private JTextField nameTextField;
    private JTextField categoryTextField;

    public CompetitorFrame() {
        competitors = new ArrayList<>();
        competitorListModel = new DefaultListModel<>();

        setTitle("Competitor Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form Panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0, 2));

        nameTextField = new JTextField();
        categoryTextField = new JTextField();
        JButton addButton = new JButton("Add Competitor");

        formPanel.add(new JLabel("Name: "));
        formPanel.add(nameTextField);
        formPanel.add(new JLabel("Category: "));
        formPanel.add(categoryTextField);
        formPanel.add(addButton);

        // List Panel
        competitorJList = new JList<>(competitorListModel);
        JScrollPane listScrollPane = new JScrollPane(competitorJList);

        // Add components to frame
        add(formPanel, BorderLayout.NORTH);
        add(listScrollPane, BorderLayout.CENTER);

        // Action Listener for Add Button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCompetitor();
            }
        });
    }

    private void addCompetitor() {
        String name = nameTextField.getText();
        String category = categoryTextField.getText();
        Competitor newCompetitor = new Competitor(name, category);
        competitors.add(newCompetitor);
        competitorListModel.addElement(newCompetitor);
        nameTextField.setText("");
        categoryTextField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CompetitorFrame frame = new CompetitorFrame();
            frame.setVisible(true);
        });
    }
}

