package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transcations extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b7,b8,b9;
    
    Transcations(){
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("TRANSACTION");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"TRANSACTION");
    
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("System", Font.BOLD, 38));
    
       
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("FAST CASH");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("ACCOUNT STATEMENTS");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        b8 = new JButton("LOAN");
        b8.setFont(new Font("System",Font.BOLD,18));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);

        b9 = new JButton("ONLINE TRANSACTIONS");
        b9.setFont(new Font("System",Font.BOLD,18));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        
        getContentPane().setLayout(null);
        
        l1.setBounds(100,100,700,40);
        getContentPane().add(l1);
        
        b1.setBounds(40,250,300,60);
        getContentPane().add(b1);
        
        b2.setBounds(440,250,300,60);
        getContentPane().add(b2);
        
        b3.setBounds(40,360,300,60);
        getContentPane().add(b3);
        
        b4.setBounds(440,360,300,60);
        getContentPane().add(b4);
        
        b7.setBounds(248,598,300,60);
        getContentPane().add(b7);
        
        b8.setBounds(40, 477, 300, 60);
        getContentPane().add(b8);

        b9.setBounds(440, 477, 300, 60);
        getContentPane().add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        getContentPane().setBackground(Color.RED);
        
        setSize(800,800);
        setLocation(380,20);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b1)
        { 
            
            new Deposit().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b2)
        { 
            
            new Withdrawl().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b3)
        { 
            
            new FastCash().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b4)
        { 
            
            new MiniStatement().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b7)
        { 
            
            System.exit(0);
            
        }
        else if(ae.getSource()==b8)
        {
        	new Loan().setVisible(true);
        	setVisible(false);
        }
        else if(ae.getSource()==b9)
        {
        	new Online_Transactions().setVisible(true);
        	setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Transcations().setVisible(true);
    }
}