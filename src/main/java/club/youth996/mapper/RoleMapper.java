package club.youth996.mapper;

import java.util.List;

import club.youth996.entity.Role;
/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 角色mapper接口
 */
public interface RoleMapper {
	/**
	 * 根据管理员ID查找角色名
	 * @param aid
	 * @return
	 */
	public List<Role> selectRnameByAid(int aid);
	
	/**
	 * 查找所有角色
	 */
	public List<Role> selectRoles();
	
	/**
	 * 添加角色
	 */
	public int insertRole(Role role);
	
	/**
	 * 添加角色权限关联表
	 */
	public int insertRolePriv(Role role);
}
