package org.therestaurantmenu.tweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "GetMenuEntry", urlPatterns = { "getCurrentMenuEntry" }, loadOnStartup = 1)
public class GetMenuEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetMenuEntry() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
