import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
	/*Finds the smallest rectangle enclosing all 
  * this container's components. This makes JScrollPane
  * behave correctly when you want put a container in it
  * that has a null (absolute) layout.
  *
  */
	public Dimension getPreferredSize() {
		 int maxX = 0;
		 int maxY = 0;
		 Component[] components = this.getComponents();
		 for(int i = 0; i < components.length; i++){
			   Rectangle bounds = components[i].getBounds();
			   maxX = Math.max(maxX, (int)bounds.getMaxX());
			   maxY = Math.max(maxY, (int)bounds.getMaxY());
		 }	
		return new Dimension(maxX,maxY);
	}
}