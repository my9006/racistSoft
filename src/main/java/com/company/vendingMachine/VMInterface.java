package com.company.vendingMachine;

import java.util.HashMap;
import java.util.Scanner;

public class VMInterface {

	protected HashMap<String, Integer> commandForammter() {
		System.out.println("Please enter the command");
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		HashMap<String, Integer> formattedCommand = new HashMap<>();
		try {
			commandValidator(command);
			formattedCommand.put(command.split(":")[0], Integer.parseInt(command.split(":")[1]));
		} catch (WrongFormattException wfe) {
			System.out.println(wfe.toString());
		}
		return formattedCommand;
	}

	private void commandValidator(String command) {
		if (!command.matches("^([A-C]|[a-c])?:[0-2]?$")) {
			throw new WrongFormattException();
		}
	}

	public void interactWithHumanBeing() {
		VMVendor vendor = new VMVendor();
		try {
			vendor.getProduct();
		}catch (WrongFormattException ex){
			System.out.println("I am dissapointed nigga, next shot");
			interactWithHumanBeing();
		}
		System.out.println("\nNeed something else?y/n");
		Scanner sc = new Scanner(System.in);
		String decision = sc.nextLine();
		if (decision.equalsIgnoreCase("y")) {
			interactWithHumanBeing();
		} else if (decision.equalsIgnoreCase("n")) {
			System.out.println("Goodbye hommie");
		} else {
			System.out.println("Are you blind nigga? Y or N nigga, shitty lives matter, try next time");

		}
	}
}