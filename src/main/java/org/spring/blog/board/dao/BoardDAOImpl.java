package org.spring.blog.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.spring.blog.board.vo.BoardVO;
import org.spring.common.Pagination;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.spring.board.BoardMapper.";
	
	@Override
	public List<BoardVO> selectBoardList(Pagination pagination) throws Exception{
		return sqlSession.selectList(namespace+"selectBoardList", pagination);
	}

	@Override
	public BoardVO selectBoardDetail(int bno) throws Exception {
		return sqlSession.selectOne(namespace+"selectBoardDetail", bno);
	}

	@Override
	public int insertBoard(BoardVO vo) throws Exception {
		return sqlSession.insert(namespace+"insertBoard", vo);
	}

	@Override
	public int updateBoard(BoardVO vo) throws Exception {
		return sqlSession.update(namespace+"updateBoard", vo);
	}

	@Override
	public int deleteBoard(int bno) throws Exception {
		return sqlSession.insert(namespace+"deleteBoard", bno);
	}

	@Override
	public int updateViewCnt(int bno) throws Exception {
		return sqlSession.update(namespace+"updateViewCnt", bno);
	}

	@Override
	public int getBoardListCnt() throws Exception {
		return sqlSession.selectOne(namespace+"getBoardListCnt");
	}
}
