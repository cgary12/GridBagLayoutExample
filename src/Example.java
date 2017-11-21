import java.awt.*;
import java.util.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.applet.Applet;

public class Example extends Applet {
	

		protected void makebutton(String name,
	                               GridBagLayout gridbag,
	                               GridBagConstraints c) {
	         Button button = new Button(name);
	         gridbag.setConstraints(button, c);

	         add(button);
	     }

	     public void init() {
	         GridBagLayout gridbag = new GridBagLayout();
	         GridBagConstraints c = new GridBagConstraints();
	         
	         JMenuBar test = new JMenuBar();
	         JMenu file = new JMenu("File");
	         
	         test.add(file);

	         setFont(new Font("SansSerif", Font.PLAIN, 14));
	         setLayout(gridbag);

	         c.fill = GridBagConstraints.BOTH;
	         c.weightx = 0.0;
	         c.gridwidth = GridBagConstraints.REMAINDER;
	         
	         gridbag.setConstraints(test, c);
	         add(test);
	         
	         c.gridwidth = GridBagConstraints.HORIZONTAL;
	         c.weightx = 1.0;
	         makebutton("Button1", gridbag, c);
	         makebutton("Button2", gridbag, c);
	         makebutton("Button3", gridbag, c);

	         c.gridwidth = GridBagConstraints.REMAINDER; //end row
	         makebutton("Button4", gridbag, c);

	         c.weightx = 0.0;                //reset to the default
	        // makebutton("Button5", gridbag, c); //another row
	        

	         c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
	         makebutton("Button6", gridbag, c);

	         c.gridwidth = GridBagConstraints.REMAINDER; //end row
	         makebutton("Button7", gridbag, c);

	         c.gridwidth = 1;                //reset to the default
	         c.gridheight = 2;
	         c.weighty = 1.0;
	         makebutton("Button8", gridbag, c);

	         c.weighty = 0.0;                //reset to the default
	         c.gridwidth = GridBagConstraints.REMAINDER; //end row
	         c.gridheight = 1;               //reset to the default
	         makebutton("Button9", gridbag, c);
	         makebutton("Button10", gridbag, c);

	         setSize(600, 400);
	     }

	     public static void main(String args[]) {
	         Frame f = new Frame("GridBag Layout Example");
	         Example ex1 = new Example();

	         ex1.init();

	         f.add("Center", ex1);
	         f.pack();
	         f.setSize(f.getPreferredSize());
	         f.show();
	     }
 }


