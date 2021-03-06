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
import org.python.core.PyFunction;
import org.python.core.PyList;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import bsh.EvalError;
import bsh.Interpreter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;


class Def{
	public static String func;                                                              //函数表达式
	public PyFunction calc;
	public static int numb=Integer.parseInt(SetPar.MaxIter.getText());
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
	public int num=Integer.parseInt(SetPar.numofind);                                       //种群中的个体数
	public double fitness;                                                                  //最适应值
	public double[][] initialpops =new double[num][SetPar.parnum];                          //初始种群
	public double[] fits = new double[num];                                                 //个体适应值
	public void initial() {                                                                 //初始化一个种群
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < SetPar.parnum; j++) {
				initialpops[i][j]=min[j]+(max[j]-min[j])*Math.random();                     //不考虑精度
			}
		}
	}
	public double popToNumber(double[] str){
		String s1=Double.toString(str[0]);
		String s2=Double.toString(str[1]);
		String f=func.replaceAll("x1",s1);
		f=f.replaceAll("x2",s2);
		switch (SetPar.parnum) {
		case 3:
			String s3=Double.toString(str[2]);
			f=f.replaceAll("x3",s3);
			break;
		case 4:
			String s31=Double.toString(str[2]);
			String s41=Double.toString(str[3]);
			f=f.replaceAll("x3",s31);
			f=f.replaceAll("x4", s41);
			break;
		case 5:
			String s32=Double.toString(str[2]);
			String s42=Double.toString(str[3]);
			String s5=Double.toString(str[4]);
			f=f.replaceAll("x3",s32);
			f=f.replaceAll("x4", s42);
			f=f.replaceAll("x5", s5);
			break;
		default:
			break;
		}
		Interpreter inter=new Interpreter();
//			System.out.println(func);
			double fit = 0;
			try {
				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
			} catch (EvalError e) {
			}
			return fit;	
	}
//	public double popToNumber(double str1, double str2) {                 //将输入字符串转为函数表达式,返回适应值
//		String s1=Double.toString(str1);
//		String s2=Double.toString(str2);
//		String f=func.replaceAll("x1",s1);
//		f=f.replaceAll("x2",s2);
//		Interpreter inter=new Interpreter();
////			System.out.println(func);
//			double fit = 0;
//			try {
//				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
//			} catch (EvalError e) {
//			}
//			return fit;
//
//	}
//	public double popToNumber(double str1, double str2, double str3) {             //将输入字符串转为函数表达式,返回适应值
//		String s1=Double.toString(str1);
//		String s2=Double.toString(str2);
//		String s3=Double.toString(str3);
//		String f=func.replaceAll("x1",s1);
//		f=f.replaceAll("x2",s2);
//		f=f.replaceAll("x3",s3);
//		Interpreter inter=new Interpreter();
////			System.out.println(func);
//			double fit = 0;
//			try {
//				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
//			} catch (EvalError e) {
//			}
//			return fit;
//
//	}
//	public double popToNumber(double str1, double str2, double str3, double str4) {             //将输入字符串转为函数表达式,返回适应值
//		String s1=Double.toString(str1);
//		String s2=Double.toString(str2);
//		String s3=Double.toString(str3);
//		String s4=Double.toString(str4);
//		String f=func.replaceAll("x1",s1);
//		f=f.replaceAll("x2",s2);
//		f=f.replaceAll("x3",s3);
//		f=f.replaceAll("x4",s4);
//		Interpreter inter=new Interpreter();
////			System.out.println(func);
//			double fit = 0;
//			try {
//				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
//			} catch (EvalError e) {
//			}
//			return fit;
//
//	}
//	public double popToNumber(double str1, double str2, double str3, double str4, double str5) {             //将输入字符串转为函数表达式,返回适应值
//		String s1=Double.toString(str1);
//		String s2=Double.toString(str2);
//		String s3=Double.toString(str3);
//		String s4=Double.toString(str4);
//		String s5=Double.toString(str5);
//		String f=func.replaceAll("x1",s1);
//		f=f.replaceAll("x2",s2);
//		f=f.replaceAll("x3",s3);
//		f=f.replaceAll("x4",s4);
//		f=f.replaceAll("x5",s5);
//		Interpreter inter=new Interpreter();
////			System.out.println(func);
//			double fit = 0;
//			try {
//				fit = Double.parseDouble(String.valueOf(inter.eval(f)));
//			} catch (EvalError e) {
//			}
//			return fit;
//
//	}
	
	public void calculate(){
		double sumfit=0;
		double []init = new double[SetPar.parnum];
		for (int i = 0; i < num; i++) {
//			switch (SetPar.parnum) {
//			case 2:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1]);
//				break;
//			case 3:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2]);
//				break;
//			case 4:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3]);
//				break;
//			case 5:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3],initialpops[i][4]);
//				break;
//			}
			for (int j = 0; j < SetPar.parnum; j++) {
				init[j]=initialpops[i][j];
			}
			fits[i]=popToNumber(init);
			sumfit+=fits[i];
		}
		fitness=sumfit/num;
		System.out.println(fitness);
	}
	
	public void py_calculate(){
		PyObject pyobj;
        double sumfit=0;
        ArrayList<Double> list = new ArrayList<Double>();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < SetPar.parnum; j++) {
				list.add(initialpops[i][j]);
			}
			pyobj = calc.__call__(new PyList(list));
			fits[i]=pyobj.asDouble();
