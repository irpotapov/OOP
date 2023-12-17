import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWithMain extends JFrame {

    public int factorial(int numb) {
        int res = 1;
        for (int i = numb; i > 1; i--)
            res *= i;
        return res;
    }
    public FrameWithMain() {
        super("Окно без функции main");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;
        constr.gridx = 0;
        constr.gridy = 0;
        JLabel labp = new JLabel("p");
        JLabel labN = new JLabel("N");
        JLabel labR = new JLabel("R");
        JLabel labb = new JLabel("b");
        JLabel labc = new JLabel("c");
        JLabel labres = new JLabel("Результат: ");
        JTextField pInput = new JTextField(10);
        JTextField NInput = new JTextField(10);
        JTextField RInput = new JTextField(10);
        JTextField bInput = new JTextField(10);
        JTextField cInput = new JTextField(10);
        JTextField resInput = new JTextField(20);
        JRadioButton level1 = new JRadioButton("Уровень 1");
        JRadioButton level2 = new JRadioButton("Уровень 2");
        panel.add(labp, constr);
        constr.gridx = 1;
        panel.add(pInput, constr);
        constr.gridx = 0; constr.gridy = 1;
        panel.add(labN, constr);
        constr.gridx = 1;
        panel.add(NInput, constr);
        constr.gridx = 0; constr.gridy = 2;
        panel.add(labR, constr);
        constr.gridx = 1;
        panel.add(RInput, constr);
        constr.gridx = 0; constr.gridy = 3;
        panel.add(labb, constr);
        constr.gridx = 1;
        panel.add(bInput, constr);
        constr.gridx = 0; constr.gridy = 5;
        panel.add(labc, constr);
        constr.gridx = 1;
        panel.add(cInput, constr);
        constr.gridx = 0; constr.gridy = 7;
        panel.add(level1, constr);
        constr.gridx = 1;
        panel.add(level2, constr);
        constr.gridx = 0; constr.gridy = 8;

        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;
        JButton btn = new JButton("Расчитать");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Z = 0;
                double p = Double.parseDouble(pInput.getText());
                int N = Integer.parseInt(NInput.getText());
                int R = Integer.parseInt(RInput.getText());
                int b = Integer.parseInt(bInput.getText());
                int c = Integer.parseInt(cInput.getText());

                if (level1.isSelected()) {
                    Z = 0;
                    for (int k = 0; k < N; k++) {
                        Z += Math.pow(p, k) / factorial(k);
                    }
                }
                else {
                    for (int i = 1; i <= N; i++) {
                        for (int j = 1; j <= R; j++) {
                            Z = (Math.pow(i, 2) + (b * j)) / (c * Math.pow(j, 3));
                        }
                    }
                }
                resInput.setText(String.valueOf(Z));
            }
        });
        panel.add(btn, constr);
        constr.gridx = 0; constr.gridy = 10;
        panel.add(labres, constr);
        constr.gridx = 0; constr.gridy = 11;
        panel.add(resInput, constr);
        constr.gridx = 0; constr.gridy = 12;


        mainPanel.add(panel);
        add(mainPanel);
        pack();

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameWithMain window = new FrameWithMain();
        window.setVisible(true);
    }
}
