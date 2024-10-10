package hcmute.uni.app2.dao.interfaces;

import hcmute.uni.app2.entities.Video;

import java.util.List;

public interface IVideoDao
{
    void insert(Video video);

    void update(Video video);

    void delete(String videoId) throws Exception;

    Video findById(String videoId);

    List<Video> findByTitle(String title);

    List<Video> findAll();

    List<Video> findAll(int page, int pagesize);

    int count();
}
