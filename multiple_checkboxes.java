// The file name is incorrect,rename it as the class name . Amen
    import java.awt.*;  
    import java.awt.event.*;  

    public class CheckboxExample  
    {  
        
      public static void main(String args[]) 
      {  
        Frame f= new Frame("Canvas Example");
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("Red", cbg, false);    
        checkBox1.setBounds(100,100, 50,50);    
        Checkbox checkBox2 = new Checkbox("Green", cbg, false);    
        checkBox2.setBounds(100,150, 50,50);
        Checkbox checkBox3 = new Checkbox("Blue", cbg, false);    
        checkBox3.setBounds(100,200, 50,50);   

        f.add(checkBox1);    
        f.add(checkBox2);
        f.add(checkBox3);  
        f.setLayout(null);  
        f.setSize(600, 600);  
        f.setVisible(true);

        checkBox1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               f.setBackground(Color.red); 
            }  
         });  

         checkBox2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               f.setBackground(Color.green); 
               
            }  
         });  

         checkBox3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               f.setBackground(Color.blue); 
                
            }  
         });    

         f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });


      }  
      
    }  
    
