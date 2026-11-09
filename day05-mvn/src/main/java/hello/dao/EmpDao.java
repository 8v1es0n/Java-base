package hello.dao;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class EmpDao {
    public List<String> empList() throws Exception{
        File file = ResourceUtils.getFile("classpath:emp.txt");
        List<String> list = Files.readAllLines(file.toPath());
        return list;
    }
}
