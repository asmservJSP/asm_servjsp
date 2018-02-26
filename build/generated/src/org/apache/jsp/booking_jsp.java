package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<!-- Basic Page Needs -->\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>AMovie - Movie list</title>\r\n");
      out.write("        <meta name=\"description\" content=\"A Template by Gozha.net\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"HTML, CSS, JavaScript\">\r\n");
      out.write("        <meta name=\"author\" content=\"Gozha.net\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Mobile Specific Metas-->\r\n");
      out.write("    \t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta content=\"telephone=no\" name=\"format-detection\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("        <!-- Font awesome - icon font -->\r\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Roboto -->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Stylesheets -->\r\n");
      out.write("        <!-- jQuery UI -->\r\n");
      out.write("        <link href=\"http://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile menu -->\r\n");
      out.write("        <link href=\"css/gozha-nav.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Select -->\r\n");
      out.write("        <link href=\"css/external/jquery.selectbox.css\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("        <!-- Custom -->\r\n");
      out.write("        <link href=\"css/style.css?v=1\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Modernizr --> \r\n");
      out.write("        <script src=\"js/external/modernizr.custom.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries --> \r\n");
      out.write("    <!--[if lt IE 9]> \r\n");
      out.write("    \t<script src=\"http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.js\"></script> \r\n");
      out.write("\t\t<script src=\"http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.3.0/respond.js\"></script>\t\t\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body> \r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        ");
      out.write("<!-- Banner -->\r\n");
      out.write("        <div class=\"banner-top\">\r\n");
      out.write("            <img alt='top banner' src=\"images/banners/bra.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header section -->\r\n");
      out.write("        <header class=\"header-wrapper header-wrapper--home\" style=\"position: relative\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Logo link-->\r\n");
      out.write("                <a href='index.jsp' class=\"logo\">\r\n");
      out.write("                    <img alt='logo' src=\"images/logo.png\">\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Main website navigation-->\r\n");
      out.write("                <nav id=\"navigation-box\">\r\n");
      out.write("                    <!-- Toggle for mobile menu mode -->\r\n");
      out.write("                    <a href=\"#\" id=\"navigation-toggle\">\r\n");
      out.write("                        <span class=\"menu-icon\">\r\n");
      out.write("                            <span class=\"icon-toggle\" role=\"button\" aria-label=\"Toggle Navigation\">\r\n");
      out.write("                              <span class=\"lines\"></span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Link navigation -->\r\n");
      out.write("                    <ul id=\"navigation\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"film-show-now.jsp\">Movie showing</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"film-upComming.jsp\">Upcoming movie</a>\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"film-is-hot.jsp\">Movie hot</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Additional header buttons / Auth and direct link to booking-->\r\n");
      out.write("                <div class=\"control-panel\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-md btn--warning btn--book btn-control--home login-window\">Book a ticket</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Search bar -->\r\n");
      out.write("        <div class=\"search-wrapper\">\r\n");
      out.write("            <div class=\"container container--add\">\r\n");
      out.write("                <form id='search-form' method='get' class=\"search\">\r\n");
      out.write("                    <input type=\"text\" class=\"search__field\" placeholder=\"Search\">\r\n");
      out.write("                    <select name=\"sorting_item\" id=\"search-sort\" class=\"search__sort\" tabindex=\"0\">\r\n");
      out.write("                        <option value=\"1\" selected='selected'>By title</option>\r\n");
      out.write("                        <option value=\"2\">By year</option>\r\n");
      out.write("                        <option value=\"3\">By producer</option>\r\n");
      out.write("                        <option value=\"4\">By title</option>\r\n");
      out.write("                        <option value=\"5\">By year</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <button type='submit' class=\"btn btn-md btn--danger search__button\">search a movie</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"container\">\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("                <div class=\"movie\">\r\n");
      out.write("                    <h2 class=\"page-heading\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"movie__info\">\r\n");
      out.write("                        <div class=\"col-sm-4 col-md-3 movie-mobile\">\r\n");
      out.write("                            <div class=\"movie__images\">\r\n");
      out.write("                                <span class=\"movie__rating\">5.0</span>\r\n");
      out.write("                                <img alt='' src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-8 col-md-9\">\r\n");
      out.write("                             ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("                            <p class=\"movie__option\"><strong>Category: </strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            <p class=\"movie__option\"><strong>Release date: </strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form id='contact-info' method='post' novalidate=\"\" class=\"form contact-info\">\r\n");
      out.write("                        <div class=\"contact-info__field\">\r\n");
      out.write("                            <input type='text' name='user-mail' placeholder='Name' class=\"form__mail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"contact-info__field contact-info__field-mail\">\r\n");
      out.write("                            <input type='email' name='user-mail' placeholder='Your email' class=\"form__mail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"contact-info__field contact-info__field-tel\">\r\n");
      out.write("                            <input type='tel' name='user-tel' placeholder='Phone number' class=\"form__mail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer-wrapper\">\r\n");
      out.write("            <section class=\"container\">\r\n");
      out.write("                <div class=\"col-xs-4 col-md-2 footer-nav\">\r\n");
      out.write("                    <ul class=\"nav-link\">\r\n");
      out.write("                        <li><a href=\"#\" class=\"nav-link__item\">Cities</a></li>\r\n");
      out.write("                        <li><a href=\"movie-list-left.html\" class=\"nav-link__item\">Movies</a></li>\r\n");
      out.write("                        <li><a href=\"trailer.html\" class=\"nav-link__item\">Trailers</a></li>\r\n");
      out.write("                        <li><a href=\"rates-left.html\" class=\"nav-link__item\">Rates</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-4 col-md-2 footer-nav\">\r\n");
      out.write("                    <ul class=\"nav-link\">\r\n");
      out.write("                        <li><a href=\"coming-soon.html\" class=\"nav-link__item\">Coming soon</a></li>\r\n");
      out.write("                        <li><a href=\"cinema-list.html\" class=\"nav-link__item\">Cinemas</a></li>\r\n");
      out.write("                        <li><a href=\"offers.html\" class=\"nav-link__item\">Best offers</a></li>\r\n");
      out.write("                        <li><a href=\"news-left.html\" class=\"nav-link__item\">News</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-4 col-md-2 footer-nav\">\r\n");
      out.write("                    <ul class=\"nav-link\">\r\n");
      out.write("                        <li><a href=\"#\" class=\"nav-link__item\">Terms of use</a></li>\r\n");
      out.write("                        <li><a href=\"gallery-four.html\" class=\"nav-link__item\">Gallery</a></li>\r\n");
      out.write("                        <li><a href=\"contact.html\" class=\"nav-link__item\">Contacts</a></li>\r\n");
      out.write("                        <li><a href=\"page-elements.html\" class=\"nav-link__item\">Shortcodes</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                    <div class=\"footer-info\">\r\n");
      out.write("                        <p class=\"heading-special--small\">A.Movie<br><span class=\"title-edition\">in the social media</span></p>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"social\">\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-facebook\"></a>\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-twitter\"></a>\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-vk\"></a>\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-instagram\"></a>\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-tumblr\"></a>\r\n");
      out.write("                            <a href='#' class=\"social__variant fa fa-pinterest\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                        <p class=\"copy\">&copy; A.Movie, 2013. All rights reserved. Done by Olia Gozha</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- open/close -->\r\n");
      out.write("        <div class=\"overlay overlay-hugeinc\">\r\n");
      out.write("            \r\n");
      out.write("            <section class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-4 col-sm-offset-4\">\r\n");
      out.write("                    <button type=\"button\" class=\"overlay-close\">Close</button>\r\n");
      out.write("                    <form id=\"login-form\" class=\"login\" method='get' novalidate=''>\r\n");
      out.write("                        <p class=\"login__title\">sign in <br><span class=\"login-edition\">welcome to A.Movie</span></p>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"social social--colored\">\r\n");
      out.write("                                <a href='#' class=\"social__variant fa fa-facebook\"></a>\r\n");
      out.write("                                <a href='#' class=\"social__variant fa fa-twitter\"></a>\r\n");
      out.write("                                <a href='#' class=\"social__variant fa fa-tumblr\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"login__tracker\">or</p>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"field-wrap\">\r\n");
      out.write("                        <input type='email' placeholder='Email' name='user-email' class=\"login__input\">\r\n");
      out.write("                        <input type='password' placeholder='Password' name='user-password' class=\"login__input\">\r\n");
      out.write("\r\n");
      out.write("                        <input type='checkbox' id='#informed' class='login__check styled'>\r\n");
      out.write("                        <label for='#informed' class='login__check-info'>remember me</label>\r\n");
      out.write("                         </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"login__control\">\r\n");
      out.write("                            <button type='submit' class=\"btn btn-md btn--warning btn--wider\">sign in</button>\r\n");
      out.write("                            <a href=\"#\" class=\"login__tracker form__tracker\">Forgot password?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript-->\r\n");
      out.write("        <!-- jQuery 1.9.1--> \r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js\"></script>\r\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/external/jquery-1.10.1.min.js\"><\\/script>')</script>\r\n");
      out.write("        <!-- Migrate --> \r\n");
      out.write("        <script src=\"js/external/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("        <!-- jQuery UI -->\r\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\r\n");
      out.write("        <!-- Bootstrap 3--> \r\n");
      out.write("        <script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile menu -->\r\n");
      out.write("        <script src=\"js/jquery.mobile.menu.js\"></script>\r\n");
      out.write("         <!-- Select -->\r\n");
      out.write("        <script src=\"js/external/jquery.selectbox-0.2.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("        <!-- Stars rate -->\r\n");
      out.write("        <script src=\"js/external/jquery.raty.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Form element -->\r\n");
      out.write("        <script src=\"js/external/form-element.js\"></script>\r\n");
      out.write("        <!-- Form validation -->\r\n");
      out.write("        <script src=\"js/form.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom -->\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("                init_MovieList();\r\n");
      out.write("            });\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("url");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${film.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("b");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListCategory(url).get(0)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
