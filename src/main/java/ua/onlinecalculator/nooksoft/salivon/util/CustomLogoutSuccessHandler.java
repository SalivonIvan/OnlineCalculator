package ua.onlinecalculator.nooksoft.salivon.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {

    @Autowired
    private RecordResult recResult;

    @Override
    public void onLogoutSuccess(HttpServletRequest hsr, HttpServletResponse hsr1, Authentication a) throws IOException, ServletException {
        if (a != null && a.getDetails() != null) {
            try {
                hsr.getSession().invalidate();
                System.out.println("User Successfully Logout");

            } catch (Exception e) {
                e.printStackTrace();
                e = null;
            }
        }
        recResult.setExpretion(hsr.getParameter("exp"));
        recResult.record();
        hsr1.setStatus(HttpServletResponse.SC_OK);
        hsr1.sendRedirect("index");
    }

}
