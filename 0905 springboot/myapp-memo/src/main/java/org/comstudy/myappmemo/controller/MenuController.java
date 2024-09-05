package org.comstudy.myappmemo.controller;

import org.comstudy.myappmemo.model.Menu;
import org.comstudy.myappmemo.model.MenuDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenuController {
    private final MenuDAO menuDAO = new MenuDAO();

    @GetMapping
    public String getMenu(Model model) {
        model.addAttribute("menu", menuDAO.getMenus());
        return "menus";
    }

    @PostMapping
    public String addMenu(Menu menu, Model model) {
        menuDAO.addMenu(menu);
        return "redirect:/menus";
    }

    @PostMapping("/update")
    public String updateMenu(Menu menu, Model model) {
        menuDAO.updateMenu(menu);
        return "redirect:/menus";
    }

    @PostMapping("/delete")
    public String deleteMenu(Long id, Model model) {
        menuDAO.deleteMenu(id);
        return "redirect:/menus";
    }
}
