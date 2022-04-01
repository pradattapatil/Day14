package Day14.LinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        create object for linkedlist class coz no one method is static in this class
        LinkedList linkedList = new LinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to DataStructure Program!\n\n"
                + "Choose your option:\n"

                + "1. Create a simple LinkedList\n"  //uc1
                + "2. Create Linked List by adding 30 and 56 to 70\n" //uc2
                + "3. Create Linked List by apending 30 and 70 to 56\n" //uc3
                + "4. Insert 30 between 56 & 70\n" //uc4
                + "5. Ability to delete the first element\n"  //uc5
                + "6. Delete the last element in the LinkedList\n"//uc6
                + "7. Find node with value 30\n"  //uc7
                + "8. Insert 40 after 30\n"  //uc8
                + "9. Delete the Node\n"   //uc9
                + "10. Ascending order\n");  //uc10
        int option = sc.nextInt();
        System.out.println();

        switch (option) {
//           for uc 1
            case 1:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                linkedList.print();
                break;

//            for uc 2
            case 2:
                linkedList.push(70);
                linkedList.push(30);
                linkedList.push(56);
                linkedList.print();
                break;

//                for uc 3
            case 3:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                linkedList.print();
                break;

//             for uc 4
            case 4:
                LinkedList.Node prevNode = linkedList.insert(56);
                linkedList.insert(70);
                linkedList.insertAfter(prevNode, 30);
                linkedList.print();
                break;

//               for uc 5
            case 5:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                int pop = linkedList.pop();
                System.out.println("Delete 1st element = " + pop);
                linkedList.print();
                break;

//                for uc 6
            case 6:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                linkedList.popLast();
                linkedList.print();
                break;

//              for uc 7
            case 7:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                int search = linkedList.search(30);
                System.out.println("Position of 30: "+ search);
                break;

 //               for uc 8
            case 8:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                linkedList.insertelement(3, 40);
                linkedList.print();
                break;

//                for uc 9
            case 9:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(40);
                linkedList.insert(70);
                linkedList.deleteANode(40);
                linkedList.print();
                break;

//                for uc 10
            case 10:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(40);
                linkedList.insert(70);
                linkedList.sort();
                linkedList.print();
                break;
        }
    }
}
