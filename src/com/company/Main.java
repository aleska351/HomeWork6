package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student("Alex", 55, 6666);
        Student student1 = new Student("Oleg", 15, 7777);
        IStudentStringConverter converter = new IniStudentsStringConverter();
        IStudentStringConverter converter1 = new JsonStudentStringConverter();
        IStudentStringConverter converter2 = new XmlStudentStringConverter();

        String studentAsString = converter.convert(student);
        String studentAsString1 = converter1.convert(student);
        String studentAsString2 = converter2.convert(student);
        System.out.println( studentAsString);
        System.out.println( studentAsString1);
        System.out.println( studentAsString2);
        System.out.println("____________________________________________________________________________________________________________");

        IStudentPrinter  printer = new ConsolPrinterStudent(converter);
        IStudentPrinter  printer1 = new ConsolPrinterStudent(converter1);
        IStudentPrinter  printer2 = new ConsolPrinterStudent(converter2);
        printer.print(student1);
        printer1.print(student1);
        printer2.print(student);
        System.out.println("_________________________________________________________________________________________________________________");
        IStudentPrinter printer3= new ZeroPrinterStudent(converter);
        printer3.print(student);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        IStudentPrinter [] printers = {printer, printer1, printer2 };
        IStudentPrinter  printer5 = new DelegatePrintStudent(printers);
        printer5.print(student);
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        IStudentPrinter [] printers1 = {printer, printer1 };
        IStudentPrinter  printer6 = new DelegatePrintStudent(printers1);
        printer6.print(student);

    }
}
