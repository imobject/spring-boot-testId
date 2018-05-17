package com.laotapo.modules.exam.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author 作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 下午2:06:26
 * @version 1.0
 * @parameter
 * @since
 * @return
 */

@Entity
public class Exam implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer paperId;

	private Integer userId;

	private Date startTime;

	private Date endTime;

	private Integer score;

	private String remark;

	private Integer status;

	private List<ExamUserAns> listExamUserAns;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPaperId() {
		return paperId;
	}

	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy="exam")
//	@Where(clause = "score >100")
	public List<ExamUserAns> getListExamUserAns() {
		return listExamUserAns;
	}

	public void setListExamUserAns(List<ExamUserAns> listExamUserAns) {
		this.listExamUserAns = listExamUserAns;
	}

}
