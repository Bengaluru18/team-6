/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chotu
 */
public class entereddetails2 extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
        String sid=request.getParameter("SchoolID");
        int schoolid=Integer.parseInt(sid);
       /* String tb2= request.getParameter("TFB1");
        String tb3= request.getParameter("TFB2");
        String tb4= request.getParameter("TFB2");
        String tb5= request.getParameter("TFB3");
        String tb6= request.getParameter("TFB3");*/
        
        String[] tb= new String[5];
        for(int i=0; i<=4;i++){
        tb[i]= request.getParameter("TFB"+i);
        }
        /*String ub= request.getParameter("UFB1");
        String ub2= request.getParameter("UFB1");
        String ub3= request.getParameter("UFB2");
        String ub4= request.getParameter("UFB2");
        String ub5= request.getParameter("UFB3");
        String ub6= request.getParameter("UFB3");
        String ub7= request.getParameter("UFB4");*/
        
        String[] ub= new String[5];
        for(int i=0; i<=4;i++){
        ub[i]= request.getParameter("UFB"+i);
        }
        
        /*String ug= request.getParameter("TFG1");
        String ug2= request.getParameter("TFG1");
        String ug3= request.getParameter("TFG2");
        String ug4= request.getParameter("TFG2");
        String ug5= request.getParameter("TFG3");
        String ug6= request.getParameter("TFG3");
        String ug7= request.getParameter("TFG4");*/
        
         String[] ug= new String[5];
        for(int i=0; i<=4;i++){
        ug[i]= request.getParameter("TFG"+i);
        }
        
        /*String tcwsn= request.getParameter("TFC1");
        String tcwsn2= request.getParameter("TFC1");
        String tcwsn3= request.getParameter("TFC2");
        String tcwsn4= request.getParameter("TFC2");
        String tcwsn5= request.getParameter("TFC3");
        String tcwsn6= request.getParameter("TFC3");
        String tcwsn7= request.getParameter("TFC4");*/
        
        String[] tcwsn = new String[5];
        for(int i=0; i<=4;i++){
        tcwsn[i]= request.getParameter("TFC"+i);
        }
        
        /*String ts= request.getParameter("TFS1");
        String ts2= request.getParameter("TFS1");
        String ts3= request.getParameter("TFS2");
        String ts4= request.getParameter("TFS2");
        String ts5= request.getParameter("TFS3");
        String ts6= request.getParameter("TFS3");
        String ts7= request.getParameter("TFS4");*/
        
         String[]ts = new String[5];
        for(int i=0; i<=4;i++){
        ts[i]= request.getParameter("TFS"+i);
        }
        
        /*String painting= request.getParameter("P1");
        String painting2= request.getParameter("P1");
        String painting3= request.getParameter("P2");
        String painting4= request.getParameter("P2");
        String painting5= request.getParameter("P3");
        String painting6= request.getParameter("P3");
        String painting7= request.getParameter("P4");*/
         String[]painting = new String[5];
        for(int i=0; i<=4;i++){
        painting[i]= request.getParameter("P"+i);
        }
        
        /*String ha= request.getParameter("HW1");
        String ha2= request.getParameter("HW1");
        String ha3= request.getParameter("HW2");
        String ha4= request.getParameter("HW2");
        String ha5= request.getParameter("HW3");
        String ha6= request.getParameter("HW3");
        String ha7= request.getParameter("HW4");*/
        
         String[]ha = new String[5];
        for(int i=0; i<=4;i++){
        ha[i]= request.getParameter("HW"+i);
        }
        
        /*String uca= request.getParameter("UCA1");
        String uca2= request.getParameter("UCA1");
        String uca3= request.getParameter("UCA2");
        String uca4= request.getParameter("UCA2");
        String uca5= request.getParameter("UCA3");
        String uca6= request.getParameter("UCA3");
        String uca7= request.getParameter("UCA4");*/
        
         String[]uca = new String[5];
        for(int i=0; i<=4;i++){
        ha[i]= request.getParameter("UCA"+i);
        }
        
        /*String hco= request.getParameter("HCO1");
        String hco2= request.getParameter("HCO1");
        String hco3= request.getParameter("HCO3");
        String hco4= request.getParameter("HCO3");
        String hco5= request.getParameter("HCO4");*/
        
         String[]hco = new String[5];
        for(int i=0; i<=4;i++){
        hco[i]= request.getParameter("HCO"+i);
        }
        
        /*String gc= request.getParameter("GC1");
        String gc2= request.getParameter("GC1");
        String gc3= request.getParameter("GC3");
        String gc4= request.getParameter("GC3");
        String gc5= request.getParameter("GC4");*/
        
         String[]gc = new String[5];
        for(int i=0; i<=4;i++){
        gc[i]= request.getParameter("GC"+i);
        }
        
       /* String dc= request.getParameter("DC1");
        String dc2= request.getParameter("DC1");
        String dc3= request.getParameter("DC2");
        String dc4= request.getParameter("DC2");
        String dc5= request.getParameter("DC3");*/
       
        String[]dc = new String[5];
        for(int i=0; i<=4;i++){
        dc[i]= request.getParameter("DC"+i);
        }
        
        /*String ec= request.getParameter("EC1");
        String ec2= request.getParameter("EC1");
        String ec3= request.getParameter("EC2");
        String ec4= request.getParameter("EC2");
        String ec5= request.getParameter("EC3");*/
        
        String[]ec = new String[5];
        for(int i=0; i<=4;i++){
        ec[i]= request.getParameter("EC"+i);
        }
        
        /*String m= request.getParameter("M1");
        String m2= request.getParameter("M1");
        String m3= request.getParameter("M2");
        String m4= request.getParameter("M2");
        String m5= request.getParameter("M3");*/
        
        String[]m = new String[5];
        for(int i=0; i<=4;i++){
        m[i]= request.getParameter("M"+i);
        }
        
        /*String fa= request.getParameter("FA1");
        String fa2= request.getParameter("FA1");
        String fa3= request.getParameter("FA2");
        String fa4= request.getParameter("FA2");
        String fa5= request.getParameter("FA3");*/
        
        String[]fa = new String[5];
        for(int i=0; i<=4;i++){
        ec[i]= request.getParameter("FA"+i);
        }
        
        PreparedStatement sanitation=null;
       PreparedStatement classroom_environment=null;
       PreparedStatement school_environment= null;
       
       Connection con=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           sanitation=con.prepareStatement("insert into sanitation (school_id,toilet_details, availability,req_repair,new_reqirement,aoir) values(?,?,?,?,?,?)");
           sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,tb[i]);
           }
           sanitation.execute();
           sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,ub[i]);
           }
           sanitation.execute();
               sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,ug[i]);
           }
           sanitation.execute();
                     sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,tcwsn[i]);
           }
           sanitation.execute();
                      sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,painting[i]);
           }
           sanitation.execute();
                        sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,ha[i]);
           }
           sanitation.execute();
                            sanitation.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               sanitation.setString(i+2,uca[i]);
           }
           sanitation.execute();
            sanitation.setInt(1,schoolid);
                      for(int i=0;i<=4;i++){
               sanitation.setString(i+2,hco[i]);
           }
           sanitation.execute();
            sanitation.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               sanitation.setString(i+2,gc[i]);
           }
           sanitation.execute();
             sanitation.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               sanitation.setString(i+2,dc[i]);
           }
           sanitation.execute();
                     sanitation.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               sanitation.setString(i+2,ec[i]);
           }
           sanitation.execute();
                         sanitation.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               sanitation.setString(i+2,m[i]);
           }
           sanitation.execute();
                          sanitation.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               sanitation.setString(i+2,fa[i]);
           }
           sanitation.execute();
           //out.println(schoolname +""+locality+""+address+""+district+""+state+""+totalclasses+""+gender+""+total+""+moi+""+dise);
           //schooldetails.execute();
       }
         catch(Exception e)
       {
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Incorrect Data Entered, Try Again');");
                out.println("location='volunteerpanel.jsp';");
                out.println("</script>");
       }
        
        
        
        
        
        
        
        
        
        }
    }

 


