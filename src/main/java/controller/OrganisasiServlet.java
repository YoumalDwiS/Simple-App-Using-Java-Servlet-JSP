package controller;

import model.SurveyData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "OrganisasiServlet", value = "/OrganisasiServlet")
public class OrganisasiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SurveyData surveyData = new SurveyData();
        surveyData.setNama(request.getParameter("nama"));
        surveyData.setDaftarOrganisasi(request.getParameterValues("daftarOrganisasi"));
        request.setAttribute("surveyData", surveyData);
        request.getRequestDispatcher("outputOrganisasi.jsp").forward(request, response);

    }
}
