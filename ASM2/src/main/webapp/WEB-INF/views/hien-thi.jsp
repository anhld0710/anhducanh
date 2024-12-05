<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <%@page pageEncoding="UTF-8" %>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Quản lý danh sách sinh viên</h2>
<form action="/sinhvien/add" method="post">
    tên : <input type="text" name="ten_sinh_vien"><br>
    Ngày sinh : <input type="date" name="ngay_sinh"><br>
    Giới tính : <input type="radio" name="gioi_tinh" value="0">nam
    <input type="radio" name="gioi_tinh" value="1">nữ<br>
    Điểm trung bình : <input type="text" name="diem_trung_binh"><br>
    Lớp học :
    <select name="lopHoc">
        <c:forEach items="${lopHoc}" var="lh">
            <option value="${lh.id}" >${lh.ten_lop}</option>
        </c:forEach>
    </select> <br>
    <button>Thêm sinh viên</button>
</form>
<h2>Danh sách sinh viên</h2>
<table border="1">
    <thead>
    <tr>
        <td>id</td>
        <td>tên sinh viên</td>
        <td>ngay sinh</td>
        <td>giới tính</td>
        <td>điểm trung bình</td>
        <td>tên lớp học</td>
        <td></td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sv">
        <tr>
            <td>${sv.id}</td>
            <td>${sv.ten_sinh_vien}</td>
            <td>${sv.ngay_sinh}</td>
            <td>${sv.gioi_tinh==0?"nam":"nữ"}</td>
            <td>${sv.diem_trung_binh}</td>
            <td>${sv.lopHoc.ten_lop}</td>
            <td>
                <a href="/sinhvien/xoa?id=${sv.id}">xóa</a>
                <a href="/sinhvien/chitiet?id=${sv.id}">chi tiết</a>
            </td>

        </tr>
    </c:forEach>
    </tbody>


</table>

</body>
</html>