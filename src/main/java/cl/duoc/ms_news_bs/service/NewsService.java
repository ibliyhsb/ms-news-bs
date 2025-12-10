package cl.duoc.ms_news_bs.service;

import cl.duoc.ms_news_bs.client.NewsDbClient;
import cl.duoc.ms_news_bs.model.dto.NewsArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsDbClient newsDbClient;

    public List<NewsArticleDto> getAll() {
        return newsDbClient.getAll();
    }

    public NewsArticleDto getById(Long id) {
        return newsDbClient.getById(id);
    }

    public NewsArticleDto create(NewsArticleDto article) {
        return newsDbClient.create(article);
    }

    public NewsArticleDto update(Long id, NewsArticleDto article) {
        return newsDbClient.update(id, article);
    }

    public void delete(Long id) {
        newsDbClient.delete(id);
    }
}
