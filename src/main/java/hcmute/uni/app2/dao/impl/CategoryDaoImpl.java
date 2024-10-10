package hcmute.uni.app2.dao.impl;

import hcmute.uni.app2.dao.ICategoryDao;
import hcmute.uni.app2.entities.Category;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class CategoryDaoImpl implements ICategoryDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Category findById(int id) {
        return entityManager.find(Category.class, id);
    }

    @Override
    public List<Category> findAll() {
        return entityManager.createQuery("SELECT c FROM Category c", Category.class).getResultList();
    }

    @Override
    @Transactional
    public void insert(Category category) {
        entityManager.persist(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        entityManager.merge(category);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Category category = findById(id);
        if (category != null) {
            entityManager.remove(category);
        }
    }

    @Override
    public List<Category> findByName(String name) {
        return entityManager.createQuery("SELECT c FROM Category c WHERE c.categoryname = :name", Category.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public int count() {
        Long count = entityManager.createQuery("SELECT COUNT(c) FROM Category c", Long.class).getSingleResult();
        return count.intValue();
    }

    @Override
    public List<Category> findAll(int page, int pageSize) {
        return entityManager.createQuery("SELECT c FROM Category c", Category.class)
                .setFirstResult((page - 1) * pageSize)
                .setMaxResults(pageSize)
                .getResultList();
    }
}