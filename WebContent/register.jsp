<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Insert</title>
	<!-- View Port Meta Tag -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<!-- BootStrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- BootStrap theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

</head>
<body>
<!-- Render the Registration form  -->
	<main class="container">

 
		<div class="row">
            <div class="col-md-offset-4 col-md-4">
                <h1>Customer Registration</h1>
                <form method="post" action="RegistrationServlet">
                    <fieldset class="form-group">
                        <label for="email">Email: *</label>
                        <input name="email" type="email" class="form-control" required autofocus />
                    </fieldset>
                    <fieldset class="form-group">
                        <label for="fullName">Full Name: *</label>
                        <input name="fullName" type="text" class="form-control" required />
                    </fieldset>
                    <fieldset class="form-group">
                        <label for="password">Password: *</label>
                        <input name="password" type="password" class="form-control" required />
                    </fieldset>

                    <fieldset class="form-group text-right">
                        <input type="submit" class="btn btn-success" value="Submit"/>
                        <a href="/">
                            <input type="button" class="btn btn-warning" value="Cancel"/>
                        </a>
                    </fieldset>
                </form>
            </div>
        </div>
	</main>
</body>
</html>


