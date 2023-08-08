package newLogics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoFiles {

	public static void main(String[] args) throws Exception {
	
		//first we create ArrayList object
		List<String> teams = new ArrayList<String>();
		
		//now, i created String array that  object are stored in name_list
		String[] name_list = { "Kings", "kkr", "csk", "mi", "rr", "srh", "rcb", "dd" };
		 
		//now , we create try statement inside i want bufferReader for using file reading then.
		//i created fileReader for using set file path
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SSLTP11395\\Desktop\\ipl1.txt"))) {
			//we want empty string ,that named line
			String line;
			//need while loop
			//inside put condition we had any input only true
			while ((line = br.readLine()) != null) {
				//now adding value in list in array format
				teams.add(line);
			}
			//print the total table values in array format
		 System.out.println(teams);
			//we want for loop for using 
			for (int i = 1; i < teams.size(); i++) {
				for (int j = 0; j < name_list.length; j++) {
					if (teams.get(i).contains(name_list[j])) {
						String name = teams.get(i);
						String[] words = name.split(" ");
						String team_Name = words[1];
						int score1 = Integer.parseInt(words[9]);
						int score2 = Integer.parseInt(words[10]);
						System.out.println("team Name: " + team_Name + " For : " + score1 + " against :" + score2
								+ " difference = " + Math.abs((score1 - score2)));
					}

				}
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}}