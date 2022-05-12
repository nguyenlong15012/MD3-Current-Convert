<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/current-convert" method="post">
    <div class="convert">
        <h1>Currency Converter</h1>
        <p>Rate</p>
        <input type="text" name="value1" placeholder="0">
        <p>USD</p>
        <input type="text" name="value2" placeholder="0"><br>
        <button type="submit" name="convert">Converter</button>
    </div>
</form>
</body>
</html>