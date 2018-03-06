<%-- 
    Document   : index
    Created on : Feb 22, 2018, 12:21:01 AM
    Author     : Administrator
--%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <jsp:useBean id="restful" class="asm.servjsp.models.covertJsonObject"></jsp:useBean>
            <!doctype html>
            <html>

            <head>
                <!-- Basic Page Needs -->
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>AMovie</title>
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
                <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,700' rel='stylesheet' type='text/css'>
                <!-- Open Sans -->
                <link href='http://fonts.googleapis.com/css?family=Open+Sans:800italic' rel='stylesheet' type='text/css'>

                <!-- Stylesheets -->

                <!-- Mobile menu -->
                <link href="css/gozha-nav.css" rel="stylesheet" />
                <!-- Select -->
                <link href="css/external/jquery.selectbox.css" rel="stylesheet" />

                <!-- REVOLUTION BANNER CSS SETTINGS -->
                <link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.css" media="screen" />

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

                        <!-- Slider -->
                        <div class="bannercontainer">
                            <div class="banner">
                                <ul>
                                    <c:forEach items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="0" end="3" var="f">
                                        <c:choose>
                                            <c:when test="${f.name.length()<10}">
                                                <li data-transition="fade" data-slotamount="7" class="slide" data-slide='${f.name}'>
                                            </c:when>
                                            <c:when test="${f.name.length()>=10}">
                                                <li data-transition="fade" data-slotamount="7" class="slide" data-slide='${f.name.substring(0,10)}...'>
                                            </c:when>
                                        </c:choose>
                                            <img alt='' src="${f.pathBanner}">
                                            <div class="caption slide__name margin-slider" data-x="right" data-y="80" data-splitin="chars" data-elementdelay="0.1" data-speed="700"
                                                data-start="1400" data-easing="easeOutBack" data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;"
                                                data-frames="{ typ :lines;
                                                 elementdelay :0.1;
                                                 start:1650;
                                                 speed:500;
                                                 ease:Power3.easeOut;
                                                 animation:x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:1;transformPerspective:600;transformOrigin:50% 50%;
                                                 },
                                                 { typ :lines;
                                                 elementdelay :0.1;
                                                 start:2150;
                                                 speed:500;
                                                 ease:Power3.easeOut;
                                                 animation:x:0;y:0;z:0;rotationX:00;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:1;transformPerspective:600;transformOrigin:50% 50%;
                                                 }
                                                 " data-splitout="lines" data-endelementdelay="0.1" data-customout="x:-230;y:0;z:0;rotationX:0;rotationY:0;rotationZ:90;scaleX:0.2;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%"
                                                data-endspeed="500" data-end="8400" data-endeasing="Back.easeIn" style="font-size: 30px">
                                                ${f.name}
                                            </div>

                                            <div class="caption slide__time margin-slider sfr str" data-x="right" data-hoffset='-243' data-y="186" data-speed="300" data-start="2100"
                                                data-easing="easeOutBack" data-endspeed="300" data-end="8700" data-endeasing="Back.easeIn">
                                                From
                                            </div>
                                            <div class="caption slide__date margin-slider lfb ltb" data-x="right" data-hoffset='-149' data-y="186" data-speed="500" data-start="2400"
                                                data-easing="Power4.easeOut" data-endspeed="400" data-end="8200" data-endeasing="Back.easeIn">${f.startDate.substring(0,5)} </div>
                                            <div class="caption slide__time margin-slider sfr str" data-x="right" data-hoffset='-113' data-y="186" data-speed="300" data-start="2100"
                                                data-easing="easeOutBack" data-endspeed="300" data-end="8700" data-endeasing="Back.easeIn">
                                                - till
                                            </div>
                                            <div class="caption slide__date margin-slider lfb ltb" data-x="right" data-y="186" data-speed="500" data-start="2800" data-easing="Power4.easeOut"
                                                data-endspeed="400" data-end="8200" data-endeasing="Back.easeIn">
                                                ${f.startDate.substring(6,10)}
                                            </div>
                                            <div class="caption slide__text margin-slider customin customout" data-x="right" data-y="250" data-customin="x:0;y:100;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:3;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:0% 0%;"
                                                data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                                                data-speed="400" data-start="3000" data-endspeed="400" data-end="8000" data-endeasing="Back.easeIn">
                                                ${f.description.substring(0,70)}...
                                            </div>
                                            <div class="caption margin-slider skewfromright customout " data-x="right" data-y="324" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                                                data-speed="400" data-start="3300" data-easing="Power4.easeOut" data-endspeed="300"
                                                data-end="7700" data-endeasing="Power4.easeOut">
                                                <a href="details?id=${f.id}" class="slide__link">check out cinemas &amp; time</a>
                                            </div>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <!--end slider -->


                        <!-- Main content -->
                        <section class="container">
                            <div class="movie-best">
                                <div class="col-sm-10 col-sm-offset-1 movie-best__rating">Today Best choice</div>
                                <div class="col-sm-12 change--col">
                                    <c:forEach items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="0" end="5" var="a">
                                        <div class="movie-beta__item ">
                                            <img alt='' src="${a.pathImg}">
                                            <span class="best-rate">5.0</span>

                                            <ul class="movie-beta__info">
                                                <li>
                                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${a.idCategory}"></c:set>
                                                    <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>
                                                    <p>${b.nameCategory}</p>
                                                </li>
                                                <li class="last-block">
                                                    <a href="details?id=${a.id}" class="slide__link">more</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </c:forEach>

                                </div>
                                <div class="col-sm-10 col-sm-offset-1 movie-best__check">check all movies now playing</div>
                            </div>

                            <div class="clearfix"></div>

                            <h2 id='target' class="page-heading heading--outcontainer">Now in the cinema</h2>

                            <div class="col-sm-12">
                                <div class="row">
                                    <div class="col-sm-8 col-md-9">
                                        <c:forEach var="f" items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="0" end="1">
                                            <!-- Movie variant with time -->
                                            <div class="movie movie--test movie--test--dark movie--test--left">
                                                <div class="movie__images">
                                                    <a href="details?id=${f.id}" class="movie-beta__link">
                                                        <img alt='' src="${f.pathImg}">
                                                    </a>
                                                </div>

                                                <div class="movie__info">
                                                    <a href='details?id=${f.id}' class="movie__title">${f.name} </a>
                                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${f.idCategory}"></c:set>
                                                    <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>
                                                    <p class="movie__option">
                                                        <a href="details?id=${f.id}">${b.nameCategory}</a>
                                                    </p>

                                                    <div class="movie__rate">
                                                        <div class="score"></div>
                                                        <span class="movie__rating">4.1</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Movie variant with time -->
                                        </c:forEach>
                                        <c:forEach var="f" items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="2" end="3">
                                            <!-- Movie variant with time -->
                                            <div class="movie movie--test movie--test--dark movie--test--right">
                                                <div class="movie__images">
                                                    <a href="details?id=${f.id}" class="movie-beta__link">
                                                        <img alt='' src="${f.pathImg}">
                                                    </a>
                                                </div>

                                                <div class="movie__info">
                                                    <a href='details?id=${f.id}' class="movie__title">${f.name} </a>
                                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${f.idCategory}"></c:set>
                                                    <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>
                                                    <p class="movie__option">
                                                        <a href="details?id=${f.id}">${b.nameCategory}</a>
                                                    </p>

                                                    <div class="movie__rate">
                                                        <div class="score"></div>
                                                        <span class="movie__rating">4.1</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Movie variant with time -->
                                        </c:forEach>
                                        <c:forEach var="f" items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="4" end="5">
                                            <!-- Movie variant with time -->
                                            <div class="movie movie--test movie--test--dark movie--test--left">
                                                <div class="movie__images">
                                                    <a href="details?id=${f.id}" class="movie-beta__link">
                                                        <img alt='' src="${f.pathImg}">
                                                    </a>
                                                </div>

                                                <div class="movie__info">
                                                    <a href='details?id=${f.id}' class="movie__title">${f.name} </a>
                                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${f.idCategory}"></c:set>
                                                    <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>
                                                    <p class="movie__option">
                                                        <a href="details?id=${f.id}">${b.nameCategory}</a>
                                                    </p>

                                                    <div class="movie__rate">
                                                        <div class="score"></div>
                                                        <span class="movie__rating">4.1</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Movie variant with time -->
                                        </c:forEach>
                                        <c:forEach var="f" items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" begin="6" end="7">
                                            <!-- Movie variant with time -->
                                            <div class="movie movie--test movie--test--dark movie--test--right">
                                                <div class="movie__images">
                                                    <a href="details?id=${f.id}" class="movie-beta__link">
                                                        <img alt='' src="${f.pathImg}">
                                                    </a>
                                                </div>

                                                <div class="movie__info">
                                                    <a href='details?id=${f.id}' class="movie__title">${f.name} </a>
                                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${f.idCategory}"></c:set>
                                                    <c:set var="b" value="${restful.getListCategory(url).get(0)}"></c:set>
                                                    <p class="movie__option">
                                                        <a href="details?id=${f.id}">${b.nameCategory}</a>
                                                    </p>

                                                    <div class="movie__rate">
                                                        <div class="score"></div>
                                                        <span class="movie__rating">4.1</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Movie variant with time -->
                                        </c:forEach>
                                    </div>
                                    <aside class="col-sm-4 col-md-3">
                                        <div class="sitebar first-banner--left">
                                            <div class="banner-wrap first-banner--left">
                                                <img alt='banner' src="images/banners/sale.jpg">
                                            </div>

                                            <div class="banner-wrap">
                                                <img alt='banner' src="images/banners/sport.jpg">
                                            </div>

                                            <div class="banner-wrap banner-wrap--last">
                                                <img alt='banner' src="images/banners/boots.jpg">
                                            </div>

                                            <div class="promo marginb-sm">
                                                <div class="promo__head">A.Movie app</div>
                                                <div class="promo__describe">for all smartphones
                                                    <br> and tablets</div>
                                                <div class="promo__content">
                                                    <ul>
                                                        <li class="store-variant">
                                                            <a href="#">
                                                                <img alt='' src="images/apple-store.svg">
                                                            </a>
                                                        </li>
                                                        <li class="store-variant">
                                                            <a href="#">
                                                                <img alt='' src="images/google-play.svg">
                                                            </a>
                                                        </li>
                                                        <li class="store-variant">
                                                            <a href="#">
                                                                <img alt='' src="images/windows-store.svg">
                                                            </a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>

                                        </div>
                                    </aside>
                                </div>
                            </div>
                        </section>
                        <div class="clearfix"></div>

                        <%@include file="footer.html" %>
                            <!-- JavaScript-->
                            <!-- jQuery 1.9.1-->
                            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
                            <script>
                                window.jQuery || document.write(
                                    '<script src="js/external/jquery-1.10.1.min.js"><\/script>')
                            </script>
                            <!-- Migrate -->
                            <script src="js/external/jquery-migrate-1.2.1.min.js"></script>
                            <!-- Bootstrap 3-->
                            <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

                            <!-- jQuery REVOLUTION Slider -->
                            <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
                            <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.revolution.min.js"></script>

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

                            <!-- Twitter feed -->
                            <script src="js/external/twitterfeed.js"></script>

                            <!-- Custom -->
                            <script src="js/custom.js"></script>

                            <script type="text/javascript">
                                $(document).ready(function () {
                                    init_Home();
                                });
                            </script>
            </body>

            </html>