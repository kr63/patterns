package creational.factory.withoutPattern;

public class Program {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        javaDeveloper.writeJavaCode();

        CppDeveloper cppDeveloper = new CppDeveloper();

        cppDeveloper.writeCppCode();
    }

}
