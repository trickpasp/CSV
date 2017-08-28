<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="url_base" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet"
	href="${url_base}css/materialize.min.css" media="screen,projection" />
<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>CSV</title>
</head>
<body>

	<div class="container">
		<div class="card-panel hoverable">
			<div class="row">
				<form class="col s9 offset-s1" action="inserir" method="post">
					<div class="row">
						<div class="input-field col s6">
							<i class="material-icons prefix">account_circle</i> <input
								id="icon_prefix" type="text" class="validate" name="nome"> <label
								for="icon_prefix">Nome</label>
						</div>
						<div class="input-field col s6">
							<i class="material-icons prefix">add_location</i> <input
								id="icon" type="text" class="validate" name="end"> <label
								for="icon">Endereço</label>
						</div>
						<div class="input-field col s6">
							<i class="material-icons prefix">phone</i> <input
								id="icon_telephone" type="tel" class="validate" name="tel"> <label
								for="icon_telephone">Telefone</label>
						</div>
						<div class="input-field col s6">
							<i class="material-icons prefix">email</i> <input id="email"
								type="email" class="validate" name="email"> <label for="email"
								data-error="wrong" data-success="right">Email</label>
						</div>
						<div class="input-field col s8 offset-s5">
							<button class="btn waves-effect waves-light" type="submit"
								name="action">
								Submit <i class="material-icons right">send</i>
							</button>
						</div>

					</div>
				</form>

			</div>
		</div>
		<c:if test="${not empty csv }">
			<div class="row">
				<div class="col s8 offset-s2">
					<table class="striped">
						<thead>
							<tr>

								<th>Nome</th>
								<th>Endereço</th>
								<th>Telefone</th>
								<th>email</th>

							</tr>
						</thead>

						<tbody>
							<c:forEach var="e" items="${csv}">
								<tr>
									<td>${e.nome}</td>
									<td>${e.end }</td>
									<td>${e.tel}</td>
									<td>${e.email}</td>
								</tr>
							</c:forEach>


						</tbody>
					</table>
				</div>
			</div>
		</c:if>
	</div>


	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="${url_base}js/materialize.min.js"></script>
</body>
</html>