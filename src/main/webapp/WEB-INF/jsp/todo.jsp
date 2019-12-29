<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>


<div class="container">
    <form:form method="post" modelAttribute="todo">
        <fieldset class="form-group">
            <form:label path="descr">Description</form:label>
            <form:input path="descr" name="descr" type="text" class="form-control" required="required"/>
            <form:errors path="descr" cssClass="text-warning"/>
        </fieldset>
        <button type="submit" class="btn btn-success">Add</button>
    </form:form>

    <script src="webjars/jquery/1.9.1/jquery.min.js"/>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"/>
</div>

</body>
</html>
