package com.company;
/*
*Delegation to other IStudent Printer instances
 */

public class DelegatePrintStudent implements IStudentPrinter{

   private IStudentPrinter [] printers;
    public DelegatePrintStudent(IStudentPrinter [] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter printer: printers){
            printer.print(student);
        }
    }
}
