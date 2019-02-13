package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String lastName;
        private String firstName;
        private String patronymic;
        private String position;
        private String adress;
        private int salary;

        public Human(){
           this.lastName="Default";
           this.firstName="Default";
           this.patronymic="Default";
           this.position="Default";
           this.adress="Default";
           this.salary=0;
        }

        public Human(String lastName, String firstName, String patronymic, String position, String adress, int salary) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.position = position;
            this.adress = adress;
            this.salary = salary;
        }

        public Human(String lastName) {
            this.lastName = lastName;
            this.firstName="Default";
            this.patronymic="Default";
            this.position="Default";
            this.adress="Default";
            this.salary=0;
        }

        public Human(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic="Default";
            this.position="Default";
            this.adress="Default";
            this.salary=0;
        }

        public Human(String lastName, String firstName, String patronymic) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.position="Default";
            this.adress="Default";
            this.salary=0;
        }

        public Human(String lastName, String firstName, String patronymic, String position) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.position = position;
            this.adress="Default";
            this.salary=0;
        }

        public Human(String lastName, String firstName, String patronymic, String position, String adress) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.position = position;
            this.adress = adress;
            this.salary=0;
        }

        public Human(String lastName, String firstName, String patronymic, int salary) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.position="Default";
            this.adress="Default";
            this.salary = salary;
        }

        public Human(String position, int salary) {
            this.position = position;
            this.salary = salary;
        }

        public Human(int salary) {
            this.salary = salary;
        }
    }
}
