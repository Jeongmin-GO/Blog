package org.spring.blog.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.blog.board.service.BoardService;
import org.spring.blog.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String boardForm(@ModelAttribute("boardVO") BoardVO vo, Model model) {
		return "board/boardForm";
	}
	
	@RequestMapping(value="/insertBoard")
	public String insertBoardList(@ModelAttribute("BoardVO") BoardVO vo, @RequestParam("mode") String mode, RedirectAttributes rttr)throws Exception{
		
		if(mode.equals("edit")) {
			service.updateBoard(vo);
		}else {
			service.insertBoard(vo);
		}
		
		return "redirect:/board/selectBoardList";
	}
	
	@RequestMapping(value="/selectBoardDetail", method=RequestMethod.GET)
	public String selectBoardDetail(Model model, @RequestParam("bno") int bno) throws Exception{
		model.addAttribute("boardDetail", service.selectBoardDetail(bno));
		return "board/boardDetail";
	}
	
	@RequestMapping(value="/editForm", method=RequestMethod.GET)
	public String editForm(@RequestParam("bno") int bno, @RequestParam("mode") String mode, Model model) throws Exception{
		model.addAttribute("boardDetail", service.selectBoardDetail(bno));
		model.addAttribute("mode", mode);
		model.addAttribute("boardVO", new BoardVO());
		return "board/boardForm";
	}
	
	@RequestMapping(value="/deleteBoard", method=RequestMethod.GET)
	public String deleteBoard(RedirectAttributes rttr, @RequestParam("bno")int bno) throws Exception{
		service.deleteBoard(bno);
		return "redirect:/board/selectBoardList";
	}
	
	/*
	 * @ExceptionHandler(RuntimeException.class) public String
	 * exceptionHandler(Model model, Exception e) { Logger logger =
	 * LoggerFactory.getLogger(this.getClass()); logger.info("exception : " +
	 * e.getMessage()); model.addAttribute("exception", e); return
	 * "error/exception"; }
	 */
}
