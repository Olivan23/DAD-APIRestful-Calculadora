package com.mycompany.calculadora_apirestful;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")  // Esto aplica a todas las rutas de la API
public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialización del filtro, si es necesario
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        
        // Agregar las cabeceras CORS necesarias
        resp.setHeader("Access-Control-Allow-Origin", "*");  // Permitir todos los orígenes
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");  // Métodos permitidos
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, X-Requested-With");  // Cabeceras permitidas

        // Si es una solicitud OPTIONS (preflight request), devolver una respuesta sin procesar
        if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
            resp.setStatus(HttpServletResponse.SC_OK);
            return;
        }

        // Continuar con el siguiente filtro o recurso
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Liberar recursos si es necesario
    }
}
