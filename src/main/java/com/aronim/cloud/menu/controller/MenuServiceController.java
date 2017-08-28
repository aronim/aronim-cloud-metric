package com.aronim.cloud.menu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-21
 * Time: 14h03
 */
@RestController
public class MenuServiceController
{
    @RequestMapping("/internal/menus/{menuId}/items")
    public List<Map<String, ?>> findMenuItems(@PathVariable  String menuId)
    {
        List<Map<String, ?>> menuItems = new ArrayList<>();
        menuItems.add(getMenuItem("Components", "/admin/components", "component/js/aronim.cloud.components", "<ac-components></ac-components>"));
        menuItems.add(getMenuItem("Users", "/admin/user", "user/js/aronim.cloud.users", "<ac-users></ac-users>"));

        return menuItems;
    }

    private Map<String, Object> getMenuItem(String name, String path, String module, String element)
    {
        Map<String, Object> selectedItem = new HashMap<>();
        selectedItem.put("name", name);
        selectedItem.put("path", path);
        selectedItem.put("module", module);
        selectedItem.put("elementText", element);

        return selectedItem;
    }
}
