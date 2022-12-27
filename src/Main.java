import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers to calculate: ");


        String userInput = scanner.nextLine();

        String[] operators=userInput.split("[0-9]+");


        Calculation calculation;
        String[] operands=userInput.split("[-+*/]+");
        





        int result=0;
        try {
             result = Integer.parseInt(operands[0]);
        }
        catch(NumberFormatException e){
            System.out.println("Enter only numbers please!");
            System.exit(0);

        }
        finally {

            scanner.close();
        }




        if(operators.length>3 ){

            System.out.println("You can't calculate more then three numbers! oops ");
        }

        else {

                for (int i = 1; i < operands.length; i++) {

                    if (Integer.parseInt(operands[i - 1]) > 10) {

                        System.out.println("Enter numbers between 1to 10!");
                        System.exit(1);

                    } else {
                        switch (operators[i]) {
                            case "+": {
                                calculation= new Addition(result, Integer.parseInt(operands[i]));
                                result= calculation.add();



                            }
                            ;
                            break;

                            case "-": {

                                {
                                    calculation = new Subtraction(result, Integer.parseInt(operands[i]));
                                    result = calculation.subtract();
                                }

                            }
                                break;
                            case "*":{
                                calculation=new Multiplication(result, Integer.parseInt(operands[i]));
                                result=calculation.multiple();

                            }

                                break;
                            case "/":{
                               calculation=new Division(result, Integer.parseInt(operands[i]));
                               result= calculation.divide();

                            }

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
