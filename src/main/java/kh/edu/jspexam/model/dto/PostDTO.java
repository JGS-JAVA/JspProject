package kh.edu.jspexam.model.dto;

import java.time.LocalDateTime;

public class PostDTO {
    private int postId;
    private String postTitle;
    private String postContent;
    private String postWriter;
    private LocalDateTime createAt;

    // 게터 세터 만들기
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostWriter() {
        return postWriter;
    }

    public void setPostWriter(String postWriter) {
        this.postWriter = postWriter;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "PostDTO{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postWriter='" + postWriter + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
