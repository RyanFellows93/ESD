<%-- 
    Document   : listAllMembers
    Created on : 26-Nov-2016, 15:47:39
    Author     : RickyL
--%>
<jsp:useBean id="member" class="model.memberWrapper" />

<br>
<h1> List of Members </h1>



    <h4>Members</h4>
    <c:forEach var="member" items="${member.getAllMembers(dbBean)}">
        <c:out value="${member.name}"/> d(<c:out value="${member.password}"/><c:out value="${member.status}"/>)<br />
    </c:forEach>
