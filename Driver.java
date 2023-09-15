import java.util.ArrayList;
import java.util.Scanner;
    public class Driver {
        private static ArrayList<Dog> dogList = new ArrayList<Dog>();
        private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
        // Instance variables

        public static void main(String[] args) {
            initializeDogList();
            initializeMonkeyList();
            System.out.println();

            // Add a loop that displays the menu, accepts the users input and takes the appropriate action.
            // Gets the feedback to the user.
            // A Scanner and pass it to the necessary methods
            // Menu options 4, 5, and 6 connect to the printAnimals() method.


            Scanner scnr = new Scanner(System.in);

            boolean done = false;
            do {
                displayMenu();
                String input = scnr.nextLine();
                if (input.equals("1")) {
                    intakeNewDog(scnr);
                }
                if (input.equals("2")) {
                    intakeNewMonkey(scnr);
                }
                if (input.equals("3")) {
                    reserveAnimal(scnr);
                }
                if (input.equals("4")) {
                    printAnimals("dog");
                }
                if (input.equals("5")) {
                    printAnimals("monkey");
                }
                if (input.equals("6")) {
                    printAnimals("available");
                }
                if (input.equals("q")) {
                    done = true;
                }
            } while (!done);
        }

        // This method prints the menu options
        public static void displayMenu() {
            System.out.println("\n\n");
            System.out.println("\t\t\t\tRescue Animal System Menu");
            System.out.println("[1] Intake a new dog");
            System.out.println("[2] Intake a new monkey");
            System.out.println("[3] Reserve an animal");
            System.out.println("[4] Print a list of all dogs");
            System.out.println("[5] Print a list of all monkeys");
            System.out.println("[6] Print a list of all animals that are not reserved");
            System.out.println("[q] Quit application");
            System.out.println();
            System.out.println("Enter a menu selection");
        }


        // Adds dogs to a list for testing
        public static void initializeDogList() {
            Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
            Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
            Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

            dogList.add(dog1);
            dogList.add(dog2);
            dogList.add(dog3);
        }


        // Adds monkeys to a list for testing
        //Optional for testing
        public static void initializeMonkeyList() {
            Monkey m1 = new Monkey("George", "male", "1", "20.0", "01-01-2023", "United States", "intake", false, "United States", "11.0", "12.0", "13.0", "Capuchin");
            monkeyList.add(m1);
        }



        // The input validation to check that the dog is not already in the list
        public static void intakeNewDog(Scanner scanner) {
            System.out.println("What is the dog's name?");
            String name = scanner.nextLine();
            for(Dog dog: dogList) {
                if(dog.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis dog is already in our system\n\n");
                    return; //returns to menu
                }
            }

            // Code to instantiate a new dog and add it to the appropriate list
            System.out.println("What is the dog's breed?");
            String breed = scanner.nextLine();
            System.out.println("What is the dog's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the dog's age?");
            String age = scanner.nextLine();
            System.out.println("What is the dog's weight?");
            String weight = scanner.nextLine();
            System.out.println("What is the dog's acquisition date?");
            String acquisitionDate = scanner.nextLine();
            System.out.println("What is the dog's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("What is the dog's training status?");
            String trainingStatus = scanner.nextLine();
            System.out.println("What is the dog's in service country?");
            String inServiceCountry = scanner.nextLine();


            Dog d1 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                    false, inServiceCountry);
            dogList.add(d1);
            System.out.println(name + " is now rescued!");

        }

        //Instantiate and adds the new monkey to the appropriate list
        //Validates the input to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            System.out.println("What is the monkey's in service country?");
            String inServiceCountry = scanner.nextLine();
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();
            System.out.println("What is the monkey's height?");
            String monkeyHeight = scanner.nextLine();
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            System.out.println("Whats the monkey's species?");
            String monkeySpecies = scanner.nextLine();

            Monkey m1 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                    false, inServiceCountry, tailLength, monkeyHeight, bodyLength, monkeySpecies);
            monkeyList.add(m1);
            System.out.println(name + " is now rescued!");
        }

        //Finds the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the type of animal?");
            String animal = scanner.nextLine();
            System.out.println("What is the in service country?");
            String country = scanner.nextLine();
            if(animal.equalsIgnoreCase("dog")) {
                for(Dog dog: dogList) {
                    if (dog.getInServiceCountry().equalsIgnoreCase(country) && dog.getTrainingStatus().equals("in service") &&
                            ! dog.getReserved()) {
                        dog.setReserved(true);
                        break;
                    }
                }
            }
            else if(animal.equalsIgnoreCase("monkey")) {
                for(Monkey monkey: monkeyList) {
                    if (monkey.getInServiceCountry().equalsIgnoreCase(country) && monkey.getTrainingStatus().equals("in service") &&
                            ! monkey.getReserved()) {
                        monkey.setReserved(true);
                        break;
                    }

                }
            }

        }

        // Includes the animal name, status, acquisition country and if the animal is reserved.
        // *Remember* that this method connects to three different menu items.
        // The printAnimals() method has three different output based on the listType parameter:
        // 1. dog - prints the list of dogs
        // 2. monkey - prints the list of monkeys
        // 3. available - prints a combined list of all animals that are fully trained ("in service") but not reserved
        public static void printAnimals(String listType) {
            if (listType.equals("dog")) {
                System.out.println("DOG LIST:");
                for (Dog dog : dogList) {
                    System.out.println(dog.getName() + " | " + dog.getTrainingStatus()
                            + " | " + dog.getInServiceCountry() + " | " + dog.getReserved());
                }
            }
            if (listType.equals("monkey")) {
                System.out.println("MONKEY LIST:");
                for (Monkey monkey : monkeyList) {
                    System.out.println(monkey.getName() + " | " + monkey.getTrainingStatus()
                            + " | " + monkey.getInServiceCountry() + " | " + monkey.getReserved());
                }
            }
            if (listType.equals("available")) {
                System.out.println("AVAILABLE LIST:");
                System.out.println("DOG LIST:");
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved())
                        System.out.println(dog.getName() + " | " + dog.getTrainingStatus()
                                + " | " + dog.getInServiceCountry() + " | " + dog.getReserved());
                }
                System.out.println("MONKEY LIST:");
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved())
                        System.out.println(monkey.getName() + " | " + monkey.getTrainingStatus()
                                + " | " + monkey.getInServiceCountry() + " | " + monkey.getReserved());
                }

            }

        }
    }

