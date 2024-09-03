package cryptography;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Example transactions
            List<String> transactions = new ArrayList<>();
            transactions.add("tx1");
            transactions.add("tx2");
            transactions.add("tx3");
            transactions.add("tx4");

            // Build the Merkle Tree
            String merkleRootHash = BuildMerkleTree.buildMerkleTree(transactions);
            System.out.println("Merkle Root Hash: " + merkleRootHash);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
