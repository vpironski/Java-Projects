package privat;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JTextField textDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button5;
    private JButton button7;
    private JButton button4;
    private JButton button8;
    private JButton button3;
    private JButton button6;
    private JButton a9Button;
    private JButton buttonP;
    private JButton buttonU;
    private JButton button0;
    private JButton buttonDot;
    private JButton buttonCl;
    private JButton buttonM;
    private JButton buttonD;
    private JButton buttonR;
    private Container Calculator;

    public JavaCalculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1 = textDisplay.getText() + button1.getText();
                Object button1Text;
				textDisplay.setText(button1Text);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button2 = textDisplay.getText() + button2.getText();
                Object button2Text;
				textDisplay.setText(button2Text);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button3 = textDisplay.getText() + button3.getText();
                Object button3Text;
				textDisplay.setText(button3Text);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button4 = textDisplay.getText() + button4.getText();
                Object button4Text;
				textDisplay.setText(button4Text);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button5 = textDisplay.getText() +button5.getText();
                Object button5Text;
				textDisplay.setText(button5Text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}