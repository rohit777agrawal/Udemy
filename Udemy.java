
// fun and weird program ? Skip it
// Change number to words 
// connected to above //  reverse the number 
// connected to above //  count number of digits in a number
// helps to find the factors of number 
// helps to find the highest common factor between two numbers
// helps to find the sum of the even digits between the number
// helps to find the shared digit between two numbers
public class Udemy {
	
	public static void main (String [] args)
	{
		printSquareStar(5);
	}	
	
	public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }else {
            int row = 1;
 
            while (row <= number) {
 
                if (row == 1 || row == number) {
                    for (int i = 1; i <= number; i++) {
                        System.out.print("*");
                    }
                }else {
                    for (int j = 1; j <= number; j++) {
                        if (j == 1 || j == number || j == row || j == number - row + 1) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                }
                
                System.out.println();
 
                row++;
            }
        }
    } 
	
	
	
	
	
	
	// fun and weird program? Skip it
	public static boolean canPack (int bigCount, int smallCount, int goal)
	{
		if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else if (bigCount * 5 + smallCount >= goal) {
            if (goal % 5 <= smallCount) {
                return true;
            } else{
                return false;
            }
        }
            return false;
	}
	
	
	// Change number to words! 
	public static void numberToWords (int number)
	{
		if (number >= 0)
		{
				int oldNumber = reverse(number);				
				int remainder = 0;
				int newNumber = oldNumber;
				
				while ( newNumber != 0)
				{
					remainder = newNumber%10;
					newNumber = newNumber/10;
					
					switch (remainder)
					{
					case 0:
						System.out.println("Zero");
						break;
					
					case 1:
						System.out.println("One");
						break;
						
					case 2:
						System.out.println("Two");
						break;
						
					case 3:
						System.out.println("Three");
						break;
						
					case 4:
						System.out.println("Four");
						break;
						
					case 5:
						System.out.println("Five");
						break;
						
					case 6:
						System.out.println("Six");
						break;
						
					case 7:
						System.out.println("Seven");
						break;
						
					case 8:
						System.out.println("Eight");
						break;	
						
					default:
						System.out.println("Nine");
						
					}
			
				}
			 if (oldNumber != getDigitCount(number))
				{
					int b = getDigitCount(number) - getDigitCount(oldNumber);
					while (b != 0)
					{
						System.out.println("Zero");
						b--;
					}
				}
		}
		else
		{
			System.out.println("Invalid Number!");
		}
	}
	
	// connected to above //  reverse the number
	public static int reverse (int number)
	{
		int reversedValue =0;
		int remainder =0;
		int newNumber = number;
		
		while ( newNumber != 0)
		{
			remainder = newNumber%10;
			reversedValue = reversedValue * 10 + remainder;
			newNumber = newNumber/10;		
		}
		return reversedValue;
		
		
	}
	
	
	// connected to above //  count number of digits in a number
	public static int getDigitCount (int number)
	{
		if (number <0)
		{
			return -1;
		}
		else if (number == 0)
		{
			return 1;
		}
		else
		{
			int count =0;
			int remainder;
			int newNumber = number;
			
			while ( newNumber != 0)
			{
				remainder = newNumber%10;
				newNumber = newNumber/10;
				count++;
			}
			return count;
			
		}
	}
	
	
	public static boolean isPerfectNumber (int number)
	{
		if (number < 1)
		{
			return false;
		}
		else
		{
			int sum=0;
			for (int n =1; n < number; n++)
			{
				if (number%n == 0)
				{
					sum = sum + n;
				}
			}
			
			if (sum == number)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	
	 /// helps to find the factors of number   
    public static void printFactors (int number)    
	    {
	        if (number < 1)
	        {
	            System.out.println("Invalid Value");
	        }
	        else
	        {
	            int n = 1;
	            while (number >= n)
	            {
	            	if (number%n == 0)
	            	{
	            		System.out.println(n);
	            	}
	            	n++;
	            
	       
	            }
	        }
	        
	    }
	

    // helps to find the highest common factor between two numbers
	public static int getGreatestCommonDivisor (int first, int second)
	{
		int store=0;
		
		if (first<10 || second<10)
		{
			return -1;
		}
		else
		{
			for (int n1=1; n1 <= first; n1++)
			{
				if (first % n1 ==0)
				{
					if (second % n1 == 0)
					{
						store = n1;
					}
				}
			}
			return store;
		}
	}
	
	
	// helps to find the sum of the even digits between the number
	public static int getEvenDigitSum (int number)
	{
		if (number < 0)
		{
			return -1;
		}
		else
		{
		int sum =0;
		int newNumber=number;
		int remainder =0;
		while (newNumber != 0)
		{
			remainder = newNumber%10;
			newNumber= newNumber/10;
			
			if (remainder%2 == 0)
			{
				sum = sum+remainder;
			}
		}
		
		return sum;
		}
	}
	
	
	
	//helps to find the shared digit between two numbers
	public static boolean hasSharedDigit (int a, int b)
	{
		if ((a<10 || a>99) || (b<10 || b>99))
		{
			return false;
		}
		else
		{
			int newNumber=a;
			int remainderA =0;
			while (newNumber != 0)
			{
				remainderA = newNumber%10;
				newNumber= newNumber/10;
				
				int remainderB=0;
				int newNumberB=b;
				while (newNumberB !=0)
				{
					remainderB = newNumberB%10;
					newNumberB= newNumberB/10;
					
					if (remainderA == remainderB)
					{
						return true;
					}
				}
					
			}
			return false;
		
		}


	}
	

}
