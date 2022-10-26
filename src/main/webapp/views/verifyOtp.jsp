<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <section>
 <div id="">
 
    <div class="container">
      <div id="Login-row" class="row justify-content-center align-items-center">
         <div id="Login-column" class="col-md-6">
             <div id="Login-box" class="col-md-12">
             
             <div class="alert alert-success" role="alert">
                      We have sent OTP to your email...
            </div>
             <form action="/sendotp" method="post">	
               <div class="form-group">
                  <input name="otp" required type="number" placeholder="Enter OTP here" class="form-control">
                 
               </div>
               <div classs="container text-center">
               <button class="btn btn-success"> Verify</button>
               </div>
             
             
             
             </form>
              </div>
                
           </div>
      </div>
    </div>
  
 </div></section>

</body>
</html>