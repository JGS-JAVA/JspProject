package kh.edu.jspexam.service;

import kh.edu.jspexam.mapper.PostMapper;
import kh.edu.jspexam.model.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    /*
    게시글 모두 조회
     * @return 게시글 리스트
     * */
    @Override
    public List<PostDTO> getAllPosts() {
        return postMapper.selectAllPosts();
    }

    /*
    * 게시글 아이디 기준 게시글 상세 조회
    * @param postId 조회할 게시글 ID
    * @return 게시글 상세 정보
    * */
    @Override
    public PostDTO getPostById(int postId) {
        return postMapper.selectPostById(postId);
    }

    /*
    * 게시글 새로 등록
    * @param post 등록할 게시글 데이터(제목,내용,작성자 등)
    * */
    @Override
    public void createPost(PostDTO post) {
        postMapper.insertPost(post);
    }
}
