<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h3 class="result-add">
    <%String addResp = (String)request.getAttribute("addResp"); %><%= addResp%>
</h3>
<h3 class="result-multiplication">
    <%String multiResp = (String)request.getAttribute("multiResp"); %><%= multiResp%>
</h3>
</body>
</html>