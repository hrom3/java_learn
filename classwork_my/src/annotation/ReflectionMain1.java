package annotation;

import homework06.dto.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionMain1 {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("SASHA", "kjijsdigzoj34rf");
        Class<? extends Person> aClass = person.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof Version) {
                Version ver = (Version) annotation;
                System.out.println(ver.info());
            }
        }
        System.out.println(person.getPassword());
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            declaredField.setAccessible(true);
            System.out.println(declaredField.get(person));
            declaredField.set(person, "Привет");
        }
        System.out.println(person.getPassword());
    }
}
