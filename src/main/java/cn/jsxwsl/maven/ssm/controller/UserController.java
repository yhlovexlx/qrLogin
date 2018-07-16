package cn.jsxwsl.maven.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jsxwsl.maven.ssm.bean.User;
import cn.jsxwsl.maven.ssm.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	// ����ҳ��
	@RequestMapping("/{id}.html")
	public ModelAndView getUser(@PathVariable("id")long id){
		ModelAndView md = new ModelAndView();
		User user = userService.getUserById(id);
		md.addObject("user",user);
		md.setViewName("user");
		return md;
		
	}

	// ����json����
	@RequestMapping("/ujson/{id}")
	@ResponseBody
	public Map<String, Object> getUserJson(@PathVariable("id") long id ){
		List<User> user = userService.getUserList();
		Map<String, Object> map = new HashMap<>();
		map.put("state", "success");
		map.put("obj", user);
		return map;
	}
	
	
	@RequestMapping("/users.html")
	public ModelAndView getUserList(){
		ModelAndView md = new ModelAndView();
//		List<User> users = userService.getUserList();
//		md.addObject("users",users);
		md.setViewName("user");
		return md;
		
	}
	
	
}
