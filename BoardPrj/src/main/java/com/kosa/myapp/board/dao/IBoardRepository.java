package com.kosa.myapp.board.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.kosa.myapp.board.model.Board;
import com.kosa.myapp.board.model.BoardUploadFile;

public interface IBoardRepository {
	int selectMaxArticleNo();
	int selectMaxFileId();
	
	void insertArticle(Board board);
	void insertFIleData(BoardUploadFile file);
	
	List<Board> selectArticleListByCategory(@Param("categoryId") int categoryId, @Param("start") int start, @Param("end") int end);
	
	Board selectArticle(int boardId);
	BoardUploadFile getFile(int fileId);
	
	void updateReadCount(int boardId);
	void updateReplyNumber(@Param("masterId") int masterId, @Param("replyNumber") int replyNumber);
	void replyArticle(Board boardId);
	
	String getPassword(int boardId);
	void updateArticle(Board board);
	void updateFIleData(BoardUploadFile file);
	
	void deleteFileData(int boardId);
	void deleteReplyFileData(int boardId);
	Board selectDeleteArticle(int boardId);
	void deleteArticleByBoardId(int boardId);
	void deleteArticleByMasterId(int boardId);
	
	int selectTotalArticleCount();
	int selectTotalArticleCountByCategoryId(int categoryId);
	List<Board> searchListByContentKeyword(String keyword);
}