package withoutPattern;

public class FactoryWithoutPattern {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        javaDeveloper.writeJavaCode();

        CppDeveloper cppDeveloper = new CppDeveloper();

        cppDeveloper.writeCppCode();
    }

}
