package RealCodedGA;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;

import org.math.plot.Plot2DPanel;

import bsh.EvalError;
import bsh.Interpreter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;



class Def{
	public static String func;                                                              //函数表达式
	public double [] min={Double.parseDouble(SetPar.min1.getText()),
						  Double.parseDouble(SetPar.min2.getText()),
						  Double.parseDouble(SetPar.min3.getText()),
						  Double.parseDouble(SetPar.min4.getText()),
						  Double.parseDouble(SetPar.min5.getText())};                       //参数的取值下界
	public double [] max={Double.parseDouble(SetPar.max1.getText()),
					 	  Double.parseDouble(SetPar.max2.getText()),
					 	  Double.parseDouble(SetPar.max3.getText()),
					 	  Double.parseDouble(SetPar.max4.getText()),
					 	  Double.parseDouble(SetPar.max5.getText())};                       //参数的取值上界
//	public double [] pre={Double.parseDouble(SetPar.pre1.getText()),
//						  Double.parseDouble(SetPar.pre2.getText()),
//						  Double.parseDouble(SetPar.pre3.getText()),
//						  Double.parseDouble(SetPar.pre4.getText()),
//						  Double.parseDouble(SetPar.pre5.getText())};                      //精度
//	public static int anum;
//	public int a=cala(anum);                 //a为个体的位数
	public int num=Integer.parseInt(SetPar.numofind);                        //种群中的个体数
	double[] fits = new double[num];          //个体适应值
	double[] fits1 = new double[num];
	int number[]=new int[num];
	public double best[]=new double[SetPar.parnum];                 //最适应个体
	double[] p = new double[num];            //个体适应值占适应值总和的概率
	double[] q = new double[num];            //概率和
	public double fitness=0;                 //最适应值
	public double[][] initialpops =new double[num][SetPar.parnum];      //初始种群
	public int generation;                   //最适应值在种群中的位置
//	public int cala(int a){                  //计算转换为二进制需要的位数
//		if (a==0) {
//			return 0;
//		} else {
//			int i=0;
//			while ((int) Math.pow(2, i)<a) {
//		    i++;
//				
//			}
//			return i;
//		}
//		
//	}
	
//	public String initialPop() {             //初始化一个个体
//		String b=""; 
//		for (int i = 0; i < a; i++){
//			if (Math.random()>0.5) {
//			b=b+"0";
//			}
//		else {
//			b=b+"1";
//		 	}
//		}
//			return b;	
//	}
	public void initial() {         //初始化一个种群
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < SetPar.parnum; j++) {
				initialpops[i][j]=min[j]+(max[j]-min[j])*Math.random();                                               //不考虑精度
//				initialpops[i][j]=Double.valueOf((int)(min[j]+(max[j]-min[j])*Math.random())/pre[j])*pre[j];          //产生区间内的随机数，符合精度
				System.out.print(initialpops[i][j]+"   ");
			}
			System.out.println("  ");
		}
	}
	public double popToNumber(double str1, double str2) {             //将输入字符串转为函数表达式,返回适应值
		String s1=Double.toString(str1);
		String s2=Double.toString(str2);
		String f=func.replaceAll("x1",s1);
		f=f.replaceAll("x2",s2);
		Interpreter inter=new Interpreter();
//			System.out.println(func);
			double fit = 0;
			try {
				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
			} catch (EvalError e) {
			}
			return fit;

	}
	public double popToNumber(double str1, double str2, double str3) {             //将输入字符串转为函数表达式,返回适应值
		String s1=Double.toString(str1);
		String s2=Double.toString(str2);
		String s3=Double.toString(str3);
		String f=func.replaceAll("x1",s1);
		f=f.replaceAll("x2",s2);
		f=f.replaceAll("x3",s3);
		Interpreter inter=new Interpreter();
//			System.out.println(func);
			double fit = 0;
			try {
				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
			} catch (EvalError e) {
			}
			return fit;

	}
	public double popToNumber(double str1, double str2, double str3, double str4) {             //将输入字符串转为函数表达式,返回适应值
		String s1=Double.toString(str1);
		String s2=Double.toString(str2);
		String s3=Double.toString(str3);
		String s4=Double.toString(str4);
		String f=func.replaceAll("x1",s1);
		f=f.replaceAll("x2",s2);
		f=f.replaceAll("x3",s3);
		f=f.replaceAll("x4",s4);
		Interpreter inter=new Interpreter();
//			System.out.println(func);
			double fit = 0;
			try {
				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
			} catch (EvalError e) {
			}
			return fit;

	}
	public double popToNumber(double str1, double str2, double str3, double str4, double str5) {             //将输入字符串转为函数表达式,返回适应值
		String s1=Double.toString(str1);
		String s2=Double.toString(str2);
		String s3=Double.toString(str3);
		String s4=Double.toString(str4);
		String s5=Double.toString(str5);
		String f=func.replaceAll("x1",s1);
		f=f.replaceAll("x2",s2);
		f=f.replaceAll("x3",s3);
		f=f.replaceAll("x4",s4);
		f=f.replaceAll("x5",s5);
		Interpreter inter=new Interpreter();
//			System.out.println(func);
			double fit = 0;
			try {
				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
			} catch (EvalError e) {
			}
			return fit;

	}
	//	public double Decode(String str){           //解码，二进制字符串转为对应的实数
