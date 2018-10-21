//package converter; // NetBeans IDE

import java.awt.Color;
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
	
}
class PieChartMaker extends JComponent
{
	public PieChart[] createChart(int num, Color[] color, double[] percent, String[]name)
	{
		PieChart[] chart = new PieChart[num];
		for(int i = 0; i < num; i++)
		{
			chart[i].setColor(color[i]);
			chart[i].setPercentage(percent[i]);
			chart[i].setName(name[i]);
		}
		return chart;
	}
	
	public void drawChart(Graphics2D g, Rectangle a, PieChart[] chart)
	{
		double sum = 0;
		for(int i = 0; i < chart.length; i++)
		{
			sum += chart[i].getPercent();
		}
		double current = 0;
		int angle, arcAngle;
		for(int i = 0; i < chart.length; i++)
		{
			angle = (int)(current/sum * 360);
			arcAngle = (int)(chart[i].getPercent()/sum *360);
			g.setColor(chart[i].getColor());
			g.fillArc(a.x, a.y, a.width, a.height, angle, arcAngle);
			current += chart[i].getPercent();
		}
	}
}
