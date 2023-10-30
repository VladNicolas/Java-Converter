import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {

    ImageIcon lengthIcon = new ImageIcon("img/length.png");
    ImageIcon tempIcon = new ImageIcon("img/temperature.png");
    ImageIcon timeIcon = new ImageIcon("img/time.png");
    ImageIcon titleImage = new ImageIcon("img/title.png");

    Button lengthButton = new Button("Length", lengthIcon);
    Button tempButton = new Button("Temperature", tempIcon);
    Button timeButton = new Button("Time", timeIcon);
    JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 0));

    JLabel titleLabel = new JLabel();
    JLabel description = new JLabel();


    MainFrame() {

        lengthButton.addActionListener(this);
        tempButton.addActionListener(this);
        timeButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        setSize(400, 500);
        setResizable(false);
        setVisible(true);
        setTitle("Nicolas Vlad's Converter");
        setLocationRelativeTo(null);

        titleLabel.setIcon(titleImage);
        add(titleLabel);

        buttonPanel.add(lengthButton);
        buttonPanel.add(tempButton);
        buttonPanel.add(timeButton);
        add(buttonPanel);

        description.setText("<html>I created this program as a way to practice what I've learned about Java and the Swing framework. This program is just a personal challenge and part of my learning process as a developer.</html>");
        description.setForeground(new Color(120, 120, 120));
        add(description);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == lengthButton) {
            new LengthConverter();
        }

        if (e.getSource() == tempButton) {
            new TempConverter();
        }

        if (e.getSource() == timeButton) {
            new TimeConverter();
        }
    }
}