//		String s=str;
//		double dec=min+pre*Integer.parseInt(s);
//		return dec;
//	}
	public void select(){                  //计算种群每个个体的适应值
		
//		fun[0]=func.replaceAll("x1", String.valueOf(Integer.parseInt(c[0], 2)));
//		Interpreter inter=new Interpreter();
//		
////			System.out.println(func);
//			try {
//				fitness = (double) inter.eval(fun[0]);
//			} catch (EvalError e) {
//
//			}
		int seq[]=new int[num];
		Random random=new Random();
		
		for (int i = 0; i < num; i++) {
			switch (SetPar.parnum) {
			case 2:
				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1]);
				break;
			case 3:
				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2]);
				break;
			case 4:
				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3]);
				break;
			case 5:
				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3],initialpops[i][4]);
				break;
			}
		}	
			//锦标赛法选择
		for (int i = 0; i < seq.length; i++) {
			int randnum=random.nextInt(num);	
			if (fits[i]<fits[randnum]) {
				for (int j = 0; j < SetPar.parnum; j++) {
					initialpops[i][j]=initialpops[randnum][j];
				}
			}
		}
			
			
//			fits1[i]=fits[i]+Math.exp(20);
//			F = F+fits1[i];
		
//		for (int i = 0; i < num; i++) {
//			fits1[i]=fits[i];
//		}
//		HashMap<Double, Integer> map=new HashMap<Double, Integer>();
//		for (int i = 0; i < num; i++) {
//			map.put(fits1[i], i);
//		}
//		Arrays.sort(fits1);
//		for (int i = 0; i < num; i++) {
//			System.out.println(fits[i]);
//		}
//		for (int i = 0; i < num; i++) {
//			number[i]=map.get(fits1[i]);
//			System.out.println(number[i]);
//		}
//		for (int i = 0; i < num; i++) {
//			System.out.println(fits[number[i]]);
//		}
//		for (int i = 0; i < num; i++) {
//			F=F+i+1;
//		}
//		System.out.println(F);
//		for (int i = 0; i < num; i++) {
//				p[i]=(i+1)/F;
//				System.out.println("p[i]="+p[i]);
//				if (i==0) {
//					q[i]=p[i];
//				}
//				else {
//					q[i]=q[i-1]+p[i];
//				}
//				System.out.println(q[i]);
//			}
//			for (int i = 0; i < num; i++) {
//				double r = Math.random();
//				if (r<q[0]) {
//					for (int j = 0; j < SetPar.parnum; j++) {
//						initialpops[i][j]=initialpops[number[0]][j];
//					}
//				} else {
//					for (int j = 1; j < num; j++) {
//						if (r<q[j]) {
//							for (int k = 0; k < SetPar.parnum; k++) {
//								initialpops[i][k]=initialpops[number[j]][k];
//							}
//							break;
//						}
//					}
//				}
//			if (i==0) {
//				fitness=fits[number[i]];
//				for (int j = 0; j < SetPar.parnum; j++) {
//					best[j]=initialpops[number[i]][j];
//				}
//			}
//		else if (fits[number[i]]>fitness) {
//				fitness=fits[number[i]];
//				for (int k = 0; k < SetPar.parnum; k++) {
//					best[k] = initialpops[number[i]][k];
//				}
//			}
//			
//		}
	}
	public void cross(){                                    //交叉
		double m[][]=new double [num][SetPar.parnum];
		double a,b;
		double alpha[]=new double[SetPar.parnum];
		int n=1;
		for (int i = 0; i < num ;i++) {
			int k=(int) ((Math.random()*num)%num);
			if (Math.random()<0.75) {
				for (int j = 0; j < SetPar.parnum; j++) {
					System.out.println("alpha="+alpha[j]);
					if (k==i) {
						k=(k+1)%num;
					}
					alpha[j] =fits[i] / (fits[k] + fits[i]);
					m[i][j]=initialpops[i][j]-(1-alpha[j])*(initialpops[i][j]-initialpops[k][j]);
//					do {
//						n++;
//						m[i][j]=initialpops[i][j]-Math.pow(1-alpha[j],n)*(initialpops[i][j]-initialpops[k][j]);
//					}while(m[i][j]<min[j]||m[i][j]>max[j]);
//					else {
//						k=(k+1)%num;
//						m[i][j]=alpha[j]*initialpops[i][j]+(1-alpha[j])*(initialpops[i][j]-initialpops[k][j]);
//						do {
//							n++;
//							m[i][j]=alpha[j]*initialpops[i][j]+Math.pow(1-alpha[j],n)*(initialpops[i][j]-initialpops[k][j]);
//						}while(m[i][j]<min[j]||m[i][j]>max[j]);
//					}
					
//					pmin=(m[i][j]<m[(i+1)/num][j])?m[i][j]:m[(i+1)/num][j];
//					pmax=(m[i][j]>m[(i+1)/num][j])?m[i][j]:m[(i+1)/num][j];
//					do {
//						n++;
//						if (Math.random()<0.5) {
//							m[i][j]=initialpops[i][j]+Math.pow(1-alpha,n)*(initialpops[i][j]-initialpops[(i+1)/num][j]);
//						}
//						else {
//							m[i][j]=initialpops[i][j]-Math.pow(1-alpha,n)*(initialpops[i][j]-initialpops[(i+1)/num][j]);
//						}
//					}while(m[i][j]<min[j]||m[i][j]>max[j]);
					switch (SetPar.parnum) {
					case 2:
						a=popToNumber(m[i][0], m[i][1]);
						b=popToNumber(initialpops[i][0], initialpops[i][1]);
						if (a>=b) {
							initialpops[i][j]=m[i][j];
						}
						break;
					case 3:
						a=popToNumber(m[i][0], m[i][1], m[i][2]);
						b=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2]);
						if (a>=b) {
							initialpops[i][j]=m[i][j];
						}
						break;	
					case 4:
						a=popToNumber(m[i][0], m[i][1], m[i][2], m[i][3]);
						b=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3]);
						if (a>=b) {
							initialpops[i][j]=m[i][j];
						}
						break;
					case 5:
						a=popToNumber(m[i][0], m[i][1], m[i][2], m[i][3], m[i][4]);
						b=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3], initialpops[i][4]);
						if (a>=b) {
							initialpops[i][j]=m[i][j];
						break;
						}
					}
				}
			}
		}
	}
	public void mutation(){                                  //变异，5%的概率随机选择位进行变异
		double m=20;
		int a;
		double delta=0;
		double p,q;
		double f[][]=new double[num][SetPar.parnum];
		for (int i = 0; i < m; i++) {
			double n=1/m;
			double rand=Math.random();
			if (rand<n) {
				a=0;
			}
			else {
				a=1;
			}
			delta=delta+a/(Math.pow(2, i));
		}	
		for (int i = 0; i < num; i++) {
			if (Math.random()<0.08) {
				for (int j = 0; j < SetPar.parnum; j++) {
					if (Math.random()<0.5) {
						
						f[i][j]=initialpops[i][j]+0.5*(max[j]-min[j])*delta;
					}
					else {
						f[i][j]=initialpops[i][j]-0.5*(max[j]-min[j])*delta;
					}
					switch (SetPar.parnum) {
					case 2:
						p=popToNumber(f[i][0], f[i][1]);
						q=popToNumber(initialpops[i][0], initialpops[i][1]);
						if (f[i][j]>min[j]&&f[i][j]<max[j]&&p>q) {
							initialpops[i][j]=f[i][j];
						}
						break;
					case 3:
						p=popToNumber(f[i][0], f[i][1], f[i][2]);
						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2]);
						if (f[i][j]>min[j]&&f[i][j]<max[j]&&p>q) {
							initialpops[i][j]=f[i][j];
						}
						break;	
					case 4:
						p=popToNumber(f[i][0], f[i][1], f[i][2], f[i][3]);
						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3]);
						if (f[i][j]>min[j]&&f[i][j]<max[j]&&p>q) {
							initialpops[i][j]=f[i][j];
						}
						break;
					case 5:
						p=popToNumber(f[i][0], f[i][1], f[i][2], f[i][3], f[i][4]);
						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3], initialpops[i][4]);
						if (f[i][j]>min[j]&&f[i][j]<max[j]&&p>q) {
							initialpops[i][j]=f[i][j];
						}
						break;
					}
				}
			}
		}
	}
}


