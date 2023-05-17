
package study.Java.Calculator.iTools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActiveCalculator implements ActionListener {
    private Calculator1 c2;
    private int stateFlag;
    private double resultNum;
    private String operate;
    private double firstNum;
    private double secondNum;

    public ActiveCalculator() {
        stateFlag = 0;//状态值
        resultNum = 0;//结果值
        operate = "";//  1："+",2:"-",3:"*",4:"/"
        firstNum = 0;
        secondNum = 0;
        c2 = new Calculator1();
        for (JButton button : c2.num)
            button.addActionListener(this);
    }

    private void optorHandle(String s) {
        if (stateFlag == 1) {//第1状态
            operate = s;
            firstNum = Double.parseDouble(c2.tResult.getText());
            stateFlag = 2; //第1状态到2状态迁移
            c2.tResult.setText(s);
        } else if (stateFlag == 2) {//第2状态
            operate = s;
            c2.tResult.setText(s);
        } else if (stateFlag == 3) {//第3状态
            operate = s;
            caltorHandle();
//            stateFlag = 4;//第3状态到4状态迁移
        } else if (stateFlag == 4) {//第4状态
            operate = s;
            firstNum = resultNum;
            stateFlag = 2;
            c2.tResult.setText(s);
        }
    }


    private void digitHandle(String s) {
        String result = c2.tResult.getText();
        switch (stateFlag) {
            case 0:
            case 4: {
                c2.tResult.setText(s);
                stateFlag = 1;//状态迁移到1
                break;
            }
            case 2: {
                c2.tResult.setText(s);
                stateFlag = 3;
                break;
            }
            case 1:
            case 3: {
                if (result.equals("0") || result.equals("0.0")) c2.tResult.setText(s);
                else c2.tResult.setText(result + s);
                break;
            }
            default: {
            }
        }
    }

    public void caltorHandle() {
        if (stateFlag == 3) secondNum = Double.parseDouble(c2.tResult.getText());
        switch (operate) {
            case "+" -> resultNum = firstNum + secondNum;
            case "-" -> resultNum = firstNum - secondNum;
            case "*" -> resultNum = firstNum * secondNum;
            case "/" -> resultNum = firstNum / secondNum;
        }
        c2.tResult.setText(String.valueOf(resultNum));
        stateFlag = 4;
    }

    public void actionPerformed(ActionEvent e) {
        String result = c2.tResult.getText();

        String s = e.getActionCommand();//按钮上面串
        if (Character.isDigit(s.charAt(0))) {
            digitHandle(s);
        } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            optorHandle(s);
        } else if (s.equals("=")) {
            caltorHandle();
        } else if (s.equals("CE")) {
            c2.tResult.setText("0");
            firstNum = 0;
            secondNum = 0;
            resultNum = 0;
            operate = "";
            stateFlag = 0;
        } else if (s.equals("退格")) {
            if (result.length() > 1) c2.tResult.setText(result.substring(0, result.length() - 1));
            else c2.tResult.setText("0");
        } else if (s.equals("退出")) System.exit(0);
    }
}
