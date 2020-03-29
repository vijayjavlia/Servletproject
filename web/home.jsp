
<html>
    <head>
        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="bootstr/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        </head>
        <body style="background-color: #f5f5f0">
        <header>
            <div >
         <jsp:include page="navbar.jsp"/>
        </div>
        <div>
         <jsp:include page="slider.jsp"/>
        </div>
        </header>
        <div>
           <%
               
                String email=(String)request.getAttribute("user");
              %>
              <%=email%>
        </div>
        <section>
            <div class="bg-primary mt-4 ">
                <h1 class="text-center">this is new brands </h1>
        </section>
         </div>
            <!--card start-->
        <section>
        <div class="container-fluid pt-4 text-center pd-auto pb-5">   
            <div class="row ">
            <div class="col-sm-4 col-md-4 col-12 ">
               <div class="card" >
  <img class="card-img-top rounded-circle" src="imges/image5.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Jelly Fish</h4>
    <p class="card-text">Some example text.</p>
    <!--<a href="#" class="btn btn-primary">See Profile</a>-->
  </div>
</div>
                </div>
                <div class="col-sm-4 col-md-4 col-lg-12">
              <div class="card" >
  <img class="card-img-top" src="imges/image1.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Jelly Fish</h4>
    <p class="card-text">Some example text.</p>
    <!--<a href="#" class="btn btn-primary">See Profile</a>-->
  </div>
</div>
                </div>
                <div class="col-sm-4 col-md-4 col-lg-12">
                <div class="card" >
  <img class="card-img-top" src="imges\image4.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Jelly Fish</h4>
    <p class="card-text">Some example text.</p>
    <!--<a href="#" class="btn btn-primary">See Profile</a>-->
  </div>
</div>
                </div>
           </div>   
        </div>
    </section>
          <!--cards end-->
      
          <%--<jsp:include page="sign in.jsp"></jsp:include>--%>
          <jsp:include page="footer.jsp"></jsp:include>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>