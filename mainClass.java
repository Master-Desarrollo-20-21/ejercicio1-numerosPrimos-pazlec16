
public class mainClass {
	public static void main(String[] args) {
		System.out.println("Suma de primos dentro de los primeros 50 numeros naturales");
		System.out.println("resultado: "+sumFrst50NaturalNUmbers());
		System.out.println("Suma de los primeros 50 numeros primos");
		System.out.println("resultado: "+sumFirst50PrimeNumbers());
		
	}
	
	public static int sumFrst50NaturalNUmbers(){
		int i=0; 
		int sumPrimes = 0;
		for (i=1; i<=50; i++){
			if (isPrimeNumber(i)){
				sumPrimes = sumPrimes + i;
			}
		}
		
		return sumPrimes;
	}
	
	public static int sumFirst50PrimeNumbers(){
		int countPrimes = 0;
		int sumPrimes = 0;
		int  numberAnalized = 0;
		int flag = 0; 
		while (flag!=1){
			if (isPrimeNumber(numberAnalized)){
				sumPrimes = sumPrimes + numberAnalized ;
				countPrimes ++;
			}
			if (countPrimes==50){
				flag = 1;
			}else{
				numberAnalized += 1;
			}
		}
		return sumPrimes;
	}
	
	public static boolean isPrimeNumber(int numberAnalized){
		int divisor = 2;
		boolean isPrime = true;
		
		if (numberAnalized < divisor) return false;
		while (isPrime && divisor < numberAnalized){
			if (numberAnalized % divisor == 0)
			  isPrime = false;
			divisor++;
		}
		return isPrime;
	}
	
}

