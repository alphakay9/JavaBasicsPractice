import java.util.Scanner;

class Main {
  static String[] guests = new String[10];
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    
  insertTestNames();

    do {
      displayGuests();
      displayMenu();
      int option = getOption();

      
      if (option == 1) {
        addGuest();
      } else if (option == 2) {
        RemoveGuest();
      } else if (option == 3) {
        break;
      }
      else if (option == 4){
        renameGuest();
      }

    } while (true);
    System.out.println("Exiting...");
  }
  
  public static void displayGuests(){
    System.out.println("_________________________\n\t-GUESTS-");
        if(guests[0]==null){System.out.println("Guest is List Empty.");}
        for (int i = 0; i < guests.length; i++) {
          System.out.print(guests[i]==null ? "": ((i+1)+". "+guests[i]+"\n"));
        }
  }

  public static void insertTestNames(){
    guests[0] = "Jaco";
    guests[1] = "Ed";
    guests[2] = "Rose";
    guests[3] = "Mol";
    guests[4] = "Chris";
    
  }

  public static void displayMenu(){
    System.out.println("_________________________\n\t-MENU-");
      System.out.println("1-Add Guests");
      System.out.println("2- Remove Guests");
      System.out.println("3- Exit");
    System.out.println("4- rename guest");
        }
  public static int getOption(){
    System.out.println("Option");
    int option = scanner.nextInt();
    scanner.nextLine();
    return option;
  }
  public static void addGuest(){
    for (int i = 0; i < guests.length; i++) {
          if (guests[i] == null) {
            System.out.println("Guests Name:");
            guests[i] = scanner.nextLine();
            break;
          }
    }
  }

  public static void renameGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
 
        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
 
            guests[num - 1] = name;
        }
        else {
            System.out.println("\nError: There is no guest with that number.");
        }
    }

  public static void RemoveGuest(){
    System.out.println("Guests Name to remove:");
    int rmguest = scanner.nextInt();
    if(rmguest>=1 && rmguest <=10){
        for (int i = 0; i < guests.length; i++) {
          if (guests[i]!= null && rmguest==i+1) {
            while(guests[i] != null){
              guests[i]=guests[i+1];
              i++;
            }
            break;
            
          }
    
        }
    }
    else{System.out.println("Error: Guest number not present");}
  }
    
    

  
  
}