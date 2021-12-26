
<%@ include file="../Layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <h2>글수정 </h2>
    <form   class="was-validated">
        <input type="hidden" id="id" value="${board.id}"/>
        <div class="form-group">

            <input  value="${board.title}" type="text" class="form-control" id="title" placeholder="Enter title" name="title" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">

            <textarea class="form-control summernote" row="5" cols=""id="content">${board.content}</textarea>
        </div>

        <button id="btn-update" class="btn btn-primary">글수정 완료</button>

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


