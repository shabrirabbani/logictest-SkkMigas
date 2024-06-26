import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void okYes(int input){
		for (int i = 0; i < input; i++) {
			if((i+1)%3 == 0){
				System.out.print("OK");
			} else if ((i+1)%4 == 0) {
				System.out.print("YES");
			}else {
				System.out.print(i+1);
			}
			System.out.print(" ");
		}
	}

	public static void firstTriangle(int input){
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

	public static void secondTriangle(int input){
		for (int i = 0; i < input; i++) {
			for (int j = i+1; j > 0 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void thirdTriangle(int input){
		int tempt = 1;
		int test = 0;
		boolean descending = false;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i + 1; j++) {
				if(test == input-1){
					descending = true;
				}
				if(descending){
					if(test == tempt){
						tempt++;
						descending = false;
					}
					System.out.print(test+1);
					test--;
				}else {
					System.out.print(test+1);
					test++;
				}
			}
			System.out.println();
		}
	}

	public static void snakeNumber(int input){
		Integer[][] arr = new Integer[input][input];
		int tempt = 1;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				arr[i][j] = tempt;
				tempt++;
			}
			if((i+1)%2 == 0 ){
				Arrays.sort(arr[i], Collections.reverseOrder());
			}
		}
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.print(arr[j][i] + " \t");
			}
			System.out.println();
		}
	}

	public static void collectAllAngle(int input){
		firstTriangle(input);
		secondTriangle(input);
		thirdTriangle(input);
		snakeNumber(input);
	}

	public static void removeThree(Integer[] input){
		List<Integer> hasil = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			if(input[i] % 3 != 0 ){
				hasil.add(input[i]);
			}
		}
		Collections.sort(hasil);
		System.out.println(hasil.toString());
	}

	public static void main(String[] args) {
		System.out.println("No 1.");
		okYes(15);
		System.out.println("No 2. ");
		collectAllAngle(6);
		System.out.println("No 3. ");
		Integer[] arr = new Integer[]{12,9,13,6,10,4,7,2};
		removeThree(arr);

	}
}