<%@ include file="../Layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/blog/css/weatherUI.css">
<link rel="stylesheet" href="/blog/css/predictInput.css">
<div class="container">

    <div class="weather-card one">
        <div class="top">
            <div class="wrapper">
                <div class="mynav">
                    <a href="javascript:;"><span class="lnr lnr-chevron-left"></span></a>
                    <a href="javascript:;"><span class="lnr lnr-cog"></span></a>
                </div>
                <h1 class="heading">Weather</h1>
                <h3 class="">Pocheon</h3>
                <p class="temp">
                    <span class="temp-value">20</span>
                    <span class="deg">0</span>
                    <a href="javascript:;"><span class="temp-type">C</span></a>
                </p>
            </div>
        </div>
        <div class="bottom">
            <div class="wrapper">
                <ul class="forecast">
                    <a href="javascript:;"><span class="lnr lnr-chevron-up go-up"></span></a>
                    <li class="active">
                        <span class="date">최저온도 </span>
                        <span class="lnr lnr-sun condition">
                            <span class="temp">23<span class="deg">0</span><span class="temp-type">C</span></span>
                        </span>
                    </li>
                    <li>
                        <span class="date">최고온도 </span>
                        <span class="lnr lnr-cloud condition">
                            <span class="temp">21<span class="deg">0</span><span class="temp-type">C</span></span>
                        </span>
                    </li>
                </ul>
            </div>

        </div>
    </div>
    <form class="was-validated predict">
        <br>
        <h3> 벽관 불량 예측 서비스 </h3>
        <div class="form-group">
            <label for="meanTemp">기온</label>
            <input type="number" class="form-control" id="meanTemp" placeholder="Enter Temp" name="meanTemp" value=0 step="0.01"required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="cjOutC1">외부 C1 압출 온도:</label>
            <input type="number" class="form-control" id="cjOutC1" placeholder="Enter cjOutC1" name="cjOutC1" value=190  step="0.01"required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="cjOutC2">외부 C2 압출 온도:</label>
            <input type="number" class="form-control" id="cjOutC2" placeholder="Enter cjOutC2" name="cjOutC2" value=190 step="0.01" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="cjOutD3">외부 D3 압출 온도:</label>
            <input type="number" class="form-control" id="cjOutD3" placeholder="Enter cjOutD3" name="cjOutD3" value=200 step="0.01" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="inD3">내부 D3 압출 온도:</label>
            <input type="number" class="form-control" id="inD3" placeholder="Enter inD3" name="inD3" value=200 step="0.01" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
    </form>
    <p id = "result"></p>
    <button id ="btn-predict" class="btn btn-primary btn-block">예측</button>
</div>
<script src ="/js/weatherApi.js"></script>
<script src ="/js/defective.js"></script>

<%@ include file="../Layout/footer.jsp"%>