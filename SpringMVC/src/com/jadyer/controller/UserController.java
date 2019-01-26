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
		user11.setUsername("张起灵");
		user11.setPassword("02200059");
		user11.setAddress("阴山古楼");
		user11.setAge(27);
		user22.setUsername("吴三省");
		user22.setPassword("95000220");
		user22.setAddress("蛇沼鬼城");
		user22.setAge(37);
		userList.add(user11);
		userList.add(user22);
		// ModelAndView类在SpringMVC中是一个很重要的概念
		//控制器执行方法都必须返回一个ModelAndView，ModelAndView对象保存了视图以及视图显示的模型数据
		//第一个参数：视图组件的逻辑名称。这里视图的逻辑名称是userlist，视图解析器会使用该名称查找实际的View对象
		//第二个参数：传递给视图的，模型对象的名称 
		//第三个参数：传递给视图的，模型对象的值
		return new ModelAndView("userList", "users", userList);
	}
}
