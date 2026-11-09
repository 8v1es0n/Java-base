package hello.service;

import hello.dao.EmpDao;
import hello.entity.Emp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EmpServiceImpl {
    public List<Emp> empList() throws Exception{
        EmpDao empDao = new EmpDao();
        List<String> list = empDao.empList();


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
        return emps;
    }
}
