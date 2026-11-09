package hello.controller;

import hello.entity.Emp;
import hello.service.EmpServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @GetMapping("/emps/list")
    public List<Emp> list() throws Exception {
        EmpServiceImpl empService = new EmpServiceImpl();
        List<Emp> emps = empService.empList();
        return emps;





        /*File file = ResourceUtils.getFile("classpath:emp.txt");
        List<String> list = Files.readAllLines(file.toPath());
        List<Emp> emps = list.stream().map(s -> {
                    String[] split = s.split(",");
                    Emp emp = new Emp();
                    emp.setId(Integer.parseInt(split[0]));
                    emp.setName(split[1]);
                    emp.setImage(split[2]);
                    emp.setGender(Integer.parseInt(split[3]));
                    emp.setJob(split[4]);
                    emp.setEntryDate(LocalDate.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    emp.setUpdateTime(LocalDateTime.parse(split[6], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                    return emp;
                }
        ).toList();
        return emps;*/




        // ArrayList<Emp> emps = new ArrayList<Emp>();

        /*for (String s : list) {
            String[] split = s.split(",");
            Emp emp = new Emp();
            emp.setId(Integer.parseInt(split[0]));
            emp.setName(split[1]);
            emp.setImage(split[2]);
            emp.setGender(Integer.parseInt(split[3]));
            emp.setJob(split[4]);
            emp.setEntryDate(LocalDate.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            emp.setUpdateTime(LocalDateTime.parse(split[6], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            emps.add(emp);
        }*/
    }
}
