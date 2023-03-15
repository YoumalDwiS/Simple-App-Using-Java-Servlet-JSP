package controller;

import model.DataAkun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (username.equals("admin") && password.equals("admin123")) {
//            response.sendRedirect("index.jsp");
//        } else {
//            response.sendRedirect("login.jsp?error=1");
//        }

        DataAkun dataAkun = new DataAkun();
        dataAkun.setUsername(request.getParameter("username"));
        dataAkun.setPassword(request.getParameter("password"));

        String cekCaptcha = request.getParameter("g-recaptcha-response");
        boolean valid = validateCaptcha(cekCaptcha);

        if(valid) {
            if(dataAkun.getUsername().equals("admin") && dataAkun.getPassword().equals("admin")) {
                response.sendRedirect("index.jsp");
            } else {
                // Jika username atau password salah, kirimkan pesan error ke halaman login
                request.setAttribute("error", "Username atau password salah. Silakan coba lagi.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            // Jika captcha tidak valid, kirimkan pesan error ke halaman login
            request.setAttribute("error", "Captcha tidak valid. Silakan coba lagi.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    private boolean validateCaptcha(String cekCaptcha) {
        // Jika captcha response tidak kosong, artinya captcha telah diberikan oleh pengguna
        if (cekCaptcha != null && !cekCaptcha.isEmpty()) {
            return true;
        }
        return false;
    }

    }

