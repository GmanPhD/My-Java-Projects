/*
Write a Human class with 6 fields.
Think up and implement 10 different constructors for it.
Each constructor should make sense.
*/
public class Main {
    public static void main(String[] args) {
    }
     
    public static class Human {
        private String name;
        private int childCount;
        private int age;
        private int length;
        private Human mother;
        private Human father;
        public Human() {
        }
        public Human(String name) {
            this.name = name;
        }
        public Human(String name, int childCount) {
            this.name = name;
            this.childCount = childCount;
        }
        public Human(String name, int childCount, int age) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
        }
        public Human(String name, int childCount, int age, int length, Human mother) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
        }
        public Human(String name, int childCount, int age, int length, Human mother, Human father) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
            this.father = father;
        }
                     
        public Human(int childCount, int age) {
            this.childCount = childCount;
            this.age = age;
        }
        public Human(int childCount, int age, int length) {
            this.childCount = childCount;
            this.age = age;
            this.length = length;
        }
        public Human(int childCount, int age, int length, Human mother) {
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
        }
        public Human(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
        }
    }
}

