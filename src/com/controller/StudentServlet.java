package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Depart;
import com.pojo.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Depart d=new Depart();
    Student s=new Student();
    BLManager b=new BLManager();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sfname=request.getParameter("sfname");
		String slname=request.getParameter("slname");
		String sfaname=request.getParameter("sfaname");
		String smname=request.getParameter("smname");
		String semail=request.getParameter("semail");
		String sphone=request.getParameter("sphone");
		String saddress=request.getParameter("saddress");
		String sdateofbirth=request.getParameter("sdateofbirth");
		String dname=request.getParameter("dname");
		
		d=b.searchby(dname);
		

		s.setSfname(sfname);
		s.setSlname(slname);
		s.setSemail(semail);
		s.setSphone(sphone);
		s.setSaddress(saddress);
		s.setSdateofbirth(sdateofbirth);
		s.setSfaname(sfaname);
		s.setSmname(smname);
		s.setD(d);
		
		b.saveStudent(s);
		
		response.sendRedirect("Index.jsp");
	}

}
