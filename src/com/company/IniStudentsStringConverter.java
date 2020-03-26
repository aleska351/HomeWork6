package com.company;

public class IniStudentsStringConverter  implements IStudentStringConverter{
    /*
    *The class  converts student into format of "param=value"
     */

    @Override
    public String convert(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name").append("=").append(student.name).append("\n");
        stringBuilder.append("age").append("=").append(student.age).append("\n");
        stringBuilder.append("id").append("=").append(student.id).append("\n");

        return stringBuilder.toString();
    }
}
