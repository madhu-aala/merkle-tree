package cryptography;

import java.util.ArrayList;
import java.util.List;

public class BuildMerkleTree extends MerkleTree {
    // Method to build the Merkle Tree and return the root hash
    public static String buildMerkleTree(List<String> transactions) throws Exception {
        List<String> tempList = new ArrayList<>(transactions);

        while (tempList.size() > 1) {
            List<String> newLevel = new ArrayList<>();

            for (int i = 0; i < tempList.size(); i += 2) {
                // Handle case with odd number of elements
                if (i + 1 < tempList.size()) {
                    newLevel.add(hash(tempList.get(i) + tempList.get(i + 1)));
                } else {
                    // If odd, duplicate last hash
                    newLevel.add(hash(tempList.get(i) + tempList.get(i)));
                }
            }
            tempList = newLevel;
        }
        return tempList.get(0);
    }
}
