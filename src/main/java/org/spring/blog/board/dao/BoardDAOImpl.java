package org.spring.blog.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.spring.blog.board.vo.BoardVO;
import org.spring.blog.board.vo.ReplyVO;
import org.spring.common.Pagination;
import org.spring.common.Search;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.spring.board.BoardMapper.";
	private static final String namespace_reply = "org.spring.blog.board.replyMapper.";
	
	@Override
	public List<BoardVO> selectBoardList(Search search) throws Exception{
		return sqlSession.selectList(namespace+"selectBoardList", search);
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
	public int getBoardListCnt(Search search) throws Exception {
		return sqlSession.selectOne(namespace+"getBoardListCnt", search);
	}

	@Override
	public List<ReplyVO> selectReplyList(int bno) throws Exception {
		return sqlSession.selectList(namespace_reply+"selectReplyList", bno);
	}

	@Override
	public int insertReply(ReplyVO replyVO) throws Exception {
		return sqlSession.insert(namespace_reply+"insertReply", replyVO);
	}

	@Override
	public int updateReply(ReplyVO replyVO) throws Exception {
		return sqlSession.update(namespace_reply+"updateReply", replyVO);
	}

	@Override
	public int deleteReply(int rno) throws Exception {
		return sqlSession.delete(namespace_reply+"updateReply", rno);
	}
}
