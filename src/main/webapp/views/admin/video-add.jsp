<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Video</title>
</head>
<body>
    <h2>Add New Video</h2>
    <form action="<c:url value='/admin/video/insert'/>" method="post" enctype="multipart/form-data">
        <input type="hidden" name="categoryId" value="${categoryId}"/>

        <label for="description">Description:</label><br>
        <input type="text" id="description" name="description" required><br>

        <label for="active">Active:</label><br>
        <input type="radio" id="active" name="active" value="1" checked> Yes
        <input type="radio" id="inactive" name="active" value="0"> No<br>

        <label for="image">Upload Image:</label><br>
        <input type="file" id="image" name="image"><br>

        <label for="imageLink">Or Image Link:</label><br>
        <input type="text" id="imageLink" name="imageLink"><br>

        <input type="submit" value="Add Video">
    </form>
</body>
</html>