//			pyobj = calc.__call__(new PyList(list));
//			fits[i]=pyobj.asDouble();
			sumfit+=fits[i];
			list.removeAll(list);
		}
		fitness=sumfit/num;
		System.out.println(fitness);
	}
	
	public void select(){                  //计算种群每个个体的适应值
		Random random=new Random();
//		for (int i = 0; i < num; i++) {
//			switch (SetPar.parnum) {
//			case 2:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1]);
//				break;
//			case 3:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2]);
//				break;
//			case 4:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3]);
//				break;
//			case 5:
//				fits[i]=popToNumber(initialpops[i][0],initialpops[i][1],initialpops[i][2],initialpops[i][3],initialpops[i][4]);
//				break;
//			}
//		}	
			//锦标赛法选择
		for (int i = 0; i < num; i++) {
			int randnum=random.nextInt(num);	
			if (fits[i]<fits[randnum]) {
				for (int j = 0; j < SetPar.parnum; j++) {
					initialpops[i][j]=initialpops[randnum][j];
				}
			}
		}
	}
//	public void py_select(){
//		Random random1=new Random();
//		ArrayList<Double> list = new ArrayList<Double>();
//		PyObject pyobj;
//		@SuppressWarnings("resource")
//		PythonInterpreter interpreter = new PythonInterpreter(); 
//		interpreter.execfile(func);
//        PyFunction calc = (PyFunction)interpreter.get("calculate",PyFunction.class);  
//		for (int i = 0; i < num; i++) {
//			switch (SetPar.parnum) {
//			case 2:
//				list.add(initialpops[i][0]);
//				list.add(initialpops[i][1]);
//				pyobj = calc.__call__(new PyList(list));
//				fits[i]=pyobj.asDouble();
//				break;
//			case 3:
//				list.add(initialpops[i][0]);
//				list.add(initialpops[i][1]);
//				list.add(initialpops[i][2]);
//				pyobj = calc.__call__(new PyList(list));
//				fits[i]=pyobj.asDouble();
//				break;
//			case 4:
//				list.add(initialpops[i][0]);
//				list.add(initialpops[i][1]);
//				list.add(initialpops[i][2]);
//				list.add(initialpops[i][3]);
//				pyobj = calc.__call__(new PyList(list));
//				fits[i]=pyobj.asDouble();
//				break;
//			case 5:
//				list.add(initialpops[i][0]);
//				list.add(initialpops[i][1]);
//				list.add(initialpops[i][2]);
//				list.add(initialpops[i][3]);
//				list.add(initialpops[i][4]);
//				pyobj = calc.__call__(new PyList(list));
//				fits[i]=pyobj.asDouble();
//				break;
//			}
//		}
//		for (int i = 0; i < num; i++) {
//			int randnum=random1.nextInt(num);	
//			if (fits[i]<fits[randnum]) {
//				for (int j = 0; j < SetPar.parnum; j++) {
//					initialpops[i][j]=initialpops[randnum][j];
//				}
//			}
//		}
//	}
	
	public void cross(){                                    //交叉
		double m[][]=new double [num][SetPar.parnum];
		double a,b;
		double []m1=new double[SetPar.parnum];
		double []m2=new double[SetPar.parnum];
		if (Math.random()<0.8) {
			for (int i = 0; i < num-1; i=i+2) {
				for (int j = 0; j < SetPar.parnum; j++) {
					double alpha=Math.random();
					m[i][j]=alpha*initialpops[i][j]+(1-alpha)*initialpops[i+1][j];
					m[i+1][j]=alpha*initialpops[i+1][j]+(1-alpha)*initialpops[i][j];
				}
			}
		
			for (int k = 0; k < num; k++) {
				for (int k2 = 0; k2 < SetPar.parnum; k2++) {
					m1[k2]=m[k][k2];
					m2[k2]=initialpops[k][k2];
					a=popToNumber(m1);
					b=popToNumber(m2);
					if (a>=b) {
						initialpops[k][k2]=m[k][k2];
					}
//					switch (SetPar.parnum) {
//					case 2:
//						a=popToNumber(m[k][0], m[k][1]);
//						b=popToNumber(initialpops[k][0], initialpops[k][1]);
//						if (a>=b) {
//							initialpops[k][k2]=m[k][k2];
//						}
//						break;
//					case 3:
//						a=popToNumber(m[k][0], m[k][1], m[k][2]);
//						b=popToNumber(initialpops[k][0], initialpops[k][1], initialpops[k][2]);
//						if (a>=b) {
//							initialpops[k][k2]=m[k][k2];
//						}
//						break;	
//					case 4:
//						a=popToNumber(m[k][0], m[k][1], m[k][2], m[k][3]);
//						b=popToNumber(initialpops[k][0], initialpops[k][1], initialpops[k][2], initialpops[k][3]);
//						if (a>=b) {
//							initialpops[k][k2]=m[k][k2];
//						}
//						break;
//					case 5:
//						a=popToNumber(m[k][0], m[k][1], m[k][2], m[k][3], m[k][4]);
//						b=popToNumber(initialpops[k][0], initialpops[k][1], initialpops[k][2], initialpops[k][3], initialpops[k][4]);
//						if (a>=b) {
//							initialpops[k][k2]=m[k][k2];
//							break;
//						}
//					}
				}
			}
		}
	}
	public void py_cross(){
		PyObject pyobj1,pyobj2;
		double a1,b1;
		double m1[][]=new double [num][SetPar.parnum];
		ArrayList<Double> list1 = new ArrayList<Double>();
		ArrayList<Double> list2 = new ArrayList<Double>();
		if (Math.random()<0.8) {
			for (int i = 0; i < num-1; i=i+2) {
				for (int j = 0; j < SetPar.parnum; j++) {
					double alpha=Math.random();
					m1[i][j]=alpha*initialpops[i][j]+(1-alpha)*initialpops[i+1][j];
					m1[i+1][j]=alpha*initialpops[i+1][j]+(1-alpha)*initialpops[i][j];
				}
			}
			for (int i1 = 0; i1 < num; i1++) {
				for (int j1 = 0; j1 < SetPar.parnum; j1++) {
					list1.add(m1[i1][j1]);
					list2.add(initialpops[i1][j1]);
				}
				pyobj1 = calc.__call__(new PyList(list1));
				pyobj2 = calc.__call__(new PyList(list2));
				a1=pyobj1.asDouble();
				b1=pyobj2.asDouble();
				if (a1>b1) {
					for (int j2 = 0; j2 < SetPar.parnum; j2++) {
						initialpops[i1][j2]=m1[i1][j2];
					}
				}
				list1.removeAll(list1);
				list2.removeAll(list2);
			}
		}
	}
	
	public void mutation(){                                  //变异，8%的概率进行变异
		double m=20;
		double delta=0;
		double f1[]=new double[SetPar.parnum];
		double f2[]=new double[SetPar.parnum];
		int a;
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
					if (initialpops[i][j]-min[j]<0.5*(max[j]-min[j])) {
						f[i][j]=initialpops[i][j]+0.5*(max[j]-min[j])*delta;
					}
					else {
						f[i][j]=initialpops[i][j]-0.5*(max[j]-min[j])*delta;
					}
					f1[j]=f[i][j];
					f2[j]=initialpops[i][j];
					p=popToNumber(f1);
					q=popToNumber(f2);
					if (p>=q) {
						initialpops[i][j]=f[i][j];
					}
//					switch (SetPar.parnum) {
//					case 2:
//						p=popToNumber(f[i][0], f[i][1]);
//						q=popToNumber(initialpops[i][0], initialpops[i][1]);
//						if (p>q) {
//							initialpops[i][j]=f[i][j];
//						}
//						break;
//					case 3:
//						p=popToNumber(f[i][0], f[i][1], f[i][2]);
//						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2]);
//						if (p>q) {
//							initialpops[i][j]=f[i][j];
//						}
//						break;	
//					case 4:
//						p=popToNumber(f[i][0], f[i][1], f[i][2], f[i][3]);
//						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3]);
//						if (p>q) {
//							initialpops[i][j]=f[i][j];
//						}
//						break;
//					case 5:
//						p=popToNumber(f[i][0], f[i][1], f[i][2], f[i][3], f[i][4]);
//						q=popToNumber(initialpops[i][0], initialpops[i][1], initialpops[i][2], initialpops[i][3], initialpops[i][4]);
//						if (p>q) {
//							initialpops[i][j]=f[i][j];
//						}
//						break;
//					}
				}
			}
		}
	}
	
	public void py_mutation(){
		int a1;
		PyObject pyobj1,pyobj2;
		double p1,q1;
		double m1=20;
		double delta1=0;
		ArrayList<Double> list11 = new ArrayList<Double>();
		ArrayList<Double> list22 = new ArrayList<Double>();
		double f[][]=new double[num][SetPar.parnum];
		for (int i = 0; i < m1; i++) {
			double n=1/m1;
			double rand=Math.random();
			if (rand<n) {
				a1=0;
			}
			else {
				a1=1;
			}
			delta1=delta1+a1/(Math.pow(2, i));
		}	
		for (int i = 0; i < num; i++) {
			if (Math.random()<0.08) {
				for (int j = 0; j < SetPar.parnum; j++) {
					if (initialpops[i][j]-min[j]<0.5*(max[j]-min[j])) {
						f[i][j]=initialpops[i][j]+0.5*(max[j]-min[j])*delta1;
					}
					else {
						f[i][j]=initialpops[i][j]-0.5*(max[j]-min[j])*delta1;
					}
					list11.add(f[i][j]);
					list22.add(initialpops[i][j]);
				}
				pyobj1 = calc.__call__(new PyList(list11));
				pyobj2 = calc.__call__(new PyList(list22));
				p1=pyobj1.asDouble();
				q1=pyobj2.asDouble();
				if (p1>q1) {
					for (int j2 = 0; j2 < SetPar.parnum; j2++) {
						initialpops[i][j2]=f[i][j2];
					}
				}
				list11.removeAll(list11);
				list22.removeAll(list22);
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
	private JTextArea textArea;
	private JLabel lblPathOfThe;
	public JRadioButton obj_rdbtn;
	public JRadioButton py_rdbtn;
	private JLabel lblObjectiveFunction;
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
		setBounds(100, 100, 724, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		
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
				Def.func=textArea.getText();
				double X[]=new double[Def.numb];
				double Y[]=new double[Def.numb];
				ga.initial();
				if (obj_rdbtn.isSelected()) {
					for (int i = 0; i < Def.numb; i++) {
						ga.cross();
						ga.mutation();
						ga.calculate();
						ga.select();
						X[i]=ga.fitness;
						Y[i]=i;
						
					}
				}
				else if (py_rdbtn.isSelected()) {
					@SuppressWarnings("resource")
					PythonInterpreter interpreter = new PythonInterpreter(); 
					interpreter.execfile(Def.func);
					ga.calc = (PyFunction)interpreter.get("calculate",PyFunction.class);
					for (int i = 0; i < Def.numb; i++) {
						ga.py_cross();
						ga.py_mutation();
						ga.py_calculate();
						ga.select();
						X[i]=ga.fitness;
						Y[i]=i;
						
					}
				}
				
					plot.addLinePlot("RCGA", Y, X);
					Result.setText(Double.toString(X[Def.numb-1]));
					switch (SetPar.parnum) {
					case 2:
						textPane.setText(ga.initialpops[ga.num-1][0]+"\n"+ga.initialpops[ga.num-1][1]);
						break;
					case 3:
						textPane.setText(ga.initialpops[ga.num-1][0]+"\n"+ga.initialpops[ga.num-1][1]
								+"\n"+ga.initialpops[ga.num-1][2]);
						break;
					case 4:
						textPane.setText(ga.initialpops[ga.num-1][0]+"\n"+ga.initialpops[ga.num-1][1]
								+"\n"+ga.initialpops[ga.num-1][2]+"\n"+ga.initialpops[ga.num-1][3]);
						break;
					case 5:
						textPane.setText(ga.initialpops[ga.num-1][0]+"\n"+ga.initialpops[ga.num-1][1]
								+"\n"+ga.initialpops[ga.num-1][2]+"\n"+ga.initialpops[ga.num-1][3]+"\n"+ga.initialpops[ga.num-1][4]);
						break;
					default:
						break;
					}
				}
			}
		);
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
				.addComponent(Result, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(70, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(67))
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
		lblOptimalSolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptimalSolution.setFont(new Font("宋体", Font.PLAIN, 14));
		
		textPane = new JTextPane();
		textPane.setForeground(Color.BLUE);
		textPane.setFont(new Font("宋体", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(13)
					.addComponent(lblOptimalSolution, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
					.addGap(13))
				.addComponent(textPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(1)
					.addComponent(lblOptimalSolution)
					.addGap(5)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel = new JPanel();
		
		obj_rdbtn = new JRadioButton("Objective Function");
		obj_rdbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				py_rdbtn.setSelected(false);
				lblObjectiveFunction.setVisible(true);
				lblPathOfThe.setVisible(false);
			}
		});
		obj_rdbtn.setFont(new Font("宋体", Font.PLAIN, 14));
		obj_rdbtn.setSelected(true);
		
		py_rdbtn = new JRadioButton("Python Script");
		py_rdbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				obj_rdbtn.setSelected(false);
				lblObjectiveFunction.setVisible(false);
				lblPathOfThe.setVisible(true);
			}
		});
		py_rdbtn.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
						.addComponent(plot, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(obj_rdbtn, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
						.addComponent(py_rdbtn, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(obj_rdbtn)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(py_rdbtn))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnExit))
						.addComponent(plot, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		lblObjectiveFunction = new JLabel("Objective Function: F(x) =");
		lblObjectiveFunction.setBounds(4, 18, 186, 20);
		lblObjectiveFunction.setHorizontalAlignment(SwingConstants.LEFT);
		lblObjectiveFunction.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		lblPathOfThe = new JLabel("Path of The Python Script : ");
		lblPathOfThe.setBounds(6, 13, 186, 31);
		lblPathOfThe.setVisible(false);
		lblPathOfThe.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblPathOfThe.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(193, 5, 284, 50);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		panel.setLayout(null);
		panel.add(lblObjectiveFunction);
		panel.add(lblPathOfThe);
		panel.add(scrollPane);
		plot.setAdjustBounds(true);
		contentPane.setLayout(gl_contentPane);
	}
}
