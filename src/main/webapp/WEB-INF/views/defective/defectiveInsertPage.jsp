<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../Layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/blog/css/styles.css">
<div class="container">
    <h2>상세정보</h2>

    <form class="was-validated detail">

        <div class="form-group">
            <label for="id">id:</label>
            <input type="number" class="form-control" id="id" placeholder="Enter id" name="id" required value="${detail.id}" readonly="readonly" >
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="date">date:</label>
            <input type="number" class="form-control" id="date" placeholder="Enter date" name="date" required  value="${detail.date}" readonly="readonly">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="Temp">Temp:</label>
            <input type="number" class="form-control" id="Temp" placeholder="Enter date" name="Temp" required   step="0.01" value="${detail.meanTemp}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="defective">defective:</label>
            <input type="number" class="form-control" id="defective" placeholder="Enter date" name="defective"  step="0.01" required value="${detail.defective}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="label">label:</label>
            <input type="number" class="form-control" id="label" placeholder="Enter label" name="label"  step="50" required value="${detail.label}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="cjC1F">cjC1F:</label>
            <input type="number" class="form-control" id="cjC1F" placeholder="Enter cjC1F" name="cjC1F"  step="0.01" required value="${detail.cjC1F}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjC2F">cjC2F:</label>
            <input type="number" class="form-control" id="cjC2F" placeholder="Enter cjC2F" name="cjC2F"  step="0.01" required value="${detail.cjC2F}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjD3F">cjD3F:</label>
            <input type="number" class="form-control" id="cjD3F" placeholder="Enter cjD3F" name="cjD3F" step="0.01"  required value="${detail.cjD3F}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjC1S">cjC1S:</label>
            <input type="number" class="form-control" id="cjC1S" placeholder="Enter cjC1S" name="cjC1S"  step="0.01" required value="${detail.cjC1S}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjC2S">cjC2S:</label>
            <input type="number" class="form-control" id="cjC2S" placeholder="Enter cjC2S" name="cjC2S"  step="0.01" required value="${detail.cjC2S}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjD3S">cjD3S:</label>
            <input type="number" class="form-control" id="cjD3S" placeholder="Enter cjD3S" name="cjD3S"  step="0.01" required value="${detail.cjD3S}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjMoterRpm">cjMoterRpm:</label>
            <input type="number" class="form-control" id="cjMoterRpm" placeholder="Enter cjMoterRpm" name="cjMoterRpm"  step="0.01" required value="${detail.cjMoterRpm}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjOutC1">cjOutC1:</label>
            <input type="number" class="form-control" id="cjOutC1" placeholder="Enter cjOutC1" name="cjOutC1" required   step="0.01" value="${detail.cjOutC1}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjOutC2">cjOutC2:</label>
            <input type="number" class="form-control" id="cjOutC2" placeholder="Enter cjOutC2" name="cjOutC2" required  step="0.01" value="${detail.cjOutC2}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="cjOutD3">cjOutD3:</label>
            <input type="number" class="form-control" id="cjOutD3" placeholder="Enter cjOutD3" name="cjOutD3" required  step="0.01" value="${detail.cjOutD3}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>




        <div class="form-group">
            <label for="inC1">inC1:</label>
            <input type="number" class="form-control" id="inC1" placeholder="Enter inC1" name="inC1" required  step="0.01"  value="${detail.inC1}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="inC2">inC2:</label>
            <input type="number" class="form-control" id="inC2" placeholder="Enter inC2" name="inC2" required  step="0.01" value="${detail.inC2}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="inD3">inD3:</label>
            <input type="number" class="form-control" id="inD3" placeholder="Enter inD3" name="inD3" required  step="0.01" value="${detail.inD3}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="inMoterRpm">inMoterRpm:</label>
            <input type="number" class="form-control" id="inMoterRpm" placeholder="Enter inMoterRpm" name="inMoterRpm"  step="0.01" required value="${detail.inMoterRpm}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="toSpeed">toSpeed:</label>
            <input type="number" class="form-control" id="toSpeed" placeholder="Enter toSpeed" name="toSpeed" required  step="0.01" value="${detail.toSpeed}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

        <div class="form-group">
            <label for="waterTemp">waterTemp:</label>
            <input type="number" class="form-control" id="waterTemp" placeholder="Enter waterTemp" name="waterTemp"  step="0.01" required value="${detail.waterTemp}">
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>

    </form>

    <button id ="btn-update" class="btn btn-primary"> </button>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src ="/blog/js/datatables-simple-demo.js"></script>
<script src ="/blog/js/scripts.js"></script>
<script src="/blog/js/defective.js
"></script>
<%@ include file="../Layout/footer.jsp"%>


