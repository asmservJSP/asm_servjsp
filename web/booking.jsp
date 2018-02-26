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
                        </div>

                        <div class="col-sm-8 col-md-9">
                             <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${film.idCategory}"></c:set>
                              <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>   
                            <p class="movie__option"><strong>Category: </strong>${b.nameCategory}</p>
                            <p class="movie__option"><strong>Release date: </strong>${film.startDate}</p>
                            <p class="movie__option"><strong>Price: </strong>${film.price} <strong>VNĐ</strong></p>
                        </div>
                    </div>
                </div>
                 <form id='contact-info' method='post' action="booking" novalidate="" class="form contact-info">
                     <input type="hidden" value="${film.id}" name="film-id">
                    <div class="contact-info__field contact-info__field-name">
                        <input type='text' name='user-name' placeholder='Your name' class="form__mail">
                        </div>
                        <div class="contact-info__field contact-info__field-mail">
                            <input type='email' name='email' id="email" placeholder='Your email' class="form__mail">
                        </div>
                        <div class="contact-info__field contact-info__field-tel">
                            <input type='tel' name='user-tel' placeholder='Phone number' class="form__mail">
                        </div>
                        <div class="contact-info__field contact-info__field-quality">
                            <input type='number' name='quatity' id="quality" placeholder='Quality' class="form__mail">
                        </div>
                        </br>
                        <button class="btn btn-md btn--warning btn--wide" type="submit">Buy</button>
                    </form>
                
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
        <!-- Bootstrap 3--> 
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

        <!-- Mobile menu -->
        <script src="js/jquery.mobile.menu.js"></script>
         <!-- Select -->
        <script src="js/external/jquery.selectbox-0.2.min.js"></script>

        <!-- Form element -->
        <script src="js/external/form-element.js"></script>
        <!-- Form validation -->
        <script src="js/form.js"></script>

        <!-- Custom -->
        <script src="js/custom.js"></script>
</body>
</html>

