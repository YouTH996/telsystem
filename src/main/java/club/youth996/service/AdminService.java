package club.youth996.service;


import club.youth996.entity.Admin;
/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 管理员service
 */
public interface AdminService {
	/**
	 * 核对管理员账号和密码
	 */
	public Admin checkAidAndApwd(Admin admin);
	
	/**
	 * 修改密码校验功能
	 */
	public boolean updateApwd(Admin admin);
	
	/**
	 * 修改个人信息校验功能
	 */public boolean updateAdminMsg(Admin admin);
}
