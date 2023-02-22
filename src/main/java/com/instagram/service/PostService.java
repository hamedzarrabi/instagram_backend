package com.instagram.service;

import com.instagram.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public Post createPost(Post post);
    public Post updatePost(Post post);
    public void deletePost(Long postId);
    public List<Post> findAllPosts();
    public Optional<Post> findPostById(Long postId);

}
