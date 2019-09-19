package club.youth996.controller;

import club.youth996.entity.Admin;
import club.youth996.service.AdminService;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zhanxinjian
 * @date 2019/9/16
 * @Descritption 管理员controller
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * 登录功能
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session){
        String acname = request.getParameter("acname");
        String apwd = request.getParameter("apwd");
        Admin admin = adminService.checkAidAndApwd(new Admin(acname, Hashing.md5().hashString(apwd, Charsets.UTF_8).toString()));
        Admin admin1 = adminService.checkAidAndApwd(admin);
        if(admin1!=null){
            session.setAttribute("admin", admin1);
            return "index";
        }
        request.setAttribute("error", "账号或密码错误");
        return "login";
    }

    /**
     * 退出功能
     */
    @RequestMapping("/exit")
    public String exit( HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:view/login.jsp";
    }

    /**
     * 修改密码功能
     */
    @RequestMapping("/updateApwd")
    public String upddateApwd(HttpServletRequest request,HttpServletResponse response) {
        String oldApwd = request.getParameter("oldApwd");
        String newApwd = request.getParameter("newApwd");
        Admin admin=(Admin) request.getSession().getAttribute("admin");
        int aid = admin.getAid();
        String path = request.getContextPath().toString();
        if(admin.getApwd().equals(Hashing.md5().hashString(oldApwd, Charsets.UTF_8).toString())) {
            boolean success = adminService.updateApwd(new Admin(aid, Hashing.md5().hashString(newApwd, Charsets.UTF_8).toString()));
            if (success) {
                request.setAttribute("upMsg", "密码修改成功！");
                return "forward:view/login.jsp";
            } else {
                request.setAttribute("upMsg", "密码修改失败！");
                return "forward:view/user/user_modi_pwd.jsp";
            }
        }else{
            request.setAttribute("upMsg", "密码错误！");
            return "forward:view/user/user_modi_pwd.jsp";
        }
    }

    /**
     * 修改个人信息功能
     */
    @RequestMapping("/updateMsg")
    public void updateMsg(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String aname = request.getParameter("aname");
        String aemail = request.getParameter("aemail");
        String atel = request.getParameter("atel");
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        admin.setAname(aname);
        admin.setAtel(atel);
        admin.setAemail(aemail);
        int aid = admin.getAid();
        boolean b = adminService.updateAdminMsg(admin);
        if (b) {
            request.getSession().setAttribute("admin", admin);
            response.getWriter().print("ok");
        } else {
            response.getWriter().print("fail");
        }
    }
}
