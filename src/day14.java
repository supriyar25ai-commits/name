/*public class day14{
    static class student {
        String name;
        int age;
        int regno;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this regno = builder.regno;
        }

        static class Builder {
            private String name;
            private int age;
            private int regno;

            public Builder name(string namevalue){
            this.name =namevalue;
            return this;

        }

        public Builder age(int ageValue) {
            this.age = ageValue;
            return this;
        }

        public Builder regNo(int regNoValue) {
            this.regNo = regNoValue;
            return this;
        }

    }

    }
    static void main() {
    student student = new Student.Builder()
            .name("supriya")
            .age("18")
            .regno("2528f0160")
            .build();
        System.out.println(Student.name);
        system.out.println(Student.age);
        System.out.println(Student.regno);

    }
    }

 */

public class day14 {

    static class Student {
        String name;
        int age;
        int regno;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regno = builder.regno;
        }

        static class Builder {
            private String name;
            private int age;
            private int regno;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }

            public Builder regNo(int regNoValue) {
                this.regno = regNoValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("Supriya")
                .age(18)
                .regNo(2528)
                .build();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.regno);
    }
}



