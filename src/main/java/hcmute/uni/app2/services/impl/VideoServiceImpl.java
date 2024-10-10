package hcmute.uni.app2.services.impl;

import hcmute.uni.app2.entities.Video;
import hcmute.uni.app2.services.IVideoService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class VideoServiceImpl implements IVideoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Video findById(String id) {
        return entityManager.find(Video.class, id);
    }

    @Override
    public List<Video> findAll() {
        return entityManager.createQuery("SELECT v FROM Video v", Video.class).getResultList();
    }

    @Override
    @Transactional
    public void insert(Video video) {
        entityManager.persist(video);
    }

    @Override
    @Transactional
    public void update(Video video) {
        entityManager.merge(video);
    }

    @Override
    @Transactional
    public void delete(String id) {
        Video video = findById(id);
        if (video != null) {
            entityManager.remove(video);
        }
    }
}