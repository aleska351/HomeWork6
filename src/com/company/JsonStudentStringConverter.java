package com.company;

public class JsonStudentStringConverter implements IStudentStringConverter {
    /*
     *The class  converts student into format of JSON
     */

    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();

        builder.append("{").append("\n");
        builder.append("\t");
        builder.append("\"name\"").append(":").append("\"").append(student.name).append("\"").append(",").append("\n");
        builder.append("\t");
        builder.append("\"age\"").append(":").append(student.age).append(",").append("\n");
        builder.append("\t");
        builder.append("\"id\"").append(":").append(student.id).append(",").append("\n");
        builder.append("}");
        return builder.toString();
    }
}
