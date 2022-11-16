public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName+space+firstName+space+middleName;
        String fullName1 = fullName.toUpperCase();
        System.out.println("Задача 1");
        System.out.println("ФИО сотрудника-"+fullName);
        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName1);
        System.out.println("Задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — "+fullName2);
    }
}