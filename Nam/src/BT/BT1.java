package BT;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BT1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        // Tạo cửa sổ JFrame với tiêu đề
        JFrame frame = new JFrame("My First Swing App");

        // Tạo JLabel với nội dung "Hello World"
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // Thêm JLabel vào frame
        frame.add(label);

        // Đặt kích thước 400x500
        frame.setSize(400, 500);

        // Đóng ứng dụng khi bấm nút X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Căn giữa cửa sổ trên màn hình
        frame.setLocationRelativeTo(null);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }

	/**
	 * Create the frame.
	 */
	
}
