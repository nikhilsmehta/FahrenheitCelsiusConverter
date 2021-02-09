import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class GUI {
    private static JButton fahrenheit;
    private static JButton celsius;

    private static JTextField fahrenheitInput;
    private static JButton farenheitInputConvert;
    private static JLabel fahrenheitLabel;
    private static JLabel celsiusOutput;

    private static JTextField celsiusInput;
    private static JButton celsiusInputConvert;
    private static JLabel celsiusLabel;
    private static JLabel fahrenheitOuput;




    public static void main(String[] args) {
        JPanel panel= new JPanel();
        JFrame frame= new JFrame();
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fahrenheit to Celsius GUI");
        frame.pack();
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        //Below is the Fahrenheit to Celsius Window
        JPanel fahrenheitToCelsiusPanel= new JPanel();
        JFrame fahrenheitToCelsiusFrame= new JFrame();
        fahrenheitToCelsiusFrame.setTitle("Fahrenheit to Celsius");
        fahrenheitToCelsiusFrame.setSize(500, 200);
        fahrenheitToCelsiusFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fahrenheitToCelsiusFrame.add(fahrenheitToCelsiusPanel);
        fahrenheitToCelsiusPanel.setLayout(null);

        fahrenheitLabel = new JLabel("Enter your Fahrenheit Value");
        fahrenheitLabel.setBounds(50, 20, 250, 25);
        fahrenheitToCelsiusPanel.add(fahrenheitLabel);

        fahrenheitInput = new JTextField();
        fahrenheitInput.setBounds(250, 20, 165, 25);
        fahrenheitToCelsiusPanel.add(fahrenheitInput);

        farenheitInputConvert = new JButton("Convert");
        farenheitInputConvert.setBackground(Color.red);
        farenheitInputConvert.setBounds(10,80, 100, 25);
        farenheitInputConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fahrenheitInputValue = Integer.parseInt(fahrenheitInput.getText());

                double celsiusOutputValue = (fahrenheitInputValue-32)/1.8;
                String celsiusOutputValueString = String.valueOf(celsiusOutputValue);
                celsiusOutput = new JLabel("Celsius output " + celsiusOutputValueString);
                celsiusOutput.setBounds(0, 100, 180, 25);
                fahrenheitToCelsiusPanel.add(celsiusOutput);
            }
        });
        fahrenheitToCelsiusPanel.add(farenheitInputConvert);


        //Blow is the Celsius to Fahrenheit Window

        JPanel celsiusToFahrenheitPanel= new JPanel();
        JFrame celsiusToFahrenheitFrame= new JFrame();
        celsiusToFahrenheitFrame.setTitle("Celsius To Fahrenheit");
        celsiusToFahrenheitFrame.setSize(500, 200);
        celsiusToFahrenheitFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        celsiusToFahrenheitFrame.add(celsiusToFahrenheitPanel);
        celsiusToFahrenheitPanel.setLayout(null);

        celsiusLabel = new JLabel("Enter your Celsius Value");
        celsiusLabel.setBounds(50, 30, 250, 25);
        celsiusToFahrenheitPanel.add(celsiusLabel);

        celsiusInput = new JTextField();
        celsiusInput.setBounds(250, 20, 165, 25);
        celsiusToFahrenheitPanel.add(celsiusInput);

        celsiusInputConvert = new JButton("Convert");
        celsiusInputConvert.setBackground(Color.red);
        celsiusInputConvert.setBounds(10,80, 100, 25);
        celsiusInputConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int celsiusInputValue = Integer.parseInt(celsiusInput.getText());

                double fahrenheitOutputValue = (celsiusInputValue*1.8)+32;
                String fahrenheitOutputValueString = String.valueOf(fahrenheitOutputValue);
                fahrenheitOuput = new JLabel("Celsius output " + fahrenheitOutputValueString);
                fahrenheitOuput.setBounds(0, 100, 180, 25);
                celsiusToFahrenheitPanel.add(fahrenheitOuput);
            }
        });
        celsiusToFahrenheitPanel.add(celsiusInputConvert);


        //BELOW are the initial buttons
        fahrenheit= new JButton("Fahrenheit to Celsius Converter");
        fahrenheit.setBackground(Color.red);
        fahrenheit.setBounds(10,80, 250, 25);
        fahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fahrenheitToCelsiusFrame.setVisible(true);
            }
        });
        panel.add(fahrenheit);



        celsius= new JButton("Celsius to Fahrenheit Converter");
        celsius.setBackground(Color.red);
        celsius.setBounds(10,160, 250, 25);
        celsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celsiusToFahrenheitFrame.setVisible(true);
            }
        });
        panel.add(celsius);

    }

}
