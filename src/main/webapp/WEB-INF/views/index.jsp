<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Dashboard List
</h1>

	<c:if test="${not empty successMessage}">
		
		<span style="color: green"><spring:message code="${successMessage}" /></span>
			
	</c:if>
	<c:if test="${not empty errorMessage}">
		
		<span style="color: red"><spring:message code="${errorMessage}" /></span>
			
	</c:if>

	<br />
	<a href="/create">Create new Content</a>
	
	<table class="table table-bordered table-striped dataTable">
		<thead>
			<tr role="row">
				<th style="width: 5%;">No</th>
				<th style="width: 36%;">Title</th>
				<th style="width: 12%;">Published</th>
				<th style="width: 15%;">Created By</th>
				<th style="width: 12%;">Created</th>
				<th style="width: 8%;">Hits</th>
				<th style="width: 12%;">Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="content" items="${contentList}" varStatus="loop">
				<tr>
					<td>${content.boardId}</td>
					<td><a href="/details/${content.boardId}">${content.title}</a></td>
					<td>
						${content.published == 1 ? '<p class=\'text-green\'>Published</p>' : '<p class=\'text-red\'>Unpublished</p>'}
					</td>
					<td>${content.creator}</td>
					<td>${content.created}</td>
					<td>${content.hits}</td>
					<td>
						<ul>
							<li>
								<a href="/board/${content.boardId}">
									Update
								</a>
							</li>
							<li>
								<c:choose>
									<c:when test="${content.published == 1}">
										<a href="/board/list/${content.boardId}/unpublish">Unpublish</a>
									</c:when>
									<c:otherwise>
										<a href="/board/list/${content.boardId}/publish">Publish</a>
									</c:otherwise>
								</c:choose>
							</li>
							<li>
								<a href="/board/list/${content.boardId}/delete" class="deleteContent">
									Delete
								</a>
							</li>
						</ul>
					</td>
				</tr>
			</c:forEach>
			<c:if test="${empty contentList}">
				<tr>
					<td colspan="2">No data.</td>
				</tr>
			</c:if>
		</tbody>
	</table>
</body>
</html>
