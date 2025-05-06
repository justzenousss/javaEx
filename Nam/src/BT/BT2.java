package BT;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BT2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        // Tạo JFrame với tiêu đề
        JFrame frame = new JFrame("Exit Button Window");

        // Đặt kích thước cửa sổ
        frame.setSize(300, 200);

        // Căn giữa màn hình
        frame.setLocationRelativeTo(null);

        // Đóng ứng dụng khi bấm nút X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo nút Exit
        JButton exitButton = new JButton("Exit");

        // Thêm sự kiện khi nhấn nút
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Thoát chương trình
            }
        });

        // Thêm nút vào giữa cửa sổ
        frame.setLayout(new BorderLayout());
        frame.add(exitButton, BorderLayout.CENTER);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }

}
