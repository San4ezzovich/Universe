package Excercises.DataTypes;

public record Student(String firstName, String lastName, int math, int physic, int informatic) {
        public String firstName() {
            return firstName;
        }
        public String lastName() {
            return lastName;
        }
        public int math() {
            return math;
        }
        public int physic() {
            return physic;
        }
        public int informatic() {
            return informatic;
        }
        public String toString() {
            return String.format("%s %s %d %d %d", firstName, lastName, math, physic, informatic);
        }
    }