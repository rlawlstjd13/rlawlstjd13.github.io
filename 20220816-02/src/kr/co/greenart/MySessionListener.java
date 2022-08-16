package kr.co.greenart;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

//세션 영역에서 동작하는 리스너(1.  2. 아이디가 변경됐을때, 3.수정할떄)

@WebListener
public class MySessionListener implements HttpSessionBindingListener, 
                                          HttpSessionIdListener, 
                                          HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("세션이 생성됨.");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().getId() + "세션이 소멸됨.");
	}

	@Override
	public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
		System.out.println(oldSessionId + " - 세션 아이디 변경 ->" + event.getSession().getId());
		
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 attribute가 설정되었음.");
		System.out.println(event.getName() + " : " + event.getValue());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		HttpSessionBindingListener.super.valueUnbound(event);
	}
	
	
	

	

}
