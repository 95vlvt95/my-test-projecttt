package ua.a.pavlenko;

import org.springframework.context.support.GenericXmlApplicationContext;
import ua.a.pavlenko.entity.Category;
import ua.a.pavlenko.service.CategoryService;

public class AppMain {
    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        CategoryService categoryService = ctx.getBean("categoryService", CategoryService.class);

        categoryService.addCategory(new Category("kfdksbfkfdslc"));

        /*

        ItemService itemService = ctx.getBean("itemService", ItemService.class);

        CategoryService categoryService = ctx.getBean("categoryService", CategoryService.class);

        //itemService.addItem(new Item(categoryService.findOne(26), "item3", (float) 200.0));
        /*
        Category categoryToEdit = service.findByName("category1");
        categoryToEdit.setName("edited_category1");

        service.editCategory(categoryToEdit);

        Category category;

        service.editCategory("edited_category1", "edited_category2");*/

        //service.deleteAll();

        //service.addCategory(new Category("new_category11"));
        //service.addCategory(new Category("new_category2"));
        //service.addCategory(new Category("new_category3"));

        /*
        Category category = service.findOne(2);
        System.out.println(category.toString());*/
    }
}
