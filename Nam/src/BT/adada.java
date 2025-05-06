package BT;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class adada extends JFrame {
    public adada() {
        getContentPane().setLayout(null);
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thông tin sinh viên");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Họ và tên");
        nameLabel.setBounds(30, 20, 120, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 20, 200, 25);

        JLabel hometownLabel = new JLabel("Quê quán");
        hometownLabel.setBounds(30, 60, 120, 25);
        JTextField hometownField = new JTextField();
        hometownField.setBounds(160, 60, 200, 25);

        JLabel dobLabel = new JLabel("Ngày sinh");
        dobLabel.setBounds(30, 100, 150, 25);
        JTextField dobField = new JTextField();
        dobField.setBounds(160, 100, 200, 25);

        JButton exportButton = new JButton("Hiển thị bảng");
        exportButton.setBounds(120, 150, 150, 30);

        exportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String hometown = hometownField.getText().trim();
                String dob = dobField.getText().trim();

                if (name.isEmpty() || hometown.isEmpty() || dob.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng điền đầy đủ tất cả các mục.", "Thiếu thông tin", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (!name.matches("[\\p{L} ]+")) {
                    JOptionPane.showMessageDialog(frame, "Họ và tên chỉ được chứa chữ cái.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Kiểm tra định dạng dd/MM/yyyy
                if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                    JOptionPane.showMessageDialog(frame, "Ngày sinh phải theo định dạng dd/MM/yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Kiểm tra ngày hợp lệ
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                try {
                    sdf.parse(dob);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(frame, "Ngày sinh không hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Hiển thị dữ liệu trong bảng
                String[] columnNames = {"Họ và tên", "Quê quán", "Ngày sinh"};
                Object[][] data = {
                    {name, hometown, dob}
                };

                JTable table = new JTable(new DefaultTableModel(data, columnNames));
                JScrollPane scrollPane = new JScrollPane(table);

                JFrame tableFrame = new JFrame("Dữ liệu sinh viên");
                tableFrame.setSize(400, 200);
                tableFrame.add(scrollPane);
                tableFrame.setLocationRelativeTo(null);
                tableFrame.setVisible(true);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(hometownLabel);
        frame.add(hometownField);
        frame.add(dobLabel);
        frame.add(dobField);
        frame.add(exportButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
