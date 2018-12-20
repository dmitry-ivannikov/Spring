<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world
<form method="post" action="${flowExecutorUrl}">
    <input type="hidden" name="_eventId" value="action">
    <input type="submit" value="GoNext">
</form>
</body>
</html>