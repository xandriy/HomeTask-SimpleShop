<!--  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> -->
<section>
	<h2>All items are here</h2>
	<c:forEach items="${items}" var = "oneItem">
		<div class="item">
			<a href = "${pageContext.request.contextPath}/all-items/${oneItem}">Go to ${oneItem}</a>
   		</div>
	</c:forEach>
	
	
</section>