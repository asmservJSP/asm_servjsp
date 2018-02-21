package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      asm.servjsp.models.covertJsonObject restful = null;
      synchronized (_jspx_page_context) {
        restful = (asm.servjsp.models.covertJsonObject) _jspx_page_context.getAttribute("restful", PageContext.PAGE_SCOPE);
        if (restful == null){
          restful = new asm.servjsp.models.covertJsonObject();
          _jspx_page_context.setAttribute("restful", restful, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Admin</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"  type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <h1>Admin films</h1>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"nav flex-column nav-pills col-xl-2 col-sm-4\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\r\n");
      out.write("                    <a class=\"nav-link active\" id=\"v-pills-home-tab\" data-toggle=\"pill\" href=\"#v-pills-home\" role=\"tab\" aria-controls=\"v-pills-home\" aria-selected=\"true\">Home</a>\r\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-messages-tab\" data-toggle=\"pill\" href=\"#v-pills-film\" role=\"tab\" aria-controls=\"v-pills-messages\" aria-selected=\"false\">Add Films</a>\r\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-booking-tab\" data-toggle=\"pill\" href=\"#v-pills-booking\" role=\"tab\" aria-controls=\"v-pills-booking\" aria-selected=\"false\">View Booking</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tab-content col-xl-10 col-sm-8\" id=\"v-pills-tabContent\">\r\n");
      out.write("                    <div class=\"tab-pane fade show active\" id=\"v-pills-home\" role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\">\r\n");
      out.write("                        <table class=\"table table-striped\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th scope=\"col\">ID</th>\r\n");
      out.write("                                    <th scope=\"col\">Name</th>\r\n");
      out.write("                                    <th scope=\"col\">Start Date</th>\r\n");
      out.write("                                    <th scope=\"col\">Description</th>\r\n");
      out.write("                                    <th scope=\"col\">Path Banner</th>\r\n");
      out.write("                                    <th scope=\"col\">Path Film</th>\r\n");
      out.write("                                    <th scope=\"col\">Link Film</th>\r\n");
      out.write("                                    <th scope=\"col\">Id Category</th>\r\n");
      out.write("                                    <th scope=\"col\">Is Hot</th>\r\n");
      out.write("                                    <th scope=\"col\">Price</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-film\" role=\"tabpanel\" aria-labelledby=\"v-pills-messages-tab\">\r\n");
      out.write("                        <form method=\"post\" action=\"admin\" enctype=\"multipart/form-data\">\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                    <label for=\"name\">Name Film</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Name\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                    <label for=\"startDate\">Start Date</label>\r\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" name=\"startDate\" id=\"startDate\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"description\">Description</label>\r\n");
      out.write("                                <textarea class=\"form-control\" id=\"description\" name=\"description\" rows=\"3\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"imgBanner\">Image Banner</label>\r\n");
      out.write("                                <input type=\"file\" class=\"form-control\" name=\"imgBanner\" id=\"imgBanner\" >\r\n");
      out.write("                                <img id=\"imageShowBanner\" src=\"images/imgBanner.png\" width=\"100%\" height=\"300px\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"imgFilm\">Image Film</label>\r\n");
      out.write("                                <input type=\"file\" class=\"form-control\" name=\"imgFilm\" id=\"imgFilm\" >\r\n");
      out.write("                                <img id=\"imageShowimgFilm\" src=\"images/img100x200.png\" width=\"100px\" height=\"200px\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"linkFilm\">Link Film</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"linkFilm\" id=\"linkFilm\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"category\">Category</label>\r\n");
      out.write("                                <select class=\"form-control\" name=\"category\" id=\"category\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Is hot</label><br>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"isHot\" id=\"ishot\" value=\"1\" checked>\r\n");
      out.write("                                    <label class=\"form-check-label\" for=\"exampleRadios1\">\r\n");
      out.write("    True\r\n");
      out.write("  </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"isHot\" id=\"ishot\" value=\"2\">\r\n");
      out.write("                                    <label class=\"form-check-label\" for=\"exampleRadios2\">\r\n");
      out.write("   False\r\n");
      out.write("  </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"price\">Price</label>\r\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"price\" id=\"price\" placeholder=\"Price of ticket\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Add</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-booking\" role=\"tabpanel\" aria-labelledby=\"v-pills-booking-tab\">\r\n");
      out.write("                        <table class=\"table table-striped\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th scope=\"col\">#</th>\r\n");
      out.write("                                    <th scope=\"col\">First</th>\r\n");
      out.write("                                    <th scope=\"col\">Last</th>\r\n");
      out.write("                                    <th scope=\"col\">Handle</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th scope=\"row\">1</th>\r\n");
      out.write("                                    <td>Mark</td>\r\n");
      out.write("                                    <td>Otto</td>\r\n");
      out.write("                                    <td>@mdo</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th scope=\"row\">2</th>\r\n");
      out.write("                                    <td>Jacob</td>\r\n");
      out.write("                                    <td>Thornton</td>\r\n");
      out.write("                                    <td>@fat</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th scope=\"row\">3</th>\r\n");
      out.write("                                    <td>Larry</td>\r\n");
      out.write("                                    <td>the Bird</td>\r\n");
      out.write("                                    <td>@twitter</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\" ></script>\r\n");
      out.write("    <script src=\"js/popper.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"js/minh.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.convertFromJsonFilm()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                    <th scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathBanner}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.linkFilm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.idCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.isHot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.convertFromJsonCategory()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.idCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
