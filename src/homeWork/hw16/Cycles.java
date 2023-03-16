package homeWork.hw16;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название программы для скачивания (IntelliJ IDEA, Git, Java):");
        String program = in.nextLine();
        System.out.println("Для какой ОС необходим дистрибутив (Linux, macOS, Windows)?");
        String os = in.nextLine();
        String downloadLink;

        switch (program.toLowerCase()) {
            case ("intellij idea"):
                switch (os.toLowerCase()) {
                    case "linux":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=linux";
                        break;
                    case "macos":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=mac";
                        break;
                    case "windows":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=windows";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        return;
                }
                break;
            case "git":
                switch (os.toLowerCase()) {
                    case "linux":
                        downloadLink = "https://git-scm.com/download/linux";
                        break;
                    case "macos":
                        downloadLink = "https://git-scm.com/download/mac";
                        break;
                    case "windows":
                        downloadLink = "https://git-scm.com/download/win";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        return;
                }
                break;
            case "java":
                switch (os.toLowerCase()) {
                    case "linux":
                        downloadLink = "https://www.oracle.com/java/technologies/downloads/#java11-linux";
                        break;
                    case "macos":
                        downloadLink = "https://www.oracle.com/java/technologies/downloads/#java11-mac";
                        break;
                    case "windows":
                        downloadLink = "https://www.oracle.com/java/technologies/downloads/#java11-windows";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        return;
                }
                break;
            default:
                System.out.println("Такой программы не существует.");
                return;
        }
        System.out.println("Ссылка для скачивания: " + downloadLink);
        System.out.println("___________");

        System.out.println("Введите строку: ");
        String inputString = in.nextLine().toLowerCase();
        int charCount = 0;
        int i = 0;
        while (i < inputString.length()) {
            if (inputString.charAt(i) == 'а') {
                charCount++;
            }
            i++;
        }
        System.out.println("Количество символов 'а' в строке: " + charCount);
        System.out.println("____________");

        System.out.println("Введите число (желательно от 1 до 7): ");
        int Number = in.nextInt();

        if (Number == 1) {
            System.out.println("Понедельник");
        } else if (Number == 2) {
            System.out.println("Вторник");
        } else if (Number == 3) {
            System.out.println("Среда");
        } else if (Number == 4) {
            System.out.println("Четверг");
        } else if (Number == 5) {
            System.out.println("Пятница");
        } else if (Number == 6) {
            System.out.println("Суббота");
        } else if (Number == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }
        System.out.println("____________");

        System.out.println("Введите слова для построения предложения, для окончания введите STOP:");
        String sentence = "";
        do {
            String word = in.next();
            if (word.equals("STOP")) {
                break;
            }
            sentence += word + " ";
        } while (true);
        System.out.println("Полученное предложение: " + sentence.trim() + ".");
        System.out.println("____________");

        System.out.print("Введите число (является ли оно палиндромом?): ");
        String str = in.next();
        boolean isPalindrome = true;
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome?"Число " + str + " является " +
                "палиндромом.":"Число " + str + " не является палиндромом.");
        System.out.println("______________");

        System.out.print("Введите вместимость склада: ");
        int capacity = in.nextInt();
        int availableSpace = capacity;

        while (availableSpace > 0) {
            System.out.printf("Склад может принять %d металла.%n", availableSpace);
            System.out.print("Введите вес металла, который хотите сдать: ");
            int weight = in.nextInt();
            if (weight < 5) {
                System.out.println("Нельзя сдать меньше 5 металла.");
            } else if (weight > availableSpace) {
                System.out.println("На складе недостаточно места для этого количества металла.");
            } else {
                availableSpace -= weight;
                System.out.printf("Вы сдали %1$d металла. Осталось места на складе: %2$d.%n",
                        weight, availableSpace);
            }
        }
        System.out.println("На складе закончилось место.");

    }
}
