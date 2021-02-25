package org.spring.blog.board.service;

import java.util.List;

import javax.inject.Inject;

import org.spring.blog.board.dao.BoardDAO;
import org.spring.blog.board.vo.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> selectBoardList() throws Exception{
		return boardDAO.selectBoardList();
	}
}
