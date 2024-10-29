package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class From_trangHome extends JFrame  implements ActionListener, MouseListener{
	
	private JMenu mnBaoBieu;
	private JMenuItem mnThongKeDT;
	private JMenu mnXuLy;
	private JMenuItem mnDatVe;

	private JMenu mnDanhMuc;
	private JMenuItem mndsPhim;
	private JMenuItem mnPhimDangChieu;
	
	private JMenu mnCV;
	private JMenuItem mnThongTinCaNhan;
	private JMenuItem mnDangXuat;
	private JMenu mnHome;
	private JPanel panelCenter;
	
	public From_trangHome() {
		setBackground(new Color(64, 64, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1100, 750);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("ABK START CINEMA");
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);

		JLabel lblNewLabel_2 = new JLabel("       ");
		menuBar.add(lblNewLabel_2);

		mnHome = new JMenu("ABK START CINEMA");
		mnHome.setForeground(new Color(0, 0, 0));
		mnHome.setFont(new Font("Heebo", Font.BOLD, 18));
		
		ImageIcon originalIcon = new ImageIcon("src\\img\\logo.png");
		Image resizedImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		mnHome.setIcon(new ImageIcon(resizedImage));
		menuBar.add(mnHome);

		//thanh menu
		JLabel lblNewLabel_1 = new JLabel("               ");
		menuBar.add(lblNewLabel_1);


		
		mnDanhMuc = new JMenu("Danh Mục");
		mnDanhMuc.setPreferredSize(new Dimension(150, 40));
		mnDanhMuc.setIcon(new ImageIcon("src\\img\\danh-muc.png"));
		mnDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnDanhMuc);

		mndsPhim = new JMenuItem("Danh Sách Phim");
		mndsPhim.setPreferredSize(new Dimension(147, 40));
		mndsPhim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnDanhMuc.add(mndsPhim);

		mnPhimDangChieu = new JMenuItem("Phim Đang Chiếu");
		mnPhimDangChieu.setPreferredSize(new Dimension(147, 40));
		mnPhimDangChieu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnDanhMuc.add(mnPhimDangChieu);

		mnXuLy = new JMenu("Xử Lý");
		mnXuLy.setPreferredSize(new Dimension(150, 40));
		mnXuLy.setIcon(new ImageIcon("src\\img\\xu-li.png"));
		mnXuLy.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnXuLy);

		mnDatVe = new JMenuItem("Đặt vé");
		mnDatVe.setPreferredSize(new Dimension(147, 40));
		mnDatVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnXuLy.add(mnDatVe);








		mnBaoBieu = new JMenu("Báo Biểu");
		mnBaoBieu.setPreferredSize(new Dimension(150, 40));
		mnBaoBieu.setIcon(new ImageIcon("src\\img\\bao-bieu.png"));
		mnBaoBieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnBaoBieu);

		mnThongKeDT = new JMenuItem("Thống kê doanh thu");
		mnThongKeDT.setPreferredSize(new Dimension(147, 40));
		mnThongKeDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnBaoBieu.add(mnThongKeDT);

		JLabel lblNewLabel = new JLabel("                                       "
				+ "                                               ");
		menuBar.add(lblNewLabel);

		mnCV = new JMenu("");
		mnCV.setPreferredSize(new Dimension(150, 40));
		mnCV.setIcon(
				new ImageIcon("src\\img\\user.png"));
		mnCV.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnCV);
		
		
		mnThongTinCaNhan = new JMenuItem("Hồ Sơ Cá Nhân");
		mnThongTinCaNhan.setPreferredSize(new Dimension(147, 40));
		mnThongTinCaNhan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnCV.add(mnThongTinCaNhan);
		mnDangXuat = new JMenuItem("Đăng Xuất");
		mnDangXuat.setPreferredSize(new Dimension(147, 40));
		mnDangXuat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnCV.add(mnDangXuat);
		// het thanh menu
		
		mnHome.addActionListener(this);
		mndsPhim.addActionListener(this);
		mnPhimDangChieu.addActionListener(this);
		mnDatVe.addActionListener(this);
		mnThongKeDT.addActionListener(this);
		mnThongTinCaNhan.addActionListener(this);
		mnDangXuat.addActionListener(this);
		
		
		
		
		panelCenter = new JPanel();
//        panelCenter.setBackground(new Color(255, 234, 234));
		panelCenter.setLayout(new BorderLayout());
		panelCenter.setPreferredSize(new Dimension(1100, 700));
        getContentPane().add(panelCenter, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		From_trangHome home = new From_trangHome();
		home.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	    Object o = e.getSource();
	    if (o == mndsPhim) {  
	        System.out.println("Màn hình danh sách phim được chọn");
	        panelCenter.removeAll();
	        panelCenter.add(new From_danhSachPhim(), BorderLayout.CENTER);
	        validate();
	        repaint();

	    }
	}

	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
