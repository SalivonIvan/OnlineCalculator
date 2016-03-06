<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jspf/header.jspf" %> 
<main>
            <section class="main">
                <div class="container-fluid">
                    <form class="form-signin" role="form" action="calculate">
                        <h2 class="form-signin-heading">Вхід</h2>
                        <label for="inputEmail" class="sr-only">Імейл</label>
                        <input type="email" id="inputEmail" class="form-control" placeholder="Імейл" required autofocus>
                        <label for="inputPassword" class="sr-only">Пароль</label>
                        <input type="password" id="inputPassword" class="form-control" placeholder="Пароль" required>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="remember-me"> Запам'ятати мене
                            </label>
                        </div>
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Зареєструватись</button>
                    </form>
                </div>
            </section>
        </main>
<%@include file="jspf/footer.jspf" %>