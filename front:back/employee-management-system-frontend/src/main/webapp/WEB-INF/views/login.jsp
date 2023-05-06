<%@ include file="header.jsp" %>
<h2> Login Page</h2>

<form:form action="add/employee"  modelAttribute="employee">
   <pre>
      Username   : <input /><br />
      Password   : <input type="password" /><br />
      
                   <input type="submit" class="btn btn-success" value="Login" />
      </pre>
   </form:form>

</body>
</html>