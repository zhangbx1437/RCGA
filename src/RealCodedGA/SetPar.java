package RealCodedGA;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
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

public class SetPar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String mi1="0",mi2="0",mi3="0",mi4="0",mi5="0";
	public static String ma1="0",ma2="0",ma3="0",ma4="0",ma5="0";
	public static String Max="1";
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
		setBounds(100, 100, 299, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setFont(new Font("宋体", Font.PLAIN, 15));
		panel_1.add(lblMax);
		
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
		
		min1 = new JTextField();
		min1.setHorizontalAlignment(SwingConstants.CENTER);
		min1.setColumns(10);
		max1 = new JTextField();
		max1.setHorizontalAlignment(SwingConstants.CENTER);
		max1.setColumns(10);
		min1.setText(mi1);
		max1.setText(ma1);
//		pre1 = new JTextField();
//		pre1.setHorizontalAlignment(SwingConstants.CENTER);
//		pre1.setColumns(10);
//		pre1.setText(pr1);
		GroupLayout gl_par_x1 = new GroupLayout(par_x1);
		gl_par_x1.setHorizontalGroup(
			gl_par_x1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x1.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addGap(46)
					.addComponent(min1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(max1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
//					.addComponent(pre1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		gl_par_x1.setVerticalGroup(
			gl_par_x1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_par_x1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_par_x1.createParallelGroup(Alignment.BASELINE)
							.addComponent(min1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addComponent(pre1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(max1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_par_x1.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addContainerGap())))
		);
		par_x1.setLayout(gl_par_x1);
		btnNewButton = new JButton("Save");
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
		
		btnCancel = new JButton("Cancel");
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
		
//		pre2 = new JTextField();
//		pre2.setHorizontalAlignment(SwingConstants.CENTER);
//		pre2.setColumns(10);
//		pre2.setText(pr2);
		GroupLayout gl_par_x2 = new GroupLayout(par_x2);
		gl_par_x2.setHorizontalGroup(
			gl_par_x2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x2.createSequentialGroup()
					.addGap(36)
					.addComponent(lblX)
					.addGap(46)
					.addComponent(min2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(max2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
//					.addComponent(pre2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		gl_par_x2.setVerticalGroup(
			gl_par_x2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x2.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_par_x2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_par_x2.createParallelGroup(Alignment.BASELINE)
							.addComponent(min2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addComponent(pre2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(max2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_par_x2.createSequentialGroup()
							.addComponent(lblX, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addContainerGap())))
		);
		par_x2.setLayout(gl_par_x2);
		
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
		
//		pre3 = new JTextField();
//		pre3.setHorizontalAlignment(SwingConstants.CENTER);
//		pre3.setColumns(10);
//		pre3.setText(pr3);
		GroupLayout gl_par_x3 = new GroupLayout(par_x3);
		gl_par_x3.setHorizontalGroup(
			gl_par_x3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x3.createSequentialGroup()
					.addGap(36)
					.addComponent(lblX_1)
					.addGap(46)
					.addComponent(min3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(max3, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_par_x3.setVerticalGroup(
			gl_par_x3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x3.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_par_x3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_par_x3.createParallelGroup(Alignment.BASELINE)
							.addComponent(max3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(min3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_par_x3.createSequentialGroup()
							.addComponent(lblX_1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addContainerGap())))
		);
		par_x3.setLayout(gl_par_x3);
		
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
		
//		pre4 = new JTextField();
//		pre4.setHorizontalAlignment(SwingConstants.CENTER);
//		pre4.setColumns(10);
//		pre4.setText(pr4);
		GroupLayout gl_par_x4 = new GroupLayout(par_x4);
		gl_par_x4.setHorizontalGroup(
			gl_par_x4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x4.createSequentialGroup()
					.addGap(36)
					.addComponent(lblX_2)
					.addGap(46)
					.addComponent(min4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(max4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
//					.addComponent(pre4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		gl_par_x4.setVerticalGroup(
			gl_par_x4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x4.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_par_x4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_par_x4.createParallelGroup(Alignment.BASELINE)
							.addComponent(min4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addComponent(pre4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(max4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_par_x4.createSequentialGroup()
							.addComponent(lblX_2, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addContainerGap())))
		);
		par_x4.setLayout(gl_par_x4);
		
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
		
//		pre5 = new JTextField();
//		pre5.setHorizontalAlignment(SwingConstants.CENTER);
//		pre5.setColumns(10);
//		pre5.setText(pr5);
		GroupLayout gl_par_x5 = new GroupLayout(par_x5);
		gl_par_x5.setHorizontalGroup(
			gl_par_x5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x5.createSequentialGroup()
					.addGap(36)
					.addComponent(lblX_3)
					.addGap(46)
					.addComponent(min5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(max5, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
//					.addComponent(pre5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		gl_par_x5.setVerticalGroup(
			gl_par_x5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_par_x5.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_par_x5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_par_x5.createParallelGroup(Alignment.BASELINE)
							.addComponent(min5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addComponent(pre5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(max5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_par_x5.createSequentialGroup()
							.addComponent(lblX_3, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addContainerGap())))
		);
		par_x5.setLayout(gl_par_x5);
		
		lblMaximumIterations = new JLabel("Maximum Iterations:");
		lblMaximumIterations.setFont(new Font("宋体", Font.PLAIN, 14));
		
		MaxIter = new JTextField();
		MaxIter.setHorizontalAlignment(SwingConstants.CENTER);
		MaxIter.setColumns(10);
		MaxIter.setText(Max);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(par_x1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(par_x2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(par_x3, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(par_x4, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(par_x5, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMaximumIterations, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(MaxIter, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(numofPar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancel)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(numofPar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaximumIterations, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(MaxIter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(par_x1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(par_x2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(par_x3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(par_x4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(par_x5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnCancel)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
