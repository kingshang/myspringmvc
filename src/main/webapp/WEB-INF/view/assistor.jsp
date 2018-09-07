<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>assistor</title>
</head>
<body>
<form:form method="post" action="/demo/assistor.do">
    <br></br>目录：<input name="dir" value="C:\Users\shangzhigang.WILMAR\Desktop\log"/>
    <br></br>查找内容：<textarea name="context">PF307471800096</textarea>
    <br></br><input type="submit" value="查找"/>
    <br></br>
    ${assistor.result}
    ${existsFiles}
</form:form>
</body>
</html>
