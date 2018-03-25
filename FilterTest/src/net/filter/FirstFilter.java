package net.filter;

import javax.servlet.*;
import java.io.IOException;

//  过滤器filter是一项十分实用的技术
//  通过filter可以对web资源机进行控制和管理，例如对jsp、servlet等进行拦截
//  filter优于jsp或者servlet之前运行

//  应用：
//  可以实现utl级别的权限访问控制，过滤敏感词汇等一下额高级的功能

//  生命周期：
//  服务器启动时创建filter对象，服务器关闭时销毁filter对象
//  注意：会在servletcontext对象创建之后创建

public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        应用较少

//      查看filterconfig的api
        String filtername =  filterConfig.getFilterName();
        String initParameter = filterConfig.getInitParameter("param");     //在web.xml中配置初始化信息
        ServletContext servletContext = filterConfig.getServletContext();

        System.out.println(filtername+"--"+initParameter);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//      需要在web.xml配置filter

//        在web.xml设置了/*，即所有的url请求被过滤了
//        filterChain是用来放行的——实用
//        注意：
//        filterChain.doFilter(servletRequest, servletResponse);

//        ServletRequest servletRequest, ServletResponse servletResponse
//        两个参数其实和servlet的HttpRequest 和 HttpResponse一样，只是不同的封装

//        最重要的参数：filterChain，过滤链对象
//        通过该对象的doFilter方法可以放行该请求——经常实用
//        当有多个过滤器的时候会将请求发送给下一个过滤器，直至发送给对应的servlet（因为一个servlet可以有多个过滤器）或者jsp处理


    }

    @Override
    public void destroy() {

    }
}
