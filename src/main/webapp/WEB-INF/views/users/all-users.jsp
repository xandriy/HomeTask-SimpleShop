<!-- 	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> -->
<section>
	<h2> All users: </h2>
	
		<c:forEach items = "${users}" var = "oneUser">
			<div class="user">
				<a href = "${pageContext.request.contextPath}/all-users/${oneUser}">${oneUser}</a>
			</div>
		</c:forEach>
    
</section>