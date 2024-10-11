<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Video</title>
</head>
<body>
    <h2>Edit Video</h2>
    <form action="<c:url value='/admin/video/edit'/>" method="post" enctype="multipart/form-data">
        <input type="hidden" name="videoId" value="${video.videoId}"/>
        <input type="hidden" name="categoryId" value="${video.category.categoryId}"/>

        <label for="description">Description:</label><br>
        <input type="text" id="description" name="description" value="${video.description}" required><br>

        <label for="active">Active:</label><br>
        <input type="radio" id="active" name="active" value="1" ${video.active == 1 ? 'checked' : ''}> Yes
        <input type="radio" id="inactive" name="active" value="0" ${video.active == 0 ? 'checked' : ''}> No<br>

        <label for="image">Upload New Image:</label><br>
        <input type="file" id="image" name="image"><br>

        <label for="imageLink">Or Image Link:</label><br>
        <input type="text" id="imageLink" name="imageLink" value="${video.poster}"><br>

        <input type="submit" value="Update Video">
    </form>
</body>
</html>