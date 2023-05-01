package com.lenhac.stockcontrol.controller;

import com.lenhac.stockcontrol.model.Category;
import com.lenhac.stockcontrol.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {


    private final CategoryRepository categoryRepository;

    public ProductController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories/new")
    public ModelAndView showCategoryForm() {
        ModelAndView mav = new ModelAndView("product/create-category");
        Category category = new Category();
        mav.addObject("category", category);
        return mav;

    }
    @PostMapping("/categories")
    public String createCategory(@ModelAttribute("category") Category category) {
        categoryRepository.save(category);
        return "redirect:/categories/new";
    }

    // Other controller methods (e.g. for displaying a list of categories) go here

}


