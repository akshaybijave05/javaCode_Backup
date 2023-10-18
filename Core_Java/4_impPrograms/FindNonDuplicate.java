
//r&t
public class FindNonDuplicate {
	
	public static void main(String[] args) {
		
		int[] array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < array.length; i++) {

			int count = 0;
			
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(array[i]);
			}
		}
	}
}