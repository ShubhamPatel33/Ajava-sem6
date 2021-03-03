//Remname the java file as class name
import java.awt.*; 
import java.awt.event.*;

class First extends Frame{  
    public static void main(String args[]){  
        Frame f = new Frame("Button example");
        Button b=new Button("click me");  
        b.setBounds(30,100,80,30);// setting button position  
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){  
                f.setTitle("Welcome");
            } 
        });
        f.add(b);//adding button into frame  
        f.setSize(300,300);//frame size 300 width and 300 height  
        f.setLayout(null);
        f.setVisible(true); 
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }    
}
