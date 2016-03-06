<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jspf/header.jspf" %> 
<main>
            <section class="main">
                <div class="container">
                    <div class="row panel-calculator text-center">

                        <form role="form" action="result">
                            <div class="form-group">
                                <a href="exit" class="btn btn-m btn-primary btn-out" role="button">
                                    Вихід
                                </a>
                            </div>
                            <div class="form-group">
                                <div class="row">

                                    <textarea id="display" class=" textarea-out bg-success" rows="2" disabled=""></textarea>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">MC</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">MR</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">MS</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">M+</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">M-</button>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">?</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">CE</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonC()">C</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">+/-</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">?</button>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton7()">7</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton8()">8</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton9()">9</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonDivision()">/</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">%</button>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton4()">4</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton5()">5</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton6()">6</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonMultiply()">*</button>
                                    <button type="button" class="btn btn-default calc-button" disabled="disabled">1/x</button>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton1()">1</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton2()">2</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton3()">3</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonSubtract()">-</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonSum()">+</button>

                                </div>
                                <div class="row">

                                    <button type="button" class="btn btn-default calc-button" onclick="clickButton0()">0</button>
                                    <button type="button" class="btn btn-default calc-button" onclick="clickButtonComa()">,</button>
                                    <button type="submit" class="btn btn-default calc-button">=</button>

                                </div>
                            </div>

                        </form>
                    </div>
                </div>

            </section>
        </main>
<%@include file="jspf/footer.jspf" %>