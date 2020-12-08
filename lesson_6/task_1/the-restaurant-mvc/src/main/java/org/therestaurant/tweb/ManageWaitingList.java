package org.therestaurant.tweb;
                                
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ManageWaitingList", urlPatterns = {"manageWaitingList"}, loadOnStartup = 1)                                 
public class ManageWaitingList extends HttpServlet {

        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)                                 
                        throws ServletException, IOException {
                response.getWriter().append("Manage Waiting List.");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                request.setAttribute("waitingSize", TheRestaurant.waitingList.size() - 1);
                request.setAttribute("waitingList", TheRestaurant.waitingList);
                request.getRequestDispatcher("addClientToWaitingListResponse.jsp").forward(request, response);                                 
        }
	protected void removeWaitingInside(HttpServletRequest request, HttpServletResponse response){
		TheRestaurant.diningRoomList.add(TheRestaurant.waitingList.get(0));
		TheRestaurant.waitingList.remove(0);
		request.getRequestDispatcher("manageWaitingList.jsp");
	}
	protected void removeWaitingOutside(HttpServletRequest request, HttpServletResponse response){                               
                TheRestaurant.terraceList.add(TheRestaurant.waitingList.get(0));                                                                                                          
                TheRestaurant.waitingList.remove(0);                                                                                                                                         
                request.getRequestDispatcher("manageWaitingList.jsp");                                                                                                                       
        }
}
