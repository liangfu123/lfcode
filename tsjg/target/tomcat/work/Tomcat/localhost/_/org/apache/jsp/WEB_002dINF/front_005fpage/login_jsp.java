/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-09 01:32:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.front_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/common/common.jsp", Long.valueOf(1537534708176L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap-3.3.7/dist/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap-3.3.7/dist/css/bootstrap-theme.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap-3.3.7/dist/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap-3.3.7/js/carousel.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap-3.3.7/js/popover.js\"></script>");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("<title>登录</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"login_big\" style=\"background-image:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/login.jpg)\">\n");
      out.write("\t\t<div class=\"login_small\">\n");
      out.write("\t\t\t<div class=\"login_form\">\n");
      out.write("\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login.shtml\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("\t\t\t\t  <div style=\"width: 435px;\" class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">用户名</label>\n");
      out.write("\t\t\t\t    <div style=\"width: 300px\" class=\"col-sm-10\">\n");
      out.write("\t\t\t\t      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name=\"username\" placeholder=\"学号/工号/手机号\">\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  <div style=\"width: 435px;\" class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">密码</label>\n");
      out.write("\t\t\t\t    <div style=\"width: 300px\" class=\"col-sm-10\">\n");
      out.write("\t\t\t\t      <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" name=\"password\" placeholder=\"密码\">\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  <div style=\"width: 435px;\" class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">验证码</label>\n");
      out.write("\t\t\t\t    <div style=\"width: 200px\" class=\"col-sm-10\">\n");
      out.write("\t\t\t\t      <input id=\"vCode\" type=\"text\" class=\"form-control\" name=\"verifycode\" placeholder=\"验证码\">  \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t     <img id=\"vcode_img\" alt=\"点击更换\" title=\"点击更换\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/validatecode.jsp\"\n");
      out.write("\t\t\t\t      onclick=\"javascript:document.getElementById('vcode_img').src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/validatecode.jsp?'+new Date();\">\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  <div style=\"width: 435px;\" class=\"form-group\">\n");
      out.write("\t\t\t\t    <div style=\"width: 270px;\" class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\t\t\t\t      <button style=\"width: 270px;background:#ffcc66;\" type=\"submit\" class=\"btn btn-default\">登录</button>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"login_link\">\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t\t<table style=\"font-size: 14px; margin:0 auto;\">\n");
      out.write("\t\t\t\t\t<tr style=\"height: 40px;\">\n");
      out.write("\t\t\t\t\t\t<td><label>还没有荐购账号？</label><a style=\"font-size: 16px;\" href=\"javascript:void(0);\" onclick=\"window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toRegister.shtml'\">&nbsp;&nbsp;立即注册</a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr style=\"height: 40px;width: 300px;\">\n");
      out.write("\t\t\t\t\t\t<td><label>版权所有&nbsp;&nbsp;阿坝师范学院</label></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
