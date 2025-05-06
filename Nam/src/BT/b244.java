package BT;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

import java.awt.*;

public class b244 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b244 frame = new b244();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public b244() {
		JFrame frame = new JFrame("JCheckBox Demo");
		frame.setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

        
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Úm ba la xì bùa");
		
		chckbxNewCheckBox.addActionListener(e -> {
            if (chckbxNewCheckBox.isSelected()) {
                contentPane.setBackground(Color.PINK); // Nền xanh
            } else {
                contentPane.setBackground(null); // Trở về mặc định
            }
        });


		
		chckbxNewCheckBox.setBounds(66, 52, 165, 48);
		contentPane.add(chckbxNewCheckBox);
	}
}
