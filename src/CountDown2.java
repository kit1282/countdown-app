import java.awt.*;

import javax.swing.*;

public class CountDown2 
{
	JFrame frame=new JFrame("Count Down");
	JLabel label=new JLabel("10");
	public CountDown2()
	{
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,160));
		label.setFont(new Font("arial",Font.BOLD,35));
		frame.add(label);
		new NumberThread().start();
		frame.setVisible(true);
	}
	class NumberThread extends Thread
	{
		public void run()
		{
			for(int num=10;num>=1;num--)
			{
				label.setText(String.valueOf(num));
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
			}
			label.setText("Let's play");
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {}
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new CountDown2();
	}
}
