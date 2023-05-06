<%@ include file="header.jsp"%>

<div class="container">
   <form:form action="add/employee"  modelAttribute="employee">
   <pre>
      Username   : <form:input path="username" placeholder="Enter Username"/><br />
      Password   : <form:password path="password" placeholder="Enter Password"/><br />
      Name       : <form:input path="name" placeholder="Enter Name"/><br />
      Experience : <form:input path="experience" placeholder="Experience"/><br />
      Age        : <form:input path="age" placeholder="Enter Age"/><br />
      Phone      : <form:input path="phone" placeholder="Phone Number"/><br />
      Salary     : <form:input path="salary" placeholder="Enter Salary"/><br />
                   <input type="submit" class="btn btn-success" value="Register" />
      </pre>
   </form:form>
    

<hr>
<table class="table">
	<tr>
		<th>Id</th>
		<th>Username</th>
		<th>Name</th>
		<th>Experience</th>
		<th>Age</th>
		<th>Phone</th>
		<th>Salary</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="employee" items="${employees }">
		<tr>
			<td>${employee.id }</td>
			<td>${employee.username }</td>
			<td>${employee.name }</td>
			<td>${employee.experience }</td>
			<td>${employee.age }</td>
			<td>${employee.phone }</td>
			<td>${employee.salary }</td>
			<td><a hred="#">Update</a> | <a href="<c:url value='/remove/employee/${employee.id }' />">Delete</a></td>
		</tr>
	</c:forEach>

</table>
</div>
</body>
</html>