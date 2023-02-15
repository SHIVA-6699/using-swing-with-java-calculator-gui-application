import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class demo extends JFrame implements ActionListener
{
    static  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    static  JTextField t;
    static  JLabel l;
    static String result;
    static String str1,str2;
    static int num1,num2,value;
    static int a;
    demo()
    {
        Font f=new Font(Font.SERIF, Font.PLAIN,  35);
        this.setLayout(null);
        this.setTitle("CALCULATOR");
        this.setSize(300,420);
        this.getContentPane().setBackground(Color.BLACK);
        b1=new JButton();
        t=new JTextField();
        t.setFont(f);
        t.setBackground(Color.green);
        t.setBounds(20,20,245,45);
        t.setHorizontalAlignment(JTextField.RIGHT);

        this.add(t);
        Font f1=new Font(Font.DIALOG_INPUT,Font.BOLD,26);
        b17=new JButton();
        b17.setText("CLEAR TEXT");
        b17.setBounds(20,320,245,35);
        b17.setFont(f1);
        b17.setBackground(Color.ORANGE);
        b17.setForeground(Color.red);

        this.add(b17);
        b1.setText("%");
        b1.setBackground(Color.CYAN);
        
        b1.setBounds(18,260,45,40);
        this.add(b1);
        b2=new JButton();
        b2.setText("0");
        
        b2.setBackground(Color.CYAN);
        b2.setBounds(80,260,45,40);
        this.add(b2);
        b3=new JButton();
        b3.setText("=");
        b3.setBackground(Color.CYAN);
        
        b3.setBounds(142,260,45,40);
        this.add(b3);

        b4=new JButton();
        b4.setText("/");
        
        b4.setBounds(220,260,45,40);
        b4.setBackground(Color.GRAY);
        this.add(b4);
        

        b5=new JButton();
        b5.setText("7");
        b5.setBackground(Color.CYAN);
        
        b5.setBounds(20,200,45,40);
        this.add(b5);
        
  
        b6=new JButton();
        b6.setText("8");
        b6.setBackground(Color.CYAN);
        
        b6.setBounds(80,200,45,40);
        this.add(b6);
    
        b7=new JButton();
        b7.setText("9");
        b7.setBackground(Color.CYAN);
        
        b7.setBounds(140,200,45,40);
        this.add(b7);

        b8=new JButton();
        b8.setText("+");
        b8.setBackground(Color.GRAY);
        
        b8.setBounds(220,200,45,40);
        this.add(b8);

        b9=new JButton();
        b9.setText("4");
        b9.setBackground(Color.CYAN);
        
        b9.setBounds(20,140,45,40);
        this.add(b9);
        
        b10=new JButton();
        b10.setText("5");
        b10.setBackground(Color.CYAN);
        
        b10.setBounds(80,140,45,40);
        this.add(b10);

        b11=new JButton();
        b11.setText("6");
        b11.setBackground(Color.CYAN);
        
        b11.setBounds(140,140,45,40);
        this.add(b11);

        b12=new JButton();
        b12.setText("-");
        
        b12.setBounds(220,140,45,40);
        b12.setBackground(Color.GRAY);
        this.add(b12);
        

        b13=new JButton();
        b13.setText("1");
        b13.setBackground(Color.CYAN);
        
        b13.setBounds(20,80,45,40);
        this.add(b13);
        
        b14=new JButton();
        b14.setText("2");
        b14.setBackground(Color.CYAN);
        
        b14.setBounds(80,80,45,40);
        this.add(b14);

        b15=new JButton();
        b15.setText("3");
        b15.setBackground(Color.CYAN);
        
        b15.setBounds(140,80,45,40);
        this.add(b15);
        b16=new JButton();
        b16.setText("x");
        b16.setBackground(Color.GRAY);
        
        b16.setBounds(220,80,45,40);
        this.add(b16);
        
        b1.addActionListener(this);
        b4.addActionListener(this);
        b2.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);        
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b15.addActionListener(this);
        b14.addActionListener(this);
        b13.addActionListener(this);
        b3.addActionListener(this);
        b8.addActionListener(this);
        b12.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        
        
        
        
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
  
        if(e.getSource()==b2)
            t.setText(t.getText().concat("0"));
        if(e.getSource()==b5)
        {
           t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b6)
        {
           t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b7)
        {
           t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b9)
        {
           t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b10)
        {
           t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b11)
        {
           t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b15)
        t.setText(t.getText().concat("3"));
        if(e.getSource()==b14)
        t.setText(t.getText().concat("2"));
        if(e.getSource()==b13)
        t.setText(t.getText().concat("1"));
       
                if(e.getSource()==b17)
                {
                    clear();
                }
                if(e.getSource()==b8)
                {

                    str1=t.getText();
                    a=1;
                    clear();
                }
                if(e.getSource()==b4)
                {
                    str1=t.getText();
                    a=2;
                    clear();
                }
                if(e.getSource()==b1)
                {
                    str1=t.getText();
                    a=3;
                    clear();
                }
                if(e.getSource()==b12)
                {
                    str1=t.getText();
                    a=4;
                    clear();
                }
                if(e.getSource()==b16)
                {
                    str1=t.getText();
                    a=5;
                    clear();
                }
                
                
               

        
        if(e.getSource()==b3)
        {

            str2=t.getText();
            switch(a)
            {
                case 1:
                num1=Integer.parseInt(str1);
                num2=Integer.parseInt(str2);
                value=num1+num2;
                result=Integer.toString(value);
                t.setText(result);
                break;
                case 2:
                num1=Integer.parseInt(str1);
                num2=Integer.parseInt(str2);
                value=num1/num2;
                result=Integer.toString(value);
                t.setText(result);
                break;
                case 3:
                num1=Integer.parseInt(str1);
                num2=Integer.parseInt(str2);
                value=num1%num2;
                result=Integer.toString(value);
                t.setText(result);
                break;
                case 4:
                num1=Integer.parseInt(str1);
                num2=Integer.parseInt(str2);
                value=num1-num2;
                result=Integer.toString(value);
                t.setText(result);
                break;

                case 5:
                num1=Integer.parseInt(str1);
                num2=Integer.parseInt(str2);
                value=num1*num2;
                result=Integer.toString(value);
                t.setText(result);
                break;

                    
            }
            
        }
       
 
    }
    public void clear()
    {
        t.setText("");
    }
    public static void main(String[] args) {
        new demo();


    }
}
