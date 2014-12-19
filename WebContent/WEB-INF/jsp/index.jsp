<%@page contentType="text/html" pageEncoding="utf-8" session="false" trimDirectiveWhitespaces='true'%>
<%@taglib prefix='core' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>
<html lang="nl">
    <head>
       <link rel='stylesheet' href="css/default.css" />
       <link rel="shortcut content" href="images/favicon.ico" type="image/x-icon" />
        <title>Frituur Frieda</title>
    </head>
    <body>
        <header>
            <h1>Frituur Frieda</h1>
            <dl>
            <dt>Adres</dt>
            <dd>${adres}</dd>
            <dd>${adres.getGemeente()}</dd>
            </dl>
            <h2>Vandaag zijn we</h2> 
            <img src="images/${openGesloten}.png" alt=${openGesloten}>
        <header/>
	</body>
</html>