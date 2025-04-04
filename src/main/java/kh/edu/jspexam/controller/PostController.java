package kh.edu.jspexam.controller;

import kh.edu.jspexam.model.dto.PostDTO;
import kh.edu.jspexam.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
* 게시물 관련 요청 처리 컨트롤러
*
* */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    /*
    * 게시글 목록 페이지 반환
    * @param model 뷰에 데이터 전달 위한 모델 객체
    * @return 게시글 목록 화면의 뷰 이름
    * */
    @GetMapping("/list")
    public String postList(Model model) {
        List<PostDTO> posts = postService.getAllPosts();
        // 컨트롤러에서 post 란 이름으로 담은 게시물 리스트를 list.jsp 폴더 내부에 전달시 "posts" 란 명칭으로 전달할 것.
        model.addAttribute("posts", posts);

        return "post/list"; //-> webapp/WEB-INF.views.post 폴더 내부에 있는 list.jsp 로 전달

    }
}
