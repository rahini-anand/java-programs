package paintMenu;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
	
	private MenuBar mb;
	private Panel p;
	private Menu mn1,mn2,mn3,mn4;
	private MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17;
	private Graphics g;
	private MyMouse m;
	protected int[][]mat=new int[8][7];
	protected int i=-1;
	
	public MyFrame(String n) {
		super(n);
		setBounds(100,100,600,700);
		setBackground(Color.gray);
		
		p=new Panel();
		p.setBounds(50,50,500,600);
		p.setBackground(Color.WHITE);
		
		m=new MyMouse(this);
		p.addMouseListener(m);
		p.addMouseMotionListener(m);
		
		mb=new MenuBar();
		
		mn1=new Menu("Windows");
		
		mi1=new MenuItem("Maximize");
		mi2=new MenuItem("Minimize");
		mi3=new MenuItem("Restore");
		mi4=new MenuItem("Close");
		mi17=new MenuItem("Redraw");
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.add(mi3);
		mn1.add(mi4);
		mn1.add(mi17);
		
		mi17.addActionListener(m);
		
		mb.add(mn1);
		
		setLayout(null);
		
		mi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
			}
		});
		
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.NORMAL);
			}
		});
		
		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.ICONIFIED);
			}
		});
		
		mi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		

		mn2=new Menu("Shapes");
		
		mi5=new MenuItem("Line");
		mi6=new MenuItem("Rectangle");
		mi7=new MenuItem("Oval");
		mi8=new MenuItem("Sketch");
		
		mn2.add(mi5);
		mn2.add(mi6);
		mn2.add(mi7);
		mn2.add(mi8);
		
		mb.add(mn2);
		
		mi5.addActionListener(m);
		mi6.addActionListener(m);
		mi7.addActionListener(m);
		mi8.addActionListener(m);
		
		
		mn3=new Menu("Color");
		
		mi9=new MenuItem("Red");
		mi10=new MenuItem("Blue");
		mi11=new MenuItem("Green");
		mi12=new MenuItem("Yellow");
		
		mn3.add(mi9);
		mn3.add(mi10);
		mn3.add(mi11);
		mn3.add(mi12);
		
		mb.add(mn3);
		
		mi9.addActionListener(m);
		mi10.addActionListener(m);
		mi11.addActionListener(m);
		mi12.addActionListener(m);
		
		mn4=new Menu("Width");
		
		mi13=new MenuItem("2");
		mi14=new MenuItem("5");
		mi15=new MenuItem("7");
		mi16=new MenuItem("10");
		
		mn4.add(mi13);
		mn4.add(mi14);
		mn4.add(mi15);
		mn4.add(mi16);
		
		mb.add(mn4);
		
		mi13.addActionListener(m);
		mi14.addActionListener(m);
		mi15.addActionListener(m);
		mi16.addActionListener(m);
		
		add(p);
		setMenuBar(mb);
		setVisible(true);
	}
	
	public void pattern(String s,String w,String c) {
		g=p.getGraphics();
		int iw=Integer.valueOf(w);
	
		mat[i][1]=iw;
		
		
		Graphics2D g2d= (Graphics2D) g;
		g2d.setStroke(new BasicStroke(iw));
		
		switch(c) {
		case "Red":
			g.setColor(Color.RED);
			mat[i][2]=1;
			break;
		case "Blue":
			g.setColor(Color.BLUE);
			mat[i][2]=2;
			break;
		case "Green":
			g.setColor(Color.GREEN);
			mat[i][2]=3;
			break;
		case "Yellow":
			g.setColor(Color.YELLOW);
			mat[i][2]=4;
			break;
		default:
			break;
		}
		
		switch(s) {
		case "Line":
			g.drawLine(m.x1,m.y1,m.x2,m.y2);
			mat[i][3]=m.x1;
			mat[i][4]=m.y1;
			mat[i][5]=m.x2;
			mat[i][6]=m.y2;
			mat[i][0]=1;
			break;
		case "Rectangle":
			g.drawRect(m.x1,m.y1,m.w,m.h);
			mat[i][3]=m.x1;
			mat[i][4]=m.y1;
			mat[i][5]=m.w;
			mat[i][6]=m.h;
			mat[i][0]=2;
			break;
		case "Oval":
			g.drawOval(m.x1,m.y1,m.w,m.h);
			mat[i][3]=m.x1;
			mat[i][4]=m.y1;
			mat[i][5]=m.w;
			mat[i][6]=m.h;
			mat[i][0]=3;
			break;
		case "Sketch":
			g.drawLine(m.sx1,m.sy1,m.sx2,m.sy2);
			mat[i][3]=m.sx1;
			mat[i][4]=m.sy1;
			mat[i][5]=m.sx2;
			mat[i][6]=m.sy2;
			mat[i][0]=4;
			break;
		default:
			break;
		}
		
		
		
	}
	public void redraw() {
		for(int j=0;j<8;j++) {
			g=p.getGraphics();
			int iw=Integer.valueOf(mat[j][1]);
		
			Graphics2D g2d= (Graphics2D) g;
			g2d.setStroke(new BasicStroke(iw));
		
			switch(mat[j][2]) {
			case 1:
				g.setColor(Color.RED);
				break;
			case 2:
				g.setColor(Color.BLUE);
				break;
			case 3:
				g.setColor(Color.GREEN);
				break;
			case 4:
				g.setColor(Color.YELLOW);
				break;
			default:
				break;
			}
		
			switch(mat[j][0]) {
			case 1:
				g.drawLine(mat[j][3],mat[j][4],mat[j][5],mat[j][6]);
				break;
			case 2:
				g.drawRect(mat[j][3],mat[j][4],mat[j][5],mat[j][6]);
				break;
			case 3:
				g.drawOval(mat[j][3],mat[j][4],mat[j][5],mat[j][6]);
				break;
			case 4:
				g.drawLine(mat[j][3],mat[j][4],mat[j][5],mat[j][6]);
				break;
			default:
				break;
			}
		}
		
	}
	
	
	
	

}
