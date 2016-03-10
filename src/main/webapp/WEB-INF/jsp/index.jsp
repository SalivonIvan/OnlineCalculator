<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="jspf/header.jspf" %> 
<main>
    <section class="main">
        <div class="container-fluid">
            <form:form class="form-signin" role="form" action="index" method="post">
                <h2 class="form-signin-heading">Вхід</h2>
                <label for="inputEmail" class="sr-only">Імейл</label>
                <input type="email" name="inputEmail" id="inputEmail" class="form-control" placeholder="Імейл" required autofocus>
                <label for="inputPassword" class="sr-only">Пароль</label>
                <input type="password" name="inputPassword" id="inputPassword" class="form-control" placeholder="Пароль" required>
                <h3 class="form-signin-heading">Код авторизації</h3>
                <input type="text" class="form-control" id="code" readonly="">
                <input type="text" class="form-control" id="inputCode" placeholder="Код" readonly="">
                
                <button class="btn btn-lg btn-primary btn-block" type="submit">Зареєструватись</button>
            </form:form>>
        </div>
    </section>
</main>
<%@include file="jspf/footer.jspf" %>