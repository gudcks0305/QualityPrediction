<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../Layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/blog/css/styles.css">
<div class="container">
  <div id="layoutSidenav_content">
    <main>
      <div class="container-fluid px-4">
        <h1 class="mt-4">충진벽관 데이터</h1>
        <ol class="breadcrumb mb-4">
          <li class="breadcrumb-item"><a href="/blog">Home</a></li>
          <li class="breadcrumb-item active">Tables</li>
        </ol>
        <div class="card mb-4">
          <div class="card-body">
          </div>
        </div>
        <div class="card mb-4">
          <div class="card-header">
            <i class="fas fa-table me-1"></i>
            DataTable
          </div>
          <div class="card-body">
            <table id="datatablesSimple">
              <thead>
              <tr>
                <th>ID</th>
                <th>날짜</th>
                <th>불량 여부 </th>
                <th>제품명</th>
                <th>충진 C1 온도</th>
                <th>충진 C2 온도</th>
                <th>충진 D3 온도</th>
                <th>상세보기</th>
              </tr>
              </thead>
              <tfoot>
              <tr>
                <th>ID</th>
                <th>날짜</th>
                <th>양품 여부 </th>
                <th>제품명</th>
                <th>충진 C1 온도</th>
                <th>충진 C2 온도</th>
                <th>충진 D3 온도</th>
                <th>상세보기</th>
              </tr>
              </tfoot>
              <tbody>
              <c:forEach var = "defective" items="${defective}">

                <tr>
                  <td>${defective.id}</td>
                  <td>${defective.date}</td>
                  <td class="defective">${defective.defective}</td>
                  <td>${defective.label}</td>
                  <td>${defective.cjC1F}</td>
                  <td>${defective.cjC2F}</td>
                  <td>${defective.cjD3F}</td>
                  <td><a href="/blog/defective/Detail?id=${defective.id}">상세보기</a></td>
                </tr>

              </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </main>
    <footer class="py-4 bg-light mt-auto">
      <div class="container-fluid px-4">
        <div class="d-flex align-items-center justify-content-between small">
          <div class="text-muted">Copyright &copy; Your Website 2021</div>
          <div>
            <a href="#">Privacy Policy</a>
            &middot;
            <a href="#">Terms &amp; Conditions</a>
          </div>
        </div>
      </div>
    </footer>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src ="/blog/js/datatables-simple-demo.js"></script>
<script src ="/blog/js/scripts.js"></script>
<script src ="/blog/js/chart-area-demo.js"></script>
<%@ include file="../Layout/footer.jsp"%>


