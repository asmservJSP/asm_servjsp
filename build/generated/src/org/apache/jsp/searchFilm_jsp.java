package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- Search bar -->\n");
      out.write("        <div class=\"search-wrapper\">\n");
      out.write("            <div class=\"container container--add\">\n");
      out.write("                <form id='search-form' method='get' class=\"search\">\n");
      out.write("                    <input type=\"text\" class=\"search__field\" placeholder=\"Search\">\n");
      out.write("                    <select name=\"sorting_item\" id=\"search-sort\" class=\"search__sort\" tabindex=\"0\">\n");
      out.write("                        <option value=\"1\" selected='selected'>By title</option>\n");
      out.write("                        <option value=\"2\">By year</option>\n");
      out.write("                        <option value=\"3\">By producer</option>\n");
      out.write("                        <option value=\"4\">By title</option>\n");
      out.write("                        <option value=\"5\">By year</option>\n");
      out.write("                    </select>\n");
      out.write("                    <button type='submit' class=\"btn btn-md btn--danger search__button\">search a movie</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
