package org.spring.blog.board.controller;

import javax.inject.Inject;

import org.spring.blog.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/selectBoardList", method=RequestMethod.GET)
	public String selectBoardList(Model model) throws Exception{
		model.addAttribute("boardList", service.selectBoardList());
		return "board/index";
	}
}