public class RCGAdemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblOptimalSolution;
	private JPanel panel_1;
	public static JTextField Result;
	private JTextPane textPane;
//	private JPanel panel;
	private Plot2DPanel plot=new Plot2DPanel();
	private JTextPane textPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RCGAdemo frame = new RCGAdemo();
					frame.setVisible(true);
//					System.out.println(Def.parnum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		
	/**
	 * Create the frame.
	 */
	public RCGAdemo() {
		setTitle("Optimization Algorithm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 720, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblObjectiveFunction = new JLabel("Objective Function: F(x) =");
		lblObjectiveFunction.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
	
		
		btnNewButton = new JButton("Set Parameters");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try {
					SetPar frame = new SetPar();
					frame.setVisible(true);
					switch (Integer.parseInt(String.valueOf(SetPar.numofPar.getValue()))) {
					case 1:
						SetPar.par_x2.setVisible(false);
						SetPar.par_x3.setVisible(false);
						SetPar.par_x4.setVisible(false);
						SetPar.par_x5.setVisible(false);
						break;
					case 2:
						SetPar.par_x2.setVisible(true);
						SetPar.par_x3.setVisible(false);
						SetPar.par_x4.setVisible(false);
						SetPar.par_x5.setVisible(false);
						break;
					case 3:
						SetPar.par_x2.setVisible(true);
						SetPar.par_x3.setVisible(true);
						SetPar.par_x4.setVisible(false);
						SetPar.par_x5.setVisible(false);
						break;
					case 4:
						SetPar.par_x2.setVisible(true);
						SetPar.par_x3.setVisible(true);
						SetPar.par_x4.setVisible(true);
						SetPar.par_x5.setVisible(false);
						break;
					case 5:
						SetPar.par_x2.setVisible(true);
						SetPar.par_x3.setVisible(true);
						SetPar.par_x4.setVisible(true);
						SetPar.par_x5.setVisible(true);
						break;
					
					} 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1 = new JButton("Run Optimization");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Def ga=new Def();
				Def.func=textPane_1.getText();
				ga.initial();
				ga.select();
				ga.cross();
				ga.mutation();
				int numb=Integer.parseInt(SetPar.MaxIter.getText());
//				System.out.println(Def.func);
				double X[]=new double[numb];
				double Y[]=new double[numb];
				for (int i = 0; i < numb; i++) {
					for (int j = 0; j < ga.num; j++) {
						for (int k = 0; k < SetPar.parnum; k++) {
							
							System.out.print(ga.initialpops[j][k]+"  ");
							System.err.println(" ");
						}
					}
//					ga.initial();
//	  				ga.select();
					ga.select();
					ga.cross();
					ga.mutation();
					X[i]=ga.fitness;
					Y[i]=i;
				}
				plot.addLinePlot("name", Y, X);
				Result.setText(Double.toString(X[numb-1]));
				textPane.setText("  x1=");
			}

			
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
//		panel = plot;
		
		panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnExit.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		
		Result = new JTextField();
		Result.setForeground(Color.BLUE);
		Result.setHorizontalAlignment(SwingConstants.LEFT);
		Result.setFont(new Font("宋体", Font.PLAIN, 14));
		Result.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(53)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(4)
							.addComponent(Result, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
		);
		panel_2.setLayout(gl_panel_2);
		
		lblOptimalSolution = new JLabel("Optimal Solution");
		lblOptimalSolution.setFont(new Font("宋体", Font.PLAIN, 14));
		
		textPane = new JTextPane();
		textPane.setForeground(Color.BLUE);
		textPane.setFont(new Font("宋体", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGap(16)
							.addComponent(lblOptimalSolution, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblOptimalSolution)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		textPane_1 = new JTextPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblObjectiveFunction)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(plot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(30))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblObjectiveFunction, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(plot, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
							.addComponent(btnExit)))
					.addContainerGap())
		);
		plot.setAdjustBounds(true);
		contentPane.setLayout(gl_contentPane);
	}
}
