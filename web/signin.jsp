<html>
    <head>
        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="bootstr/bootstrap.min.css">
        </head>
        <body style="background-color:#f5f5f0">
        <header>
            <div >
                <jsp:include page="navbar.jsp"></jsp:include>
        </div>
       </header>
       
       
        <!--Sign In start-->
        <section class="pb-5" >
        <div class="container-fluid">
            <div class="row">
        <div class=" col-sm-5 col-md-5  col-12">
                                     <form action="demo">
  <div class="form-group"> 
      <h1 class="text-center text-bold">Sign In</h1>
      <hr>
    <label for="text">User Email:</label>
    <input type="text" class="form-control" placeholder="Enter email" id="email" name="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="password">
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary">LogIn</button>
</form>
        </div>
                
                <!--Sign up form start--------------------------------------------->
<!--                <style>
                    .vl{
                     border-left: 2px solid gray;
                      height: 500px;
                    }
                </style>
             -->
            <%
                String error;
            error=(String)request.getAttribute("error");
            if(error==null)
            {
                error="Hey Alians";
            }
           
            %>
                <div class="col-sm-6 col-md-6  col-12">
                    <form action="UserRegister" method="POST">
                 <h1 class="text-center text-bold"> Sign Up</h1>
                 <hr>
                 <p><%=error%></p>
     <div class="form-group">
     <label for="email">Name:</label>
     <input type="text" class="form-control" placeholder="Enter Name" id="name" name="name">
      </div>
                
    <div class="form-group">
    <label for="email">Mobile Number:</label>
    <input type="number" class="form-control" placeholder="Enter Number" id="number" name="phone">
     </div>     
                 
     <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" placeholder="Enter email" id="email" name="email">
     </div>
                 
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="pwd">
  </div>

  <button type="submit" class="btn btn-primary">Sign Up</button>
</form> 
        </div>
            </div>
        </div>
        </section>
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
