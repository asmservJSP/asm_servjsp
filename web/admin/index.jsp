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
            <h1><a href="index.jsp" style="text-decoration: none;color:black">Admin films</a></h1>
            <div class="row">
                <div class="nav flex-column nav-pills col-xl-2 col-sm-4" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home" aria-selected="true">Home</a>
                    <a class="nav-link" id="v-pills-messages-tab" data-toggle="pill" href="#v-pills-film" role="tab" aria-controls="v-pills-messages" aria-selected="false">Add Films</a>
                    <a class="nav-link" id="v-pills-category-tab" data-toggle="pill" href="#v-pills-category" role="tab" aria-controls="v-pills-category" aria-selected="false">Category</a>
                    <a class="nav-link" id="v-pills-booking-tab" data-toggle="pill" href="#v-pills-booking" role="tab" aria-controls="v-pills-booking" aria-selected="false">View Booking</a>
                </div>
                <div class="tab-content col-xl-10 col-sm-8" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Start</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Path Banner</th>
                                    <th scope="col">Path Img</th>
                                    <th scope="col">Link Film</th>
                                    <th scope="col">Category</th>
                                    <th scope="col">Hot</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">CRUD</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${restful.getListFilm('http://45.76.161.51/api/vi/films')}" var="f">
                                    <tr>
                                    <th scope="row">${f.id}</th>
                                    <td><p style="width: 100px">${f.name}</p></td>
                                    <td><p style="white-space: nowrap;">${f.startDate}</p></td>
                                    <c:if test="${f.description.length() <50}">
                                        <td>${f.description}</td>
                                    </c:if>
                                    <c:if test="${f.description.length() >50}">
                                        <td><p style="width: 100px">${f.description.substring(0,100)}...</p></td>
                                    </c:if>
                                    <td><img src="../${f.pathBanner}" style="width: 300px;height: 150px" /></td>
                                    <td><img src="../${f.pathImg}" style="width: 150px;height: 150px" /></td>
                                    <td>${f.linkFilm}</td>
                                    <c:set var="url" value="http://45.76.161.51/api/vi/categorys/+${f.idCategory}"></c:set>
                                    <c:set var="c" value="${restful.getListCategory(url)[0].getNameCategory()}"></c:set>
                                    <td>${c}</td>
                                    <c:choose>
                                        <c:when test="${'1'==f.isHot}">
                                            <td>True</td>
                                        </c:when>
                                        <c:when test="${'0'==f.isHot}">
                                         <td>False</td>
                                        </c:when>
                                    </c:choose>
                                         <td>${f.price}</td>
                                         <td>
                                             <div><a href="admin?id=${f.id}&method=delete">Delete</a></div>
                                             <div><a href="admin?id=${f.id}&method=edit">Edit</a></div>
                                         </td>
                                         
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
                                <img id="imageShowBanner" src="images/imgBanner.png"  width="100%" height="300px" />
                            </div>
                            <div class="form-group">
                                <label for="imgFilm">Image Film</label>
                                <input type="file" class="form-control" name="imgFilm" id="imgFilm" >
                                <img id="imageShowimgFilm" src="images/img100x200.png" width="150px" height="200px" />
                            </div>
                            <div class="form-group">
                                <label for="linkFilm">Link Film</label>
                                <input type="text" class="form-control" name="linkFilm" id="linkFilm">
                            </div>
                            <div class="form-group">
                                <label for="category">Category</label>
                                <select class="form-control" name="category" id="category">
                                    <c:forEach items="${restful.getListCategory('http://45.76.161.51/api/vi/categorys')}" var="c">
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
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Phone</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Film</th>
                                    <th scope="col">Quality</th>
                                    <th scope="col">CRUD</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${restful.getListBooking('http://45.76.161.51/api/vi/bookings')}" var="q">
                                    <tr>
                                        <td>${q.idBooking}</td>
                                        <td>${q.name}</td>
                                        <td>${q.phone}</td>
                                        <td>${q.email}</td>
                                        <c:set var="url" value="http://45.76.161.51/api/vi/films/${q.idFilm}"></c:set>
                                        <c:set var="b" value="${restful.getListFilm(url).get(0)}"></c:set>
                                        <td>${b.name}</td>
                                        <td>${q.quality}</td>
                                        <td>
                                            <div><a href="booking?delete=${q.idBooking}">Delete</a></div>
                                            <div><a href="booking?edit=${q.idBooking}">Edit</a></div>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="tab-pane fade" id="v-pills-category" role="tabpanel" aria-labelledby="v-pills-category-tab">
                        <!-- Button trigger modal -->
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                  +
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                  <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <form method="post" action="addC">
                                      <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Add category</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                          <span aria-hidden="true">&times;</span>
                                        </button>
                                      </div>
                                      <div class="modal-body">
                                          
                                             <div class="form-group">
                                                <label for="category">Category</label>
                                                <input type="text" class="form-control" name="category" id="category" placeholder="category input">
                                              </div>
                                          
                                      </div>
                                      <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                        <button type="submit" class="btn btn-primary">Add</button>
                                      </div>
                                        </form>
                                    </div>
                                  </div>
                                </div>
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Category</th>
                                    <th scope="col">Relative</th>
                                    <th scope="col">CRUD</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${restful.getListCategory('http://45.76.161.51/api/vi/categorys')}" var ="c">
                                    <tr>
                                    <th scope="row">${c.idCategory}</th>
                                    <td>${c.nameCategory}</td>
                                    <c:set var="f" value="${restful.getListFilmByCategory(c.idCategory).size()}"></c:set>
                                    <td>${f}</td>
                                    <c:choose>
                                        <c:when test="${f>0}">
                                            <td>
                                                <div><a href="" style="color:gray;pointer-events: none" >Delete</a></div>
                                                <div><a href="addC?edit=${c.idCategory}" >Edit</a></div>
                                            </td>
                                        </c:when>
                                        <c:when test="${0==f}">
                                            <td>
                                                <div><a href="addC?delete=${c.idCategory}" >Delete</a></div>
                                                <div><a href="addC?edit=${c.idCategory}" >Edit</a></div>
                                            </td>
                                        </c:when>
                                    </c:choose>
                                </tr>
                                </c:forEach>
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
