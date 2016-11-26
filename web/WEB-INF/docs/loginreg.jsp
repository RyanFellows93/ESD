<%-- 
    Document   : testjsp
    Created on : 04-Nov-2016, 18:29:27
    Author     : RickyL
--%>

<br /><br />

Please Login: <br>
<form name="login" method="POST" action="<%=request.getContextPath()%>/login.do">
    <input type="text" name="username" value="" />
    <input type="password" name="password" value="" />
    <input type="submit" name="submit" value="Login" />

</form>
