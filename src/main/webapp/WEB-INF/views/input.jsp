<!doctype html>
<html>
<head>
    <title>Hello MVC</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/form/process" method="post">
        <label for="temp.age">Age (even though it's just a number)</label>
        <input type="number" name="age" id="temp.age" />
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>