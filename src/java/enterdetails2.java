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
 * @author Prashanth
 */
public class enterdetails2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
        String sid=request.getParameter("SchoolID");
        int schoolid=Integer.parseInt(sid);
        String tb1=request.getParameter("TFB1");
        String[] tb= new String[5];
        for(int i=0; i<=4;i++){
        tb[i]= request.getParameter("TFB"+i);
       out.print(tb[i]);
        }
        String[] ub= new String[5];
        for(int i=0; i<=4;i++){
        ub[i]= request.getParameter("UFB"+i);
        }
        String[] ug= new String[5];
        for(int i=0; i<=4;i++){
        ug[i]= request.getParameter("TFG"+i);
        }
        String[] tcwsn = new String[5];
        for(int i=0; i<=4;i++){
        tcwsn[i]= request.getParameter("TFC"+i);
        }
        String[]ts = new String[5];
        for(int i=0; i<=4;i++){
        ts[i]= request.getParameter("TFS"+i);
        }
        String[]painting = new String[5];
        for(int i=0; i<=4;i++){
        painting[i]= request.getParameter("P"+i);
        }
         String[]ha = new String[5];
        for(int i=0; i<=4;i++){
        ha[i]= request.getParameter("HW"+i);
        }
        String[]uca = new String[5];
        for(int i=0; i<=4;i++){
        ha[i]= request.getParameter("UCA"+i);
        }
        String[]hco = new String[5];
        for(int i=0; i<=4;i++){
        hco[i]= request.getParameter("HCO"+i);
        }
        String[]gc = new String[5];
        for(int i=0; i<=4;i++){
        gc[i]= request.getParameter("GC"+i);
        }
        String[]dc = new String[5];
        for(int i=0; i<=4;i++){
        dc[i]= request.getParameter("DC"+i);
        }
        String[]ec = new String[5];
        for(int i=0; i<=4;i++){
        ec[i]= request.getParameter("EC"+i);
        }
        String[]m = new String[5];
        for(int i=0; i<=4;i++){
        m[i]= request.getParameter("M"+i);
        }
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
           sanitation=con.prepareStatement("insert into sanitation (school_id,toilet_details, availability,req_repair,new_requirement,aoir) values(?,?,?,?,?,?)");
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
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfull');");
                out.println("location='volunteerpanel2.jsp';");
                out.println("</script>");
       }
       catch(Exception e)
       {
         
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Incorrect Data Entered, Try Again');");
                out.println("location='volunteerpanel2.jsp';");
                out.println("</script>");
       }
        
    }
}
