package csk.web.config;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(
        filterName="LoginFilter",
        urlPatterns="/*",
        initParams={
                /** 忽略资源 */
                @WebInitParam(name="exclusions", value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        }
)
@Order(1)
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String path = request.getContextPath();
        String url = request.getRequestURI();
        System.out.println("path: "+path);
        System.out.println("url: "+url);
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("order LoginFilter");
    }

    @Override
    public void destroy() {

    }
}
