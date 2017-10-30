<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <script>
        function alertMsg() {
            alert("Button 1 was clicked!")
        }
    </script>
</head>
<body>
    <input id="name" type="text" placeholder="Type a name">
    <button id="button" type="button" onclick="alertMsg()">Click Me!</button>
</body>
</html>