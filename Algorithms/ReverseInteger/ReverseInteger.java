public class ReverseInteger {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            int tail = x % 10;
            int oldsum = sum;
            sum = sum * 10 + tail;
            int temp = (sum - tail)/10;
            if (temp != oldsum)
                return 0;
            x = x/10;
        }
        if(x < 0)
           return sum*(-1);
        else
           return sum;  
    }   
	public static void main(String[] args) {
	int num = 6756878;
	System.out.println("The original number is :" +num);
	int result;
	ReverseInteger reverseinteger = new ReverseInteger();
	result = reverseinteger.reverse(num);
	System.out.println("The reversed number is: " + result);
	}
}
