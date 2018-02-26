<%-- 
    Document   : movie-page-full.jsp
    Created on : Feb 24, 2018, 1:11:43 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="restful" class="asm.servjsp.models.covertJsonObject"></jsp:useBean>
<!doctype html>
<html> 
<head>
	<!-- Basic Page Needs -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AMovie - Movie page</title>
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
        <!-- Swiper slider -->
        <link href="css/external/idangerous.swiper.css" rel="stylesheet" />
        <!-- Magnific-popup -->
        <link href="css/external/magnific-popup.css" rel="stylesheet" />

    
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
        <%@include file="searchFilm.jsp" %>
        
        <!-- Main content -->
        <section class="container">
            <div class="col-sm-12">
                <div class="movie">
                    <h2 class="page-heading">${film.name}</h2>
                    
                    <div class="movie__info">
                        <div class="col-sm-4 col-md-3 movie-mobile">
                            <div class="movie__images">
                                <span class="movie__rating">5.0</span>
                                <img alt='' src="${film.pathImg}">
                            </div>
                            <div class="movie__rate">Your vote: <div id='score' class="score"></div></div>
                        </div>

                        <div class="col-sm-8 col-md-9">
                             <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${film.idCategory}"></c:set>
                              <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>   
                            <p class="movie__option"><strong>Category: </strong>${b.nameCategory}</p>
                            <p class="movie__option"><strong>Release date: </strong>${film.startDate}</p>

                            <div class="movie__btns movie__btns--full">
                                <a href="booking?id=${film.id}" class="btn btn-md btn--warning">book a ticket for this movie</a>
                            </div>
                        </div>
                    </div>
                    
                    <div class="clearfix"></div>
                    
                    <h2 class="page-heading">The plot</h2>

                    <p class="movie__describe">${film.description} </p>

                    <h2 class="page-heading">photos &amp; videos</h2>
                    
                    <div class="movie__media">
                        <div class="movie__media-switch">
                            <a href="#" class="watchlist list--photo" data-filter='media-photo'>234 photos</a>
                            <a href="#" class="watchlist list--video" data-filter='media-video'>10 videos</a>
                        </div>

                        <div class="swiper-container">
                          <div class="swiper-wrapper">
                              <!--First Slide-->
                              <div class="swiper-slide media-video">
                                <a href='${film.linkFilm}' class="movie__media-item ">
                                    <img alt='' src="${film.pathImg}" height="150%" width="90px">
                                </a>
                              </div>
                          </div>
                        </div>

                    </div>

                </div>

            </div>

        </section>
        
        <div class="clearfix"></div>

        <%@include file="footer.html" %>

</body>
</html>

