package com.FridayTest;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    private static final String DATA_PATH = "src/contact.csv";

    private static void saveContacts(Map<String, List<String>> contacts) {
        try (PrintWriter writer = new PrintWriter(DATA_PATH)) {
            if (!contacts.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                    String line = String.format("%s,\"%s\"",
                            entry.getKey(), entry.getValue().toString().replaceAll("\\[ | ]", ""));
                    writer.println(line);
                }
            }

        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }
    }

    private static void loadContacts(Map<String, List<String>> contacts) {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {

            Pattern pattern = Pattern.compile("^([^,\"]{2,50}),\"([0-9+, ]+)\"$");

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String[] numbers = matcher.group(2).split(",\\s*");
                    contacts.put(matcher.group(1), Arrays.asList(numbers));
                }
            }

        } catch (IOException ioe) {
            System.err.println("phone book is empty!");
        }
    }

    private static void listCommands() {
        System.out.println("list - lists all saved contacts in alphabetical  order");
        System.out.println("show - find a contact by name");
        System.out.println("find - search a contact by number");
        System.out.println("add - save a new contact entry into the phone book");
        System.out.println("edit - modify a existing contact");
        System.out.println("delete - remove a contact from the phone book");
    }

    private static void listContacts(Map<String, List<String>> contacts) {
        if (!contacts.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey());
                for (String number : entry.getValue()) {
                    System.out.println(number);
                }
                System.out.println();
            }
        } else {
            System.out.println("phone book is empty!");
        }

        System.out.println();
        System.out.println("exit");
    }

    private static void showContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Enter the name:");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println(name);
            for (String number : contacts.get(name)) {
                System.out.println(number);
            }
        } else {
            System.out.println("number not found!");
        }

        System.out.println();
        System.out.println("exit");
    }

    private static void findContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Enter a number:");
        String number = input.nextLine().trim();

        while (!number.matches("^\\+?[0-9 ]{3,25}$")) {
            System.out.println("Invalid number! May contain only digits, space and '+'. Min length 3, max length 25.");
            System.out.println("Enter number:");
            number = input.nextLine().trim();
        }

        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            if (entry.getValue().contains(number)) {
                System.out.println(entry.getKey());
                System.out.println(number);
            }
        }

        System.out.println();
        System.out.println("exit");
    }

    private static void addContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("add a new contact");
        String name;
        String number;

        while (true) {
            System.out.println("Enter contact name");
            name = input.nextLine().trim();
            if (name.matches("^.{2,50}$")) {
                break;
            } else {
                System.out.println("Name must be in range 2 - 50 symbols.");
            }
        }

        while (true) {
            System.out.println("Enter contact number:");
            number = input.nextLine().trim();
            if (number.matches("^\\+?[0-9 ]{3,25}$")) {
                break;
            } else {
                System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
            }
        }

        if (contacts.containsKey(name)) {
            System.out.printf("'%s' already exists in the phone book!", name);

            if (contacts.get(name).contains(number)) {
                System.out.printf("Number %s already available for contact '%s'.", number, name);
            } else {
                contacts.get(name).add(number);
                saveContacts(contacts);
                System.out.printf("Successfully added number %s for contact '%s'.", number, name);
            }

        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(name, numbers);
            saveContacts(contacts);
            System.out.printf("Successfully added contact '%s' !", name);
        }

        System.out.println();
        System.out.println("exit");
    }

    private static void editContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Enter a name  to modify:");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            List<String> numbers = new ArrayList<>(contacts.get(name));
            System.out.printf("Current number(s) for %s:", name);
            for (String number : numbers) {
                System.out.println(number);
            }
            System.out.println();
            System.out.println(" add a new number or delete an existing number for this contact");
            String editOption = input.nextLine().trim().toLowerCase();
            boolean addNumber = false;
            boolean delNumber = false;

            option:
            while (true) {
                switch (editOption) {
                    case "add":
                        addNumber = true;
                        break option;
                    case "delete":
                        delNumber = true;
                        break option;
                    case "cancel":
                        System.out.println("Contact was not modified!");
                        break option;
                    default:
                        System.out.println(" 'add' to save a new number, 'delete' to remove an existing number or 'cancel' ");
                        editOption = input.nextLine().trim().toLowerCase();
                        break;
                }
            }

            if (addNumber) {
                while (true) {
                    System.out.println("Enter new number:");
                    String number = input.nextLine().trim();
                    if (number.matches("^\\+?[0-9 ]{3,25}$")) {
                        contacts.get(name).add(number);
                        saveContacts(contacts);
                        System.out.printf("Number %s was successfully added, record updated!", number);
                        break;
                    } else {
                        System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
                    }
                }
            }

            if (delNumber) {
                while (true) {
                    System.out.println("Enter the number you want to delete:");
                    String number = input.nextLine().trim();
                    if (numbers.contains(number)) {
                        numbers.remove(number);
                        contacts.put(name, numbers);
                        saveContacts(contacts);
                        System.out.printf("number %s was removed from the record for '%s'", number, name);
                        break;
                    } else {
                        System.out.printf("number does not exist!:", name);
                        for (String num : numbers) {
                            System.out.println(num);
                        }
                    }
                }
            }

        } else {
            System.out.println("Sorry, name not found!");
        }

        System.out.println();
        System.out.println("exit");
    }

    private static void deleteContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Enter name of the contact to delete:");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.printf("Contact '%s' will be deleted", name);
            String confirmation = input.nextLine().trim().toLowerCase();
            confirm:
            while (true) {
                switch (confirmation) {
                    case "y":
                        contacts.remove(name);
                        saveContacts(contacts);
                        System.out.println("contact was deleted successfully!");
                        break confirm;
                    case "n":
                        break confirm;
                    default:
                        System.out.println("delete contact:");
                        break;
                }
                confirmation = input.nextLine().trim().toLowerCase();
            }

        } else {
            System.out.println("Sorry, name not found!");
        }

        System.out.println();
        System.out.println("exit");
    }

    public static void main(String[] args) {

        System.out.println("Phone Book (ver 0.2)");
        System.out.println("Welcome to phonebook");
        System.out.println("write a command exit:");
        listCommands();

        Map<String, List<String>> contacts = new TreeMap<>();
        loadContacts(contacts);

        Scanner input = new Scanner(System.in);
        String line = input.nextLine().trim();

        while (!line.equals("exit")) {

            switch (line) {
                case "list":
                    listContacts(contacts);
                    break;
                case "show":
                    showContact(contacts, input);
                    break;
                case "find":
                    findContact(contacts, input);
                    break;
                case "add":
                    addContact(contacts, input);
                    break;
                case "edit":
                    editContact(contacts, input);
                    break;
                case "delete":
                    deleteContact(contacts, input);
                    break;
                case "help":
                    listCommands();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }


            System.out.print("\n> ");
            line = input.nextLine().trim();
        }

        System.out.println("'Phone Book 0.2' terminated.");
    }
}