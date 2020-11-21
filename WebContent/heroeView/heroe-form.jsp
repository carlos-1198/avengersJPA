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
<title>Insert title here</title>
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
            <a class="nav-link" href="HeroeController?action=listar">Heroes</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Peliculas</a>
          </li>
        </ul>
      </div>
    </nav>
    <!--/HEADER-->
	
	<div class="container col-md-5 pt-3">
        <div class="card">
            <div class="card-body">
                <c:if test="${heroe != null}">
                    <form action="HeroeController?action=update" method="post">
                </c:if>
                <c:if test="${heroe == null}">
                    <form action="HeroeController?action=insert" method="post">
                </c:if>

                <caption>
                    <h2>
                        <c:if test="${heroe != null}">
                            Edit Heroe
                        </c:if>
                        <c:if test="${heroe == null}">
                            Add New Heroe
                        </c:if>
                    </h2>
                </caption>

                <c:if test="${heroe != null}">
                    <input type="hidden" name="id" value="<c:out value='${heroe.id}' />" />
                </c:if>

                <fieldset class="form-group">
                    <label>nombre</label> <input type="text" value="<c:out value='${heroe.nombre}' />" class="form-control" name="nombre" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>alias</label> <input type="text" value="<c:out value='${heroe.heroe}' />" class="form-control" name="alias">
                </fieldset>

                <fieldset class="form-group">
                <label for="estados">estado</label>
                	 <select class="form-control" id="estados" name="estados">
            			<c:forEach var="estado" items="${estados}">
            			<option value="${estado.id}"><c:out value="${estado.descripcion}" /></option>
			            </c:forEach>
       				 </select>
                    <!--<label>estado</label> <input type="text" value="<c:out value='${heroe.estadoBean}' />" class="form-control" name="estado"> -->
                </fieldset>
                
                <fieldset class="form-group">
                	<label for="generos">genero</label>
                	 <select class="form-control" id="generos" name="generos">
            			<c:forEach var="genero" items="${generos}">
            			<option value="${genero.id}"><c:out value="${genero.descripcion}" /></option>
			            </c:forEach>
       				 </select>
                </fieldset> 
                <button type="submit" class="btn btn-success">Save</button>
                </form>
            </div>
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