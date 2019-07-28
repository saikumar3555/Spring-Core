<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<c:choose>
    <c:when test="${!empty emp_list }">
         <table border="1">
             <tr bgcolor="red"><th>sNo</th> <th>empNo</th> <th>empName </th><th>job</th><th>salary</th> <th>deptNo</tr>
             <c:forEach var="emp"  items="${emp_list}">
                  <tr bgcolor="cyan">
                     <td>${emp.sno}</td>
                     <td>${emp.empNo}</td>
                     <td>${emp.ename}</td>
                     <td>${emp.job}</td>
                     <td>${emp.salary}</td>
                     <td>${emp.deptNo}</td>
                  </tr>
             </c:forEach>
         </table>
    </c:when>
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>

 <br><br>
   <a href="home.htm">home</a>    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
    <a href="JavaScript:showPrint()"> print</a>
    
    <script language="JavaScript">
        function  showPrint(){
        	frames.focus();
        	frames.print();
        }
    </script>
