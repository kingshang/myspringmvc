<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>assistor</title>
    <head>
        <script src="/static/jquery-ui-1.12.1/external/jquery/jquery.js"></script>
        <script src="/static/js/bootstrap.js"></script>
        <link rel="stylesheet" type="text/css" href="/static/css/bootstrap.css"/>

        <script src="/static/jquery-ui-1.12.1/jquery-ui.js"></script>
        <link rel="stylesheet" type="text/css" href="/static/jquery-ui-1.12.1/jquery-ui.css"/>
    </head>
</head>
<body>
<form method="post" action="/demo/assistor">
    目录：<input class="form-control" name="dir"
              value="C:\projects\Wilmar.Interface\test\Wilmar.Interface.Sync.Tests\bin\Debug\logs"/>

    查找内容：<textarea class="form-control" name="context">PF307471800096</textarea>
    <input class="form-control" type="submit" value="查找"/>
    ${result}
</form>
</body>
</html>
