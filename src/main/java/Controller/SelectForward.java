package Controller;

import Bean.Account;
import DB.DBconnection;
import Dao.selectDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import java.util.List;

@WebServlet("/SelectForward")
public class SelectForward extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = DBconnection.CreateConnection();

        List<Account> list = selectDao.SelectAccount(conn);

        request.setAttribute("listaccount",list);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Home.jsp");
        rd.forward(request,response);
    }
}
