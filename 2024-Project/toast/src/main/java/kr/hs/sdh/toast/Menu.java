package kr.hs.sdh.toast;

import java.util.List;

public class Menu {

    private String name;

    private List<Menu> menus;

    private Boolean isAcctive;

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, Boolean isAcctive) {
        this.name = name;
        this.isAcctive = isAcctive;
    }

    public Menu(String name, List<Menu> menus) {
        this.name = name;
        this.menus = menus;
    }

    public String getName() {
        return this.name;
    }

    public List<Menu> getMenus() {
        return this.menus;
    }

    public Boolean getIsAcctive() {
        return this.isAcctive;
    }


}
