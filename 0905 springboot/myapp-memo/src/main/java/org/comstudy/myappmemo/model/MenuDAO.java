package org.comstudy.myappmemo.model;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuDAO {
    private final ArrayList<Menu> menus;
    private long nextId = 1;

    public MenuDAO() {
        menus = new ArrayList<>();
        menus.add(new Menu(nextId++, "title", "description"));
        menus.add(new Menu(nextId++, "title2", "description2"));
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu) {
        menu.setId(nextId++);
        menus.add(menu);
    }

    public void updateMenu(Menu updatedMenu) {
        for (Menu menu : menus) {
            if (menu.getId().equals(updatedMenu.getId())) {
                menu.setTitle(updatedMenu.getTitle());
                menu.setContent(updatedMenu.getContent());
                break;
            }
        }
    }

    public void deleteMenu(Long id) {
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            if (menu.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }
}
