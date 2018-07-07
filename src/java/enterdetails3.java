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
public class enterdetails3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
        String sid=request.getParameter("SchoolID");
        int schoolid=Integer.parseInt(sid);
        String[] nc= new String[5];
        for(int i=0; i<=4;i++){
        nc[i]= request.getParameter("nc"+i);
        }

        String[] lp= new String[5];
        for(int i=0; i<=4;i++){
        lp[i]= request.getParameter("lp"+i);
        }

         String[] up= new String[5];
        for(int i=0; i<=4;i++){
        up[i]= request.getParameter("up"+i);
        }



        String[] ct = new String[5];
        for(int i=0; i<=4;i++){
        ct[i]= request.getParameter("ct"+i);
        }



         String[] cc = new String[5];
        for(int i=0; i<=4;i++){
        cc[i]= request.getParameter("cc"+i);
        }

         String[]pj = new String[5];
        for(int i=0; i<=4;i++){
        pj[i]= request.getParameter("pj"+i);
        }



         String[]ps = new String[5];
        for(int i=0; i<=4;i++){
        ps[i]= request.getParameter("ps"+i);
        }


         String[]rw = new String[5];
        for(int i=0; i<=4;i++){
        rw[i]= request.getParameter("rw"+i);
        }



         String[]an = new String[5];
        for(int i=0; i<=4;i++){
        an[i]= request.getParameter("an"+i);
        }



         String[]la = new String[5];
        for(int i=0; i<=4;i++){
        la[i]= request.getParameter("la"+i);
        }


        String[]cp = new String[5];
        for(int i=0; i<=4;i++){
        cp[i]= request.getParameter("cp"+i);
        }



        String[]oc = new String[5];
        for(int i=0; i<=4;i++){
        oc[i]= request.getParameter("oc"+i);
        }



        String[]t = new String[5];
        for(int i=0; i<=4;i++){
        t[i]= request.getParameter("t"+i);
        }


        String[]cb = new String[5];
        for(int i=0; i<=4;i++){
        cb[i]= request.getParameter("cb"+i);
        }
         String[]ay = new String[5];
        for(int i=0; i<=4;i++){
        ay[i]= request.getParameter("ay"+i);
        }
        String[]wm = new String[5];
        for(int i=0; i<=4;i++){
        wm[i]= request.getParameter("wm"+i);
        }
         String[]ce = new String[5];
        for(int i=0; i<=4;i++){
        ce[i]= request.getParameter("ce"+i);
        }
         String[]ch = new String[5];
        for(int i=0; i<=4;i++){
        ch[i]= request.getParameter("ch"+i);
        }
         String[]wb = new String[5];
        for(int i=0; i<=4;i++){
        wb[i]= request.getParameter("wb"+i);
        }
         String[]mo = new String[5];
        for(int i=0; i<=4;i++){
        mo[i]= request.getParameter("mo"+i);
        }
         String[]ao = new String[5];
        for(int i=0; i<=4;i++){
        ao[i]= request.getParameter("ao"+i);
        }
         String[]ro = new String[5];
        for(int i=0; i<=4;i++){
        ro[i]= request.getParameter("ro"+i);
        }
         String[]uv = new String[5];
        for(int i=0; i<=4;i++){
        uv[i]= request.getParameter("uv"+i);
        }
             String[]sf = new String[5];
        for(int i=0; i<=4;i++){
        sf[i]= request.getParameter("sf"+i);
        }
       PreparedStatement classroom_environment=null;
       //PreparedStatement school_environment= null;

       Connection con=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           classroom_environment=con.prepareStatement("insert into classroom_environment (school_id,indicators, total_available,req_repair,new_requirement,aoir) values(?,?,?,?,?,?)");
           classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,nc[i]);
           }
           classroom_environment.execute();
          classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,lp[i]);
           }
           classroom_environment.execute();
           classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,up[i]);
           }
           classroom_environment.execute();
               classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ct[i]);
           }
           classroom_environment.execute();
                     classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,cc[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,pj[i]);
           }
           classroom_environment.execute();
                        classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ps[i]);
           }
           classroom_environment.execute();
                            classroom_environment.setInt(1,schoolid);
           for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,rw[i]);
           }
           classroom_environment.execute();
            classroom_environment.setInt(1,schoolid);
                      for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,an[i]);
           }
           classroom_environment.execute();
            classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,la[i]);
           }
           classroom_environment.execute();
             classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,cp[i]);
           }
           classroom_environment.execute();
                     classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,oc[i]);
           }
           classroom_environment.execute();
                         classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,t[i]);
           }
           classroom_environment.execute();
                          classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,cb[i]);
           }
           classroom_environment.execute();
                        classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ay[i]);
           }
           classroom_environment.execute();
                     classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,wm[i]);
           }
           classroom_environment.execute();
                         classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ce[i]);
           }
           classroom_environment.execute();
                          classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ch[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,wb[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,mo[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ao[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,ro[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,uv[i]);
           }
           classroom_environment.execute();
                      classroom_environment.setInt(1,schoolid);
                          for(int i=0;i<=4;i++){
               classroom_environment.setString(i+2,sf[i]);
           }
           classroom_environment.execute();
out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfull');");
                out.println("location='volunteerpanel2.jsp';");
                out.println("</script>");

       }
         catch(Exception e)
       {
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Incorrect Data Entered, Try Again');");
                out.println("location='volunteerpanel3.jsp';");
                out.println("</script>");
       }
}
}
