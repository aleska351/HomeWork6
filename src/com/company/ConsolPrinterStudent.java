package com.company;
/*
 *сonsole output using System.out
 */
public class ConsolPrinterStudent implements  IStudentPrinter{


   private IStudentStringConverter converter;
    ConsolPrinterStudent(IStudentStringConverter converter) {
        this.converter=converter;

    }

    @Override
    public void print(Student student) {
        String s =converter.convert(student);
        System.out.println(s);
    }
}
