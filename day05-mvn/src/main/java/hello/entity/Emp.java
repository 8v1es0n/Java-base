package hello.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id; //主键
    private String name; //姓名
    private String image; //头像
    private Integer gender; //性别
    private String job; //职位
    private LocalDate entryDate; //入职日期
    private LocalDateTime updateTime; //更新时间
}
