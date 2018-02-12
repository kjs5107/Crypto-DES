Program Assignment 1: DES simulation


DES program consists of several classes:

1. DES_Simultion
   - Main simulation engine
   
2. Conversion
   - Provides utility functions for conversion between a string 
     of characters and a binary string

3. DES
   - Includes encryption and decryption algorithms

4. IP
   - Initial permutation

5. FeisteNetwork
   - Consists of 16 rounds. 
   - This class includes the f-function with four steps: Expansion, Xor, S-box substitution, Permutation

6. IPinverse
   - Final permutation, inverse of the initial permutation

7. KeySchedule
   - Includes key scheduling algorithms for both encryption and decryption


Things to Know:

1. To run the DES_Simulation class, provide two command line arguments
   for a file name for plaintext and another file name for the key.
   For example, type “java DES_Simulation input.txt key.txt”
   
   With the given txt files, the program output must be:

   - Ciphertext: 1100100011010010001000001001111011111011011101001101100110000101
   - Success
   - Recovered Text:
   - Hi World

2. .txt files are included:
   - The input.txt file contains exactly 8 characters which fit in a block of 64 bits. 
   - The key.txt file contains a key of 64 bits.
   - You may choose different plaintext and keys.
 
 
   
    