package spring_boot_test.spring_boot_testId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import com.laotapo.modules.student.entity.Student;
import com.laotapo.modules.student.entity.Teacher;

/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年12月3日 下午2:36:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ManyToManyTest {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Persistence.createEntityManagerFactory("jpatest1");
		em = factory.createEntityManager();
	}

	@Test
	public void testSave() {
		
		em.getTransaction().begin(); //开启事务
		
		Student student1 = new Student("张三");
		Student student2 = new Student("李四");
		Teacher teacher1 = new Teacher("吴老师");
		Teacher teacher2 = new Teacher("张老师");
		
		em.persist(student1);
		em.persist(teacher1);
		em.persist(student2);
		em.persist(teacher2);
		
		em.getTransaction().commit(); //提交事务
		em.close(); //关闭
		factory.close(); //关闭
	}

}


