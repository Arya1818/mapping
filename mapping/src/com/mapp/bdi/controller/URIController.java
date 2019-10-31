package com.mapp.bdi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class URIController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static final String prefix = "/WEB-INF/view";
       private static final String suffix = ".jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		uri = prefix + uri.substring(4) + suffix; // "/uri/target" 에서 /target만 뽑아냄 
	//	System.out.println(uri);
		String msg = (String)request.getAttribute("msg");
		msg += "난 URIcontroller를 거치지";
		request.setAttribute("msg", msg); //아래를 다 가지고 오버라이딩target으로 감
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
