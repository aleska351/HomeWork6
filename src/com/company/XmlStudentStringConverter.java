package com.company;
/*
 *The class  converts student into format of XML
 */
public class XmlStudentStringConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("<student>").append("\n");
        builder.append("\t");
        builder.append("<name>").append(student.name).append("</name>").append("\n");
        builder.append("\t");
        builder.append("<age>").append(student.age).append("</age>").append("\n");
        builder.append("\t");
        builder.append("<id>").append(student.id).append("</id>").append("\n");
        builder.append("</student>").append("\n");
        return builder.toString();
    }
}
