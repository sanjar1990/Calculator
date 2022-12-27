import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers to calculate: ");

        String a = scanner.nextLine();
        //   System.out.println(a);
        String[] operators=a.split("[0-9]+");

        String[] operands=a.split("[-+*/]+"); //+ nimaga qo'yilgan

        // System.out.println(Arrays.toString(operators));
        //  System.out.println(Arrays.toString(operands));

        int result = Integer.parseInt(operands[0]);




        if(operators.length>3 ){
//            System.out.println(Arrays.toString(operators));
//            System.out.println(operators.length);
            System.out.println("You can't calculate more then three numbers! oops ");
        }

        else {

            for(int i=1;i<operands.length;i++){

                if(Integer.parseInt(operands[i-1])>10){
                    //   System.out.println(Integer.parseInt(operands[i]));
                    System.out.println("Enter numbers between 1to 10!");
                    System.exit(1);

                }

                else  {
                    switch(operators[i]){
                        case "+" :result += Integer.parseInt(operands[i]);
                            break;

                        case "-":result -=Integer.parseInt(operands[i]);
                            break;
                        case "*": result *=Integer.parseInt(operands[i]);
                            break;
                        case "/":result /=Integer.parseInt(operands[i]);
                            break;
                        default:

                            System.out.println("Not applicable");
                    }

                }



            }
            System.out.println(Math.abs(result));
        }


    }
}
