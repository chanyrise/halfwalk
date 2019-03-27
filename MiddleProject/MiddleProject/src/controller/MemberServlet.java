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
		m.addAttribute("all",all);
		return "WEB-INF/show/listScore.jsp";
	}

	
	@RequestMapping("delete.do")
	public String my_delete(@RequestParam("del_name") int no) {
		int res = memberbiz.getDelete(no);
		if(res > 0)
			return "/select.do";
		return "";
	}
	
//	@RequestMapping(value="/find.do", method = RequestMethod.GET)
//	public String my_find(@RequestParam("find_name") String name, Model model) {
//		
//		Member r = memberbiz.getFind(name);
//		model.addAttribute("find",r);
//		return "/WEB-INF/show/updateScore.jsp";
//		
//	}
	
	@RequestMapping("/show/member.do")
	public String InsertView() {
		System.out.println("input");
		return "/WEB-INF/show/member.jsp";
	}

	
	@RequestMapping("/insert.do")
	public String MyInsert(@ModelAttribute("member") Member member) {
		System.out.println(member.getNo());
		System.out.println("insert");
		int r = memberbiz.getInsert(member);
		return "";
	}

}
