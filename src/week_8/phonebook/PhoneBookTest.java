package week_8.phonebook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBookTest {
    public static void main(String[] args) throws PhoneBookFullExcepition, EntryNotFoundException {
        Scanner scan = new Scanner(System.in);
        PhoneBook phonebook = new PhoneBook();
        int choice = 1;

        System.out.println("Изберете опция:\n");
        while (choice > 0 && choice < 5) {
            System.out.println("1. Добави нов запис\n"
                    + "2. Изтрий запис по номер\n"
                    + "3. Покажи всички записи които започват с низ\n"
                    + "4. Принтирай toString\n"
                    + "5. Изход\n");

            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    if (phonebook.getData().size() + 1 > phonebook.RECORDS_MAX_COUNT) {
                        throw new PhoneBookFullExcepition("Records max count reached!");
                    }
                    createNewRecord(phonebook, scan);
                    break;
                case 2:
                    System.out.println("Въведете телефонния номер за който искате да бъде изтрит записът.");
                    String num = scan.nextLine();
                    if (!checkIfNumberExists(phonebook, num)) {
                        throw new EntryNotFoundException("There is no such record!");
                    }
                    if (phonebook.deleteByPhoneNumber(num)) {
                        System.out.println("Записът беше успешно изтрит.\n");
                    } else {
                        System.out.println("Запис за този номер не беше намерен.\n");
                    }
                    break;
                case 3:
                    System.out.println("Въведете низ.");
                    String str = scan.nextLine();
                    if (phonebook.getAllNamesStartingWith(str).size() == 0) {
                        throw new EntryNotFoundException("There is no such record");
                    }
                    System.out.printf("Всички записи, които започват с %s са: %d%n", str, phonebook.getAllNamesStartingWith(str).size());
                    break;
                case 4: // Не ми извежда първата част на записите
                    System.out.println(phonebook.toString());
                    break;
                case 5:
                    return;
            }
            System.out.println("Изберете следваща опция:\n");
        }
    }

    private static void createNewRecord(PhoneBook phonebook, Scanner scan){
        String name;
        String number;

        System.out.println("Въведете име: ");
        name = readName(scan);
        //scan.nextLine();
        number = readPhoneNumber(scan);
        String record = name + " - " + number;

        if (phonebook.existsRecord(record)) {
            System.out.println("Запис за този номер съществува вече.\nИзберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
            int choice = Integer.parseInt(scan.nextLine());
            if (choice == 1) {
                if (phonebook.overwriteExisting(record)) {
                    System.out.println("Номерът беше успешо презаписан.\n");
                } else {
                    System.out.println("Неуспешен опит.\n");
                }
            } else if (choice == 0) {
                return;
            } else {
                System.out.println("Invalid data!");
                return;
            }
        } else {
            System.out.println("Записът се въвежда.\n");
            phonebook.insert(name, number);
        }
    }

    private static String readName(Scanner scan) throws IllegalArgumentException {
        String name = scan.nextLine();
        if (name.length() > 26) {
            throw new IllegalArgumentException("The name should be less than 26 symbols!");
        } else {
            return name;
        }
    }

    private static String readPhoneNumber(Scanner scan) {
        String number = null;
        do {
        System.out.println("Въведете телефонен номер: ");
        number = scan.nextLine();
        } while (!validatePhoneNumber(number));
        return number;
    }

    private static boolean validatePhoneNumber(String number) throws IllegalArgumentException {
        number = number.replaceAll("\\s*", "");
        String pattern1 = "^(08)[7-9][2-9]\\d{6}$";
        String pattern2 = "^(\\+3598)[7-9][2-9]\\d{6}$";
        String pattern3 = "^(003598)[7-9][2-9]\\d{6}$";

        Pattern pattern_1 = Pattern.compile(pattern1);
        Pattern pattern_2 = Pattern.compile(pattern2);
        Pattern pattern_3 = Pattern.compile(pattern3);

        Matcher matcher1 = pattern_1.matcher(number);
        Matcher matcher2 = pattern_2.matcher(number);
        Matcher matcher3 = pattern_3.matcher(number);

        if (!(matcher1.matches() || matcher2.matches() || matcher3.matches())) {
            throw new IllegalArgumentException("Invalid phone number format!");
        }

        return matcher1.matches() || matcher2.matches() || matcher3.matches();
    }

    public static boolean checkIfNumberExists(PhoneBook phoneBook, String num) {
        boolean result = false;
        for (String rec : phoneBook.getData()) {
            if (rec.contains(num)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
