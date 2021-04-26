package com.company;

public class CategoryManager {



    public  void  listCategory(Category[] categories)
    {
        for(Category category:categories)
        {
            System.out.println(category.catName);
        }
    }
}
