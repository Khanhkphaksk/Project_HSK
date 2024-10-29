package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class From_ThongTinPhim1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTheLoai;
	private JTextField txtDaoDien;
	private JTextField txtThoiLuong;
	private JTextField txtMoTa;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					From_ThongTinPhim1 frame = new From_ThongTinPhim1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public From_ThongTinPhim1() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1100, 700);
		setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(240, 240, 240));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Thông tin Phim");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setIcon(new ImageIcon("src\\img\\list.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src\\img\\MoDomDom.jpg"));
		
		JLabel lblNewLabel_2 = new JLabel("MỘ ĐOM ĐÓM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_2.setForeground(Color.BLACK);
		
		JLabel lblTheLoai = new JLabel("Thể loại: ");
		lblTheLoai.setForeground(Color.BLACK);
		lblTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtTheLoai = new JTextField();
		txtTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTheLoai.setEditable(false);
		txtTheLoai.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Đạo Diễn:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_4_1 = new JLabel("Thời lượng: ");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtDaoDien = new JTextField();
		txtDaoDien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtDaoDien.setEditable(false);
		txtDaoDien.setColumns(10);
		
		txtThoiLuong = new JTextField();
		txtThoiLuong.setEditable(false);
		txtThoiLuong.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtThoiLuong.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Mô Tả: ");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtMoTa = new JTextField();
		txtMoTa.setEditable(false);
		txtMoTa.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMoTa.setColumns(10);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Lịch Chiếu: ");
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnThu2 = new JButton("28/10 Thứ Hai");
		btnThu2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnThu4 = new JButton("30/10 Thứ Tư");
		btnThu4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnThu6 = new JButton("32/10 Thứ 6");
		btnThu6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnthu7 = new JButton("33/10 Thứ 7");
		btnthu7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnchunhat = new JButton("34/10 Chủ nhật");
		btnchunhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Giờ Chiếu: ");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btngioChieu1 = new JButton("10:30");
		btngioChieu1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btngiocchieu2 = new JButton("14:30");
		btngiocchieu2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btngioChieu3 = new JButton("17:30");
		btngioChieu3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnGioChieu4 = new JButton("19:30");
		btnGioChieu4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnGioChieu5 = new JButton("22:30");
		btnGioChieu5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnNewButton_1_5_1 = new JButton("Next");
		btnNewButton_1_5_1.setIcon(new ImageIcon("src\\img\\arrow-circle-right.png"));
		btnNewButton_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(66)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTheLoai)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_4_1)
										.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
											.addComponent(txtDaoDien)
											.addComponent(txtTheLoai, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
											.addComponent(txtThoiLuong))
										.addComponent(txtMoTa, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4_1_1_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(btngioChieu1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addGap(27)
											.addComponent(btngiocchieu2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addGap(28)
											.addComponent(btngioChieu3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnGioChieu4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(btnThu2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
											.addGap(30)
											.addComponent(btnThu4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
											.addGap(48)
											.addComponent(btnThu6, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
									.addGap(30)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addComponent(btnthu7, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(17)
											.addComponent(btnGioChieu5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(39)
											.addComponent(btnchunhat, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(121)
											.addComponent(btnNewButton_1_5_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap(1089, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(63)
							.addComponent(lblNewLabel_2)
							.addGap(32)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(lblTheLoai)
									.addGap(18)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4)
										.addComponent(txtDaoDien, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(txtTheLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(41)))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtThoiLuong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(33)
									.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(27)
									.addComponent(txtMoTa, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))))
					.addGap(41)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThu2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThu4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThu6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnthu7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnchunhat, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(lblNewLabel_4_1_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(btngioChieu1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btngiocchieu2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btngioChieu3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnGioChieu4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnGioChieu5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1_5_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(71))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(new Color(64, 64, 64));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		add(contentPane);
	}
}
