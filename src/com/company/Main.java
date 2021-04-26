package com.company;

public class Main {

    public static void main(String[] args) {

        Course c1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.","Engin DEMİROĞ",0.0);
        Course c2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.","Engin DEMİROĞ",0.0);
        Course c3 = new Course(3,"Programlamaya Giriş için Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.","Engin DEMİROĞ",0.0);
        Course[] courses ={c1,c2,c3};
        CourseManager courseManager = new CourseManager();
        courseManager.registerCourse(c1);
        courseManager.listCourse(courses);

        Category cat1= new Category(1,"Kurslarım");
        Category cat2= new Category(1,"Tüm Kurslarım");
        Category cat3= new Category(1,"Kampa Hazırlık");
        Category cat4= new Category(1,"Sık Sorulan Sorular");

        Category[] categories = {cat1,cat2,cat3,cat4};

        CategoryManager catManager = new CategoryManager();
        catManager.listCategory(categories);
    }
}
