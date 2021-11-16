package Collections;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] SArray = { "Java", "Selenium", "Java", "Selenium", "Eclipse", "Eclipse", "Java", "Selenium", "API",
				"Eclipse" };

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < SArray.length; i++) {

			int count = 0;
			if (!al.contains(SArray[i])) // If the if condition is true then it will go inside if statement

			// We have used negation since for the firsttime the arralylist is empty and it
			// will return false and therefore
			// it will not go inside the if loop to forceably make it true and add

			{
				al.add(SArray[i]);

				count++;

				for (int j = i + 1; j < SArray.length; j++) {

					if (SArray[i] == SArray[j]) {
						count++;
					}

				}

				System.out.println("For the String " + SArray[i] + " the count is " + count);
				if (count == 1) {

					System.out.println("The unique string is " + SArray[i]);

				}

			}

		}

	}

}
