package RealCodedGA;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class SetPar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String mi1="0",mi2="0",mi3="0",mi4="0",mi5="0";
	public static String ma1="0",ma2="0",ma3="0",ma4="0",ma5="0";
	public static String Max="1";
	public static String numofind="2";
//	public static String pr1="0",pr2="0",pr3="0",pr4="0",pr5="0";
	public static JPanel contentPane;
	public static JTextField min1;
	public static JTextField max1;
//	public static JTextField pre1;
	public static JPanel par_x1;
	public static JTextField min2;
	public static JTextField max2;
//	public static JTextField pre2;
	public static JTextField min3;
	public static JTextField max3;
//	public static JTextField pre3;
	public static JTextField min4;
	public static JTextField max4;
//	public static JTextField pre4;
	public static JTextField min5;
	public static JTextField max5;
//	public static JTextField pre5;
	public static JPanel par_x2;
	public static JPanel par_x3;
	public static JPanel par_x4;
	public static JPanel par_x5;
	public static JSpinner numofPar;
	public static int numberofpar=2;
	public static int parnum=2;                //参数个数

	private JButton btnNewButton;
	private JButton btnCancel;
	private JLabel lblMaximumIterations;
	public static JTextField MaxIter;
	public static JTextField numofInd;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SetPar frame = new SetPar();
//					frame.setVisible(true);
////					System.out.println(Def.parnum);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SetPar() {
		setTitle("Set Parameters");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setHorizontalAlignment(SwingConstants.CENTER);
		lblMax.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setFont(new Font("宋体", Font.PLAIN, 15));
		panel_2.add(lblMin);
		
//		JLabel lblPrecision = new JLabel("Precision");
//		lblPrecision.setFont(new Font("宋体", Font.PLAIN, 15));
//		panel_3.add(lblPrecision);
		
		JPanel panel = new JPanel();
		
		JLabel lblParameter = new JLabel("Parameter");
		panel.add(lblParameter);
		lblParameter.setFont(new Font("宋体", Font.PLAIN, 15));
		
		par_x1 = new JPanel();

		JLabel lblNewLabel = new JLabel("x1");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Number of Parameters:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		numofPar = new JSpinner();
		numofPar.setModel(new SpinnerNumberModel(2, 2, 5, 1));
		numofPar.setValue(parnum);
		numofPar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				switch (Integer.parseInt(String.valueOf(numofPar.getValue()))) {
				case 2:
					par_x2.setVisible(true);
					par_x3.setVisible(false);
					par_x4.setVisible(false);
					par_x5.setVisible(false);
					break;
				case 3:
					par_x2.setVisible(true);
					par_x3.setVisible(true);
					par_x4.setVisible(false);
					par_x5.setVisible(false);
					break;
				case 4:
					par_x2.setVisible(true);
					par_x3.setVisible(true);
					par_x4.setVisible(true);
					par_x5.setVisible(false);
					break;
				case 5:
					par_x2.setVisible(true);
					par_x3.setVisible(true);
					par_x4.setVisible(true);
					par_x5.setVisible(true);
					break;
				
				} 
			}
		});
		
		numberofpar=Integer.parseInt(String.valueOf(numofPar.getValue()));
