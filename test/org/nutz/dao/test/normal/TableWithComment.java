package org.nutz.dao.test.normal;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

@Table("t_twc")
@Comment("测试表")
public class TableWithComment {

	@Id
	@Comment("唯一主键")
	private int id;

	@Column("nm")
	@Comment("名称")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}