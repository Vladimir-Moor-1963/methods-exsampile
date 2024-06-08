public class Main {
    public static void main(String[] args) {
        String nameFirst = "Даниил";
        String nameSecond = "Михаил";
        String nameThird = "Евгений";

       //System.out.println("Привет, " + nameFirst);
       //System.out.println();
       //System.out.println("--------------");

       //System.out.println("Привет, " + nameSecond);
       //System.out.println();
       //System.out.println("--------------");

       //System.out.println("Привет, " + nameThird);
       //System.out.println();
       //System.out.println("--------------");
     // hello(nameFirst);
     // hello(nameSecond);
     // hello(nameThird);

        brushTeeth(2);
        int c = 7+8;

       double answer = Math.sqrt(c) + Math.sqrt(c/5);
        System.out.println(answer);
        answer++;

    }
    public static void hello(String name){
        System.out.println("Привет, " + name);
        System.out.println();
        System.out.println("--------------");


    }
    public static void brushTeeth(int time){
        System.out.println("Окей папа я пошёл чистить зубы");
        System.out.println("Окей я буду это делать вот такое количество минут " + time);

    }




}
