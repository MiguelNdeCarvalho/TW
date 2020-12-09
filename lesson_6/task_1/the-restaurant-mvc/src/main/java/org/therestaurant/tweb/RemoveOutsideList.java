package org.therestaurant.tweb;
                                
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RemoveOutsideList", urlPatterns = {"removeOutsideList"}, loadOnStartup = 1)                                 
public class RemoveOutsideList extends HttpServlet {

        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)                                 
                        throws ServletException, IOException {
                response.getWriter().append("Remove Outside List.");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        	String id = request.getParameter("id");
                TheRestaurant.terraceList.remove(Integer.parseInt(id));
                request.setAttribute("waitingList", TheRestaurant.waitingList);
                request.setAttribute("diningRoomList", TheRestaurant.diningRoomList);
                request.setAttribute("terraceList", TheRestaurant.terraceList);
		request.getRequestDispatcher("waitingList.jsp").forward(request, response);
	}
}
