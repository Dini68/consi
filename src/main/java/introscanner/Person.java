package introscanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Person {


    public List<String> readLines(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                result.add(line);
            }
            return result;
        } catch (IOException ioException) {
            throw new IllegalStateException("not read file", ioException);
        }
    }

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer n: numbers) {
            sum += n;
        }
        return sum;
    }

    public int countLetterB(String s) {
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == 'b') {
                count++;
            }
        }
        return count;
    }

    public int max(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer n: numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    public int min(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer n: numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
    public boolean containsGreaterThanEight(List<Integer> numbers) {
        for (Integer i : numbers) {
            if (i > 8) {
                return true;
            }
        }
        return false;
    }
    public List<Integer> greaterThanSix(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : numbers) {
            if (i > 6) {
                filtered.add(i);
            }
        }
        return filtered;
    }
    public List<String> getNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee: employees) {
            names.add(employee.getName());
        }
        return names;
    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What's your name?");
//        String name = scanner.nextLine();
//
//        System.out.println("What's your year of birth?");
//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What's your age?");
//        String line = scanner.nextLine();
//        try {
//            int age = Integer.parseInt(line);
//            if (age < 0 || age > 150) {
//                System.out.println("age must be between '0 .. 150' ");
//            }
//        } catch (NumberFormatException nfe) {
//            System.out.println("Error! This not number '" + line + "'");
//        }
//
//        String num = Integer.toString(5);
//
        System.out.println("APPLE".contains("PP"));

        String s = "ab3c2d";
        for (char c : s.toCharArray()) {
            System.out.print("'" + c + "' is letter: " + Character.isLetter(c));
            System.out.print(", '" + c + "' is digit: " + Character.isDigit(c));
            System.out.println(", '" + c + "' getNumericValue = " + Character.getNumericValue(c));
        }
        System.out.println(Character.getNumericValue('0'));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(" * ").append(i).append(" = ").append(i * i).append("\n");
        }
        System.out.println(sb);

        Employee employee = new Employee("John Doe", 1968);
        String formatted = String.format("Name: %s, year of birth: %d", employee.getName(), employee.getYearOfBirth());
        // Name: John Doe, year of birth: 1980
        System.out.println(formatted);

// Vagy azonnal kiírva:
        System.out.printf("Name: %s, year of birth: %d\n", employee.getName(), employee.getYearOfBirth());

        LocalDate fromDate = LocalDate.of(2015, Month.JANUARY, 30);
        System.out.println(fromDate);

        LocalDateTime fromDateTime = LocalDateTime.of(2015, 1, 20, 10, 15);
        System.out.println(fromDateTime);

        List<String> names = List.of("John", "Jack"); // Módosíthatatlan lista
        System.out.println(names);

        List<String> moreNumbers = new ArrayList<>(); // Módosítható lista, diamond operátor, primitív típus nem lehet
        System.out.println(moreNumbers);

        List<String> copy = new ArrayList<>(names); // Módosítható másolat

        copy.add("Jane"); // ["John", "Jack", "Jane"] - hozzáadás
        System.out.println(copy);

        copy.remove("John"); // ["Jack", "Jane"] - eltávolítás
        System.out.println(copy);

        boolean containsJohn = names.contains("John"); // false - nincs benne
        System.out.println(containsJohn);

        int size = names.size(); // 2 - hossza
        System.out.println(size);

        int indexOfJane = copy.indexOf("Jane"); // 1 - 1. indexen
        System.out.println(indexOfJane);

        for (String name : names) {
            System.out.println(name);
        }
        Random rnd = new Random();
        int randomNumberTo10 = rnd.nextInt(10); // 0 - 9-ig generálhat számokat, 10-et sosem generál
        System.out.println(randomNumberTo10);

        System.out.println(Coin.FIFTY);
        System.out.println(Coin.FIFTY.getValue());
        System.out.println(Coin.valueOf("FIVE"));
        System.out.println(Arrays.toString(Coin.values()));
        System.out.println(Coin.FIFTY.ordinal());


        int a = 20;
        int b = 7;
        try {
            int result = a / b;
            // Ha nincs hiba
            System.out.println("A hányados alsó egészrésze: " + result);
        } catch (ArithmeticException ae) {
            // Ha van hiba
            throw new IllegalArgumentException("Arithmetic error", ae);
        } finally {
            // Minden esetben lefut
            System.out.println("Finally");
        }
        List<Integer> numbers = List.of(2, 4, 6, 8, 9, 5, 1, 3, 7);
        Person person = new Person();

        System.out.println(person.sum(numbers));
        System.out.println(person.countLetterB("nfjnfjndjbnjb"));
        System.out.println(person.max(numbers));
        System.out.println(person.min(numbers));
        System.out.println(person.containsGreaterThanEight(numbers));
        System.out.println(person.greaterThanSix(numbers));

        List<Employee> employees = List.of(new Employee("John", 1987),
                new Employee("Jack", 1997),
                new Employee("Jane", 1977));
        System.out.println(new Person().getNames(employees));