//		System.out.println();
		par_x2 = new JPanel();
		par_x2.setVisible(false);
		JLabel lblX = new JLabel("x2");
		lblX.setFont(new Font("宋体", Font.PLAIN, 14));
		
		min2 = new JTextField();
		min2.setHorizontalAlignment(SwingConstants.CENTER);
		min2.setColumns(10);
		min2.setText(mi2);
		
		max2 = new JTextField();
		max2.setHorizontalAlignment(SwingConstants.CENTER);
		max2.setColumns(10);
		max2.setText(ma2);
		
		par_x3 = new JPanel();
		par_x3.setVisible(false);
		JLabel lblX_1 = new JLabel("x3");
		lblX_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		min3 = new JTextField();
		min3.setHorizontalAlignment(SwingConstants.CENTER);
		min3.setColumns(10);
		min3.setText(mi3);
		
		max3 = new JTextField();
		max3.setHorizontalAlignment(SwingConstants.CENTER);
		max3.setColumns(10);
		max3.setText(ma3);
		
		par_x4 = new JPanel();
		par_x4.setVisible(false);
		JLabel lblX_2 = new JLabel("x4");
		lblX_2.setFont(new Font("宋体", Font.PLAIN, 14));
		
		min4 = new JTextField();
		min4.setHorizontalAlignment(SwingConstants.CENTER);
		min4.setColumns(10);
		min4.setText(mi4);
		
		max4 = new JTextField();
		max4.setHorizontalAlignment(SwingConstants.CENTER);
		max4.setColumns(10);
		max4.setText(ma4);
		
		par_x5 = new JPanel();
		par_x5.setVisible(false);
		JLabel lblX_3 = new JLabel("x5");
		lblX_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		min5 = new JTextField();
		min5.setHorizontalAlignment(SwingConstants.CENTER);
		min5.setColumns(10);
		min5.setText(mi5);
		
		max5 = new JTextField();
		max5.setHorizontalAlignment(SwingConstants.CENTER);
		max5.setColumns(10);
		max5.setText(ma5);
		
		lblMaximumIterations = new JLabel("Maximum Iterations:");
		lblMaximumIterations.setFont(new Font("宋体", Font.PLAIN, 14));
		
		MaxIter = new JTextField();
		MaxIter.setHorizontalAlignment(SwingConstants.CENTER);
		MaxIter.setColumns(10);
		MaxIter.setText(Max);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Individuals: ");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		
		numofInd = new JTextField();
		numofInd.setHorizontalAlignment(SwingConstants.CENTER);
		numofInd.setText(numofind);
		numofInd.setColumns(10);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, par_x1, -6, SpringLayout.NORTH, par_x2);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, -46, SpringLayout.EAST, numofPar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, par_x1, 0, SpringLayout.EAST, par_x2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, numofPar);
		sl_contentPane.putConstraint(SpringLayout.WEST, MaxIter, 183, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMaximumIterations, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblMaximumIterations, -10, SpringLayout.WEST, MaxIter);
		sl_contentPane.putConstraint(SpringLayout.EAST, MaxIter, -40, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, numofInd, 10, SpringLayout.EAST, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, numofInd, -40, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, numofPar, 24, SpringLayout.EAST, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, numofPar, -40, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, numofInd, 2, SpringLayout.NORTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, MaxIter, 23, SpringLayout.NORTH, lblMaximumIterations);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, numofPar, 3, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, MaxIter, 0, SpringLayout.NORTH, lblMaximumIterations);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMaximumIterations, 8, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblMaximumIterations, -4, SpringLayout.NORTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 65, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, numofPar, -4, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 16, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, par_x5, 276, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, par_x5, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, par_x5, 309, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, par_x5, 272, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, par_x4, 239, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, par_x4, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, par_x4, 272, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, par_x4, 272, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, par_x3, 202, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, par_x3, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, par_x3, 235, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, par_x3, 272, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, par_x2, 165, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, par_x2, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, par_x2, 198, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, par_x2, 272, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, par_x1, 128, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, par_x1, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_2, 96, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_2, 116, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_2, 173, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 96, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 102, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(panel);
		contentPane.add(panel_2);
		contentPane.add(panel_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(lblMax)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lblMax)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.add(par_x1);
		
		min1 = new JTextField();
		min1.setHorizontalAlignment(SwingConstants.CENTER);
		min1.setColumns(10);
		min1.setText(mi1);
		max1 = new JTextField();
		max1.setHorizontalAlignment(SwingConstants.CENTER);
		max1.setColumns(10);
		max1.setText(ma1);
		GroupLayout gl_par_x1 = new GroupLayout(par_x1);
		gl_par_x1.setHorizontalGroup(
			gl_par_x1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x1.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel)
					.addGap(54)
					.addComponent(min1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(max1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_par_x1.setVerticalGroup(
			gl_par_x1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_par_x1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(max1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(min1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		par_x1.setLayout(gl_par_x1);
		contentPane.add(par_x2);
		GroupLayout gl_par_x2 = new GroupLayout(par_x2);
		gl_par_x2.setHorizontalGroup(
			gl_par_x2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x2.createSequentialGroup()
					.addGap(39)
					.addComponent(lblX)
					.addGap(54)
					.addComponent(min2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(max2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_par_x2.setVerticalGroup(
			gl_par_x2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_par_x2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblX)
						.addComponent(max2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(min2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		par_x2.setLayout(gl_par_x2);
		contentPane.add(par_x3);
		GroupLayout gl_par_x3 = new GroupLayout(par_x3);
		gl_par_x3.setHorizontalGroup(
			gl_par_x3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x3.createSequentialGroup()
					.addGap(39)
					.addComponent(lblX_1)
					.addGap(54)
					.addComponent(min3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(max3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_par_x3.setVerticalGroup(
			gl_par_x3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x3.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_par_x3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblX_1)
						.addGroup(gl_par_x3.createParallelGroup(Alignment.BASELINE)
							.addComponent(min3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(max3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		par_x3.setLayout(gl_par_x3);
		contentPane.add(par_x4);
		GroupLayout gl_par_x4 = new GroupLayout(par_x4);
		gl_par_x4.setHorizontalGroup(
			gl_par_x4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x4.createSequentialGroup()
					.addGap(39)
					.addComponent(lblX_2)
					.addGap(54)
					.addComponent(min4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(max4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_par_x4.setVerticalGroup(
			gl_par_x4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x4.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_par_x4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblX_2)
						.addGroup(gl_par_x4.createParallelGroup(Alignment.BASELINE)
							.addComponent(max4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(min4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		par_x4.setLayout(gl_par_x4);
		contentPane.add(par_x5);
		GroupLayout gl_par_x5 = new GroupLayout(par_x5);
		gl_par_x5.setHorizontalGroup(
			gl_par_x5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x5.createSequentialGroup()
					.addGap(39)
					.addComponent(lblX_3)
					.addGap(54)
					.addComponent(min5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(max5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_par_x5.setVerticalGroup(
			gl_par_x5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x5.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_par_x5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblX_3)
						.addGroup(gl_par_x5.createParallelGroup(Alignment.BASELINE)
							.addComponent(max5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(min5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		par_x5.setLayout(gl_par_x5);
		contentPane.add(lblNewLabel_1);
		contentPane.add(numofPar);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblMaximumIterations);
		contentPane.add(numofInd);
		contentPane.add(MaxIter);
		btnNewButton = new JButton("Save");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 19, SpringLayout.SOUTH, par_x5);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, panel_2);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				parnum=(int) numofPar.getValue();
				mi1=min1.getText();
				mi2=min2.getText();
				mi3=min3.getText();
				mi4=min4.getText();
				mi5=min5.getText();
				ma1=max1.getText();
				ma2=max2.getText();
				ma3=max3.getText();
				ma4=max4.getText();
				ma5=max5.getText();
				Max=MaxIter.getText();
				numofind=numofInd.getText();
//				pr1=pre1.getText();
//				pr2=pre2.getText();
//				pr3=pre3.getText();
//				pr4=pre4.getText();
//				pr5=pre5.getText();
//				Def.anum[1]=(int) ((Integer.parseInt(max2.getText())-Integer.parseInt(min2.getText()))/(Double.parseDouble(pre2.getText())));
//				Def.anum[2]=(int) ((Integer.parseInt(max3.getText())-Integer.parseInt(min3.getText()))/(Double.parseDouble(pre3.getText())));
//				Def.anum[3]=(int) ((Integer.parseInt(max4.getText())-Integer.parseInt(min4.getText()))/(Double.parseDouble(pre4.getText())));
//				Def.anum[4]=(int) ((Integer.parseInt(max5.getText())-Integer.parseInt(min5.getText()))/(Double.parseDouble(pre5.getText())));
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton);
		
		btnCancel = new JButton("Cancel");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancel, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCancel, 0, SpringLayout.WEST, panel_1);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel);
	}
}
