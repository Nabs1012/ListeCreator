<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>Liste des taches</title> -->
<!-- </head> -->
<jsp:include page="header.jsp"></jsp:include>
<body>
<div class="container">
	<h1>TODO LIST</h1>
	<c:forEach items="${listetache}" var="tache">
		<div title="${tache.idTache }">
			<h2>${tache.titre }</h2>
			<h3>${tache.priorite}</h3>
			<p>${tache.tache }</p>
		</div>
		
		<c:url value="/deleteTache" var="deleteUrl" />
 <a class="btn btn-danger" href="${deleteUrl}?idTache=${tache.idTache}">Supprimer Tache</a>

		
												

	</c:forEach>
	<!-- On est coté serveur (serveur/jsp/source) le c:url permet de mettre devant l'url le context root -->
	<c:url value="/form.html" var="createUrl"/>
	<a href="${createUrl}"> clic ici!!!</a>
	
	</div>
</body>
</html>