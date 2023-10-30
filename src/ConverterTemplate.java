import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ConverterTemplate extends JFrame {

    JLabel titleLabel = new JLabel();
    JComboBox<String> measurements1;
    JComboBox<String> measurements2;
    JTextField inputField;
    JTextField outputField;
    JButton convertButton;

    ConverterTemplate(String title, String imagePath, String[] measurements) {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle(title);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon(imagePath);

        titleLabel.setText(title);
        titleLabel.setIcon(icon);
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        titleLabel.setVerticalTextPosition(JLabel.BOTTOM);
        add(titleLabel);

        measurements1 = new JComboBox<>(measurements);
        measurements1.setBounds(30, 150, 100, 20);
        add(measurements1);

        measurements2 = new JComboBox<>(measurements);
        measurements2.setBounds(30, 250, 100, 20);
        add(measurements2);

        inputField = new JTextField();
        inputField.setBounds(210, 150, 150, 20);
        add(inputField);

        outputField = new JTextField();
        outputField.setBounds(210, 250, 150, 20);
        add(outputField);

        convertButton = new JButton("Convert");
        convertButton.setBounds(230, 200, 110, 20);
        convertButton.setFocusable(false);
        add(convertButton);

    }
}