
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
		int ancestry = 0; 
		while (ancestry!=1){
			if (isPrimeNumber(numberAnalized)){
				sumPrimes = sumPrimes + numberAnalized ;
				countPrimes ++;
			}
			if (countPrimes==50){
				ancestry = 1;
			}else{
				numberAnalized += 1;
			}
		}
		return sumPrimes;
	}
	
	public static boolean isPrimeNumber(int numberAnalized){
		boolean ret = false;
		int scrapCounter = 0;
		int i = 0;
		if (numberAnalized <=1){
			ret = false;
		}else if (numberAnalized == 2){
			ret = true;
		}else{ 
			for (i=2 ; i<= numberAnalized ; i++ ){
				if (numberAnalized%i==0){
					scrapCounter ++;
				}
			}
			if (scrapCounter>1){
				ret = false;
			}else{
				ret = true;
			}
		}
		return ret;
	}
}

