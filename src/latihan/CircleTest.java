
package latihan;

class CircleTest {
        public static void main(String[] args) {
                try {
                        Circle c1 = new Circle(10, 10, 2);
                        System.out.println("Circle created");
                }
                catch(InvalidRadiusException e)
                {
                        e.printError();
                }
        }
}
