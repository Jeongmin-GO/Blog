package org.spring.blog.board.controller;

import javax.inject.Inject;

import org.spring.blog.board.service.BoardService;
import org.spring.blog.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value="/boardForm")
	public String boardForm() {
		return "board/boardForm";
	}
	
	@RequestMapping(value="/insertBoard")
	public String insertBoardList(@ModelAttribute("BoardVO") BoardVO vo, RedirectAttributes rttr)throws Exception{
		service.insertBoard(vo);
		return "redirect:/board/selectBoardList";
	}
}
