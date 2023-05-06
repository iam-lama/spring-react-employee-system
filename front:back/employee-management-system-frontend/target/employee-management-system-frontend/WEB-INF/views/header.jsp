<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	${message }
	<hr>
	<a href="/">Home</a> |
	<a href="employee-list">Employees</a> |
	<a href="about">About Us</a> |
	<a href="login">Login</a> |
	<hr>