//        BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("data.csv")));
//        person.readLines(reader);

        Set<String> firstNames = new HashSet<>();
        firstNames.add("John");
        firstNames.add("Jane");
        firstNames.add("Jane");
        firstNames.add("Jack");
        firstNames.add("John");
        System.out.println(firstNames); // [John, Jack]

        firstNames.remove("John");

        boolean contains = firstNames.contains("Jack"); // true

        for (String name: firstNames) {
            System.out.println(name);
        }

        Map<String, String> words = new HashMap<>();
        words.put("apple", "alma");
        words.put("peer", "körte");

        System.out.println(words.get("apple")); // alma

        words.put("apple", "Apfel"); // Felülírja az értéket
        System.out.println(words.get("apple")); // Apfel

        Set<String> keys = words.keySet(); // Kulcsok
        System.out.println(keys);
        Collection<String> values = words.values(); // Értékek
        System.out.println(values);

        for (Map.Entry entry: words.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String ss = "alma mater";
        Map<Character, Integer> countOfLetters = new HashMap<>();
        for (char c: ss.toCharArray()) {
            if (countOfLetters.containsKey(c)) {
                countOfLetters.put(c, countOfLetters.get(c) + 1);
            }
            else {
                countOfLetters.put(c, 1);
            }
        }
        System.out.println(countOfLetters); // { =1, a=3, r=1, t=1, e=1, l=1, m=2}
        int numberOfM = countOfLetters.get('m'); // 2
        System.out.println(numberOfM);

        List<Integer> numberList = new ArrayList<>(List.of(6, 5, 8, 3));
//        numberList.sort(Collator.getInstance(new Locale("hu", "HU")));
        Collections.sort(numberList);
        System.out.println(numberList);

// Figyelembe veszi az ékezeteket
        List<String> nickNames = new ArrayList<>(List.of("Benjámin", "Áron", "József", "Arnold"));
        Collections.sort(nickNames, Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(nickNames);

        List<Employee> employees2 = new ArrayList<>(List.of(
                new Employee("John Doe", 1980),
                new Employee("Jane Doe", 1990),
                new Employee("Black Doe", 1988),
                new Employee("Jack Doe", 1970)));

// Év vagy név szeretnénk rendezni
        Collections.sort(employees2);
        System.out.println(employees2);
//        Collections.sort(employees2, new NameComparator());
//        System.out.println(employees2);
//        Collections.sort(employees2, new YearComparator());
//        System.out.println(employees2);

        List<String> names2 = new ArrayList<>(List.of("John Doe", "Jack Doe", "John Smith"));
        System.out.println(names2);
        List<String> johns = new ArrayList<>();
        for (String name: names2) {
            if (name.startsWith("John")) {
                johns.add(name);
            }
        }
        names2.removeAll(johns);
        System.out.println(names2);
//        Iterátorral:

        List<String> names3 = new ArrayList<>(List.of("John Doe", "Jack Doe", "John Smith"));
        System.out.println(names3);
        Iterator<String> it = names3.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("John")) {
                it.remove();
            }
        }
        System.out.println(names3);
    }
}