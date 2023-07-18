<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1 text-align="center">전송 테스트</h1>
    <form action="<%= request.getContextPath()%>/form-test" method="post">
        <select name="testForm">
            <option value="괴물">괴물</option>
            <option value="닌자">닌자</option>
            <option value="호랑이">호랑이</option>
            <option value="홍길동">홍길동</option>
        </select>
        <input type="number" min="0" max="100" step="1" name="amount" placeholder="몇번째?">
        <button type="submit">선택완료</button>
    </form>
</body>
</html>