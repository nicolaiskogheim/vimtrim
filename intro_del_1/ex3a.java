class ex3 {
	private static void main(String[] args) {
		int[] tall = {1,2,3,4,5};

		System.out.println(plus(tall));
	}

	private static int plus(int[] tall) {
		int sum = 0;

		for(int i=0; i<tall.length; i++) {
			sum += tall[i];
		}

		return sum;
	}

	private static int subtract(int[] tall) {
		int sum = 0;

		for(int i=0; i<tall.length; i++) {
			sum -= tall[i];
		}

		return sum;
	}

	// Kopier subtract og lag en multiply-funksjon
	// Kopier subtract og lag en divide-funksjon

}
