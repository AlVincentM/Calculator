import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Calculator class
public class Calculator {

  private JTextField screen;

  String display;
  double result;

  Calculator() {

    JFrame frame = new JFrame("Calculator");

    // Calculator screen
    screen = new JTextField("");
    screen.setHorizontalAlignment(JTextField.RIGHT);
    screen.setEditable(false);
    screen.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    screen.setFont(new Font("Sans Serif", Font.BOLD, 32));
    screen.setBounds(5, 5 , 335, 95);

    // Button no.7
    JButton btn7 = new JButton("7");
    btn7.setBounds(5, 160, 80, 50);
    btn7.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn7.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.8
    JButton btn8 = new JButton("8");
    btn8.setBounds(90, 160, 80, 50);
    btn8.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn8.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.9
    JButton btn9 = new JButton("9");
    btn9.setBounds(175, 160, 80, 50);
    btn9.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn9.setFont(new Font("Sans Serif", Font.BOLD, 24));


    // Addition button
    JButton plusBtn = new JButton("+");
    plusBtn.setBounds(260, 160, 80, 50);
    plusBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    plusBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.4
    JButton btn4 = new JButton("4");
    btn4.setBounds(5, 215, 80, 50);
    btn4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn4.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.5
    JButton btn5 = new JButton("5");
    btn5.setBounds(90, 215, 80, 50);
    btn5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn5.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.6
    JButton btn6 = new JButton("6");
    btn6.setBounds(175, 215, 80, 50);
    btn6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn6.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Subtraction button
    JButton minusBtn = new JButton("-");
    minusBtn.setBounds(260, 215, 80, 50);
    minusBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    minusBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.1
    JButton btn1 = new JButton("1");
    btn1.setBounds(5, 270, 80, 50);
    btn1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn1.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.2
    JButton btn2 = new JButton("2");
    btn2.setBounds(90, 270, 80, 50);
    btn2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn2.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.3
    JButton btn3 = new JButton("3");
    btn3.setBounds(175, 270, 80, 50);
    btn3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn3.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Multiplication button
    JButton multBtn = new JButton("*");
    multBtn.setBounds(260, 270, 80, 50);
    multBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    multBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Button no.0
    JButton btn0 = new JButton("0");
    btn0.setBounds(5, 325, 80, 50);
    btn0.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    btn0.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Equals button
    JButton equalsBtn = new JButton("=");
    equalsBtn.setBounds(175, 325, 80, 50);
    equalsBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    equalsBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Division button
    JButton divBtn = new JButton("/");
    divBtn.setBounds(260, 325, 80, 50);
    divBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    divBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // del button
    JButton delBtn = new JButton("DELETE");
    delBtn.setBounds(5, 105, 165, 50);
    delBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    delBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    // Clear button
    JButton clearBtn = new JButton("CLEAR");
    clearBtn.setBounds(175, 105, 165, 50);
    clearBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    clearBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    JButton pointBtn = new JButton(".");
    pointBtn.setBounds(90, 325, 80, 50);
    pointBtn.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    pointBtn.setFont(new Font("Sans Serif", Font.BOLD, 24));

    frame.add(screen);
    frame.add(plusBtn);
    frame.add(minusBtn);
    frame.add(multBtn);
    frame.add(divBtn);
    frame.add(equalsBtn);
    frame.add(delBtn);
    frame.add(clearBtn);
    frame.add(btn0);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(btn4);
    frame.add(btn5);
    frame.add(btn6);
    frame.add(btn7);
    frame.add(btn8);
    frame.add(btn9);
    frame.add(pointBtn);


    // Action Listeners for buttons
    btn1.addActionListener(new ListenToOne());
    btn2.addActionListener(new ListenToTwo());
    btn3.addActionListener(new ListenToThree());
    btn4.addActionListener(new ListenToFour());
    btn5.addActionListener(new ListenToFive());
    btn6.addActionListener(new ListenToSix());
    btn7.addActionListener(new ListenToSeven());
    btn8.addActionListener(new ListenToEight());
    btn9.addActionListener(new ListenToNine());
    btn0.addActionListener(new ListenToZero());
    plusBtn.addActionListener(new ListenToAdd());
    minusBtn.addActionListener(new ListenToSubtract());
    multBtn.addActionListener(new ListenToMultiply());
    equalsBtn.addActionListener(new ListenToEquals());
    divBtn.addActionListener(new ListenToDivide());
    clearBtn.addActionListener(new ListenToClear());
    delBtn.addActionListener(new ListenToDelete());
    pointBtn.addActionListener(new ListenToPoint());

    frame.setSize(360, 420);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ListenToOne implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "1");
            }
    }

    class ListenToTwo implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "2");
            }
    }

    class ListenToThree implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "3");
            }
    }

    class ListenToFour implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "4");
            }
    }

    class ListenToFive implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "5");
            }
    }

    class ListenToSix implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "6");
            }
    }

    class ListenToSeven implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "7");
            }
    }

    class ListenToEight implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "8");
            }
    }

    class ListenToNine implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "9");
            }
    }

    class ListenToZero implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "0");
            }
    }

    class ListenToAdd implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "+");
            }
    }

    class ListenToSubtract implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "-");
            }
    }

    class ListenToMultiply implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "*");
            }
    }

    class ListenToDivide implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + "/");
            }
    }

    class ListenToPoint implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = screen.getText();
                screen.setText(display + ".");
            }
    }

    class ListenToEquals implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = screen.getText();
            String answerString = "";
            Parser p = new Parser();

            try {
                result = p.evaluate(display);
                if(result - Math.round(result) == 0) {
                    int result1 = (int) result;
                    answerString += result1;
                screen.setText(display + " = " + answerString);
                }
                else {
                    answerString += result;
                    screen.setText(display + " = " + answerString);
                }
            }
            catch(ParserException parseE) {
                JOptionPane.showMessageDialog(null, parseE);
            }
            
        }
    }

    class ListenToClear implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                screen.setText("");
            }
    }

    class ListenToDelete implements ActionListener {
         public void actionPerformed(ActionEvent e) {
            String str = screen.getText();
            int strLen = str.length();  
            if(strLen == 0) {
            }
            else {
                display = str.substring(0, strLen - 1);
                screen.setText(display);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }
}
