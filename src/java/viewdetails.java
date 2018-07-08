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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prashanth
 */
public class viewdetails extends HttpServlet {

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
        String sid=request.getParameter("id");
        int schoolid=Integer.parseInt(sid);
        HttpSession session=request.getSession();
        session.setAttribute(sid, schoolid);
        response.sendRedirect("viewalldetails.jsp");
       
       
    }
}
