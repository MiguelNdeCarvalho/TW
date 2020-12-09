<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<title>Waiting List</title>
<meta charset="UTF-8">
</head>
<body>
        <h3>Waiting list</h3>
        <p>Waiting list: ${waitingList}</p>
	<form method="post" action="firstInside">
                <input type="submit" value="First goes inside" />
        </form>
	<form method="post" action="firstOutside">
                <input type="submit" value="First goes outside" />
        </form>
</body>
</html>
