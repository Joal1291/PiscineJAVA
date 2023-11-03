import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.*;

public class Inspector<T> {
    // --- VARIABLES ---
    private Class<T> inspectedClass;
    // --- CONSTRUCTOR ---
    public Inspector(Class<T> inspectedClass){
        this.inspectedClass = inspectedClass;
    }
    // --- GETTER, SETTER ---

    // --- METHODS ---
    public void displayInformations(){
        System.out.println("Information of the '" + inspectedClass.getName() + "' class");
        System.out.println("SuperClass: " + inspectedClass.getSuperclass().getName());

        Method[] methods = inspectedClass.getMethods();
        if(methods.length >= 1){
            System.out.println(inspectedClass.getMethods().length + " methods : ");
            for(Method method : methods){
                System.out.println("- " + method.getName());
            }
        }
        Field[] fields = inspectedClass.getFields();
        if(fields.length >= 1){
            System.out.println(inspectedClass.getFields().length + " fields:");
            for(Field field : fields){
                System.out.println("- " + field.getName());
            }
        }
    }

    public T createInstance() throws Exception{
        try{
            return inspectedClass.getDeclaredConstructor().newInstance();
        }catch(Exception e){
            throw e;
        }
    };
}
//    Information of the “java.lang.Number” class:
//        Superclass: java.lang.Object
//        6 methods:
//        - byteValue
//        - shortValue
//        - intValue
//        - longValue
//        - floatValue
//        - doubleValue
//        1 fields:
//        - serialVersionUID
// --- VARIABLES ---

// --- CONSTRUCTOR ---

// --- GETTER, SETTER ---

// --- METHODS ---