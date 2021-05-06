package miu.kidusmt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        if (!addOp1.isEmpty() && !addOp2.isEmpty()) {
            int addResult = Integer.parseInt(addOp1) + Integer.parseInt(addOp2);
            System.out.println("===> add result: " + addResult);

            String addData = String.format("%s + %s = %s", addOp1, addOp2, addResult);
            req.setAttribute("addResp", addData);
        }else{
            req.setAttribute("addResp", "");
        }

        if (!multiOp1.isEmpty() && !multiOp2.isEmpty()) {
            int multiResult = Integer.parseInt(multiOp1) + Integer.parseInt(multiOp2);
            System.out.println("===> multi result: " + multiResult);

            String multiData = String.format("%s * %s = %s", multiOp1, multiOp2, multiResult);
            req.setAttribute("multiResp", multiData);
        }else{
            req.setAttribute("multiResp", "");
        }

        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
