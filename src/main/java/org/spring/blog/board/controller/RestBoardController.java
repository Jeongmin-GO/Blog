package org.spring.blog.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.blog.board.service.BoardService;
import org.spring.blog.board.vo.ReplyVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/restBoard")
public class RestBoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardService;

	@RequestMapping(value = "/getReqlyList", method = RequestMethod.POST)
	public List<ReplyVO> selectReplyList(@RequestParam("bno") int bno) throws Exception {
		return boardService.selectReplyList(bno);
	}
	
}
