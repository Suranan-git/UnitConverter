package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/convert")
public class LengthServlet extends HttpServlet {

    private static final Map<String, Double> factors = new HashMap<>();

    static {
        factors.put("mm", 0.001);
        factors.put("cm", 0.01);
        factors.put("m", 1.0);
        factors.put("km", 1000.0);
        factors.put("inch", 0.0254);
        factors.put("foot", 0.3048);
        factors.put("yard", 0.9144);
        factors.put("mile", 1609.34);
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        double value = Double.parseDouble(request.getParameter("value"));
        String fromUnit = request.getParameter("fromUnit");
        String toUnit = request.getParameter("toUnit");

        double inMeters = value * factors.get(fromUnit);
        double convertedValue = inMeters / factors.get(toUnit);

        request.setAttribute("convertedValue",
                convertedValue + " " + toUnit);

        request.getRequestDispatcher("/result.jsp")
               .forward(request, response);
    }
}
