package cl.duoc.ms_news_bs.controller;

import cl.duoc.ms_news_bs.service.NewsService;
import cl.duoc.ms_news_bs.model.dto.NewsArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<NewsArticleDto> getAll() {
        return newsService.getAll();
    }

    @GetMapping("/{id}")
    public NewsArticleDto getById(@PathVariable Long id) {
        return newsService.getById(id);
    }

    @PostMapping
    public NewsArticleDto create(@RequestBody NewsArticleDto article) {
        return newsService.create(article);
    }

    @PutMapping("/{id}")
    public NewsArticleDto update(@PathVariable Long id, @RequestBody NewsArticleDto article) {
        return newsService.update(id, article);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        newsService.delete(id);
    }
}
