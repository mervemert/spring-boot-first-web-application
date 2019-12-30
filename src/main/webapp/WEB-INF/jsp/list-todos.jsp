<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Todo's for ${name}</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <caption>Your Todos are</caption>
        <thead>
        <tr>
            <td>Description</td>
            <td>Target Date</td>
            <td>Is it done?</td>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></td>
                <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div><a class="button" href="/add-todo">Add a Todo</a></div>

    <script src="webjars/jquery/1.9.1/jquery.min.js"/>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"/>

</div>

</body>
</html>
