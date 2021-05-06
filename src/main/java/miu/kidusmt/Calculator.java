package miu.kidusmt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author KidusMT
 * Date: 5/5/2021
 */
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String addOp1 = req.getParameter("addOp1");
        String addOp2 = req.getParameter("addOp2");

        String multiOp1 = req.getParameter("multiOp1");
        String multiOp2 = req.getParameter("multiOp2");

//        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Simple Calculator</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div style='align-content: center'>");

        out.println("<h1> Simple Calculator</h1>");

        out.println("<form method='get'>");
        out.println("<div style='display: inline-flex; flex-direction: column'>");
        out.println("    <div style='display: inline-flex; flex-direction: row'>");


        if (addOp1 != null && addOp2 != null && !addOp1.isEmpty() && !addOp2.isEmpty()) {

            out.println("        <input name='addOp1' type='number' value='" + addOp1 + "'>");
            out.println("        <pre> + </pre>");
            out.println("        <input name='addOp2' type='number' value='" + addOp2 + "'>");
            out.println("        <pre> = </pre>");

            int addResult = Integer.parseInt(addOp1) + Integer.parseInt(addOp2);
            System.out.println("===> add result: " + addResult);

//            String addData = String.format("%s + %s = %s", addOp1, addOp2, addResult);
//            req.setAttribute("addResp", addData);

            out.println("        <input type='text' value='" + addResult + "' />");

        } else {
            System.out.println("===> add result: ELSE");
//            req.setAttribute("addResp", "");
            out.println("        <input type='text' value='' />");
        }
        out.println("    </div>");
        out.println("    <br>");
        out.println("    <div style='display: inline-flex; flex-direction: row'>");
        if (multiOp1 != null && multiOp2 != null && !multiOp1.isEmpty() && !multiOp2.isEmpty()) {
            int multiResult = Integer.parseInt(multiOp1) + Integer.parseInt(multiOp2);
            System.out.println("===> multi result: " + multiResult);

            out.println("        <input name='multiOp1' type='number' value='" + multiOp1 + "'>");
            out.println("        <pre> * </pre>");
            out.println("        <input name='multiOp2' type='number' value='" + multiOp2 + "'>");
            out.println("        <pre> = </pre>");


//            String multiData = String.format("%s * %s = %s", multiOp1, multiOp2, multiResult);
//            req.setAttribute("multiResp", multiData);
            out.println("        <input type='text' value='" + multiResult + "' />");
//            out.println("        <input type='text' value='<%=(String)request.getParameter('multiResp')==null? '': (String)request.getParameter('addResp')%>' />");
        } else {
            System.out.println("===> multi result: ELSE");
//            req.setAttribute("multiResp", "");
            out.println("        <input type='text' value='' />");
        }

        out.println("    </div>");
        out.println("</div>");
        out.println("<br>");
        out.println("<div>");
        out.println("    <input style='padding: 10px; margin: 20px; width: 100px' type='submit'>");
        out.println("</div>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
//        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
