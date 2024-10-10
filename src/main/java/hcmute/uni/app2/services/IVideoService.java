package hcmute.uni.app2.services;

import hcmute.uni.app2.entities.Video;
import java.util.List;

public interface IVideoService {
    Video findById(String id);
    List<Video> findAll();
    void insert(Video video);
    void update(Video video);
    void delete(String id);
}