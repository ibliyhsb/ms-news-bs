package cl.duoc.ms_news_bs.client;

import cl.duoc.ms_news_bs.model.dto.NewsArticleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "newsDbClient", url = "${news.db.url}")
public interface NewsDbClient {
    @GetMapping("/news")
    List<NewsArticleDto> getAll();

    @GetMapping("/news/{id}")
    NewsArticleDto getById(@PathVariable("id") Long id);

    @PostMapping("/news")
    NewsArticleDto create(@RequestBody NewsArticleDto article);

    @PutMapping("/news/{id}")
    NewsArticleDto update(@PathVariable("id") Long id, @RequestBody NewsArticleDto article);

    @DeleteMapping("/news/{id}")
    void delete(@PathVariable("id") Long id);
}
