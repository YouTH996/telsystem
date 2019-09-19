package club.youth996.entity;

import lombok.Data;

import java.sql.Date;
import java.util.List;
/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 管理员实体类
 */
@Data
public class Admin {
	/**
	 * 管理员编号
	 */
	private int aid;
	/**
	 * 管理员姓名
	 */
	private String aname;
	/**
	 * 管理员密码
	 */
	private String apwd;
	/**
	 * 管理员账号
	 */
	private String acname;
	/**
	 * 管理员手机号
	 */
	private String atel;
	/**
	 * 管理员邮箱地址
	 */
	private String aemail;
	/**
	 * 管理员图片地址
	 */
	private String aimg;
	/**
	 * 备用1
	 */
	private String by001;
	/**
	 * 备用2
	 */
	private String by002;
	/**
	 * 备用3
	 */
	private String by003;
	/**
	 * 备用4
	 */
	private String by004;
	/**
	 * 备用5
	 */
	private int by005;
	/**
	 * 备用6
	 */
	private int by006;
	/**
	 * 备用7
	 */
	private int by007;
	/**
	 * 备用8
	 */
	private Date by008;
	/**
	 * 备用9
	 */
	private Date by009;
	/**
	 * //备用10
	 */
	private Date by0010;
	/**
	 * 创建日期
	 */
	private Date createdate;
	/**
	 * 创建人
	 */
	private String createuser;
	/**
	 * 修改日期
	 */
	private Date updatedate;
	/**
	 * 修改人
	 */
	private String updateuser;
	/**
	 * priv的集合
	 */
	private List<Priv> list;
	/**
	 * role的集合
	 */
	private List<Role> lr;

	public Admin(String acname, String apwd) {
		this.apwd = apwd;
		this.acname = acname;
	}

	public Admin() {
	}

	public Admin(int aid, String apwd) {
		this.aid = aid;
		this.apwd = apwd;
	}

	public String getLrString(){
		String lrString="";
		if(lr!=null){
			for(int i=0;i<lr.size();i++){
				if(i==lr.size()-1) {
					lrString+=lr.get(i).getRname();
				} else {
					lrString+=lr.get(i).getRname()+",";
				}
			}
		}
		return lrString;
	}
	public List<Role> getLr() {
		return lr;
	}

	public void setLr(List<Role> lr) {
		this.lr = lr;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApwd() {
		return apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public String getAtel() {
		return atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

	public String getAemail() {
		return aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public String getAimg() {
		return aimg;
	}

	public void setAimg(String aimg) {
		this.aimg = aimg;
	}

	public String getBy001() {
		return by001;
	}

	public void setBy001(String by001) {
		this.by001 = by001;
	}

	public String getBy002() {
		return by002;
	}

	public void setBy002(String by002) {
		this.by002 = by002;
	}

	public String getBy003() {
		return by003;
	}

	public void setBy003(String by003) {
		this.by003 = by003;
	}

	public String getBy004() {
		return by004;
	}

	public void setBy004(String by004) {
		this.by004 = by004;
	}

	public int getBy005() {
		return by005;
	}

	public void setBy005(int by005) {
		this.by005 = by005;
	}

	public int getBy006() {
		return by006;
	}

	public void setBy006(int by006) {
		this.by006 = by006;
	}

	public int getBy007() {
		return by007;
	}

	public void setBy007(int by007) {
		this.by007 = by007;
	}

	public Date getBy008() {
		return by008;
	}

	public void setBy008(Date by008) {
		this.by008 = by008;
	}

	public Date getBy009() {
		return by009;
	}

	public void setBy009(Date by009) {
		this.by009 = by009;
	}

	public Date getBy0010() {
		return by0010;
	}

	public void setBy0010(Date by0010) {
		this.by0010 = by0010;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCreateuser() {
		return createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public List<Priv> getList() {
		return list;
	}

	public void setList(List<Priv> list) {
		this.list = list;
	}
}
