package com.mycompany.calculadora_apirestful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/operaciones")
public class OperacionesResource {

    @GET
    @Path("/suma")
    @Produces(MediaType.APPLICATION_JSON)
    public String suma(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        double resultado = num1 + num2;
        return "La suma es: " + resultado;
    }

    @GET
    @Path("/resta")
    @Produces(MediaType.APPLICATION_JSON)
    public String resta(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        double resultado = num1 - num2;
        return "La resta es: " + resultado;
    }

    @GET
    @Path("/multiplicacion")
    @Produces(MediaType.APPLICATION_JSON)
    public String multiplicacion(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        double resultado = num1 * num2;
        return "La multiplicación es: " + resultado;
    }

    @GET
    @Path("/division")
    @Produces(MediaType.APPLICATION_JSON)
    public String division(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        if (num2 == 0) {
            return "Error: No se puede dividir por cero";
        }
        double resultado = num1 / num2;
        return "La división es: " + resultado;
    }

    @GET
    @Path("/factorial")
    @Produces(MediaType.APPLICATION_JSON)
    public String factorial(@QueryParam("base") int base) {
        if (base < 0) {
            return "Error: El número debe ser mayor o igual a 0";
        }
        int resultado = 1;
        for (int i = 1; i <= base; i++) {
            resultado *= i;
        }
        return "El factorial de " + base + " es: " + resultado;
    }

    @GET
    @Path("/potencia")
    @Produces(MediaType.APPLICATION_JSON)
    public String potencia(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        double resultado = Math.pow(num1, num2);
        return "La potencia es: " + resultado;
    }

    @GET
    @Path("/modulo")
    @Produces(MediaType.APPLICATION_JSON)
    public String modulo(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
        double resultado = num1 % num2;
        return "El módulo es: " + resultado;
    }

    @GET
    @Path("/raizCuadrada")
    @Produces(MediaType.APPLICATION_JSON)
    public String raizCuadrada(@QueryParam("raiz") double raiz) {
        if (raiz < 0) {
            return "Error: No se puede calcular la raíz cuadrada de un número negativo";
        }
        double resultado = Math.sqrt(raiz);
        return "La raíz cuadrada es: " + resultado;
    }

    @GET
    @Path("/logaritmo")
    @Produces(MediaType.APPLICATION_JSON)
    public String logaritmo(@QueryParam("log") double log) {
        if (log <= 0) {
            return "Error: El logaritmo solo está definido para números mayores que cero";
        }
        double resultado = Math.log(log);
        return "El logaritmo es: " + resultado;
    }

    @GET
    @Path("/sin")
    @Produces(MediaType.APPLICATION_JSON)
    public String seno(@QueryParam("seno") double seno) {
        double resultado = Math.sin(Math.toRadians(seno));  // Convertir a radianes
        return "El seno es: " + resultado;
    }

    @GET
    @Path("/cos")
    @Produces(MediaType.APPLICATION_JSON)
    public String coseno(@QueryParam("cos") double cos) {
        double resultado = Math.cos(Math.toRadians(cos));  // Convertir a radianes
        return "El coseno es: " + resultado;
    }

    @GET
    @Path("/tan")
    @Produces(MediaType.APPLICATION_JSON)
    public String tangente(@QueryParam("tan") double tan) {
        double resultado = Math.tan(Math.toRadians(tan));  // Convertir a radianes
        return "La tangente es: " + resultado;
    }

    @GET
    @Path("/e")
    @Produces(MediaType.APPLICATION_JSON)
    public String exponente(@QueryParam("e") double e) {
        double resultado = Math.exp(e);
        return "El exponente es: " + resultado;
    }

    @GET
    @Path("/sinh")
    @Produces(MediaType.APPLICATION_JSON)
    public String senh(@QueryParam("senh") double senh) {
        double resultado = Math.sinh(senh);
        return "El seno hiperbólico es: " + resultado;
    }

    @GET
    @Path("/cosh")
    @Produces(MediaType.APPLICATION_JSON)
    public String cosh(@QueryParam("cosh") double cosh) {
        double resultado = Math.cosh(cosh);
        return "El coseno hiperbólico es: " + resultado;
    }

    @GET
    @Path("/tanh")
    @Produces(MediaType.APPLICATION_JSON)
    public String tanh(@QueryParam("tanh") double tanh) {
        double resultado = Math.tanh(tanh);
        return "La tangente hiperbólica es: " + resultado;
    }
}
