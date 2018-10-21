//package converter; // NetBeans IDE

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class PieChart 
{
	private Color color;
	private double percent;
	private String name;
	public PieChart()
	{
		color = color.black;
		percent = 0;
		name = "";
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void setPercentage(double percent)
	{
		this.percent = percent;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPercent()
	{
		return percent;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public String getName()
	{
		return name;
	}
	
}
class PieChartMaker extends JComponent
{
	public PieChart[] createChart(int num, Color[] color, double[] percent, String[]name)
	{
		PieChart[] chart = new PieChart[num];
		for(int i = 0; i < num; i++)
		{
			chart[i] = new PieChart();
			chart[i].setColor(color[i]);
			chart[i].setPercentage(percent[i]);
			chart[i].setName(name[i]);
		}
		
		return chart;
	}
	
	public void drawChart(Graphics2D g, Rectangle a, PieChart[] chart)
	{
		int cY = a.y;
		double sum = 0;
		g.setColor(Color.white);
		g.fill(a);
		Font font = new Font("Serif", Font.BOLD, 25);
		g.setFont(font);
		for(int i = 0; i < chart.length; i++)
		{
			sum += chart[i].getPercent();
			g.setColor(chart[i].getColor());
			g.drawString(chart[i].getName(), a.x, cY + 18);
			cY += 25;
		}
		double current = 0;
		int angle,arcAngle = 0;
		cY = a.y;
		for(int i = 0; i < chart.length; i++)
		{
			angle = (int)(current/sum * 360);
			arcAngle = (int)(chart[i].getPercent()/sum *360);
			g.setColor(chart[i].getColor()); 
			g.fillArc(a.x, a.y, a.width, a.height, angle, arcAngle);
			current += chart[i].getPercent();
			double percentages = (double)(chart[i].getPercent()/sum*100);
			g.drawString(String.format("%.2f", percentages) + "%", a.x + 700, cY + 18);
			cY += 25;
		}
	}
}
