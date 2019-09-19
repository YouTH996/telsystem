package club.youth996.mapper;

import java.util.List;

import club.youth996.entity.Priv;
/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 菜单权限mapper接口
 */
public interface PrivMapper {

	/**
	 * 通过管理员id获取该用户的所有权限
	 */
	public List<Priv> selectPrivsByAid(int aid);
	
	/**
	 * 通过角色ID查找所有权限
	 */
	public List<Priv> selectPrivsByRid(int rid);
	
	/**
	 * 获取所有权限
	 */
	public List<Priv> selectAllPrivs();
}
