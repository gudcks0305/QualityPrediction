
<%@ include file="../Layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <h2>글쓰기</h2>
    <form   class="was-validated">
        <div class="form-group">

            <input type="text" class="form-control" id="title" placeholder="Enter title" name="title" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <textarea class="form-control summernote" row="5" cols=""id="content"></textarea>
        </div>

        <button id="btn-save" class="btn btn-primary">글쓰기완료</button>

    </form>
</div>
<script>
    $('.summernote').summernote({

        tabsize: 2,
        height: 300
    });
</script>
<script src ="/js/board.js"></script>
<%@ include file="../Layout/footer.jsp"%>


