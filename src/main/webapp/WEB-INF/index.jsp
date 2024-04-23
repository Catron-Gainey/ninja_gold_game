<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="wrapper">
		<div class="top">
			<div class="YourGold"> <h1>Your Gold</h1></div>
			<div class="GoldAmount"> <h1> <c:out value="${goldAmount}"/> </h1></div>
		</div>
		<div class="middle">
			<div class="box1">
				<div class="top1"><h2>Farm</h2></div>
				<div class="middle1"><h2>(earns 10-20 gold)</h2></div>
				<div class="bottom1">
					<form action="/earnGold" method="post"><button type="submit">Find Gold!</button>
					<input type="hidden" name="location" value="farm"/>
					</form>
			    </div>
			</div>
			<div class="box2">
				<div class="top2"><h2>Cave</h2></div>
				<div class="middle2"><h2>(earns 5-10 gold)</h2></div>
				<div class="bottom2">
					<form action="/earnGold" method="post"><button type="submit">Find Gold!</button>
					<input type="hidden" name="location" value="cave"/>
					</form>
				</div>
			</div>
			<div class="box3">
				<div class="top3"><h2>House</h2></div>
				<div class="middle3"><h2>(earns 2-5 gold)</h2></div>
				<div class="bottom3">
					<form action="/earnGold" method="post"><button type="submit">Find Gold!</button>
					<input type="hidden" name="location" value="house"/>
					</form>
				</div>			
			</div>
			<div class="box4">
				<div class="top4"><h2>Quest</h2></div>
				<div class="middle4"><h2>(earns/takes 0-50 gold)</h2></div>
				<div class="bottom4">
					<form action="/earnGold" method="post"><button type="submit">Find Gold!</button>
					<input type="hidden" name="location" value="quest"/>
					</form>
				</div>			
			</div>
		</div>
		<div class="activities"><h1>Activities:</h1></div>
		<div class="bottom">
			<c:forEach var="message" items="${messages}">
        	<p>${message}</p>
    </c:forEach>
		</div>
	</div>
</body>
</html>