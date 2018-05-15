package co.matisses.b1ws.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class ObjectUtils {

    private static final Logger log = Logger.getLogger(ObjectUtils.class.getSimpleName());

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Class objClass = obj.getClass();
        sb.append(objClass.getSimpleName());
        sb.append("{");
        for (Field field : objClass.getDeclaredFields()) {
            for (Method method : objClass.getDeclaredMethods()) {
                if (Modifier.isPublic(method.getModifiers()) && method.getName().equalsIgnoreCase("get" + field.getName())
                        && method.getParameterTypes().length == 0) {
                    try {
                        Object result = method.invoke(obj, new Object[]{});
                        if (result != null) {
                            String resultStr = null;
                            if (result.getClass().getName().startsWith("java") || result.getClass().getName().startsWith("org.apache")) {
                                resultStr = result.toString();
                            } else {
                                resultStr = toString(result);
                            }
                            if (resultStr != null && !resultStr.isEmpty()) {
                                if(sb.charAt(sb.length()-1) != '{'){
                                    sb.append(" ");
                                }
                                sb.append(field.getName());
                                sb.append("=\"");
                                sb.append(resultStr);
                                sb.append("\",");
                            }
                        }
                    } catch (Exception e) {
                        log.log(Level.SEVERE, "Ocurrio un error al invocar el metodo " + method.getName(), e);
                    }
                    break;
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }
}
