package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
//인코딩은 변하지않는 것이기에 상수로가능 또는 initparam
@WebFilter(filterName = "EncodingFilter", urlPatterns= "/*", 
initParams = @WebInitParam(name = "encoding", value = "UTF-8")) //*모든 요청에 동작? 서블렛에선 불가 필터에서만 가능..
public class EncodingFilter implements Filter{
	private String encoding;
	
@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	    encoding = filterConfig.getInitParameter("encoding");
	}

	//인코딩은 변하지않는 것이기에 상수로가능 또는 initparam
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);
		
	}
	

}
