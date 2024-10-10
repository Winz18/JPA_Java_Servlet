package hcmute.uni.app2.services.impl;

import hcmute.uni.app2.dao.ICategoryDao;
import hcmute.uni.app2.entities.Category;
import hcmute.uni.app2.services.ICategoryService;

import jakarta.transaction.Transactional;
import java.util.List;

public class CategoryServiceImpl implements ICategoryService {

    private final ICategoryDao categoryDao;

    public CategoryServiceImpl(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Category findById(int id) {
        return categoryDao.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    @Transactional
    public void insert(Category category) {
        categoryDao.insert(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        categoryDao.update(category);
    }

    @Override
    @Transactional
    public void delete(int id) {
        categoryDao.delete(id);
    }

    @Override
    public List<Category> findByName(String name) {
        return categoryDao.findByName(name);
    }

    @Override
    public int count() {
        return categoryDao.count();
    }

    @Override
    public List<Category> findAll(int page, int pageSize) {
        return categoryDao.findAll(page, pageSize);
    }
}