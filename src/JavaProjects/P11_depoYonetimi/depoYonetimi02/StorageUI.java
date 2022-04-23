package JavaProjects.P11_depoYonetimi.depoYonetimi02;

import java.util.Scanner;

public class StorageUI {
    static Scanner scan = new Scanner(System.in);
    static Storage storage = new Storage();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("===============================");
        System.out.println("STORAGE MANAGEMENT SYSTEM (SMS)");
        System.out.println("===============================");

        System.out.println("1  PRODUCT LIST");
        System.out.println("2  NEW PRODUCT SPECIFY");
        System.out.println("3  PRODUCT SHELVING");
        System.out.println("4  PRODUCT ENTRY");
        System.out.println("5  PRODUCT EXIT");
        System.out.println("===============================");

        int select = scan.nextInt();

        // TODO catch inappropriate entry exception.

        switch (select) {
            case 1:
                pListUI();
                break;
            case 2:
                pSpecificationUI();
                break;
            case 3:
                pShelvingUI();
                break;
            case 4:
                pEnterUI();
                break;
            case 5:
                pExitUI();
                break;
        }
    }

    static void pListUI() {
        System.out.println("ID\tNAME\t\tPRODUCER\t\tQUANTITY\tUNIT\tSHELF");
        System.out.println("==============================================================================");

        for (int i = 0; i < storage.pList.size(); i++) {
            System.out.println(storage.pList.get(i).id + "\t" +
                    storage.pList.get(i).name + "\t\t" +
                    storage.pList.get(i).producer + "\t\t\t" +
                    storage.pList.get(i).quantity + "\t" +
                    storage.pList.get(i).unit + "\t" +
                    storage.pList.get(i).shelf
            );
        }
        System.out.println("==============================================================================");
        returnMenu();
    }

    static void pSpecificationUI() {
        // TODO catch inappropriate entry exception.
        String pName;
        String pProducer;
        String pUnit;
        System.out.println("Product Name:");
        pName = scan.next();
        System.out.println("Producer:");
        pProducer = scan.next();
        System.out.println("Unit:");
        pUnit = scan.next();

        storage.pSpecification(pName, pProducer, pUnit);
        System.out.println("A new product is specified with the ID number " + storage.pList.get(storage.pList.size() - 1).id + ".");

        System.out.println();
        System.out.println("ID\tNAME\t\tPRODUCER\t\tQUANTITY\tUNIT\tSHELF");
        System.out.println("==============================================================================");

        System.out.println(storage.pList.get(storage.pList.size() - 1).id + "\t" +
                storage.pList.get(storage.pList.size() - 1).name + "\t\t" +
                storage.pList.get(storage.pList.size() - 1).producer + "\t\t\t" +
                storage.pList.get(storage.pList.size() - 1).quantity + "\t" +
                storage.pList.get(storage.pList.size() - 1).unit + "\t" +
                storage.pList.get(storage.pList.size() - 1).shelf
        );
        System.out.println("==============================================================================");
        returnMenu();
    }

    static void pShelvingUI() {
        // TODO catch inappropriate entry exception.
        // TODO catch product not specified exception.
        int pID;
        String pShelf;

        System.out.println("Product ID:");
        pID = scan.nextInt();
        System.out.println("Shelf:");
        pShelf = scan.next();

        storage.pShelving(pID, pShelf);

        System.out.println("Product ID " + pID + " redirected to shelf " + pShelf);

        System.out.println();
        System.out.println("ID\tNAME\t\tPRODUCER\t\tQUANTITY\tUNIT\tSHELF");
        System.out.println("==============================================================================");

        System.out.println(storage.pList.get(pID - storage.idBase).id + "\t" +
                storage.pList.get(pID - storage.idBase).name + "\t\t" +
                storage.pList.get(pID - storage.idBase).producer + "\t\t\t" +
                storage.pList.get(pID - storage.idBase).quantity + "\t" +
                storage.pList.get(pID - storage.idBase).unit + "\t" +
                storage.pList.get(pID - storage.idBase).shelf
        );
        System.out.println("==============================================================================");

        returnMenu();
    }

    static void pEnterUI() {
        // TODO catch inappropriate entry exception.
        // TODO catch product not specified exception.
        int pID;
        int pQuantity;

        System.out.println("Product ID:");
        pID = scan.nextInt();
        System.out.println("Quantity");
        pQuantity = scan.nextInt();

        storage.pEnter(pID, pQuantity);

        System.out.println("Product ID " + pID + " enter to the storage: " + pQuantity);
        System.out.println();
        System.out.println("ID\tNAME\t\tPRODUCER\t\tQUANTITY\tUNIT\tSHELF");
        System.out.println("==============================================================================");

        System.out.println(storage.pList.get(pID - storage.idBase).id + "\t" +
                storage.pList.get(pID - storage.idBase).name + "\t\t" +
                storage.pList.get(pID - storage.idBase).producer + "\t\t\t" +
                storage.pList.get(pID - storage.idBase).quantity + "\t" +
                storage.pList.get(pID - storage.idBase).unit + "\t" +
                storage.pList.get(pID - storage.idBase).shelf
        );
        System.out.println("==============================================================================");

        returnMenu();
    }

    static void pExitUI() {
        // TODO catch inappropriate entry exception.
        // TODO catch product not specified exception.
        // TODO catch insufficient amount exception.
        int pID;
        int pQuantity;

        System.out.println("Product ID:");
        pID = scan.nextInt();
        System.out.println("Quantity");
        pQuantity = scan.nextInt();

        storage.pExit(pID, pQuantity);

        System.out.println("Product ID " + pID + " exit from the storage: " + pQuantity);
        System.out.println();
        System.out.println("ID\tNAME\t\tPRODUCER\t\tQUANTITY\tUNIT\tSHELF");
        System.out.println("==============================================================================");

        System.out.println(storage.pList.get(pID - storage.idBase).id + "\t" +
                storage.pList.get(pID - storage.idBase).name + "\t\t" +
                storage.pList.get(pID - storage.idBase).producer + "\t\t\t" +
                storage.pList.get(pID - storage.idBase).quantity + "\t" +
                storage.pList.get(pID - storage.idBase).unit + "\t" +
                storage.pList.get(pID - storage.idBase).shelf
        );
        System.out.println("==============================================================================");

        returnMenu();
    }

    static void returnMenu() {
        System.out.println("1  MAIN MENU");

        int select = scan.nextInt();

        // TODO catch inappropriate entry exception.

        switch (select) {
            case 1:
                menu();
                break;
        }
    }
}
