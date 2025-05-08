<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body class="bg-light p-5">

  <div class="container">
    <h2 class="mb-4">Form Đăng Ký</h2>
    <form>

      <!-- Email -->
      <div class="mb-3">
        <label for="inputEmail" class="form-label">Email</label>
        <input type="email" class="form-control" id="inputEmail" placeholder="Nhập email">
      </div>

      <!-- Password -->
      <div class="mb-3">
        <label for="inputPassword" class="form-label">Pass</label>
        <input type="password" class="form-control" id="inputPassword" placeholder="Nhập mật khẩu">
      </div>

      <!-- Address -->
      <div class="mb-3">
        <label for="inputAddress" class="form-label">Address</label>
        <input type="text" class="form-control" id="inputAddress" placeholder="123 Nguyễn Trãi">
      </div>

      <!-- Address 2 -->
      <div class="mb-3">
        <label for="inputAddress2" class="form-label">Address 2</label>
        <input type="text" class="form-control" id="inputAddress2" placeholder="Căn hộ, tầng, số nhà...">
      </div>

      <!-- City, State, Zip -->
      <div class="row">
        <div class="col-md-6 mb-3">
          <label for="inputCity" class="form-label">City</label>
          <input type="text" class="form-control" id="inputCity">
        </div>

        <div class="col-md-4 mb-3">
          <label for="inputState" class="form-label">State</label>
          <select id="inputState" class="form-select">
            <option selected>Chọn tỉnh</option>
            <option>Hà Nội</option>
            <option>TP.HCM</option>
            <option>Đà Nẵng</option>
          </select>
        </div>

        <div class="col-md-2 mb-3">
          <label for="inputZip" class="form-label">Zip</label>
          <input type="text" class="form-control" id="inputZip">
        </div>
      </div>

      <!-- Checkbox -->
      <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="checkMeOut">
        <label class="form-check-label" for="checkMeOut">Check me out</label>
      </div>

      <!-- Submit -->
      <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
  </div>

</body>
</html>