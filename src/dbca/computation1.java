/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbca;

import static dbca.window.value1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Priyanka
 */
public class computation1 {
    public static int vr1=nextwindow.vr1;
    Connection con;
    Statement st1,st2,st;
    ArrayList al=new ArrayList();
    ArrayList al1=new ArrayList();
    ArrayList al2=new ArrayList();
  
    public void compute(String batch)
    {
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbca", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st2=con.createStatement();
         
         
//    for(int i=3;i<(vr1/10);)
//    {
        ResultSet rs=st.executeQuery("select * from " +batch);
        while(rs.next())
        {
            String vs=rs.getString(2);
            al.add(vs);
        }
       calculatemean(batch); 
//    }
         }
         catch(ClassNotFoundException | SQLException e)
         {
             System.out.println(e.getMessage());
         }
    }
    public void calculatemean(String batch)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbca", "root", "");
               st = con.createStatement();
               st1 = con.createStatement();
               st2=con.createStatement();
           int count=0;
            int count1=0;
            int count2=0;
            int count3=0;
            int count4=0;
            int count5=0;
            for(int i=0;i<al.size();i++)
            {
   //             System.out.println(al.get(i).toString());
                String var=(String) al.get(i);
                StringTokenizer str=new StringTokenizer(var, " #");
                while(str.hasMoreTokens())
                {
                    String bd=str.nextToken();
   //                 st.executeUpdate("insert into words  values ('"+bd+ "','"+count +"')");
                    System.out.println(bd);
                    switch (bd) {
                        case "shapner":
                            count++;
                            st.executeUpdate("insert into words  values ('"+bd+ "','"+count +"','"+batch+"')");
                            break;
                        case "pen":
                            count1++;
                            st.executeUpdate("insert into words  values ('"+bd+ "','"+count1 +"','"+batch+"')");
                            break;
                        case "eraser":
                            count2++;
                            st.executeUpdate("insert into words  values ('"+bd+ "','"+count2+"','"+batch+"')");
                            break;
                        case "scale":
                            count3++;
                            st.executeUpdate("insert into words  values ('"+bd+ "','"+count3 +"','"+batch+"')");
                            break;
                        case "ink":
                            count4++;
                            st.executeUpdate("insert into words  values ('"+bd+ "','"+count4+"','"+batch +"')");
                            break;
                        default:
                            count5++;
                            break;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(computation1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void netvalue(String batch) throws ClassNotFoundException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbca", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st2=con.createStatement();
            ResultSet rs1=st1.executeQuery("select count(distinct word) from words where batch='"+batch +"'" );
                      while(rs1.next())
                      {
                     value1=rs1.getString(1);
//                          jTextArea1.append("\n Batch 1 contains" + value1 + "\n");
    //                      jTextArea1.append("count of "  + af + "is"  +  value + "\n" );
                          st2.executeUpdate(" insert into compute values ('"+value1 + "','" + batch+ "')");
                      }
        } catch (SQLException ex) {
            Logger.getLogger(computation1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cutvalue() throws SQLException
    {
        int n0 = 0,n1 = 0,n,finalcutvalue = 0,i,j;
        double delta = 0;
     double m;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbca", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st.executeUpdate("truncate table cutvalue");
            st2=con.createStatement();
        for( i=3;i<=10;)
        {
            ResultSet rs=st.executeQuery("select count from compute where batch='batch"+i +"'");
            while(rs.next())
            {
                n0=Integer.parseInt(rs.getString(1));
                System.out.println("hzhghgsgfxhno"+n0);
            }
            for( j=4;j<=10;)
            {
                ResultSet rs1=st1.executeQuery("select count from compute where batch='batch"+j+"'");
                while(rs1.next())
                {
                    n1=Integer.parseInt(rs1.getString(1));
                     System.out.println("hzhghgsgfxhno"+n1);
                     n=n0+n1;
//          double f=1d/6;
//          System.out.println(f);
          m=1d/((1d/n0)+(1d/n1));
          System.out.println(m);
          delta=0.04;
//           delta=Double.parseDouble(JOptionPane.showInputDialog("enter your value", delta)) ;
              double deltadash=delta/n;
              System.out.println(deltadash);
//              jTextField4.setText(String.valueOf(deltadash));
              double cutvalue=Math.sqrt((1d/(2*m)) *(4d/deltadash));
              System.out.println("gchafhd" +cutvalue);
               finalcutvalue=(int) cutvalue;
               
                }
//                st.executeUpdate("insert into cutvalue values ( 'batch("+ (i+"_"+j)+")','"+finalcutvalue +"')"  );
            
            
            }
               i+=2;
               j+=2;
//              jTextField5.setText(String.valueOf(finalcutvalue));
//          jTextField1.setText(String.valueOf(n0));
//          jTextField2.setText(String.valueOf(n1));
//          jTextField3.setText(String.valueOf(m));
//        }
//        return finalcutvalue;
//        return 0;
    }
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
    public static void main(String ar[]) throws SQLException
    {
        computation1 com=new computation1();
        com.cutvalue();
    }
}
