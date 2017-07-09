package devcastzone.javaee.serwlety;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html; charset=utf-8");
        PrintWriter pw = res.getWriter();
        ServletContext kontekts =this.getServletContext();
        pw.println("Serwlet");

//        kontekts.setAttribute("");
//        HttpSession sesja = req.getSession();
//        sesja.setMaxInactiveInterval(20);
//        Integer licznik = (Integer)sesja.getAttribute("licznik");
//        if (licznik == null){
//            licznik = 1;
//        } else {
//            licznik++;
//        }
//        sesja.setAttribute("licznik", licznik);
//        pw.println("Liczna wyświetleń strony:" + licznik);
//        if (req.getCookies() != null){
//            for (int i = 0; i < req.getCookies().length; i++){
//                Cookie c = req.getCookies()[i];
//                if (c.getName().equals("imie")){
//                    pw.println("Witaj, " + c.getValue());
//                    return;
//                }
//            }
//        }
//        pw.println("<html><head><title>Witaj Świecie</title></head>");
//        pw.println("<body>");
//        pw.println("<p>Pierwszy Świecie</p>");
//        pw.println("<p>Drugi Świecie</p>");
//        pw.println("<form method=\"post\">");
//        pw.println("<p>Podaj imie: </p> <input name=\"imie\" /><input type = \"submit\" value = \"OK\" />");
//        pw.println("</form>");
//        pw.println("</body></html>");
//        /*byte[] bufor = wczytajPlik("/home/ppolak/Downloads/wesele.jpg");
//        res.setContentType("image/jpg");
//        res.setContentLength(bufor.length);
//        res.addHeader("Content-Disposition","attachment;filename=obraz.jpg");
//        OutputStream os = res.getOutputStream();
//        os.write(bufor);
//        os.flush();*/

    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
//        res.setContentType("text/html; charset=utf-8");
//        PrintWriter pw = res.getWriter();
//        String imie = req.getParameter("imie");
//
//        if (imie != null && !"".equals(imie)){
//            Cookie ciastko = new Cookie("imie", imie);
//            ciastko.setMaxAge(3600);
//            res.addCookie(ciastko);
//            pw.println("Witaj, " + imie);
//        }
//    }
//
//    private byte[] wczytajPlik(String nazwaPliku) throws IOException {
//        File f = new File(nazwaPliku);
//        long rozmiar = f.length();
//        byte[] zawartosc = new byte[(int)rozmiar];
//        FileInputStream fis = new FileInputStream(f);
//        fis.read(zawartosc);
//        fis.close();
//        return zawartosc;
//    }
}
