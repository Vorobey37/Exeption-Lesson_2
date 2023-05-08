import java.io.File;
import java.util.Collections;
import java.util.List;

/**
 * ExamplesOfExeptions
 */
public class ExamplesOfExeptions {

    public static void main(String[] args) {
        /*  Пример NullPointerException
        String name = null;
        System.out.println(name.length());*/

        /* Пример ClassCastException
        Object object = new String ("123");
        File file = (File) object;
        System.out.println(file);*/

        /* Пример NumberFormatException
        String name = "123fg";
        Integer.parseInt(name);*/

        /* Пример NumberFormatException
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());*/

        
    }
}