package org.therestaurantmenu.tweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "AddItem", urlPatterns = { "addItem" }, loadOnStartup = 1)
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddItem() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); 
		String id = request.getParameter("id");
		session.setAttribute("id", id);
		response.getWriter().append(Menu.getEntry(id));
	}
}
