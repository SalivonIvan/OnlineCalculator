<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jspf/header.jspf" %> 
<main>
    <section class="main">
        <div class="container">
            <div class="error-page-alert">
                <div class="alert alert-danger text-center" role="alert">
                    ${message}
                </div>
                <a href="index" class="btn btn-lg btn-primary btn-block" role="button">
                    Повернутись на сторінку авторизації
                </a>
            </div>
        </div>
    </section>
</main>
<%@include file="jspf/footer.jspf" %>