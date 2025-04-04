package kh.edu.jspexam.mapper;

import kh.edu.jspexam.model.dto.PostDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    // 모든 게시물 조회 , 컴마 없으면 에러남
    @Select("SELECT " +
            "post_id as postId, " +
            "post_title as postTitle, " +
            "post_content as postContent, " +
            "post_writer as postWriter, " +
            "created_at as createAt " +
            "from post")
    List<PostDTO> selectAllPosts();

    // 특정 게시물 조회
    @Select("SELECT " +
            "post_id as postId, " +
            "post_title as postTitle, " +
            "post_content as postContent, " +
            "post_writer as postWriter, " +
            "created_at as createAt " +
            "from post where post_id=${postId}")
    PostDTO selectPostById(@Param("postId") int postId);

    // 게시물 저장
    @Insert("insert into post (post_title, post_content, post_writer) " +
            "VALUES (#{postTitle},#{postContent},#{postWriter}")
    void insertPost(PostDTO post);


}
