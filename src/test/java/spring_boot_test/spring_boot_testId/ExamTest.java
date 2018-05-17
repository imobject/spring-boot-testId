package spring_boot_test.spring_boot_testId;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;
import com.laotapo.App;
import com.laotapo.modules.exam.dto.ExamRepository;
import com.laotapo.modules.exam.entity.Exam;
import com.laotapo.modules.exam.entity.ExamUserAns;
import com.laotapo.modules.user.dto.UserAnsRepository;

/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 上午11:25:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ExamTest {
	@Autowired
    private ExamRepository examRepository;
	
	@Autowired
	private UserAnsRepository userAnsRepository;

    @Test
//    @Transactional(readOnly  = false,propagation = Propagation.REQUIRED,noRollbackFor = ArithmeticException.class)
    public void test()  {

        // 创建10条记录
    	Exam exam = new Exam();
    	exam.setPaperId(4);
    	exam.setScore(150);
    	exam.setStatus(2);
    	exam.setUserId(222);
    	Date date = new Date();
    	exam.setStartTime(date);
    	exam.setEndTime(date);
//    	examRepository.save(exam);
    	List<ExamUserAns> list = Lists.newArrayList();
    	for(int i=1;i<=5;i++){
    		ExamUserAns useAns = new ExamUserAns();
    		useAns.setExam(exam);
    		useAns.setAnswer("wenti"+i);
    		useAns.setQuestionId(i);
    		useAns.setRemark("备注"+i);
    		useAns.setScore(60+i);
    		list.add(useAns);
//    		System.out.println(1/(i-4));
//    		userAnsRepository.save(useAns);
    	}
    	exam.setListExamUserAns(list);
    	examRepository.save(exam);
//    	userAnsRepository.save(list);
    }
}


