Program Assignment 1: DES simulation


DES program consists of several classes:

1. DES_Simultion
   - Main simulation engine
   - Completed (do not modify)
   
2. Conversion
   - Provides utility functions for conversion between a string 
     of characters and a binary string
   - Completed (do not modify)

3. DES
   - Includes encryption and decryption algorithms
   - Completed (do not modify)

4. IP
   - Initial permutation
   - Completed (do not modify)

5. FeisteNetwork
   - Consists of 16 rounds. 
   - This class includes the f-function with four steps: Expansion, Xor, S-box substitution, Permutation 
   - To be completed

6. IPinverse
   - Final permutation, inverse of the initial permutation
   - To be completed  

7. KeySchedule
   - Includes key scheduling algorithms for both encryption and decryption
   - To be completed


Things to Know:

1. To run the DES_Simulation class, provide two command line arguments
   for a file name for plaintext and another file name for the key.
   For example, type “java DES_Simulation input.txt key.txt”
   
   With the given txt files, your program output must be:

   - Ciphertext: 1100100011010010001000001001111011111011011101001101100110000101
   -             1100010011110101100110101000101111100010010101101000100000101001
   -             1100100011111010011001010100011111010001101010010100010000010110


   - Success
   - Recovered Text:
   - Hi World

2. .txt files are included:
   - The input.txt file contains exactly 8 characters which fit in a block of 64 bits. 
   - The key.txt file contains a key of 64 bits.
   - You may choose different plaintext and keys.
 
 
   
    