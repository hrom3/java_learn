package stream;

import homework06.dto.Person;
import homework06.ver2.CollectionWorkVer3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMain4 {
    public static void main(String[] args) {
        CollectionWorkVer3 genCollection = new CollectionWorkVer3();
        int collectionSize = 1_000_000;
        ArrayList<Person> personArrayList = new ArrayList<>();
        genCollection.randomCollection(personArrayList, CollectionWorkVer3::generatePerson, collectionSize);

        long count = personArrayList.parallelStream()
                .filter((person) -> person.getPassword().length() >= 10)
                .count();

        List<Person> collect = personArrayList.stream()
                .filter((person) -> person.getPassword().length() >= 10)
                .collect(Collectors.toList());

        System.out.println(count);
        System.out.println(collect.size());
        System.out.println(personArrayList.size());
    }
}

