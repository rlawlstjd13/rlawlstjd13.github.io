package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//필터는 인터페이스를 활용
//해당필터로 세션 및 로그인 설정제어, 매핑해줘야함.. /board

//*
public class LoginFilter implements Filter {
//서블릿이 먼저 요청처리하기 전 다룰수있음.
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 서블릿이 먼저 요청처리하기 전 다룰수있음.
		System.out.println("dofilter 전!!");
		System.out.println("사용자가 게시판 목록을 요청하였습니다. (게시판 목록)");
		System.out.println("세션값을 확인합니다");

		HttpSession session = ((HttpServletRequest) request).getSession();
		Object loginid = session.getAttribute("loginid");

		if (loginid != null) {
			System.out.println("로그인 되었씁니다. 게시판으로 forward합니다");

			// 원래 흐름. (chain.doFilter 위에서 코드를 치면 서블릿 객체 다루기전
			chain.doFilter(request, response);
		} else {
			// 밑에서 코드 치면.. 서블릿이 요청을 처리하고 응답 보내기 전.
			System.out.println("doFilter 후!!");
			System.out.println("로그인을 확인하세요");
			((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}

}
