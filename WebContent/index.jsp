<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Avengers</title>
  </head>              
  <body>
    <!--HEADER-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <a class="navbar-brand" href="#"><img id="logo" class="ml-2" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages-wixmp-ed30a86b8c4ca887773594c2.wixmp.com%2Ff%2F846a9086-8a40-43e0-aa10-2fc7d6d73730%2Fdd4bz30-1d55fffc-6517-422f-9609-680cc512ef12.png%2Fv1%2Ffit%2Fw_150%2Ch_150%2Cstrp%2Favengers__endgame__2019__avengers_logo_png__by_mintmovi3_dd4bz30-150.png%3Ftoken%3DeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM4NSIsInBhdGgiOiJcL2ZcLzg0NmE5MDg2LThhNDAtNDNlMC1hYTEwLTJmYzdkNmQ3MzczMFwvZGQ0YnozMC0xZDU1ZmZmYy02NTE3LTQyMmYtOTYwOS02ODBjYzUxMmVmMTIucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.HSwQpmD6VQVxpTovHw2AfJBINQC5dmlYqKxjvTGP_Fo&f=1&nofb=1" class="d-inline-block align-top" alt="" loading="lazy"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home</a>
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

    <!--BANNER-->
      <section id="banner">
        <div id="carousel" class="carousel slide" data-ride="carousel" data-pause="false">
          <div class="carousel-inner">
            <div class="carousel-item active" data-interval="10000">
                <img class="d-block w-100" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic3.srcdn.com%2Fwordpress%2Fwp-content%2Fuploads%2F2018%2F03%2FAvengers-1-Movie-Wallpaper.jpg&f=1&nofb=1" alt="Avengers 1">
            </div>
            <div class="carousel-item" data-interval="2000">
              <img class="d-block w-100" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fletsdownloadgame.com%2Fwp-content%2Fuploads%2F2019%2F12%2FDownload-marvels-avengers-game-apk-for-android-free.jpg&f=1&nofb=1" alt="Avengers 2">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.clickondetroit.com%2Fphoto%2F2018%2F12%2F07%2FAvengers%25204%2520trailer%2520screen%2520grab%25203_1544221647051.png_15291129_ver1.0_1280_720.jpg&f=1&nofb=1" alt="Avengers 3">
            </div>
          </div>
        </div>
      </section>
    <!--/BANNER-->

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

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>
