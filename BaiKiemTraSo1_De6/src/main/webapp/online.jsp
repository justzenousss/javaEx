<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    long onlineTime = session.getAttribute("onlineTime") != null
                      ? (Long) session.getAttribute("onlineTime") : 0;
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Time</title>
    <script>
        let seconds = <%= onlineTime %>;

        function updateTime() {
            document.getElementById("online-time").innerText = seconds + " giây";
            if (seconds > 60) {
                document.getElementById("alert").style.display = "block";
            }
            seconds++;
        }

        setInterval(updateTime, 1000);
    </script>
</head>
<body>
    <h2>Thời gian bạn đã online: 
        <span id="online-time"><c:out value="${sessionScope.onlineTime}"/> giây</span>
    </h2>

    <c:if test="${sessionScope.onlineTime gt 60}">
        <p id="alert" style="color: red;">Bạn đã online hơn 60 giây!</p>
    </c:if>
    <c:if test="${sessionScope.onlineTime le 60}">
        <p id="alert" style="display: none; color: red;">Bạn đã online hơn 60 giây!</p>
    </c:if>

    <p>Số session hiện tại: 
        <c:out value="${applicationScope.sessionCount}"/>
    </p>

    <form method="get" action="online">
        <input type="hidden" name="reset" value="true"/>
        <button type="submit">Reset thời gian</button>
    </form>
</body>
</html>
