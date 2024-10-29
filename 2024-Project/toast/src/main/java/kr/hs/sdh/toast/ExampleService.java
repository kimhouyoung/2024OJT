package kr.hs.sdh.toast;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

    public ExampleService() {

    }

    public String[] getFruits() {
        return new String[]{"사과","바나나", "멜론", "수박"};
    }

    public Menu getMenu() {
        List<Menu> menuList = new ArrayList<>();

        Menu subMenu1 = new Menu("서브메뉴1", true);
        Menu subMenu2 = new Menu("서브메뉴2", false);
        Menu subMenu3 = new Menu("서브메뉴3", false);
        Menu subMenu4 = new Menu("서브메뉴4", false);

        menuList.add(subMenu1);
        menuList.add(subMenu2);
        menuList.add(subMenu3);
        menuList.add(subMenu4);

        Menu rootmenu = new Menu("대메뉴", menuList);
        return rootmenu;
    }

}
