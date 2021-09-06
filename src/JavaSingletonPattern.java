import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

//Despues de horas de ver que es lo que fallaba en mi código, me di cuenta que tenía el constructor el publico
//Lo cambié a privado y... listo.

class JavaSingletonPattern{

    public String str;
    static JavaSingletonPattern instance;

    public static JavaSingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new JavaSingletonPattern();
        }
        return instance;
    }

    private JavaSingletonPattern() {

    }
}
