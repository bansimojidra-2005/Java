/*Write a java application that generates a custom exception if any of its command-line arguments are negative.
	*The application should accept command-line arguments(integer) and check if any of them are negative.
	*If negative value is encounted, the program should throw and handle a custom exeception, such as NegativeValueException. 
*/

// Custom Exception class
class NegativeValueException extends Exception
{
    NegativeValueException(String message)
    {
        super(message);
    }
}


// Main class
public class CustomException
{
    public static void main(String[] args)
    {
        try
        {
            for (int i = 0; i < args.length; i++)
            {
                int number = Integer.parseInt(args[i]);

                if (number < 0)
                {
                    throw new NegativeValueException("Negative value found: " + number);
                }

                System.out.println("Value: " + number);
            }

            System.out.println("All values are positive.");
        }
        catch (NegativeValueException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter only integer values.");
        }
    }
} 