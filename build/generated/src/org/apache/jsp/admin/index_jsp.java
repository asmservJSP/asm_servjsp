package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"  type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <h1>Admin films</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"nav flex-column nav-pills col-xl-2 col-sm-4\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\n");
      out.write("                    <a class=\"nav-link active\" id=\"v-pills-home-tab\" data-toggle=\"pill\" href=\"#v-pills-home\" role=\"tab\" aria-controls=\"v-pills-home\" aria-selected=\"true\">Home</a>\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-messages-tab\" data-toggle=\"pill\" href=\"#v-pills-film\" role=\"tab\" aria-controls=\"v-pills-messages\" aria-selected=\"false\">Add Films</a>\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-booking-tab\" data-toggle=\"pill\" href=\"#v-pills-booking\" role=\"tab\" aria-controls=\"v-pills-booking\" aria-selected=\"false\">View Booking</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tab-content col-xl-10 col-sm-8\" id=\"v-pills-tabContent\">\n");
      out.write("                    <div class=\"tab-pane fade show active\" id=\"v-pills-home\" role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\">\n");
      out.write("                        <table class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td>Larry</td>\n");
      out.write("                                    <td>the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-film\" role=\"tabpanel\" aria-labelledby=\"v-pills-messages-tab\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"name\">Name Film</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Name\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"startDate\">Start Date</label>\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" id=\"startDate\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"Description\">Description</label>\n");
      out.write("                                <textarea class=\"form-control\" id=\"Description\" rows=\"3\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"imgBanner\">Image Banner</label>\n");
      out.write("                                <input type=\"file\" class=\"form-control\" id=\"imgBanner\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"imgFilm\">Image Film</label>\n");
      out.write("                                <input type=\"file\" class=\"form-control\" id=\"imgFilm\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Is hot</label><br>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"ishot\" value=\"true\" checked>\n");
      out.write("                                    <label class=\"form-check-label\" for=\"exampleRadios1\">\n");
      out.write("    True\n");
      out.write("  </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"ishot\" value=\"false\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"exampleRadios2\">\n");
      out.write("   False\n");
      out.write("  </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"price\">Price</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"price\" placeholder=\"Price of ticket\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-booking\" role=\"tabpanel\" aria-labelledby=\"v-pills-booking-tab\">\n");
      out.write("                        <table class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td>Larry</td>\n");
      out.write("                                    <td>the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\" ></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
