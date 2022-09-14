public class Lesson13{
        public static void main(String[] args) throws Exception {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };                           // Only 0 & 1 indexes are .
                abc[3] = 9;                                     // Index out of bounds, expected 0 or 1
            //} catch (Throwable ex) {                          // This lines unnecessary. Handling of other errors will be impossible
                //System.out.println("Что-то пошло не так..."); //
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
         }

         public static void printSum(Integer a, Integer b){
            System.out.println(a + b);
         }
         
    }