<%@include file="common/header.jspf"%>
<div class="container">
	Welcome to the login page !!
	<p>${errorMessage}</p>
	<form method="post">
		Name:<input type="text" name="name"> Password:<input
			type="password" name="password"> <input type="submit">
	</form>
</div>
<%@include file="common/footer.jspf"%>