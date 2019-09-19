package club.youth996.service.impl;

import club.youth996.entity.Admin;
import club.youth996.entity.Priv;
import club.youth996.entity.Role;
import club.youth996.mapper.AdminMapper;
import club.youth996.mapper.PrivMapper;
import club.youth996.mapper.RoleMapper;
import club.youth996.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 管理员service实现类
 */
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;
	@Autowired
	PrivMapper privMapper;
	@Autowired
	RoleMapper roleMapper;


	@Override
	public Admin checkAidAndApwd(Admin admin) {
		//查询用户名和密码到tb_admin中
		Admin admin2=adminMapper.selectAdminByAidAndApwd(admin);
		//假如登录成功，继续获取该管理员的所有权限由tc_priv表
		if(admin2!=null) {
			List<Priv> list=privMapper.selectPrivsByAid(admin2.getAid());
			List<Role> lr = roleMapper.selectRnameByAid(admin2.getAid());
			admin2.setList(list);
			admin2.setLr(lr);
		}
		return admin2;
	}


	@Override
	public boolean updateApwd(Admin admin) {
		int i = adminMapper.updateApwd(admin);
		return i>0?true:false;
	}


	@Override
	public boolean updateAdminMsg(Admin admin) {
		int i=adminMapper.updateAdminMsg(admin);
		return i>0?true:false;
	}

}
