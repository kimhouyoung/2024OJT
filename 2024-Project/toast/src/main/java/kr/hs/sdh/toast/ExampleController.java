package kr.hs.sdh.toast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExampleController {

    private final ExampleService exampleService;
    private final MenuService menuService;

    public ExampleController(MenuService menuService, ExampleService exampleService) {
        this.menuService = menuService;
        this.exampleService = exampleService;
    }

    @GetMapping("/profile")
    public  String myProfile() {
        return "profile";
    }

    @GetMapping("/list")
    public ModelAndView myList() {
        ModelAndView modelAndView = new ModelAndView("list");
        String[] fruits = exampleService.getFruits();

        modelAndView.addObject( "fruits", fruits);

        return modelAndView;
    }

    @GetMapping("/menus")
    public ModelAndView menus() {
        ModelAndView modelAndView = new ModelAndView("menus");
        Menu menu = exampleService.getMenu();
        modelAndView.addObject("menu", menu);
        return modelAndView;
    }

    @GetMapping("/multi-menus")
    public ModelAndView multiMenus() {
        ModelAndView modelAndView = new ModelAndView("multi-menus");
        List<Menu> rootMenus = menuService.getRootMenus();
        modelAndView.addObject("rootMenus", rootMenus);
        return modelAndView;
    }

}

