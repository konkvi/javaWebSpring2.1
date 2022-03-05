package ru.netology.service;

import ru.netology.exception.NotFoundException;
import ru.netology.model.Post;
import ru.netology.repository.PostRepository;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class PostService {
  private final PostRepository repository;

  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public ConcurrentMap<Long,Post> all() { return repository.all(); }

  public Post getById(long id) { return repository.getById(id).orElseThrow(NotFoundException::new); }

  public Post save(Post post) { return repository.save(post); }

  public Post removeById(long id) { return repository.removeById(id).orElseThrow(NotFoundException::new); }
}

