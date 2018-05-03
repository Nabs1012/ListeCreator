<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp"></jsp:include>

<body>
<section>
	<div class="container-fluid">
		<!-- premiere ligne ------------------------------------------->
		<div class="row">
			<!-- colonne 1 -->
			<div class="col-sm-4"></div>

			<!-- colonne 2 -->
			<div class="col-sm-4" id="form">
				<form method="POST" action="ServletLogin">
					<div class="form-group">
						<label for="login"></label><input type="text"
							class="form-control" id="login"
							placeholder="Login" name="login" required="true">
					</div>
					<div class="form-group">
						<label for="MotDePasse"></label><input type="password"
							class="form-control" id="MotDePasse"
							placeholder="mot de passe" name="password" required="true">
					</div>
	<button type="submit" class="btn" class="active">Connexion</button>
				</form>
			</div>
		</div>
	</div>

</section>
</body>
</html>