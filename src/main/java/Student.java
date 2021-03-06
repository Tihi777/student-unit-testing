class Student {
    //поля класса
    private String firstName;
    private String lastName;
    private int age;

    //конструктор с аргументами
    public Student(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    //конструктор по умолчанию
    public Student() {
    }

    //геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    //сеттер для имени
    public void setFirstName(String firstName) {
        if (firstName.length() > 1) {
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        } else {
            this.firstName = firstName.toUpperCase();
        }
    }

    public String getLastName() {
        return lastName;
    }

    //сеттер для фио
    public void setLastName(String lastName) {
        if (lastName.contains("[a-zA-Z]+") == false) {
            this.lastName = lastName.replaceAll("\\d", "");
        }
        if (lastName.length() >= 2) {
            this.lastName = Character.toUpperCase(this.lastName.charAt(0)) + this.lastName.substring(1).toLowerCase();
        } else {
            this.lastName = "Ivanov";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 17 && age <= 50 ? age : 18;
    }

    //печать ФИО
    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }

    //метод для расчета среднего возраста
    public static int avgAge(Student[] array) {
        int avg = 0;
        int ageSum = 0;

        for (int i = 0; i < array.length; i++) {
            ageSum += array[i].age;
        }
        avg = ageSum / array.length;

        return avg;
    }

    //метод для расчета минимального возраста
    public static int minAge(Student[] array) {

        int min = 100;        // текущий минимальный возраст

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() < min) {
                min = array[i].getAge();
            }

        }
        return min;
    }

    //метод для расчета максимального возраста
    public static int maxAge(Student[] array) {

        int max = 0; // текущий максимальный возраст

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > max) {
                max = array[i].getAge();
            }

        }
        return max;
    }

}
