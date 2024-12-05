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

tên sinh viên : ${up.ten_sinh_vien}<br>
ngay sinh : ${up.ngay_sinh} <br>
Giới tính :${up.gioi_tinh==0?"nam":"nữ"}<br>
Diểm trung bình : ${up.diem_trung_binh}<br>
lớp học :${up.lopHoc.ten_lop}

</body>
</html>