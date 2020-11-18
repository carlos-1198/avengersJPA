<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" 
integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
<title>Lista Heroes</title>
</head>
<body>
	 <!--HEADER-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <a class="navbar-brand" href="HeroeController?action=index"><img id="logo" class="ml-2" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages-wixmp-ed30a86b8c4ca887773594c2.wixmp.com%2Ff%2F846a9086-8a40-43e0-aa10-2fc7d6d73730%2Fdd4bz30-1d55fffc-6517-422f-9609-680cc512ef12.png%2Fv1%2Ffit%2Fw_150%2Ch_150%2Cstrp%2Favengers__endgame__2019__avengers_logo_png__by_mintmovi3_dd4bz30-150.png%3Ftoken%3DeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM4NSIsInBhdGgiOiJcL2ZcLzg0NmE5MDg2LThhNDAtNDNlMC1hYTEwLTJmYzdkNmQ3MzczMFwvZGQ0YnozMC0xZDU1ZmZmYy02NTE3LTQyMmYtOTYwOS02ODBjYzUxMmVmMTIucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.HSwQpmD6VQVxpTovHw2AfJBINQC5dmlYqKxjvTGP_Fo&f=1&nofb=1" class="d-inline-block align-top" alt="" loading="lazy"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="HeroeController?action=index">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Heroes</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Peliculas</a>
          </li>
        </ul>
      </div>
    </nav>
    <!--/HEADER-->
    
    <div class="container pt-3">
    	<div class="row">
        	<h3 class="text-center">Lista de Heroes</h3>
        	<a href="HeroeController?action=nuevo"><i id="plus-icon" class="fas fa-plus-circle"></i></a>
        </div>
        <div class="row">
	        <table class="table table-bordered">
	            <thead>
	                <tr>
	                    <th>CODIGO</th>
	                    <th>NOMBRE</th>
	                    <th>ALIAS</th>
	                    <th>GENERO</th>
	                    <th>ESTADO</th>
	                    <th>ACCIONES</th>
	                </tr>
	            </thead>
	            <tbody>
	                <!--   for (Todo todo: todos) {  -->
	         		<c:forEach var="heroe" items="${listaHeroes}">
	             	<tr>
		                 <td><c:out value="${heroe.id}" /></td>
		                 <td><c:out value="${heroe.nombre}" /></td>
		                 <td><c:out value="${heroe.heroe}" /></td>
		                 <td><c:out value="${heroe.generoBean.getId()}" /></td>
		                 <td><c:out value="${heroe.estadoBean.getId()}" /></td>
		                 <td class="d-flex justify-content-center"><a id="edit-icon" href="HeroeController?action=edit&id=${heroe.id}"><i class="fas fa-edit"></i></a>
                             <form action="HeroeController?action=delete&id=${heroe.id}" method="POST">
                                 <button id="delete-icon" type="submit" onclick="return confirm('Borrar?');"><i class="fas fa-trash-alt"></i></button>
                             </form>
                         </td>
	            	</tr>
	         		</c:forEach>
	         	</tbody>
	     	</table>
        </div>
    </div>
    
    <!--FOOTER-->
       <footer id="footer" class="navbar navbar-dark bg-primary ">
        <div class="container">
          <div class="row pt-3 col-12">
            <div class="col-12 text-center">
              <p>© 2020 All Rihts Reserved. Desarrollado por Carlos Mendoza</p>
            </div>     
          </div>
        </div>
      </footer>
    <!--/FOOTER-->
</body>
</html>