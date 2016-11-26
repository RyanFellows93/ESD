<%-- 
    Document   : index
    Created on : 08-Nov-2016, 12:40:59
    Author     : RickyL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>AYZ Home</title>
 <body>
        <div id="header">
            <jsp:include page="templates/header.jsp" flush="true" />
        </div>

        <div id="top">
            <div id="menu">
                <jsp:include page="templates/menu.jsp" flush="true" />
            </div>
            
            <div id="body">
                <% String pageName = (String) request.getAttribute("page");
                
                    if (pageName == null) {
                       // out.println("Found = " + pageName);
                        pageName = "docs/main.jsp";
                    }
                    //out.print("Page Name = " + pageName);
                %>
                <jsp:include page="<%=pageName%>" flush="true" /> 
            </div>
           
    </body>
</html>
