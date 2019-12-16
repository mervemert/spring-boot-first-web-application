<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Todo's for ${name}</title>
</head>
<body>

<H1>Your Todos</H1>

<table>
    <caption>Your Todos are</caption>
        <thead>
            <tr>
                <td>Description</td>
                <td>Target Date</td>
                <td>Is it done?</td>
            </tr>
        </thead>
    <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.descr}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.isDone}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<form method="post">
    Here are the list of ${name}'s todos:
    ${todos}
    <br/>
    <a href="/add-todo">Add a Todo</a>
</form>


</body>
</html>
