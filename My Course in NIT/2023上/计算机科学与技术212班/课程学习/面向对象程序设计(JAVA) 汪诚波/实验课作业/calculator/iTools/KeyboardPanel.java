
package study.Java.Calculator.iTools;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class KeyboardPanel extends JPanel {
    private ArrayList<JButton> keyboard;

    public ArrayList<JButton> getKeyboard() {
        return keyboard;
    }

    public KeyboardPanel() {
        keyboard = new ArrayList<>();
        String[] str = {
                "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "CE", ".", "/",
                "退格", "退出", "%", "=", "CE", "空格"};
        setLayout(new GridLayout(6, 4, 2, 3));
        for (int i = 0; i < str.length; i++) {
            keyboard.add(new JButton(str[i]));
            keyboard.get(i).setFont(new Font("宋体", Font.BOLD, 20));
            this.add(keyboard.get(i));
        }
    }


}
