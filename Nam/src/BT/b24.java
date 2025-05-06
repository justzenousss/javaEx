package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class b24 extends JFrame {
	public b24() {
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		JFrame frame = new JFrame("JCheckBox Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JCheckBox checkBox = new JCheckBox("Enable Background");
        checkBox.setBounds(50, 70, 200, 30);

	checkBox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (checkBox.isSelected()) {
                frame.getContentPane().setBackground(Color.CYAN);
            } else {
                frame.getContentPane().setBackground(null);
            }
        }
    });
	

    // Thêm checkbox vào frame
    frame.getContentPane().add(checkBox);

    // Hiển thị cửa sổ
    frame.setVisible(true);
}

}
