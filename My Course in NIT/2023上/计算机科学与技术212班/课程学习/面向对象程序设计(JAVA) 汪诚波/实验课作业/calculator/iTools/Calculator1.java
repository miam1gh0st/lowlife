package study.Java.Calculator.iTools;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculator1 extends JFrame {
    public JTextField tResult;
    public JPanel pCenter;
    public Font f1;
    public ArrayList<JButton> num;



    public Calculator1() {
        setTitle("计算器");
        this.setSize(400, 200);

        pCenter = new JPanel();
        this.setLayout(new BorderLayout());
        add(new JTextField(), "North");
        add(pCenter, "Center");


        setSize(450, 400);
        f1 = new Font("宋体", Font.BOLD, 20);
        tResult = new JTextField("0", 26);
        tResult.setHorizontalAlignment(JTextField.RIGHT);
        tResult.setEditable(false);
        setFont(new Font("宋体", Font.BOLD, 20));
        tResult.setFont(f1);
        add(tResult, BorderLayout.NORTH);

        pCenter.setLayout(new GridLayout(5, 4, 2, 3));
        num = new ArrayList<>();
        String[] str= {
                "1","2","3","+","4","5","6","-","7","8","9","*","0","%",".","/","退格","退出","CE","="
        };
        for (int i = 0; i < str.length; i++) {
            JButton temp=new JButton(str[i]);
            num.add(temp);
            temp.setFont(f1);
            pCenter.add(temp);
        }
        add(pCenter);
        setVisible(true);
    }

}

