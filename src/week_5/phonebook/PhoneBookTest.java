package week_5.phonebook;

import java.util.Scanner;

public class PhoneBookTest {
    public static void main(String[] args) {
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

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    createNewRecord(phonebook, scan);
                    break;
                case 2:
                    System.out.println("Въведете телефонния номер за който искате да бъде изтрит записът.\n");
                    String num = scan.nextLine();
                    if (phonebook.deleteByPhoneNumber(num)) {
                        System.out.println("Записът беше успешно изтрит.\n");
                    } else {
                        System.out.println("Запис за този номер не беше намерен.\n");
                    }
                    break;
                case 3: // Не ми брои правилно записите
                    System.out.println("Въведете низ.");
                    String str = scan.next();
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

    private static void createNewRecord(PhoneBook phonebook, Scanner scan) {
        String name;
        String number;

        System.out.println("Въведете име: ");
        name = scan.nextLine();
        scan.nextLine();
        System.out.println("Въведете телефонен номер: ");
        number = scan.nextLine();
        String record = name + " - " + number;

        if (phonebook.existsRecord(record)) {
            System.out.println("Запис за този номер съществува вече.\nИзберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
            int choice = scan.nextInt();
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
}
