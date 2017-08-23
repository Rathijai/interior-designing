<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="Admin">Admin</a></li>
        <li><a href="Aboutus">aboutus</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="Register"><span class="glyphicon glyphicon-log-in"></span> Register</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="http://osteencollege.com/PUC/wp-content/uploads/2016/08/InteriorDesigning.jpg" style="width:90%">
        <div class="carousel-caption">
        
        </div>      
      </div>

      <div class="item">
        <img src="http://doves-house.com/wp-content/uploads/2016/09/modern-kitchen-cabinet-colors-on-880x500.jpg" style= "width:90%">
        <div class="carousel-caption">
          
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">    
  <h3>What We Do</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <img src= "http://cdn.myfancyhouse.com/wp-content/uploads/2014/02/Classic-vs.-Modern-D%C3%A9cor-4.jpg" class="img-responsive" style="width:100%" >
      <p> Urban Style</p>
    </div>
    <div class="col-sm-4"> 
      <img src="https://s-media-cache-ak0.pinimg.com/736x/ca/9f/cd/ca9fcd8f7dc6afe8ed89121271bc6e27--urban-bedroom-bedroom-bed.jpg" class="img-responsive" style="width:100%" >
      <p>Modern classical</p>    
    </div>
    <div class="col-sm-4">
      <div class="well">
       <p>Interior Design provides a soul to a building or space and makes a space more functional pleasant and livable.</p>
      </div>
      <div class="well">
       <p>Interior design plays a big role in the everyday life. ..</p>
      </div>
    </div>
  </div>
</div><br>

<footer class="container-fluid text-center">
 <ul class="nav navbar-nav navbar-right">
 <a href="https://web.facebook.com/iamgurdeeposahan" target="_blank" class="fa fa-facebook"></a>
<a href="https://www.instagram.com/gurdeeposahan/" target="_blank" class="fa fa-instagram"></a>
<a href="https://twitter.com/gurdeeposahan1" target="_blank" class="fa fa-twitter"></a>
<a href="https://plus.google.com/u/0/105032594920038016998" target="_blank" class="fa fa-google"></a>
 >
</ul>
</footer>

</body>
</html>
