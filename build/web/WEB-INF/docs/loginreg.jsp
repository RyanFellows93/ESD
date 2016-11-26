<%-- 
    Document   : testjsp
    Created on : 04-Nov-2016, 18:29:27
    Author     : RickyL
--%>

<br /><br />

You are not logged in. <br>
Please Login: <br>
<form name="login" method="POST" action="<%=request.getContextPath()%>/login.do">
    <input type="text" name="username" value="" />
    <input type="password" name="password" value="" />
    <input type="submit" name="submit" value="Login" />

</form>
    
    
    <br><br>
    Register
<form action="register.php" method="POST">
  
  Name<br>
  <input type="text" name="name" value="">
  <br>
  Id<br>
  <input type="text" name="id" value="">
  <br>
  Address<br>
  <input type="text" name="address" value="">
  <br>
  Date of Birth<br>
  <input type="text" name="dob" value="">
  <br>
  Password<br>
  <input type="password" name="password" value="">
  <br><br>
  <input type="submit" value="Register">
</form>
