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
public class enterdetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
        String schoolname=request.getParameter("SchoolName");
        String locality=request.getParameter("Locality");
        String address=request.getParameter("SchoolAddress");
        String district=request.getParameter("District");
        String state=request.getParameter("State");
        String totalclasses=request.getParameter("TotClasses");
        String gender=request.getParameter("Gender");
        String moi=request.getParameter("Medium");
        String total=request.getParameter("NumberOfStudent");
        String bkm1=request.getParameter("BKM1");
        String bkm2=request.getParameter("BKM2");
        String bkm3=request.getParameter("BKM3");
        String bkm4=request.getParameter("BKM4");
        String bkm5=request.getParameter("BKM5");
        String bkm6=request.getParameter("BKM6");
        String bkm7=request.getParameter("BKM7");
        String bkm8=request.getParameter("BKM8");
        String bkm9=request.getParameter("BKM9");
        String bkm10=request.getParameter("BKM10");
        String gkm1=request.getParameter("GKM1");
        String gkm2=request.getParameter("GKM2");
        String gkm3=request.getParameter("GKM3");
        String gkm4=request.getParameter("GKM4");
        String gkm5=request.getParameter("GKM5");
        String gkm6=request.getParameter("GKM6");
        String gkm7=request.getParameter("GKM7");
        String gkm8=request.getParameter("GKM8");
        String gkm9=request.getParameter("GKM9");
        String gkm10=request.getParameter("GKM10");
        String tkm1=request.getParameter("TKM1");
        String tkm2=request.getParameter("TKM2");
        String tkm3=request.getParameter("TKM3");
        String tkm4=request.getParameter("TKM4");
        String tkm5=request.getParameter("TKM5");
        String tkm6=request.getParameter("TKM6");
        String tkm7=request.getParameter("TKM7");
        String tkm8=request.getParameter("TKM8");
        String tkm9=request.getParameter("TKM9");
        String tkm10=request.getParameter("TKM10");
        String bem1=request.getParameter("BEM1");
        String bem2=request.getParameter("BEM2");
        String bem3=request.getParameter("BEM3");
        String bem4=request.getParameter("BEM4");
        String bem5=request.getParameter("BEM5");
        String bem6=request.getParameter("BEM6");
        String bem7=request.getParameter("BEM7");
        String bem8=request.getParameter("BEM8");
        String bem9=request.getParameter("BEM9");
        String bem10=request.getParameter("BEM10");
        String gem1=request.getParameter("GEM1");
        String gem2=request.getParameter("GEM2");
        String gem3=request.getParameter("GEM3");
        String gem4=request.getParameter("GEM4");
        String gem5=request.getParameter("GEM5");
        String gem6=request.getParameter("GEM6");
        String gem7=request.getParameter("GEM7");
        String gem8=request.getParameter("GEM8");
        String gem9=request.getParameter("GEM9");
        String gem10=request.getParameter("GEM10");
        String tem1=request.getParameter("TEM1");
        String tem2=request.getParameter("TEM2");
        String tem3=request.getParameter("TEM3");
        String tem4=request.getParameter("TEM4");
        String tem5=request.getParameter("TEM5");
        String tem6=request.getParameter("TEM6");
        String tem7=request.getParameter("TEM7");
        String tem8=request.getParameter("TEM8");
        String tem9=request.getParameter("TEM9");
        String tem10=request.getParameter("TEM10");
        String cns1=request.getParameter("CNS1");
        String cns2=request.getParameter("CNS2");
        String cns3=request.getParameter("CNS3");
        String cnh1=request.getParameter("CNH1");
        String cnh2=request.getParameter("CNH2");
        String cnh3=request.getParameter("CNH3");
        String bsc=request.getParameter("SC1");
        String bst=request.getParameter("SC2");
        String gsc=request.getParameter("SC3");
        String gst=request.getParameter("SC4");
        String tot=request.getParameter("SC5");
        String dise=request.getParameter("SchoolDISE");
        String teachersdetails=request.getParameter("TeachersDetails");
        String FTM=request.getParameter("FT1");
        String FTF=request.getParameter("FT2");
        String FTT=request.getParameter("FT3");
        String PTM=request.getParameter("PT1");
        String PTF=request.getParameter("PT2");
        String PTT=request.getParameter("PT3");
        String hmname=request.getParameter("HM1");
        String hmnumber=request.getParameter("HM2");
        String hmemail=request.getParameter("HM3");
         String atname=request.getParameter("AT1");
        String atnumber=request.getParameter("AT2");
        String atemail=request.getParameter("AT3");
        String crpname=request.getParameter("CRP1");
        String crpnumber=request.getParameter("CRP2");
        String crpemail=request.getParameter("CRP3");
        String brcname=request.getParameter("BRC1");
        String brcnumber=request.getParameter("BRC2");
        String brcemail=request.getParameter("BRC3");
        String beoname=request.getParameter("BEO1");
        String beonumber=request.getParameter("BEO2");
        String beoemail=request.getParameter("BEO3");
        String sdmc1=request.getParameter("SDMC1");
        String sdmc2=request.getParameter("SDMC2");
        String sdmc3=request.getParameter("SDMC3");
        String sm1=request.getParameter("SM1");
        String sm2=request.getParameter("SM2");
        String sm3=request.getParameter("SM3");
        String aa1=request.getParameter("AA1");
        String aa2=request.getParameter("AA2");
        String aa3=request.getParameter("AA3");
        String ss1=request.getParameter("SS1");
        String ss2=request.getParameter("SS2");
        String ss3=request.getParameter("SS3");
        String ptm1=request.getParameter("PTM1");
        String ptm2=request.getParameter("PTM2");
        String ptm3=request.getParameter("PTM3");
        String sp411=request.getParameter("SP411");
        String sp412=request.getParameter("SP412");
        String sp413=request.getParameter("SP413");
        String sp421=request.getParameter("SP421");
        String sp422=request.getParameter("SP422");
        String sp423=request.getParameter("SP423");
        String sp431=request.getParameter("SP431");
        String sp432=request.getParameter("SP432");
        String sp433=request.getParameter("SP433");
        String otherinfo=request.getParameter("otherinfo");
        String sid=request.getParameter("SchoolID");
        int schoolid=Integer.parseInt(sid);
        String mkm1=request.getParameter("MKM1");
        String mkm2=request.getParameter("MKM2");
        String mkm3=request.getParameter("MKM3");
        String mkm4=request.getParameter("MKM4");
        String mkm5=request.getParameter("MKM5");
        String mkm6=request.getParameter("MKM6");
        String mkm7=request.getParameter("MKM7");
        String mkm8=request.getParameter("MKM8");
        String mkm9=request.getParameter("MKM9");
        String mkm10=request.getParameter("MKM10");
        String c1=request.getParameter("c1");
        String c2=request.getParameter("c2");
        String c3=request.getParameter("c3");
        String c4=request.getParameter("c4");
        String c5=request.getParameter("c5");
        String c6=request.getParameter("c6");
        String c7=request.getParameter("c7");
        String c8=request.getParameter("c8");
        String c9=request.getParameter("c9");
        String c10=request.getParameter("c10");
       PreparedStatement schooldetails=null;
       PreparedStatement student=null;
       
       Connection con=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           schooldetails=con.prepareStatement("insert into school_details (school_id,school_name,locality,address,district,state,totalclasses,gender,total_no_of_students,MOI,DISE) values(?,?,?,?,?,?,?,?,?,?,?)");
           schooldetails.setInt(1, schoolid);
           schooldetails.setString(2, schoolname);
           schooldetails.setString(3,locality);
           schooldetails.setString(4, address);
           schooldetails.setString(5, district);
           schooldetails.setString(6,state);
           schooldetails.setString(7, totalclasses);
           schooldetails.setString(8, gender);
           schooldetails.setString(9, total);
           schooldetails.setString(10, moi);
           schooldetails.setString(11, dise);
           //out.println(schoolname +""+locality+""+address+""+district+""+state+""+totalclasses+""+gender+""+total+""+moi+""+dise);
           //schooldetails.execute();
           
           student=con.prepareStatement("insert into student(school_id,class,boys,girls,total,mdm) values(?,?,?,?,?,?)");
           student.setInt(1, schoolid);
           student.setString(2, c1);
           student.setString(3, bkm1);
           student.setString(4,gkm1);
           student.setString(5, tkm1);
           student.setString(6,mkm1 );
           student.execute();
           /*student.setString(1, schoolid);
           student.setString(2, c2);
           student.setString(3, bkm2);
           student.setString(4, gkm2);
           student.setString(5, mkm2);
           student.setString(6, tkm2);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c3);
           student.setString(3, bkm3);
           student.setString(4, gkm3);
           student.setString(5, mkm3);
           student.setString(6, tkm3);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c4);
           student.setString(3, bkm4);
           student.setString(4, gkm4);
           student.setString(5, mkm4);
           student.setString(6, tkm4);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c5);
           student.setString(3, bkm5);
           student.setString(4, gkm5);
           student.setString(5, mkm5);
           student.setString(6, tkm5);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c6);
           student.setString(3, bkm6);
           student.setString(4, gkm6);
           student.setString(5, mkm6);
           student.setString(6, tkm6);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c7);
           student.setString(3, bkm7);
           student.setString(4, gkm7);
           student.setString(5, mkm7);
           student.setString(6, tkm7);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c8);
           student.setString(3, bkm8);
           student.setString(4, gkm8);
           student.setString(5, mkm8);
           student.setString(6, tkm8);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c9);
           student.setString(3, bkm9);
           student.setString(4, gkm9);
           student.setString(5, mkm9);
           student.setString(6, tkm9);
           student.addBatch();
           student.setString(1, schoolid);
           student.setString(2, c10);
           student.setString(3, bkm10);
           student.setString(4, gkm10);
           student.setString(5, mkm10);
           student.setString(6, tkm10);
           student.addBatch();*/
           
           
          out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='volunteerpanel.jsp';");
                out.println("</script>");
           
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
