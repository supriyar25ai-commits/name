

/*
class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        public Car(String brand, String color, int fuel) {
                this.brand = brand;
                this.color = color;
                this.fuel = fuel;
                this.speed = 0;
        }

        public void accelerate() {
                if (fuel > 0) {
                        speed += 10;
                        fuel -= 5;
                        System.out.println(brand + " accelerated. Speed: " + speed + " km/h | Fuel: " + fuel + "%");
                }
        }

        public void decelerate() {
                if (speed > 0) {
                        speed -= 10;
                        System.out.println(brand + " slowed down. Speed: " + speed + " km/h");
                }
        }

        public void refill() {
                fuel += 20;
                System.out.println(brand + " refueled. Current Fuel: " + fuel + "%");
        }

        public void showFuel() {
                System.out.println("Fuel Status for " + color + " " + brand + ": " + fuel + "%");
        }
}

class CarApp {
        public static void main(String[] args) {
                Car myCar = new Car("Tesla", "Red", 30);
                myCar.showFuel();
                myCar.accelerate();
                myCar.accelerate();
                myCar.decelerate();
                myCar.refill();
                myCar.showFuel();
        }
}
*/
/*
class Student {
        String name;
        String dept;
        int regNo;
        int maths = 0;
        int physics = 0;
        int chemistry = 0;

        Student(String n, int r, String d) {
                name = n;
                regNo = r;
                dept = d;
        }
        void setMaths(int m) {
                maths = m;
        }
        void setPhysics(int p) {
        physics = p;
}
        void setChemistry(int c) {
                chemistry = c;
        }
        void updateMarks(int m) {
                maths = m;
        }
        void updateMarks(int m, int p) {
                maths = m;
                physics = p;
        }

        void updateMarks(int m, int p, int c) {
                maths = m;
                physics = p;
                chemistry = c;
        }
        void show(){
                System.out.println(name + " " + regNo + " " + dept);
                System.out.print

        }


}

 *
 */
public class day6{
        static class Student {
                String name, dept;
                int regNo;
                int maths, physics, chemistry;

                Student(String n, int r, String d) {
                        name = n;
                        regNo = r;
                        dept = d;
                }
                int getMaths() {
                        return maths;
                }
                int getPhysics() {
                        return physics;
                }

                int getChemistry() {
                        return chemistry;
                }

                void setMaths(int m) {
                        maths = m;
                }

                void setPhysics(int p) {
                        physics = p;
                }

                void setChemistry(int c) {
                        chemistry = c;
                }
                void updateMarks(int m) {
                        maths = m;
                }

                void updateMarks(int m, int p) {
                        maths = m;
                        physics = p;
                }

                void updateMarks(int m, int p, int c) {
                        maths = m;
                        physics = p;
                        chemistry = c;
                }

                void show() {
                        System.out.println(name + " " + regNo + " " + dept);
                        System.out.println(maths + " " + physics + " " + chemistry);

                }
        }
        public static void main(String[] args) {
                Student s1 = new Student("supriya", 101, "ai");
                Student s2 = new Student("thanya", 102, "ai&ds");
                Student s3 = new Student("reymanth", 103, "mech");
                s1.updateMarks(80, 85, 90);
                s2.setMaths(70);
                s2.setPhysics(75);
                s2.setChemistry(65);
                s3.updateMarks(88);
                s1.show();
                s2.show();
                s3.show();
        }
}
