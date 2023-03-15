<%--
  Created by IntelliJ IDEA.
  User: Youmal Dwi Santoso
  Date: 15/03/2023
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="surveyData" scope="request" class="model.SurveyData"></jsp:useBean>
<head>
    <title>Terima Kasih</title>
</head>
<body>
<h2>Terima Kasih Telah Melakukan Survey Ini</h2>
<p>
    <jsp:getProperty name="surveyData" property="nama"/>,
    Anda Mengikuti Organisasi sebagai Berikut:
</p>
<ul>
    <%
        String[] bahasa = surveyData.getDaftarOrganisasi();
        if (bahasa != null){
            for (int i=0; i< bahasa.length; i++){
    %>
    <li>
        <%=bahasa[i]%>
    </li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
