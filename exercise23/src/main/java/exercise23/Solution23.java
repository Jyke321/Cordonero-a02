package exercise23;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        DecisionTreeNode tree = createTroubleshootingDecisionTree();
        promptUser(tree);
    }

    private static void promptUser(DecisionTreeNode tree) {
        //the program stops when a tree node is reached
        while (tree.left != null && tree.right != null) {
            System.out.print(tree.data); //asks the question
            char response = getUserInputYesOrNo();
            if (response=='y')
                tree = tree.left;
            else
                tree = tree.right;
        }
        System.out.println(tree.data);
    }

    private static char getUserInputYesOrNo() {
        char retVal = '\0';
        while (retVal=='\0') {
            String buffer = in.nextLine();
            if (buffer.startsWith("y"))
                retVal = 'y';
            if (buffer.startsWith("n"))
                retVal = 'n';
            if (retVal=='\0')
                System.out.print("\nPlease enter a y/n: ");
        }
        return retVal;
    }

    private static DecisionTreeNode createTroubleshootingDecisionTree() {
        DecisionTreeNode tree = new DecisionTreeNode("Is the car silent when you turn the key? ");
        tree.left = new DecisionTreeNode("Are the battery terminals corroded? "); //if answered yes
        tree.left.left = new DecisionTreeNode("Clean terminals and try starting again. ");// if y again
        //this node becomes a leaf node since java automatically sets the left and right to null apparently
        tree.left.right = new DecisionTreeNode("Replace cables and try again");//if r (after initial y)
        //the right side also has children auto set to null
        //Set up the right side of the tree (initial no)
        tree.right = new DecisionTreeNode("Does the car make a slicking noise? "); // N
        tree.right.left = new DecisionTreeNode("Replace the battery."); // NY
        tree.right.right = new DecisionTreeNode("Does the car crank up but fail to start? "); // NN
        tree.right.right.left = new DecisionTreeNode("Check spark plug connections."); // NNY
        tree.right.right.right = new DecisionTreeNode("Does the engine start and then die? "); // NNN
        tree.right.right.right.left = new DecisionTreeNode("Does you car have fuel injection? "); // NNNY
        tree.right.right.right.left.left = new DecisionTreeNode("Get it in for service."); // NNNYY
        tree.right.right.right.left.right = new DecisionTreeNode("Check to ensure the choke is opening and closing."); // NNNYN
        tree.right.right.right.right = new DecisionTreeNode("This should not be possible."); // NNNN
        return tree;
    }

    private static class DecisionTreeNode {
        private String data;
        private DecisionTreeNode left;
        private DecisionTreeNode right;

        public DecisionTreeNode(String data) {
            this.data = data;
        }
    }

}
