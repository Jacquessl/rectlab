// Program is couting square of colored rectangle depending on inputs

public class Program6{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int[] liczbyx = new int[4];
		int[] liczbyy = new int[4];

		// inputing x's value as an array

		System.out.print("Podaj cztery wartosci osi x: ");
		for( int i=0; i<4; i++){
			liczbyx[i] = scanner.nextInt();
		}

		// inputing y's value as an array

		System.out.print("Podaj cztery wartosci osi y: ");
		for( int i=0; i<4; i++){
			liczbyy[i] = scanner.nextInt();
		}

		//sorting y values

		for(int i=0; i<4; i++){
			if(liczbyy[0]>liczbyy[1]){
				int z;
				int z2;
				z = liczbyy[0];
				z2 = liczbyy[1];
				liczbyy[0] = z2;
				liczbyy[1] = z;
			}
			else if(liczbyy[1]>liczbyy[2]){
				int z;
				int z2;
				z = liczbyy[1];
				z2 = liczbyy[2];
				liczbyy[1] = z2;
				liczbyy[2] = z;
			}
			else if(liczbyy[2]>liczbyy[3]){
				int z;
				int z2;
				z = liczbyy[2];
				z2 = liczbyy[3];
				liczbyy[2] = z2;
				liczbyy[3] = z;
			}
			else if(liczbyy[0]>liczbyy[1]&&liczbyy[1]>liczbyy[2]&&liczbyy[2]>liczbyy[3]){
				break;
			}
		}
		// sorting x values
		for(int i=0; i<4; i++){
			if(liczbyx[0]>liczbyx[1]){
				int z;
				int z2;
				z = liczbyx[0];
				z2 = liczbyx[1];
				liczbyx[0] = z2;
				liczbyx[1] = z;
			}
			else if(liczbyx[1]>liczbyx[2]){
				int z;
				int z2;
				z = liczbyx[1];
				z2 = liczbyx[2];
				liczbyx[1] = z2;
				liczbyx[2] = z;
			}
			else if(liczbyx[2]>liczbyx[3]){
				int z;
				int z2;
				z = liczbyx[2];
				z2 = liczbyx[3];
				liczbyy[2] = z2;
				liczbyy[3] = z;
			}
			else if(liczbyx[0]>liczbyx[1]&&liczbyx[1]>liczbyx[2]&&liczbyx[2]>liczbyx[3]){
				break;
			}
		}

		// calculating sides length
		
		int a = liczbyx[3]-liczbyx[2];
		int b = liczbyy[3]-liczbyy[2];

		// making sure length isn't a negative value
		if(a<0) {
			a = a*-1;
		}
		if(b<0){
			b = b*-1;
		}

		System.out.println("Pole wspolne dwoch prostokatow wynosi: " + a*b);
	}
}