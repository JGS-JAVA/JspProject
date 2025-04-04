package kh.edu.jspexam.service;

import kh.edu.jspexam.model.dto.PostDTO;

import java.util.List;

public interface PostService {

    // 게시물 모두 조회
    List<PostDTO> getAllPosts();
    // 특정 게시물 상세조회
    PostDTO getPostById(int postId);
    // 게시물 저장
    void createPost(PostDTO post);
}
