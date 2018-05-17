package com.laotapo.modules.student.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author 作者 E-mail: lcm
 * @date 创建时间：2016年12月3日 上午11:43:44
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
@Table(name = "t_student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 20, nullable = false)
	private String name;
	/**
	 * JoinTable表示中间表 inverseJoinColumns表示关系被维护端对应的中间表的外键名
	 * joinColumns表示关系维护端对应的中间表的外键名
	 * 
	 * @return
	 */
	@ManyToMany(cascade = { CascadeType.REFRESH })
	@JoinTable(name = "t_student_teacher", inverseJoinColumns = @JoinColumn(name = "teacher_id"), joinColumns = @JoinColumn(name = "student_id"))
	private Set<Teacher> teachers;

	/**
	 * 学生为维护者，为其指定添加老师方法
	 * 
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	/**
	 * 学生为维护者，为其指定移除老师方法
	 * 
	 * @param teacher
	 */
	public void removeTeacher(Teacher teacher) {
		if (this.teachers.contains(teacher)) {
			this.teachers.remove(teacher);
		}
	}

	public Student() {
	}

	/**
	 * 方便初始化，最小构造函数
	 * 
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teachers == null) ? 0 : teachers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teachers == null) {
			if (other.teachers != null)
				return false;
		} else if (!teachers.equals(other.teachers))
			return false;
		return true;
	}

}
