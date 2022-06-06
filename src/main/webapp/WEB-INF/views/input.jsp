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

        <label for="customer.name">Name (what's in it, anyway?)</label>
        <input type="text" name="customer.name" id="customer.name" />
        <label for="customer.taxId">Tax ID</label>
        <input type="text" name="customer.taxId" id="customer.taxId" />
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>