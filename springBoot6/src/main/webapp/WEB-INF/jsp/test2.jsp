<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:if test="${ctx == null}">
    <c:set var="ctx" value="${pageContext.request.contextPath}" scope="application" />
</c:if>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
222
<c:set var="salary" scope="session" value="${2000*2}"/>
<c:if test="${salary > 2000}">
<p>我的工资为: <c:out value="${salary}"/><p>
    </c:if>
<c:out value="111"></c:out>
</body>
</html>
