package club.youth996.service.impl;

import java.util.List;

import club.youth996.entity.Priv;
import club.youth996.entity.Role;
import club.youth996.mapper.PrivMapper;
import club.youth996.mapper.RoleMapper;
import club.youth996.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	PrivMapper privMapper;

	@Override
	public List<Role> getAllRoles() {
		List<Role> list = roleMapper.selectRoles();   //只有角色的id和name
		for(Role r:list) {
			List<Priv> lp = privMapper.selectPrivsByRid(r.getRid());
			r.setLp(lp);
		}
		return list;
	}

	@Override
	public List<Priv> selectAllPrivs() {
		// TODO Auto-generated method stub
		return privMapper.selectAllPrivs();
	}

	@Override
	public boolean addRole(Role role) {
		int i=roleMapper.insertRole(role);
		int j=roleMapper.insertRolePriv(role);
		return i+j>2?true:false;
	}

}
