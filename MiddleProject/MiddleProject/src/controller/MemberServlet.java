package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import biz.MemberBiz;
import vo.Member;

@Controller
public class MemberServlet {

	@Autowired
	MemberBiz memberbiz;

	// 1.전체출력
	@RequestMapping("/select.do")
	public String my_select(Model m) {
		List<Member> all = memberbiz.getAll();
		m.addAttribute("all", all);
		return "listScore";
	}

	@RequestMapping("/delete.do")
	public String my_delete(@RequestParam("del_name") String id) {
		int res = memberbiz.getDelete(id);
		if (res > 0)
			return "/select.do";
		return "";
	}

	@RequestMapping("/show/member.do")
	public String InsertView() {
		
		return "/WEB-INF/show/member.jsp";
	}

	@RequestMapping("/insert.do")
	public String MyInsert(@ModelAttribute("member")Member member) {
		System.out.println(member.getId());
		
		int r = memberbiz.getInsert(member);
		return "";
	}
	
	@RequestMapping("/update.do")
	public String MyUpdate(@ModelAttribute("member") Member member) {
		System.out.println(member.getId());
		
		int r = memberbiz.getUpdate(member);
		return "";

	}
	

}
