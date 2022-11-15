public class Main {
    public static void main(String[] args) {
        String a = " ";
        String firstname = "ivan";
        firstname = firstname.replace(" ", "");
        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
        String middlename = "ivanovich";
        middlename = middlename.replace(" ", "");
        middlename = middlename.substring(0, 1).toUpperCase() + middlename.substring(1);
        String lastname = "ivanov";
        lastname = lastname.replace(" ", "");
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
        String fullname = lastname + a + firstname + a +middlename;
        System.out.println("ФИО сотрудника - " + fullname);


//        String a = " ";
//        String firstname = "Семён";
//        firstname = firstname.replace('ё', 'e');
//        String middlename = "Семёнович";
//        middlename = middlename.replace('ё', 'e');
//        String lastname = "Иванов";
//        String fullname = lastname+a+firstname+a+middlename;
//        System.out.println("ФИО Сотрудника - " +fullname);

    }
}