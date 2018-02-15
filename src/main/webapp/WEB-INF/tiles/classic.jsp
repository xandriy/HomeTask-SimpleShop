<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<jsp:include page="/WEB-INF/fragments/style-including.jsp" />
	
	<title> 
		<tiles:getAsString name="title"></tiles:getAsString> 
	</title>
</head>
<body>
	
	<tiles:insertAttribute name = "header" ></tiles:insertAttribute>
	
	<tiles:insertAttribute name = "section"></tiles:insertAttribute>
	

	<tiles:insertAttribute name = "footer"></tiles:insertAttribute>

</body>
</html>