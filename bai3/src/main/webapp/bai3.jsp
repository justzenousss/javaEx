<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body class="bg-light d-flex justify-content-center align-items-center vh-100">

  <div class="card p-4 shadow" style="width: 100%; max-width: 400px;">
    <h3 class="text-center mb-4">Đăng Nhập</h3>

    <form>
      <div class="mb-3">
        <label for="email" class="form-label">Email hoặc Tên đăng nhập</label>
        <input type="text" class="form-control" id="email" placeholder="Nhập email hoặc tên đăng nhập">
      </div>

      <div class="mb-3">
        <label for="password" class="form-label">Mật khẩu</label>
        <input type="password" class="form-control" id="password" placeholder="Nhập mật khẩu">
      </div>

      <div class="d-grid">
        <button type="submit" class="btn btn-primary">Đăng nhập</button>
      </div>
    </form>
  </div>

</body>
</html>