package org.spring.blog.board.service;

import java.util.List;
import java.util.Map;

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
	
	@Override
	public void insertBoard(BoardVO vo) throws Exception{
		boardDAO.insertBoard(vo);
	}

	@Override
	public BoardVO selectBoardDetail(int bno) throws Exception {
		boardDAO.updateViewCnt(bno);
		return boardDAO.selectBoardDetail(bno);
	}

	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		boardDAO.updateBoard(vo);
	}
}
