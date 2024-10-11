<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Video List</title>
</head>
<body>
    <h1>Video List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Category</th>
                <th>Description</th>
                <th>Active</th>
                <th>Poster</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="video" items="${videos}">
                <tr>
                    <td>${video.videoId}</td>
                    <td>${video.category.name}</td>
                    <td>${video.description}</td>
                    <td>${video.active}</td>
                    <td><img src="${pageContext.request.contextPath}/uploads/${video.poster}" alt="Poster" width="100"></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/admin/video/edit?id=${video.videoId}">Edit</a>
                        <a href="${pageContext.request.contextPath}/admin/video/delete?id=${video.videoId}" onclick="return confirm('Are you sure you want to delete this video?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/admin/video/add">Add New Video</a>
</body>
</html>