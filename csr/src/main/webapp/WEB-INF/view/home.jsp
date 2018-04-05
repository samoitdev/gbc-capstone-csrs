<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<h3>Home</h3>

<security:authorize access="hasAnyRole('ADMIN')">
			
				<!-- put new button: Add Customer -->
			
				<input type="button" value="View Users"
					   onclick="window.location.href='admin/users/'; return false;"
					   class="add-button"
				/>
</security:authorize>
</body>
</html>