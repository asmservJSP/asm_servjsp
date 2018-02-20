<%-- 
    Document   : index
    Created on : Feb 20, 2018, 3:58:34 PM
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
            <h1>Admin films</h1>
            <div class="row">
                <div class="nav flex-column nav-pills col-xl-2 col-sm-4" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home" aria-selected="true">Home</a>
                    <a class="nav-link" id="v-pills-messages-tab" data-toggle="pill" href="#v-pills-film" role="tab" aria-controls="v-pills-messages" aria-selected="false">Add Films</a>
                    <a class="nav-link" id="v-pills-booking-tab" data-toggle="pill" href="#v-pills-booking" role="tab" aria-controls="v-pills-booking" aria-selected="false">View Booking</a>
                </div>
                <div class="tab-content col-xl-10 col-sm-8" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Start Date</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Path Banner</th>
                                    <th scope="col">Path Film</th>
                                    <th scope="col">Link Film</th>
                                    <th scope="col">Id Category</th>
                                    <th scope="col">Is Hot</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${restful.convertFromJsonFilm()}" var="f">
                                    <tr>
                                    <th scope="row">${f.id}</th>
                                    <td>${f.name}</td>
                                    <td>${f.startDate}</td>
                                    <td>${f.description}</td>
                                    <td>${f.pathBanner}</td>
                                    <td>${f.pathImg}</td>
                                    <td>${f.linkFilm}</td>
                                    <td>${f.idCategory}</td>
                                    <td>${f.isHot}</td>
                                    <td>${f.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="tab-pane fade" id="v-pills-film" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                        <form method="post" action="admin" enctype="multipart/form-data">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="name">Name Film</label>
                                    <input type="text" class="form-control" name="name" id="name" placeholder="Name">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="startDate">Start Date</label>
                                    <input type="date" class="form-control" name="startDate" id="startDate">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" name="description" rows="3"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="imgBanner">Image Banner</label>
                                <input type="file" class="form-control" name="imgBanner" id="imgBanner" >
                                <img id="imageShowBanner" src="images/imgBanner.png" width="100%" height="300px" />
                            </div>
                            <div class="form-group">
                                <label for="imgFilm">Image Film</label>
                                <input type="file" class="form-control" name="imgFilm" id="imgFilm" >
                                <img id="imageShowimgFilm" src="images/img100x200.png" width="100px" height="200px" />
                            </div>
                            <div class="form-group">
                                <label for="linkFilm">Link Film</label>
                                <input type="text" class="form-control" name="linkFilm" id="linkFilm">
                            </div>
                            <div class="form-group">
                                <label for="category">Category</label>
                                <select class="form-control" name="category" id="category">
                                    <c:forEach items="${restful.convertFromJsonCategory()}" var="c">
                                        <option value="${c.idCategory}">${c.nameCategory}</option>
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
                                <input type="number" class="form-control" name="price" id="price" placeholder="Price of ticket">
                            </div>
                            <button type="submit" class="btn btn-primary">Add</button>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="v-pills-booking" role="tabpanel" aria-labelledby="v-pills-booking-tab">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">First</th>
                                    <th scope="col">Last</th>
                                    <th scope="col">Handle</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>@mdo</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob</td>
                                    <td>Thornton</td>
                                    <td>@fat</td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td>Larry</td>
                                    <td>the Bird</td>
                                    <td>@twitter</td>
                                </tr>
                            </tbody>
                        </table>
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
