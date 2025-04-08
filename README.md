# Merkle Tree
A simple implementation of a Merkle Tree in ```Java```.

## Overview
A Merkle Tree is a ```cryptographic data structure``` used in ```blockchain technology``` to efficiently and securely verify the integrity of data. This Java implementation demonstrates how to construct a Merkle Tree and obtain its root hash.

## How It Works
1. **Hash Transactions:**
   
   Takes a list of transactions. Each transaction is hashed using ```SHA-256```.
   
2. **Pair and Hash:**
   
   Pairs of adjacent transaction ```hashes``` are concatenated and hashed to form the next level and builds a hierarchical structure of hashes.
   
3. **Repeat:**
   
   This process is repeated until only one hash remains, which is the ```Merkle Root hash```.

## Illustration of Merkle Tree
```bash
         Merkle Root
        /            \
    hash 0          hash 1
   /      \        /      \
hash 0-0 hash 0-1 hash 1-0 hash 1-1
   |        |        |        |
  tx1      tx2      tx3      tx4
```

## Conclusion
This implementation demonstrates the basic concept of a Merkle Tree, which is essential in verifying data integrity in distributed systems like blockchain.
