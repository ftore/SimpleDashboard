<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Create Content
</h1>
	<form:form modelAttribute="content" method="post">
		<form:hidden path="boardId"/>
		
		<table>
			<tr>
				<th>Title</th>
				<td>
					<form:input path="title" placeholder="Title" />
					<label>
						<form:errors path="title" />
					</label>
				</td>
			</tr>
			<tr>
				<th>Contents</th>
				<td>
					<form:textarea path="contents" placeholder="Contents"></form:textarea>
					<label>
						<form:errors path="contents" />
					</label>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>