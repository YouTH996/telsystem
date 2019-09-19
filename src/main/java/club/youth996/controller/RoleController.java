package club.youth996.controller;

import club.youth996.entity.Priv;
import club.youth996.entity.Role;
import club.youth996.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zhanxinjian
 * @date 2019/9/16
 * @Descritption
 */
@Controller
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 显示所有的角色所拥有的权限
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/roleList")
    public String roleList(HttpServletRequest request, HttpServletResponse response) {
        List<Role> lr =roleService.getAllRoles();
        request.setAttribute("rolelist", lr);
        return "role/role_list";
    }

    /**
     * 显示角色的详细信息
     */
    @RequestMapping("/role/listPriv")
    public String listPriv(HttpServletResponse response, HttpServletRequest request) {
        List<Priv> allPrivs = roleService.selectAllPrivs();
        request.setAttribute("allPrivs", allPrivs);
        return "role/role_add";
    }
}
