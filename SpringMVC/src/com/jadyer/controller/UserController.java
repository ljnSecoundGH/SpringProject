package com.jadyer.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.jadyer.model.User;

public class UserController extends AbstractController {
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		
		System.out.println(arg0.getParameter("pageIndex")+"****");
		List<User> userList = new ArrayList<User>();
		User user11 = new User();
		User user22 = new User();
		user11.setUsername("������");
		user11.setPassword("02200059");
		user11.setAddress("��ɽ��¥");
		user11.setAge(27);
		user22.setUsername("����ʡ");
		user22.setPassword("95000220");
		user22.setAddress("���ӹ��");
		user22.setAge(37);
		userList.add(user11);
		userList.add(user22);
		// ModelAndView����SpringMVC����һ������Ҫ�ĸ���
		//������ִ�з��������뷵��һ��ModelAndView��ModelAndView���󱣴�����ͼ�Լ���ͼ��ʾ��ģ������
		//��һ����������ͼ������߼����ơ�������ͼ���߼�������userlist����ͼ��������ʹ�ø����Ʋ���ʵ�ʵ�View����
		//�ڶ������������ݸ���ͼ�ģ�ģ�Ͷ�������� 
		//���������������ݸ���ͼ�ģ�ģ�Ͷ����ֵ
		return new ModelAndView("userList", "users", userList);
	}
}
