<%-- 
    Document   : edit.jsp
    Created on : Feb 21, 2018, 4:17:20 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="restful" class="asm.servjsp.models.covertJsonObject" />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
</head>

<body>
    <header>
        <div class="container-fluid">
            <h1><a href="index.jsp" style="text-decoration: none">Admin films</a></h1>
            <div class="row">
                <div class="nav flex-column nav-pills col-xl-2 col-sm-4" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="v-pills-edit-tab" data-toggle="pill" href="#v-pills-edit" role="tab" aria-controls="v-pills-edit" aria-selected="true">Edit</a>
                </div>
                <div class="tab-content col-xl-10 col-sm-8" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="v-pills-edit" role="tabpanel" aria-labelledby="v-pills-edit-tab">
                        <form method="post" action="film" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="idFilm">ID</label>
                                <input class="form-control" id="idFilm" name="idFilm" value="${film.id}">
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="name">Name Film</label>
                                    <input type="text" class="form-control" name="name" id="name" placeholder="Name" value="${film.name}">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="startDate">Start Date</label>
                                    <input type="date" class="form-control" name="startDate" id="startDate" value="${film.startDate}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" name="description" rows="3">${film.description}</textarea>
                            </div>
                            <div class="form-group">
                                <label for="imgBanner">Image Banner</label>
                                <input type="file" class="form-control" name="imgBanner" id="imgBanner" >
                                <img id="imageShowBanner" src="../${film.pathBanner}"  width="100%" height="300px" />
                            </div>
                            <div class="form-group">
                                <label for="imgFilm">Image Film</label>
                                <input type="file" class="form-control" name="imgFilm" id="imgFilm" >
                                <img id="imageShowimgFilm" src="../${film.pathImg}" width="150px" height="200px" />
                            </div>
                            <div class="form-group">
                                <label for="linkFilm">Link Film</label>
                                <input type="text" class="form-control" name="linkFilm" id="linkFilm" value="${film.linkFilm}">
                            </div>
                            <div class="form-group">
                                <label for="category">Category</label>
                                <select class="form-control" name="category" id="category">
                                    <c:forEach items="${restful.getListCategory('http://45.76.161.51/api/vi/categorys')}" var="c">
                                        <c:if test="${c.idCategory==film.idCategory}">
                                            <option value="${c.idCategory}" selected>${c.nameCategory}</option>
                                        </c:if>
                                        <c:if test="${c.idCategory!=film.idCategory}">
                                            <option value="${c.idCategory}">${c.nameCategory}</option>
                                        </c:if>
                                        
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Is hot</label><br>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="isHot" id="ishot" value="1" checked>
                                    <label class="form-check-label" for="exampleRadios1">
    True
  </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="isHot" id="ishot" value="2">
                                    <label class="form-check-label" for="exampleRadios2">
   False
  </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="price">Price</label>
                                <input type="number" class="form-control" name="price" id="price" placeholder="Price of ticket" value="${film.price}">
                            </div>
                            <button type="submit" class="btn btn-primary">Edit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </header>


    <script src="js/jquery-3.3.1.min.js" ></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <script src="js/minh.js"></script>
</body>

</html>

