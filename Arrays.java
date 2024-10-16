public class Arrays {
    public static void main (String[] args) {
        // arrays

        int[] numbers = {12,33,44,0,50,12,33,44,0,50,12,33,44,0,50,12,33,44,0,50,12,33,44,0,51};

       // numbers = new int[5];
        //System.out.println("the frist valus is "+numbers[4]);
        System.out.println("the frist valus is "+numbers[2]);
        numbers[2] = 10;
        System.out.println("the frist valus is "+numbers[2]);
        System.out.println("size of array is "+numbers.length);
        System.out.println("the last value is "+numbers[numbers.length - 1]);



        String[] students = {"ahmed","ayoub","khalid","fadwa","fatim-ezzahra","saad"};
        for (int i = 1;i<students.length;i++){
            System.out.println("name : "+students[i]);
            System.out.println("--------------------");
        }
    }
}
