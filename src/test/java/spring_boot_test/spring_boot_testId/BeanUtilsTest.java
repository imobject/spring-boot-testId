package spring_boot_test.spring_boot_testId;

import java.lang.reflect.Field;
import java.util.Map;

/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月18日 下午2:29:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class BeanUtilsTest {
	
	public static void main(String[] args) {
//		Person p =new Person();
		Field[] fields= Person.class.getDeclaredFields();
		for(int i =0 ; i < fields.length ; i++){
			Field field = fields[i];
			String fieldName = field.getName();
			System.out.println(fieldName);
		}
		
	}

}


class Person{
	private int id;
	private String name;
	private Map<String,String> map;
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
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	
}


