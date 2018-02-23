<%-- 
    Document   : film-show-now
    Created on : Feb 24, 2018, 2:27:16 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="restful" class="asm.servjsp.models.covertJsonObject" ></jsp:useBean>
<!doctype html>
<html>
<head>
	<!-- Basic Page Needs -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AMovie - Movie list</title>
        <meta name="description" content="A Template by Gozha.net">
        <meta name="keywords" content="HTML, CSS, JavaScript">
        <meta name="author" content="Gozha.net">
    
    <!-- Mobile Specific Metas-->
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="telephone=no" name="format-detection">
    
    <!-- Fonts -->
        <!-- Font awesome - icon font -->
        <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <!-- Roboto -->
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>
    
    <!-- Stylesheets -->
        <!-- jQuery UI -->
        <link href="http://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css" rel="stylesheet">

        <!-- Mobile menu -->
        <link href="css/gozha-nav.css" rel="stylesheet" />
        <!-- Select -->
        <link href="css/external/jquery.selectbox.css" rel="stylesheet" />
    
        <!-- Custom -->
        <link href="css/style.css?v=1" rel="stylesheet" />

        <!-- Modernizr --> 
        <script src="js/external/modernizr.custom.js"></script>
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries --> 
    <!--[if lt IE 9]> 
    	<script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.js"></script> 
		<script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.3.0/respond.js"></script>		
    <![endif]-->
</head>

<body> 
    <div class="wrapper">
        <%@include file="header.html" %>
        
        <!-- Search bar -->
        <div class="search-wrapper">
            <div class="container container--add">
                <form id='search-form' method='get' class="search">
                    <input type="text" class="search__field" placeholder="Search">
                    <select name="sorting_item" id="search-sort" class="search__sort" tabindex="0">
                        <option value="1" selected='selected'>By title</option>
                        <option value="2">By year</option>
                        <option value="3">By producer</option>
                        <option value="4">By title</option>
                        <option value="5">By year</option>
                    </select>
                    <button type='submit' class="btn btn-md btn--danger search__button">search a movie</button>
                </form>
            </div>
        </div>
        
        <!-- Main content -->
        <section class="container">
            <div class="col-sm-12">
                <h2 class="page-heading">Movies</h2>
                <c:forEach items="${restful.getListFilm('')}" var="f"></c:forEach>
                <!-- Movie preview item -->
                <div class="movie movie--preview movie--full">
                     <div class="col-sm-3 col-md-2 col-lg-2">
                            <div class="movie__images">
                                <img alt='' src="images/movie/movie-sample1.jpg">
                            </div>
                            <div class="movie__feature">
                                <a href="#" class="movie__feature-item movie__feature--comment">123</a>
                                <a href="#" class="movie__feature-item movie__feature--video">7</a>
                                <a href="#" class="movie__feature-item movie__feature--photo">352</a>
                            </div>
                    </div>

                    <div class="col-sm-9 col-md-10 col-lg-10 movie__about">
                            <a href='movie-page-full.html' class="movie__title link--huge">Last Vegas (2013)</a>

                            <p class="movie__time">105 min</p>

                            <p class="movie__option"><strong>Country: </strong><a href="#">USA</a></p>
                            <p class="movie__option"><strong>Category: </strong><a href="#">Comady</a></p>
                            <p class="movie__option"><strong>Release date: </strong>November 1, 2013</p>
                            <p class="movie__option"><strong>Director: </strong><a href="#">Jon Turteltaub</a></p>
                            <p class="movie__option"><strong>Actors: </strong><a href="#">Robert De Niro</a>, <a href="#">Michael Douglas</a>, <a href="#">Morgan Freeman</a>, <a href="#">Kevin Kline</a>, <a href="#">Mary Steenburgen</a>, <a href="#">Jerry Ferrara</a>, <a href="#">Romany Malco</a> <a href="#">...</a></p>
                            <p class="movie__option"><strong>Age restriction: </strong><a href="#">13</a></p>

                            <div class="movie__btns">
                                <a href="#" class="btn btn-md btn--warning">book a ticket <span class="hidden-sm">for this movie</span></a>
                                <a href="#" class="watchlist">Add to watchlist</a>
                            </div>
                    </div>

                    <div class="clearfix"></div>

                </div>
                <!-- end movie preview item -->

                <div class="coloum-wrapper">
                    <div class="pagination paginatioon--full">
                            <a href='#' class="pagination__prev">prev</a>
                            <a href='#' class="pagination__next">next</a>
                    </div>
                </div>

            </div>

        </section>
        
        <div class="clearfix"></div>
        <%@include file="footer.html" %>
<!-- JavaScript-->
        <!-- jQuery 1.9.1--> 
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/external/jquery-1.10.1.min.js"><\/script>')</script>
        <!-- Migrate --> 
        <script src="js/external/jquery-migrate-1.2.1.min.js"></script>
        <!-- jQuery UI -->
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <!-- Bootstrap 3--> 
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

        <!-- Mobile menu -->
        <script src="js/jquery.mobile.menu.js"></script>
         <!-- Select -->
        <script src="js/external/jquery.selectbox-0.2.min.js"></script> 

        <!-- Stars rate -->
        <script src="js/external/jquery.raty.js"></script>

        <!-- Form element -->
        <script src="js/external/form-element.js"></script>
        <!-- Form validation -->
        <script src="js/form.js"></script>

        <!-- Custom -->
        <script src="js/custom.js"></script>
		
		<script type="text/javascript">
            $(document).ready(function() {
                init_MovieList();
            });
		</script>
</body>
</html>

