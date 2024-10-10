package hcmute.uni.app2.dao;

import hcmute.uni.app2.entities.Category;
import java.util.List;

public interface ICategoryDao {
    Category findById(int id);
    List<Category> findAll();
    void insert(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findByName(String name);
    int count();
    List<Category> findAll(int page, int pageSize);
}