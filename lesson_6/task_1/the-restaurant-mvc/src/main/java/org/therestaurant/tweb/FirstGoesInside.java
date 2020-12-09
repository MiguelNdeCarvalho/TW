package org.therestaurant.tweb;
                                
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstGoesInside", urlPatterns = {"firstInside"}, loadOnStartup = 1)                                 
public class FirstGoesInside extends HttpServlet {

        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)                                 
                        throws ServletException, IOException {
                response.getWriter().append("Manage Waiting List.");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                TheRestaurant.diningRoomList.add(TheRestaurant.waitingList.get(0));
		TheRestaurant.waitingList.remove(0);
		request.setAttribute("diningRoomList", TheRestaurant.diningRoomList);
		request.setAttribute("terraceList", TheRestaurant.terraceList);
		request.setAttribute("waitingList", TheRestaurant.waitingList);
                request.getRequestDispatcher("waitingList.jsp").forward(request, response);                                 
        }
}
