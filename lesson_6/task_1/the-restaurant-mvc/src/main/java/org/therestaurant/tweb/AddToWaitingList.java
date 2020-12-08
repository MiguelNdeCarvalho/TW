package org.therestaurant.tweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.util.ArrayList;
//import org.therestaurant.tweb.TheRestaurant;


@WebServlet(name = "AddToWaitingList", urlPatterns = {"waitingList"}, loadOnStartup = 1) 
public class AddToWaitingList extends HttpServlet {
	//ArrayList<String> waitingList = new ArrayList<String>();

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Welcome to The Restaurant. ");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String name = request.getParameter("name");
		TheRestaurant.waitingList.add(name);
		request.setAttribute("clientName", name);
		request.setAttribute("waitingSize", TheRestaurant.waitingList.size() - 1);
	 	request.setAttribute("waitingList", TheRestaurant.waitingList);
		request.getRequestDispatcher("addClientToWaitingListResponse.jsp").forward(request, response); 
	}
}
