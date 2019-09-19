package club.youth996.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption 菜单权限实体类
 */
@Data
public class Priv {
	/**
	 * 菜单权限id
	 */
	private int pid;
	/**
	 * 菜单样式
	 */
	private String pclass;
	/**
	 * 菜单链接地址
	 */
	private String purl;
	/**
	 * 权限名字
	 */
	private String pname;
	/**
	 * 权限状态
	 */
	private int pstate;
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

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPstate() {
		return pstate;
	}

	public void setPstate(int pstate) {
		this.pstate = pstate;
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
}
