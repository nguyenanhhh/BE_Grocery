package net.geeksbox.demo.restfulspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface CategoryRepositiry extends JpaRepository<Category, Integer> {

}
