package club.youth996.mapper;


import club.youth996.entity.Admin;
/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 管理员mapper接口
 */
public interface AdminMapper {
	/**
	 * 根据管理员用户名和密码查询管理员
	 */
	public Admin selectAdminByAidAndApwd(Admin admin);
	
	/**
	 * 修改密码
	 */
	public int updateApwd(Admin admin);
	
	/**
	 * 修改个人信息
	 */
	public int updateAdminMsg(Admin admin);
}
