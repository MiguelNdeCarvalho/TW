<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<title>Waiting List</title>
<meta charset="UTF-8">
</head>
<body>
        <p>Dinning Room list: ${diningRoomList}</p>
        
	<form method="post" action="removeInsideList">
		<input type="text" id="remove-from-inside-list" name="id">
		<input type="submit" value="Remove from Dinning Room"/>
	</form>
        
	<p>Terrace list: ${terraceList}</p>
	<form method="post" action="removeOutsideList">          
                <input type="text" id="remove-from-outside-list" name="id">
                <input type="submit" value="Remove from Terrace"/> 
        </form>

	<p>Waiting list: ${waitingList}</p>
	<form method="post" action="removeWaitingList">          
                <input type="text" id="remove-from-waiting-list" name="id">
                <input type="submit" value="Remove from Waiting"/> 
        </form>
</body>
</html>
