/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-09 03:04:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.back_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class purchase_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>采购清单</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: rgba(10%,10%,10%,6%);\">\n");
      out.write("\t<div class=\"back_right\">\n");
      out.write("\t\t<div class=\"back_right_box\">\n");
      out.write("\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t<table class=\"back_right_form\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t\t<select style=\"width: 90px;margin: 0 auto;\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"0\">图书</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"1\">期刊</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"70px\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn btn-default\" type=\"submit\" value=\"导出\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"60px\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<table border=\"1\" class=\"back_right_list\">\n");
      out.write("\t\t\t\t<tr style=\"height: 30px;color: red;font-size: 14px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t题名\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t作者\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\tISBN/ISSN\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t荐购次数\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t操作\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height: 22px;\">\n");
      out.write("\t\t\t\t\t<td width=\"15px\">\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t  <label>\n");
      out.write("\t\t\t\t\t\t    &nbsp;&nbsp;<input type=\"checkbox\" id=\"blankCheckbox\" value=\"option1\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t\t  </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toDetails.shtml')\">红楼梦 </a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t罗贯中\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\">\n");
      out.write("\t\t\t\t\t\t1234567890123\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t清华大学出版社\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"80px\">\n");
      out.write("\t\t\t\t\t\t20\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"140px\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"javascript:void(0);\" role=\"button\">删除</a>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button style=\"font-size: 12px;height: 35px;\" type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("\t\t\t\t\t\t  编辑\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t  <div style=\"width: 800px;\" class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t    <div class=\"modal-content\">\n");
      out.write("\t\t      <div class=\"modal-header\">\n");
      out.write("\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t        <h4 class=\"modal-title\" id=\"myModalLabel\">编辑</h4>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t      <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\" method=\"post\">\n");
      out.write("\t\t\t      <div style=\"width: 800px;\" class=\"modal-body\">\n");
      out.write("\t\t\t        <table style=\"width: 770px;\">\n");
      out.write("\t\t\t        \t<tr height=\"40\">\n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">题名：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t        \t\t<input style=\"width: 220px;\" type=\"text\" class=\"form-control\" name=\"\" placeholder=\"题名\">\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t\t        \t\n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">作者：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t\t        \t<input style=\"width: 220px;\" type=\"text\" class=\"form-control\" name=\"\" placeholder=\"作者\">\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t        \t</tr>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        \t<tr height=\"40\">\n");
      out.write("\t\t\t        \t\t<td style=\"text-align: right;\">ISBN/ISSN：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t        \t\t<input style=\"width: 220px;\" type=\"text\" class=\"form-control\" name=\"\" placeholder=\"ISBN/ISSN\">\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t\t        \t\n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">出版社：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t        \t\t<input style=\"width: 220px;\" type=\"text\" class=\"form-control\" name=\"\" placeholder=\"出版社\">\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t        \t</tr>\n");
      out.write("\t\t\t        \t\n");
      out.write("\t\t\t        \t<tr height=\"40\">\n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">学科分类：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t        \t\t<select style=\"width: 220px;\" name=\"college\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"文学与传媒学院\">文学与传媒学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"马克思主义学院\">马克思主义学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"外国语学院\">外国语学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"基础教育学院\">基础教育学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"经济与管理学院\">经济与管理学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"数学与计算机科学学院\">数学与计算机科学学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"电子信息与自动化学院\">电子信息与自动化学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"资源与环境学院\">资源与环境学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"藏汉双语学院\">藏汉双语学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"音乐舞蹈学院\">音乐舞蹈学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"美术学院\">美术学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"体育与健康学院\">体育与健康学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t\t        \t\n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">普通分类：</td>\n");
      out.write("\t\t\t\t        \t<td>\n");
      out.write("\t\t\t\t        \t\t<select style=\"width: 220px;\" name=\"college\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"文学与传媒学院\">文学与传媒学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"马克思主义学院\">马克思主义学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"外国语学院\">外国语学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"基础教育学院\">基础教育学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"经济与管理学院\">经济与管理学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"数学与计算机科学学院\">数学与计算机科学学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"电子信息与自动化学院\">电子信息与自动化学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"资源与环境学院\">资源与环境学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"藏汉双语学院\">藏汉双语学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"音乐舞蹈学院\">音乐舞蹈学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"美术学院\">美术学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"体育与健康学院\">体育与健康学院</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t        \t</tr>\n");
      out.write("\t\t\t        \t\n");
      out.write("\t\t\t        </table>\n");
      out.write("\t\t\t        \t\n");
      out.write("\t\t\t        <table style=\"width: 700px;height: 220px;margin-left: 50px;\">\n");
      out.write("\t\t\t        \t<tr>\n");
      out.write("\t\t\t        \t\t<td style=\"text-align: right;\">封面：</td>\n");
      out.write("\t\t\t\t        \t<td width=\"200px\">\n");
      out.write("\t\t\t\t        \t\t<div style=\"width: 200px;\" class=\"form-group\"><br>\n");
      out.write("\t\t\t\t\t\t\t\t    <input type=\"file\" id=\"file\" onchange=\"filechange(event)\">\n");
      out.write("\t\t\t\t\t\t\t\t    <div id=\"picBox\">\n");
      out.write("\t\t\t\t\t\t\t\t    \t<img src=\"\" id=\"img\" width=\"130px\" height=\"140px\" style=\"margin-top: 6px;margin-left: 10px;\">\n");
      out.write("\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t        \t</td>\n");
      out.write("\t\t\t       \n");
      out.write("\t\t\t\t        \t<td style=\"text-align: right;\">摘要：</td>\n");
      out.write("\t\t\t\t        \t<td width=\"350px;\">\n");
      out.write("\t\t\t\t        \t\t<textarea style=\"height: 200px;resize:none;\" class=\"form-control\" rows=\"3\" ></textarea>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t        \t</tr>\n");
      out.write("\t\t\t        </table>\n");
      out.write("\t\t\t        \t\n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t      <div class=\"modal-footer\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t\t\t        <button type=\"submit\" class=\"btn btn-primary\">保存</button>\n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t      </form>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar filechange = function(event){\n");
      out.write("\t\tvar files = event.target.files, file;\n");
      out.write("\t\tif(files && files.length > 0){\n");
      out.write("\t\t\tfile = files[0];\n");
      out.write("\t\t\tvar URL = window.URL || window.webkitURL;\n");
      out.write("\t\t\tvar imgURL = URL.createObjectURL(file);\n");
      out.write("\t\t\t$(\"#img\").attr(\"src\",imgURL);\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("</script>\n");
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