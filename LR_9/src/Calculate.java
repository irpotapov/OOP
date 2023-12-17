import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Calculate extends JFrame {

    private JComboBox<String> iterationsComboBox;
    private JSpinner iterationsSpinner;
    private JTextField variable1Field;
    private JTextField variable2Field;
    private JLabel resultLabel1;
    private JLabel resultLabel2;
    private JLabel resultLabel3;
    private JLabel resultLabel4;

    public Calculate() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3, 1));

        JPanel iterationsPanel = new JPanel();
        iterationsPanel.setBorder(BorderFactory.createTitledBorder("Итерации"));
        iterationsPanel.setLayout(new GridLayout(2, 2));
        JLabel iterationsLabel = new JLabel("N ");
        iterationsComboBox = new JComboBox();
        iterationsComboBox.setPreferredSize(new Dimension(50, 5));
        iterationsComboBox.addItem("5");
        iterationsComboBox.addItem("10");
        iterationsComboBox.addItem("15");
        iterationsComboBox.addItem("20");
        iterationsComboBox.addItem("25");
        JLabel iterationsSpinnerLabel = new JLabel("K ");
        iterationsSpinner = new JSpinner();
        iterationsPanel.add(iterationsLabel);
        iterationsPanel.add(iterationsComboBox);
        iterationsPanel.add(iterationsSpinnerLabel);
        iterationsPanel.add(iterationsSpinner);

        JPanel variablesPanel = new JPanel();
        variablesPanel.setBorder(BorderFactory.createTitledBorder("Переменные"));
        variablesPanel.setLayout(new GridLayout(2, 2));
        JLabel variable1Label = new JLabel("x ");
        variable1Field = new JTextField();
        JLabel variable2Label = new JLabel("y ");
        variable2Field = new JTextField();
        variablesPanel.add(variable1Label);
        variablesPanel.add(variable1Field);
        variablesPanel.add(variable2Label);
        variablesPanel.add(variable2Field);

        JPanel resultPanel = new JPanel();
        resultPanel.setBorder(BorderFactory.createTitledBorder("Результат"));
        resultPanel.setLayout(new GridLayout(4, 1));
        resultLabel1 = new JLabel();
        resultLabel2 = new JLabel();
        resultLabel3 = new JLabel();
        resultLabel4 = new JLabel();
        resultPanel.add(resultLabel1);
        resultPanel.add(resultLabel2);
        resultPanel.add(resultLabel3);
        resultPanel.add(resultLabel4);

        iterationsComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                   calculat();
                }
            }
        });

        iterationsSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                calculat();
            }
        });

        variable1Field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculat();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculat();
            }
        });

        variable2Field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculat();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculat();
            }
        });

        frame.add(iterationsPanel);
        frame.add(variablesPanel);
        frame.add(resultPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(250, 300);
        frame.setVisible(true);
    }

    private void calculat() {
        try {
            if (!variable1Field.getText().isEmpty() && !variable2Field.getText().isEmpty()) {
                int N = Integer.parseInt((String)iterationsComboBox.getSelectedItem());
                int K = (int)iterationsSpinner.getValue();
                double x = Double.parseDouble(variable1Field.getText());
                double y = Double.parseDouble(variable2Field.getText());
                double Z = 0;
                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= K; j++) {
                        Z += (Math.sin(x) * Math.pow(x, i) + Math.cos(y) * Math.pow(y, j)) / i * j;
                    }
                }

                resultLabel1.setText(String.format("%12.3f", Z));
                resultLabel2.setText(String.format("%o", (int)Z));
                resultLabel3.setText(String.format("%x", (int)Z));
                resultLabel4.setText(String.format("%5.3e", Z));
            }
        } catch (NumberFormatException ex) {}
    }

    public static void main(String[] args) {
        new Calculate();
    }
}
