<!-- Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pst = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        String query = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        pst = conn.prepareStatement(query);
        pst.setInt(1, Integer.parseInt(empno));
        pst.setString(2, empname);
        pst.setInt(3, Integer.parseInt(basicsalary));

        int i = pst.executeUpdate();
        if(i > 0){
            out.println("<h3>Employee added successfully.</h3>");
        } else {
            out.println("<h3>Failed to add employee.</h3>");
        }
    } catch(Exception e){
        out.println("Error: " + e.getMessage());
    } finally {
        if(pst != null) pst.close();
        if(conn != null) conn.close();
    }
%>
<br>
<a href="delete.html">Go to Delete 'S' Employees</a><br>
<a href="viewReportAfterDelete.jsp">View All Employees</a>
