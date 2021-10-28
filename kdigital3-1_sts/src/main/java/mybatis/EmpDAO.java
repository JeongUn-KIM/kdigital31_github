package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper   //@Mapper-Scan
@Repository //@cOMPONENT-SCAN
public interface EmpDAO {
	
	public List<EmpVO> emplist();
	
	// 0> sql-mapping.xml 주석 해제 
	// 1> 메소드이름을 session.xxxx("emp.mapping 파일 id", xxx);
	// 2> 메소드 구현부 삭제
	// 3> EmpService, EmpSeviceImpl 주석해제. dao 호출메소드 수정 
	// 4> 컨트롤러 /empdeptlist 주석 해제 후 실행
	
public EmpVO empone(int id);
	
	public void insertemp(EmpVO vo);
	
	public void updateemp(EmpVO vo);
	
	public void deleteemp(String name);
	
	public int countemp();
	
	public List<EmpVO> empdeptlist(int [] dept_list);
}
















