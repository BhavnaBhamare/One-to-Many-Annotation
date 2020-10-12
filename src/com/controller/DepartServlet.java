package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Depart;

@WebServlet("/DepartServlet")
public class DepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DepartServlet() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dname=request.getParameter("dname");
		String dphone=request.getParameter("dphone");
		String demail=request.getParameter("demail");
		
		Depart d=new Depart();
		
		d.setDname(dname);
		d.setDphone(dphone);
		d.setDemail(demail);
		
		BLManager b=new BLManager();
		b.saveDepart(d);
		
		response.sendRedirect("Index.jsp");
	}

}
