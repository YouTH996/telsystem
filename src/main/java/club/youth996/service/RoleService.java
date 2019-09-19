package club.youth996.service;

import java.util.List;

import club.youth996.entity.Priv;
import club.youth996.entity.Role;

public interface RoleService {
	/**
	 * 获取所有角色信息，包括角色id，角色名称...角色所有权限
	 */
	public List<Role> getAllRoles();
	
	/**
	 * 获取所有权限
	 */
	public List<Priv> selectAllPrivs();
	
	/**
	 * 添加角色包括角色名、及该角色拥有的权限
	 */
	public boolean addRole(Role role);
}
