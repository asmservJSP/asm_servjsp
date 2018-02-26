package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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
      out.write("        <title>AMovie</title>\r\n");
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
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- Open Sans -->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Stylesheets -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile menu -->\r\n");
      out.write("        <link href=\"css/gozha-nav.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Select -->\r\n");
      out.write("        <link href=\"css/external/jquery.selectbox.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- REVOLUTION BANNER CSS SETTINGS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"rs-plugin/css/settings.css\" media=\"screen\" />\r\n");
      out.write("    \r\n");
      out.write("        <!-- Custom -->\r\n");
      out.write("        <link href=\"css/style.css?v=1\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
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
      out.write("<body>\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("    ");
      out.write("<!-- Banner -->\r\n");
      out.write("        <div class=\"banner-top\">\r\n");
      out.write("            <img alt='top banner' src=\"images/banners/bra.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header section -->\r\n");
      out.write("        <header class=\"header-wrapper header-wrapper--home\">\r\n");
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
      out.write("                            <a href=\"page-elements.html\">Movie showing</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"page-elements.html\">Upcoming movie</a>\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <span class=\"sub-nav-toggle plus\"></span>\r\n");
      out.write("                            <a href=\"gallery-four.html\">Movie hot</a>\r\n");
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
      out.write("\r\n");
      out.write("        <!-- Slider -->\r\n");
      out.write("            <div class=\"bannercontainer\">\r\n");
      out.write("                    <div class=\"banner\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("        <!--end slider -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"container\">\r\n");
      out.write("            <div class=\"movie-best\">\r\n");
      out.write("                 <div class=\"col-sm-10 col-sm-offset-1 movie-best__rating\">Today Best choice</div>\r\n");
      out.write("                 <div class=\"col-sm-12 change--col\">\r\n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                 </div>\r\n");
      out.write("                <div class=\"col-sm-10 col-sm-offset-1 movie-best__check\">check all movies now playing</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("            <h2 id='target' class=\"page-heading heading--outcontainer\">Now in the cinema</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-8 col-md-9\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                         <aside class=\"col-sm-4 col-md-3\">\r\n");
      out.write("                        <div class=\"sitebar first-banner--left\">\r\n");
      out.write("                            <div class=\"banner-wrap first-banner--left\">\r\n");
      out.write("                                <img alt='banner' src=\"images/banners/sale.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                             <div class=\"banner-wrap\">\r\n");
      out.write("                                <img alt='banner' src=\"images/banners/sport.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                             <div class=\"banner-wrap banner-wrap--last\">\r\n");
      out.write("                                <img alt='banner' src=\"images/banners/boots.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"promo marginb-sm\">\r\n");
      out.write("                              <div class=\"promo__head\">A.Movie app</div>\r\n");
      out.write("                              <div class=\"promo__describe\">for all smartphones<br> and tablets</div>\r\n");
      out.write("                              <div class=\"promo__content\">\r\n");
      out.write("                                  <ul>\r\n");
      out.write("                                      <li class=\"store-variant\"><a href=\"#\"><img alt='' src=\"images/apple-store.svg\"></a></li>\r\n");
      out.write("                                      <li class=\"store-variant\"><a href=\"#\"><img alt='' src=\"images/google-play.svg\"></a></li>\r\n");
      out.write("                                      <li class=\"store-variant\"><a href=\"#\"><img alt='' src=\"images/windows-store.svg\"></a></li>\r\n");
      out.write("                                  </ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </aside>\r\n");
      out.write("                </div></div></section>\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("                        \r\n");
      out.write("                         ");
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
      out.write("                         <!-- JavaScript-->\r\n");
      out.write("        <!-- jQuery 1.9.1--> \r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js\"></script>\r\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/external/jquery-1.10.1.min.js\"><\\/script>')</script>\r\n");
      out.write("        <!-- Migrate --> \r\n");
      out.write("        <script src=\"js/external/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap 3--> \r\n");
      out.write("        <script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery REVOLUTION Slider -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile menu -->\r\n");
      out.write("        <script src=\"js/jquery.mobile.menu.js\"></script>\r\n");
      out.write("         <!-- Select -->\r\n");
      out.write("        <script src=\"js/external/jquery.selectbox-0.2.min.js\"></script>\r\n");
      out.write("        <!-- Stars rate -->\r\n");
      out.write("        <script src=\"js/external/jquery.raty.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Form element -->\r\n");
      out.write("        <script src=\"js/external/form-element.js\"></script>\r\n");
      out.write("        <!-- Form validation -->\r\n");
      out.write("        <script src=\"js/form.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Twitter feed -->\r\n");
      out.write("        <script src=\"js/external/twitterfeed.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom -->\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t      <script type=\"text/javascript\">\r\n");
      out.write("              $(document).ready(function() {\r\n");
      out.write("                init_Home();\r\n");
      out.write("              });\r\n");
      out.write("\t\t    </script>\r\n");
      out.write("</body>\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(2);
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li data-transition=\"fade\" data-slotamount=\"7\" class=\"slide\" data-slide='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name.substring(0,10)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("...'>\r\n");
          out.write("                                <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathBanner}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                <div class=\"caption slide__name margin-slider\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-y=\"80\" \r\n");
          out.write("\r\n");
          out.write("                                     data-splitin=\"chars\"\r\n");
          out.write("                                     data-elementdelay=\"0.1\"\r\n");
          out.write("\r\n");
          out.write("                                     data-speed=\"700\" \r\n");
          out.write("                                     data-start=\"1400\" \r\n");
          out.write("                                     data-easing=\"easeOutBack\"\r\n");
          out.write("\r\n");
          out.write("                                     data-customin=\"x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;\"\r\n");
          out.write("\r\n");
          out.write("                                    data-frames=\"{ typ :lines;\r\n");
          out.write("                                                 elementdelay :0.1;\r\n");
          out.write("                                                 start:1650;\r\n");
          out.write("                                                 speed:500;\r\n");
          out.write("                                                 ease:Power3.easeOut;\r\n");
          out.write("                                                 animation:x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:1;transformPerspective:600;transformOrigin:50% 50%;\r\n");
          out.write("                                                 },\r\n");
          out.write("                                                 { typ :lines;\r\n");
          out.write("                                                 elementdelay :0.1;\r\n");
          out.write("                                                 start:2150;\r\n");
          out.write("                                                 speed:500;\r\n");
          out.write("                                                 ease:Power3.easeOut;\r\n");
          out.write("                                                 animation:x:0;y:0;z:0;rotationX:00;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:1;transformPerspective:600;transformOrigin:50% 50%;\r\n");
          out.write("                                                 }\r\n");
          out.write("                                                 \"\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                    data-splitout=\"lines\"\r\n");
          out.write("                                    data-endelementdelay=\"0.1\"\r\n");
          out.write("                                    data-customout=\"x:-230;y:0;z:0;rotationX:0;rotationY:0;rotationZ:90;scaleX:0.2;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%\"\r\n");
          out.write("\r\n");
          out.write("                                    data-endspeed=\"500\"\r\n");
          out.write("                                    data-end=\"8400\"\r\n");
          out.write("                                    data-endeasing=\"Back.easeIn\"\r\n");
          out.write("                                    style=\"font-size: 30px\"\r\n");
          out.write("                                     >\r\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"caption slide__time margin-slider sfr str\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-hoffset='-243' \r\n");
          out.write("                                     data-y=\"186\" \r\n");
          out.write("                                     data-speed=\"300\" \r\n");
          out.write("                                     data-start=\"2100\" \r\n");
          out.write("                                     data-easing=\"easeOutBack\"\r\n");
          out.write("                                     data-endspeed=\"300\"\r\n");
          out.write("                                     data-end=\"8700\"\r\n");
          out.write("                                     data-endeasing=\"Back.easeIn\"\r\n");
          out.write("                                     >\r\n");
          out.write("                                     From\r\n");
          out.write("                                 </div>\r\n");
          out.write("                                <div class=\"caption slide__date margin-slider lfb ltb\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-hoffset='-149' \r\n");
          out.write("                                     data-y=\"186\" \r\n");
          out.write("                                     data-speed=\"500\" \r\n");
          out.write("                                     data-start=\"2400\" \r\n");
          out.write("                                     data-easing=\"Power4.easeOut\"\r\n");
          out.write("                                     data-endspeed=\"400\"\r\n");
          out.write("                                     data-end=\"8200\"\r\n");
          out.write("                                     data-endeasing=\"Back.easeIn\"\r\n");
          out.write("                                     >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.startDate.substring(0,5)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </div>\r\n");
          out.write("                                <div class=\"caption slide__time margin-slider sfr str\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-hoffset='-113' \r\n");
          out.write("                                     data-y=\"186\" \r\n");
          out.write("                                     data-speed=\"300\" \r\n");
          out.write("                                     data-start=\"2100\" \r\n");
          out.write("                                     data-easing=\"easeOutBack\"\r\n");
          out.write("                                     data-endspeed=\"300\"\r\n");
          out.write("                                     data-end=\"8700\"\r\n");
          out.write("                                     data-endeasing=\"Back.easeIn\"\r\n");
          out.write("                                     >\r\n");
          out.write("                                     - till\r\n");
          out.write("                                 </div>\r\n");
          out.write("                                <div class=\"caption slide__date margin-slider lfb ltb\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-y=\"186\" \r\n");
          out.write("                                     data-speed=\"500\" \r\n");
          out.write("                                     data-start=\"2800\" \r\n");
          out.write("                                     data-easing=\"Power4.easeOut\"\r\n");
          out.write("                                     data-endspeed=\"400\"\r\n");
          out.write("                                     data-end=\"8200\"\r\n");
          out.write("                                     data-endeasing=\"Back.easeIn\"\r\n");
          out.write("                                     >\r\n");
          out.write("                                     ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.startDate.substring(6,10)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                 </div>\r\n");
          out.write("                                <div class=\"caption slide__text margin-slider customin customout\" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-y=\"250\"\r\n");
          out.write("                                     data-customin=\"x:0;y:100;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:3;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:0% 0%;\"\r\n");
          out.write("                                     data-customout=\"x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;\" \r\n");
          out.write("                                     data-speed=\"400\" \r\n");
          out.write("                                     data-start=\"3000\"\r\n");
          out.write("                                     data-endspeed=\"400\"\r\n");
          out.write("                                     data-end=\"8000\"\r\n");
          out.write("                                     data-endeasing=\"Back.easeIn\">\r\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.description.substring(0,70)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("...\r\n");
          out.write("                                 </div>\r\n");
          out.write("                                <div class=\"caption margin-slider skewfromright customout \" \r\n");
          out.write("                                     data-x=\"right\" \r\n");
          out.write("                                     data-y=\"324\"\r\n");
          out.write("                                     data-customout=\"x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;\"\r\n");
          out.write("                                     data-speed=\"400\" \r\n");
          out.write("                                     data-start=\"3300\"\r\n");
          out.write("                                     data-easing=\"Power4.easeOut\"\r\n");
          out.write("                                     data-endspeed=\"300\"\r\n");
          out.write("                                     data-end=\"7700\"\r\n");
          out.write("                                     data-endeasing=\"Power4.easeOut\">\r\n");
          out.write("                                     <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"slide__link\">check out cinemas &amp; time</a>\r\n");
          out.write("                                 </div>\r\n");
          out.write("                            </li>\r\n");
          out.write("                        ");
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
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(5);
    _jspx_th_c_forEach_1.setVar("a");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                     <div class=\"movie-beta__item \">\r\n");
          out.write("                         <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                         <span class=\"best-rate\">5.0</span>\r\n");
          out.write("\r\n");
          out.write("                         <ul class=\"movie-beta__info\">\r\n");
          out.write("                             <li>\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                             </li>\r\n");
          out.write("                             <li class=\"last-block\">\r\n");
          out.write("                                 <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"slide__link\">more</a>\r\n");
          out.write("                             </li>\r\n");
          out.write("                         </ul>\r\n");
          out.write("                     </div>\r\n");
          out.write("                 ");
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
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_0.setVar("url");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${a.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("f");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setBegin(0);
    _jspx_th_c_forEach_2.setEnd(1);
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <!-- Movie variant with time -->\r\n");
          out.write("                            <div class=\"movie movie--test movie--test--dark movie--test--left\">\r\n");
          out.write("                                <div class=\"movie__images\">\r\n");
          out.write("                                    <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"movie-beta__link\">\r\n");
          out.write("                                        <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"movie__info\">\r\n");
          out.write("                                    <a href='details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' class=\"movie__title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  </a>\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                    <p class=\"movie__option\"><a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                                    \r\n");
          out.write("                                    <div class=\"movie__rate\">\r\n");
          out.write("                                        <div class=\"score\"></div>\r\n");
          out.write("                                        <span class=\"movie__rating\">4.1</span>\r\n");
          out.write("                                    </div>               \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                         <!-- Movie variant with time -->\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_2.setVar("url");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${f.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_3.setVar("b");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListCategory(url).get(0)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("f");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setBegin(2);
    _jspx_th_c_forEach_3.setEnd(3);
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <!-- Movie variant with time -->\r\n");
          out.write("                            <div class=\"movie movie--test movie--test--dark movie--test--right\">\r\n");
          out.write("                                <div class=\"movie__images\">\r\n");
          out.write("                                    <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"movie-beta__link\">\r\n");
          out.write("                                        <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"movie__info\">\r\n");
          out.write("                                    <a href='details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' class=\"movie__title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  </a>\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("                                    <p class=\"movie__option\"><a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                                    \r\n");
          out.write("                                    <div class=\"movie__rate\">\r\n");
          out.write("                                        <div class=\"score\"></div>\r\n");
          out.write("                                        <span class=\"movie__rating\">4.1</span>\r\n");
          out.write("                                    </div>               \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                         <!-- Movie variant with time -->\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_set_4.setVar("url");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${f.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_set_5.setVar("b");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListCategory(url).get(0)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("f");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setBegin(4);
    _jspx_th_c_forEach_4.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <!-- Movie variant with time -->\r\n");
          out.write("                            <div class=\"movie movie--test movie--test--dark movie--test--left\">\r\n");
          out.write("                                <div class=\"movie__images\">\r\n");
          out.write("                                    <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"movie-beta__link\">\r\n");
          out.write("                                        <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"movie__info\">\r\n");
          out.write("                                    <a href='details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' class=\"movie__title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  </a>\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                                    <p class=\"movie__option\"><a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                                    \r\n");
          out.write("                                    <div class=\"movie__rate\">\r\n");
          out.write("                                        <div class=\"score\"></div>\r\n");
          out.write("                                        <span class=\"movie__rating\">4.1</span>\r\n");
          out.write("                                    </div>               \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                         <!-- Movie variant with time -->\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_set_6.setVar("url");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${f.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_set_7.setVar("b");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListCategory(url).get(0)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setVar("f");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListFilm('http://45.76.161.51/api/vi/films')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setBegin(6);
    _jspx_th_c_forEach_5.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <!-- Movie variant with time -->\r\n");
          out.write("                            <div class=\"movie movie--test movie--test--dark movie--test--right\">\r\n");
          out.write("                                <div class=\"movie__images\">\r\n");
          out.write("                                    <a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"movie-beta__link\">\r\n");
          out.write("                                        <img alt='' src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.pathImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"movie__info\">\r\n");
          out.write("                                    <a href='details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' class=\"movie__title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  </a>\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("                                    <p class=\"movie__option\"><a href=\"details?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.nameCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                                    \r\n");
          out.write("                                    <div class=\"movie__rate\">\r\n");
          out.write("                                        <div class=\"score\"></div>\r\n");
          out.write("                                        <span class=\"movie__rating\">4.1</span>\r\n");
          out.write("                                    </div>               \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                         <!-- Movie variant with time -->\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_set_8.setVar("url");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://45.76.161.51/api/vi/categorys/+${f.idCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_set_9.setVar("b");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restful.getListCategory(url).get(0)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }
}
