<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Album</title>
    <link rel="stylesheet" href="/resources/css/public.css"/>
</head>
<body>
<div id="menu_wrapper">
    <tiles:insertAttribute name="header" flush="true"/>
    <tiles:insertAttribute name="content" flush="true"/>
    <tiles:insertAttribute name="footer" flush="true"/>
</div>
</body>
</html>
