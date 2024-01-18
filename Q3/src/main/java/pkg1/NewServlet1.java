/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ViP
 */
@WebServlet(name = "NewServlet1", urlPatterns = {"/NewServlet1"})

public class NewServlet1 extends HttpServlet {

 private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace the URL, username, and password with your database connection details
            String url = "jdbc:mysql://localhost:3306/savandb";
            String username = "root";
            String password = "";

            // Establish the database connection
            conn = DriverManager.getConnection(url, username, password);

            // Retrieve data from the Category_Master table
            String sql = "SELECT * FROM category_master";
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            // Write HTML response
            out.println("<html>");
            out.println("<head><title>Display Data</title></head>");
            out.println("<body>");
            out.println("<h2>Category_Master Table Data</h2>");
            out.println("<table border=\"1\">");
            out.println("<tr><th>Category ID</th><th>Category Name</th><th>Parent Category ID</th></tr>");

            // Iterate through the result set and display data
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getInt("Category_id") + "</td>");
                out.println("<td>" + resultSet.getString("Category_Name") + "</td>");
                out.println("<td>" + resultSet.getInt("parent_category_id") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources to prevent memory leaks
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            out.close();
        }
    }

}
