
package study.Java.Calculator.iTools;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ActiveCal implements ActionListener {
    private Calculator1 cal;

    public ActiveCal() {
        cal = new Calculator1();
        cal.setVisible(true);
        for (JButton button : cal.num)
            button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String result = cal.tResult.getText();
        if (Character.isDigit(s.charAt(0))) {
            if (result.equals("0"))
                cal.tResult.setText(s);
            else
                cal.tResult.setText(result + s);
        } else if (s.equals("CE"))
            cal.tResult.setText("0");
        else if (s.equals("退格")) {
            if (result.length() > 1)
                cal.tResult.setText(result.substring(0, result.length() - 1));
            else
                cal.tResult.setText("0");
        } else if (s.equals("%"))
            cal.tResult.setText(result + "%");
        else if (s.equals("+"))
            cal.tResult.setText(result + "+");
        else if (s.equals("-"))
            cal.tResult.setText(result + "-");
        else if (s.equals("*"))
            cal.tResult.setText(result + "*");
        else if (s.equals("/"))
            cal.tResult.setText(result + "/");
        else if (s.equals("退出"))
            System.exit(0);
    }
}