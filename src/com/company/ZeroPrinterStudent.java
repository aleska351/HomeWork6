package com.company;
/*
*line output to nowhere
 */
public class ZeroPrinterStudent implements IStudentPrinter {
    private IStudentStringConverter converter;

    ZeroPrinterStudent(IStudentStringConverter converter) {
        this.converter = converter;

    }
// намеренно ничего не выводит
    @Override
    public void print(Student student) {
    }
}
